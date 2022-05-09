package com.github.vaqio.university.lecture.schedules.service;

import com.github.vaqio.university.lecture.schedules.controller.dto.LectureDTO;
import com.github.vaqio.university.lecture.schedules.repository.model.Lecture;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface LectureService {

  boolean existsById(Long id);

  boolean existsByName(String name);

  Lecture create(LectureDTO lectureDTO);

  Lecture updateName(Long id, String name);

  Lecture updateSubject(Long id, Long subjectId);

  Lecture updateLectureRoom(Long id, Long lectureRoomId);

  Lecture updateStartDate(Long id, Date startDate);

  Lecture updateEndDate(Long id, Date endDate);

  Lecture updateEnrollmentStartDate(Long id, Date enrollmentStartDate);

  Lecture updateEnrollmentEndDate(Long id, Date enrollmentEndDate);

  Lecture updateSubject(Long id, String subjectName);

  Lecture addStudent(Long id, Long studentId);

  Lecture removeStudent(Long id, Long studentId);

  Lecture addTeacher(Long id, Long teacherId);

  Lecture removeTeacher(Long id, Long teacherId);

  void deleteById(Long id);

  void deleteAll();

  Lecture getById(Long id);

  List<Lecture> getAllByName(String name);

  List<Lecture> getAllBySubjectId(Long subjectId);

  List<Lecture> getAllByStudentId(Long studentId);

  List<Lecture> getAllByTeacherId(Long teacherId);

  List<Lecture> getAllByLectureRoomId(Long lectureRoomId);

  List<Lecture> getAll();

}
