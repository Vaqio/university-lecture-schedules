package com.github.vaqio.university.lecture.schedules.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Null;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubjectDTO {

  @Null
  private Long id;

  @NotEmpty
  @Length(min = 3, max = 40)
  private String name;

}
