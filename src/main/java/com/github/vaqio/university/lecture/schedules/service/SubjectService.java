package com.github.vaqio.university.lecture.schedules.service;

import com.github.vaqio.university.lecture.schedules.controller.dto.SubjectDTO;

import java.util.List;
import java.util.Optional;

public interface SubjectService {

  boolean existsById(Long id);

  boolean existsByName(String name);

  SubjectDTO create(SubjectDTO subjectDTO);

  SubjectDTO update(Long id, SubjectDTO subjectDTO);

  void deleteById(Long id);

  void deleteByName(String name);

  void deleteAll();

  Optional<SubjectDTO> getById(Long id);

  Optional<SubjectDTO> getByName(String name);

  List<SubjectDTO> getAll();

}
