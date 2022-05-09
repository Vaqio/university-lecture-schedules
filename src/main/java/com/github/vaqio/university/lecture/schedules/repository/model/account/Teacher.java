package com.github.vaqio.university.lecture.schedules.repository.model.account;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.vaqio.university.lecture.schedules.repository.model.Lecture;
import com.github.vaqio.university.lecture.schedules.repository.model.Subject;
import lombok.*;

import javax.persistence.*;
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
public class Teacher extends User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

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
