package com.github.vaqio.university.lecture.schedules.repository.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.vaqio.university.lecture.schedules.repository.model.audit.Auditable;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

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
  @NotEmpty
  @Length(min = 3, max = 40)
  private String name;

  @ManyToMany(
          fetch = FetchType.EAGER,
          cascade = { CascadeType.PERSIST, CascadeType.MERGE} )
  @JoinTable(
          name = "teacher_subjects",
          joinColumns = @JoinColumn(name = "lecture_id"),
          inverseJoinColumns = @JoinColumn(name = "subject_id"))
  private Set<Subject> subjects;

  @ManyToMany(
          fetch = FetchType.EAGER,
          cascade = { CascadeType.PERSIST, CascadeType.MERGE},
          mappedBy = "teachers")
  @JsonIgnore
  private Set<Lecture> lectures;

}
