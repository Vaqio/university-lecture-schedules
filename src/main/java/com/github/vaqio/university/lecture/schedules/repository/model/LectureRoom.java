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
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "lecture_rooms")
@Entity
public class LectureRoom {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  @Length(min = 1, max = 20)
  @Column(name = "room_number")
  private String roomNumber;

  @OneToMany(
          fetch = FetchType.EAGER,
          cascade = { CascadeType.PERSIST, CascadeType.MERGE},
          mappedBy = "lectureRoom")
  @JsonIgnore
  private Set<Lecture> lectures;

}
