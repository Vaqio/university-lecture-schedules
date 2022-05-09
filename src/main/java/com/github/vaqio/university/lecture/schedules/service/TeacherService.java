package com.github.vaqio.university.lecture.schedules.service;

import com.github.vaqio.university.lecture.schedules.controller.dto.TeacherDTO;
import com.github.vaqio.university.lecture.schedules.repository.model.account.Teacher;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

public interface TeacherService {

  boolean existsById(Long id);

  boolean existsByName(String name);

  Teacher create(TeacherDTO teacherDTO);

  Teacher updateFirstName(Long id, String firstName);

  Teacher updateLastName(Long id, String lastName);

  Teacher updateEmail(Long id, String firstName);

  Teacher updatePassword(Long id, String password);

  Teacher addSubject(Long id, Long subjectId);

  Teacher removeSubject(Long id, Long subjectId);

  void deleteById(Long id);

  void deleteByName(String name);

  void deleteAll();

  Teacher getCurrent(Principal principal);

  Teacher getById(Long id);

  Teacher getByName(String name);

  List<Teacher> getAll();

}
