package com.github.vaqio.university.lecture.schedules.repository.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

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
