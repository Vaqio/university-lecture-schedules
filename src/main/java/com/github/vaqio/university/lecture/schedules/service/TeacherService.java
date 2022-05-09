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

  Optional<Teacher> updateFirstName(Long id, String firstName);

  Optional<Teacher> updateLastName(Long id, String lastName);

  Optional<Teacher> updateEmail(Long id, String firstName);

  Optional<Teacher> updatePassword(Long id, String password);

  Optional<Teacher> addSubject(Long id, Long subjectId);

  Optional<Teacher> removeSubject(Long id, Long subjectId);

  void deleteById(Long id);

  void deleteByName(String name);

  void deleteAll();

  Optional<Teacher> getCurrent(Principal principal);

  Optional<Teacher> getById(Long id);

  Optional<Teacher> getByName(String name);

  List<Teacher> getAll();

}
