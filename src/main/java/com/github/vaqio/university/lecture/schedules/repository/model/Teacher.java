package com.github.vaqio.university.lecture.schedules.repository.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.vaqio.university.lecture.schedules.repository.model.audit.Auditable;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "teachers")
@Entity
public class Teacher extends Auditable<Long> {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  @Length(min = 3, max = 40)
  private String name;

  @NotNull
  @ManyToMany(
          fetch = FetchType.EAGER,
          cascade = { CascadeType.PERSIST, CascadeType.MERGE })
  @JoinTable(
          name = "teacher_subjects",
          joinColumns = @JoinColumn(name = "lecture_id", referencedColumnName = "id"),
          inverseJoinColumns = @JoinColumn(name = "subject_id", referencedColumnName = "id"))
  private List<Subject> subjects = new ArrayList<>();

  @NotNull
  @ManyToMany(
          fetch = FetchType.EAGER,
          mappedBy = "teachers",
          cascade = { CascadeType.PERSIST, CascadeType.MERGE })
  @JsonIgnore
  private List<Lecture> lectures = new ArrayList<>();

}
