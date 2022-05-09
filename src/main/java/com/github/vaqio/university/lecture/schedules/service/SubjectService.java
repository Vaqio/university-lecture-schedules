package com.github.vaqio.university.lecture.schedules.service;

import com.github.vaqio.university.lecture.schedules.controller.dto.SubjectDTO;
import com.github.vaqio.university.lecture.schedules.repository.model.Subject;

import java.util.List;
import java.util.Optional;

public interface SubjectService {

  boolean existsById(Long id);

  boolean existsByName(String name);

  Optional<Subject> create(SubjectDTO subjectDTO);

  Optional<Subject> update(Long id, SubjectDTO subjectDTO);

  void deleteById(Long id);

  void deleteByName(String name);

  void deleteAll();

  Optional<Subject> getById(Long id);

  Optional<Subject> getByName(String name);

  List<Subject> getAll();

}
