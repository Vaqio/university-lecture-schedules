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

  Student create(StudentDTO studentDTO);

  Student updateFirstName(Long id, String firstName);

  Student updateLastName(Long id, String lastName);

  Student updateEmail(Long id, String firstName);

  Student updatePassword(Long id, String password);

  void deleteById(Long id);

  void deleteByEmail(String email);

  void deleteAll();

  Student getCurrent(Principal principal);

  Student getById(Long id);

  Student getByEmail(String email);

  List<Student> getAll();

}
