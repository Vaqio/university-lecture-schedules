package com.github.vaqio.university.lecture.schedules.service;

import com.github.vaqio.university.lecture.schedules.controller.dto.StudentDTO;

import java.util.List;
import java.util.Optional;

public interface StudentService {

  boolean existsById(Long id);

  boolean existsByEmail(String email);
S
  StudentDTO create(StudentDTO studentDTO);

  StudentDTO update(Long id, StudentDTO studentDTO);

  void deleteById(Long id);

  void deleteByEmail(String email);

  void deleteAll();

  Optional<StudentDTO> getById(Long id);

  Optional<StudentDTO> getByEmail(String email);

  List<StudentDTO> getAll();

}
