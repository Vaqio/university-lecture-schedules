package com.github.vaqio.university.lecture.schedules.repository.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.vaqio.university.lecture.schedules.repository.model.audit.Auditable;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
@Entity
public class Student extends Auditable<Long> {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

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
  @Column(unique = true)
  private String password;

  @NotNull
  @ManyToMany(
          fetch = FetchType.EAGER,
          mappedBy = "students",
          cascade = { CascadeType.PERSIST, CascadeType.MERGE })
  @JsonIgnore
  private List<Lecture> lectures = new java.util.ArrayList<>();

}
