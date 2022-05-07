package com.github.vaqio.university.lecture.schedules.repository.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

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

  @ManyToMany(
          fetch = FetchType.EAGER,
          cascade = { CascadeType.PERSIST, CascadeType.MERGE },
          mappedBy = "subjects")
  @JsonIgnore
  private Set<Teacher> teachers;

  @ManyToMany(
          fetch = FetchType.EAGER,
          cascade = { CascadeType.PERSIST, CascadeType.MERGE },
          mappedBy = "subject")
  @JsonIgnore
  private Set<Lecture> lectures;

}
