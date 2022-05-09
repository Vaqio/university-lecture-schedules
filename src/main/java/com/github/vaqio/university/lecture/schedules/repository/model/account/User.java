package com.github.vaqio.university.lecture.schedules.repository.model.account;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.vaqio.university.lecture.schedules.repository.model.audit.Auditable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Setter
@Getter
@MappedSuperclass
public class User extends Auditable<User> {

  @NotBlank
  @Length(min = 3, max = 40)
  @Column(name = "first_name")
  private String firstName;

  @NotBlank
  @Length(min = 3, max = 40)
  @Column(name = "last_name")
  private String lastName;

  @NotBlank
  @Length(min = 3, max = 40)
  @Email
  @Column(unique = true)
  private String email;

  @NotBlank
  @JsonIgnore
  @Length(min = 3, max = 40)
  @Column
  private String password;

}
