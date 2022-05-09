package com.github.vaqio.university.lecture.schedules.service;

import com.github.vaqio.university.lecture.schedules.controller.dto.TeacherDTO;
import com.github.vaqio.university.lecture.schedules.repository.model.account.Teacher;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

public interface TeacherService {

  boolean existsById(Long id);

  boolean existsByName(String name);

  Optional<Teacher> create(TeacherDTO teacherDTO);

  Optional<Teacher> update(Long id, TeacherDTO teacherDTO);

  void deleteById(Long id);

  void deleteByName(String name);

  void deleteAll();

  Optional<Teacher> getCurrent(Principal principal);

  Optional<Teacher> getById(Long id);

  Optional<Teacher> getByName(String name);

  List<Teacher> getAll();

}
