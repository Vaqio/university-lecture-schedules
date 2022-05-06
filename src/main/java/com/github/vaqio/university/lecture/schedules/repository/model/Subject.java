package com.github.vaqio.university.lecture.schedules.repository.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "subjects")
@Entity
public class Subject {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank
  @Length(min = 3, max = 40)
  @Column(unique = true)
  private String name;

}
