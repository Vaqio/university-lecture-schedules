package com.github.vaqio.university.lecture.schedules.repository.model;

import com.github.vaqio.university.lecture.schedules.repository.model.audit.Auditable;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "teachers")
@Entity
public class Teacher extends Auditable<Long> {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  @NotEmpty
  @Length(min = 3, max = 40)
  private String name;

}
