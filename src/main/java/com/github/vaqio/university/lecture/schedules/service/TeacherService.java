package com.github.vaqio.university.lecture.schedules.service;

import com.github.vaqio.university.lecture.schedules.controller.dto.TeacherDTO;

import java.util.List;
import java.util.Optional;

public interface TeacherService {

  boolean existsById(Long id);

  boolean existsByName(String name);

  TeacherDTO create(TeacherDTO teacherDTO);

  TeacherDTO update(Long id, TeacherDTO teacherDTO);

  void deleteById(Long id);

  void deleteByName(String name);

  void deleteAll();

  Optional<TeacherDTO> getById(Long id);

  Optional<TeacherDTO> getByName(String name);

  List<TeacherDTO> getAll();

}
