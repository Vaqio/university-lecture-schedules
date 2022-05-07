package com.github.vaqio.university.lecture.schedules.service;

import com.github.vaqio.university.lecture.schedules.controller.dto.StudentDTO;
import com.github.vaqio.university.lecture.schedules.repository.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

  boolean existsById(Long id);

  boolean existsByEmail(String email);

  void create(StudentDTO studentDTO);

  void update(Long id, StudentDTO studentDTO);

  void deleteById(Long id);

  void deleteByEmail(String email);

  void deleteAll();

  Optional<Student> getById(Long id);

  Optional<Student> getByEmail(String email);

  List<Student> getAll();

}
