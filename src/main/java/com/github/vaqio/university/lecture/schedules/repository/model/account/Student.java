package com.github.vaqio.university.lecture.schedules.repository.model.account;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.vaqio.university.lecture.schedules.repository.model.Lecture;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
@Entity
public class Student extends User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  @ManyToMany(
          fetch = FetchType.EAGER,
          mappedBy = "students",
          cascade = { CascadeType.PERSIST, CascadeType.MERGE })
  @JsonIgnore
  private List<Lecture> lectures = new java.util.ArrayList<>();

}
