package com.github.vaqio.university.lecture.schedules.repository.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.vaqio.university.lecture.schedules.repository.model.account.Teacher;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "subjects")
@Entity
public class Subject {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  @Length(min = 3, max = 40)
  @Column(unique = true)
  private String name;

  @NotNull
  @ManyToMany(
          fetch = FetchType.EAGER,
          mappedBy = "subjects",
          cascade = { CascadeType.PERSIST, CascadeType.MERGE })
  @JsonIgnore
  private List<Teacher> teachers = new java.util.ArrayList<>();

  @NotNull
  @ManyToMany(
          fetch = FetchType.EAGER,
          mappedBy = "subject",
          cascade = { CascadeType.PERSIST, CascadeType.MERGE })
  @JsonIgnore
  private List<Lecture> lectures = new java.util.ArrayList<>();

}
