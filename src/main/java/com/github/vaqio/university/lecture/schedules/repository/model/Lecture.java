package com.github.vaqio.university.lecture.schedules.repository.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "lectures")
@Entity
public class Lecture {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @NotBlank
  @Length(min = 3, max = 40)
  @Column
  private String name;

  @NotNull
  @ManyToOne(
          fetch = FetchType.EAGER,
          cascade = { CascadeType.PERSIST, CascadeType.MERGE })
  @JoinTable(
          name = "lecture_subjects",
          joinColumns = @JoinColumn(name = "lecture_id"),
          inverseJoinColumns = @JoinColumn(name = "subject_id"))
  private Subject subject;

  @NotNull
  @ManyToMany(
          fetch = FetchType.EAGER,
          cascade = { CascadeType.PERSIST, CascadeType.MERGE })
  @JoinTable(
          name = "lecture_students",
          joinColumns = @JoinColumn(name = "lecture_id"),
          inverseJoinColumns = @JoinColumn(name = "student_id"))
  private List<Student> students = new ArrayList<>();

  @NotNull
  @ManyToMany(
          fetch = FetchType.EAGER,
          cascade = { CascadeType.PERSIST, CascadeType.MERGE })
  @JoinTable(
          name = "lecture_teachers",
          joinColumns = @JoinColumn(name = "lecture_id"),
          inverseJoinColumns = @JoinColumn(name = "teacher_id"))
  private List<Teacher> teachers = new ArrayList<>();

  @ManyToOne(
          fetch = FetchType.EAGER,
          cascade = { CascadeType.PERSIST, CascadeType.MERGE })
  @JoinTable(
          name = "lecture_rooms",
          joinColumns = @JoinColumn(name = "lecture_id"),
          inverseJoinColumns = @JoinColumn(name = "lecture_room_id"))
  private LectureRoom lectureRoom;

  @Nullable
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "start_date")
  private Date startDate;

  @Nullable
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "end_date")
  private Date endDate;

  @Nullable
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "enrollment_start_date")
  private Date enrollmentStartDate;

  @Nullable
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "enrollment_end_date")
  private Date enrollmentEndDate;

}
