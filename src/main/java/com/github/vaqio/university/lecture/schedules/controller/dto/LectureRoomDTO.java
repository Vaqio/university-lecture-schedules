package com.github.vaqio.university.lecture.schedules.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Null;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LectureRoomDTO {

  @Null
  private Long id;

  @JsonProperty("room-number")
  @NotEmpty
  @Length(min = 1, max = 40)
  private String roomNumber;

}
