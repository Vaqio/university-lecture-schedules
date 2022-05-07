package com.github.vaqio.university.lecture.schedules.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LectureDTO {

  @Null
  private Long id;

  @NotEmpty
  @Length(min = 3, max = 40)
  private String name;

  @JsonProperty("subject-id")
  @NotNull
  private Long subjectId;

  @JsonProperty("student-ids")
  private List<Long> studentIds;

  @JsonProperty("teacher-ids")
  private List<Long> teacherIds;

  @NotNull
  @JsonProperty("room-id")
  private Long lectureRoomId;

  @NotNull
  @JsonProperty("start-date")
  private Date startDate;

  @NotNull
  @JsonProperty("end-date")
  private Date endDate;

  @NotNull
  @JsonProperty("enrollment-start-date")
  private Date enrollmentStartDate;

  @NotNull
  @JsonProperty("enrollment-end-date")
  private Date enrollmentEndDate;

}
