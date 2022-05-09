package com.github.vaqio.university.lecture.schedules.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {

  @Null
  private Long id;

  @JsonProperty("first-name")
  @NotEmpty
  @Length(min = 3, max = 40)
  private String firstName;

  @JsonProperty("last-name")
  @NotEmpty
  @Length(min = 3, max = 40)
  private String lastName;

  @NotEmpty
  @Length(min = 3, max = 40)
  @Email
  private String email;

  @NotEmpty
  @Length(min = 3, max = 40)
  private String password;

  @NotNull
  private List<Long> lecturesIds = new java.util.ArrayList<>();

}
