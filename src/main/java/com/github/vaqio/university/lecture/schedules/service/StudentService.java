package com.github.vaqio.university.lecture.schedules.service;

import com.github.vaqio.university.lecture.schedules.controller.dto.StudentDTO;
import com.github.vaqio.university.lecture.schedules.repository.model.account.Student;
import com.github.vaqio.university.lecture.schedules.repository.model.account.Teacher;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

public interface StudentService {

  boolean existsById(Long id);

  boolean existsByEmail(String email);

  Optional<Student> create(StudentDTO studentDTO);

  Optional<Student> updateFirstName(Long id, String firstName);

  Optional<Student> updateLastName(Long id, String lastName);

  Optional<Student> updateEmail(Long id, String firstName);

  Optional<Student> updatePassword(Long id, String password);

  void deleteById(Long id);

  void deleteByEmail(String email);

  void deleteAll();

  Optional<Student> getCurrent(Principal principal);

  Optional<Student> getById(Long id);

  Optional<Student> getByEmail(String email);

  List<Student> getAll();

}
