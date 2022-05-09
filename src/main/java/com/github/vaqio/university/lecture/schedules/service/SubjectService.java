package com.github.vaqio.university.lecture.schedules.service;

import com.github.vaqio.university.lecture.schedules.controller.dto.SubjectDTO;
import com.github.vaqio.university.lecture.schedules.repository.model.Subject;

import java.util.List;
import java.util.Optional;

public interface SubjectService {

  boolean existsById(Long id);

  boolean existsByName(String name);

  Subject create(SubjectDTO subjectDTO);

  Subject updateName(Long id, String name);

  void deleteById(Long id);

  void deleteByName(String name);

  void deleteAll();

  Subject getById(Long id);

  Subject getByName(String name);

  List<Subject> getAll();

}
