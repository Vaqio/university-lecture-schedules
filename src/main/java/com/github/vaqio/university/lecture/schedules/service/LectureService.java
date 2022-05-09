package com.github.vaqio.university.lecture.schedules.service;

import com.github.vaqio.university.lecture.schedules.controller.dto.LectureDTO;
import com.github.vaqio.university.lecture.schedules.repository.model.Lecture;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface LectureService {

  boolean existsById(Long id);

  boolean existsByName(String name);

  Optional<Lecture> create(LectureDTO lectureDTO);

  Optional<Lecture> updateName(Long id, String name);

  Optional<Lecture> updateSubject(Long id, Long subjectId);

  Optional<Lecture> updateLectureRoom(Long id, Long lectureRoomId);

  Optional<Lecture> updateStartDate(Long id, Date startDate);

  Optional<Lecture> updateEndDate(Long id, Date endDate);

  Optional<Lecture> updateEnrollmentStartDate(Long id, Date enrollmentStartDate);

  Optional<Lecture> updateEnrollmentEndDate(Long id, Date enrollmentEndDate);

  Optional<Lecture> updateSubject(Long id, String subjectName);

  Optional<Lecture> addStudent(Long id, Long studentId);

  Optional<Lecture> removeStudent(Long id, Long studentId);

  Optional<Lecture> addTeacher(Long id, Long teacherId);

  Optional<Lecture> removeTeacher(Long id, Long teacherId);

  void deleteById(Long id);

  void deleteAll();

  Optional<Lecture> getById(Long id);

  List<Lecture> getAllByName(String name);

  List<Lecture> getAllBySubjectId(Long subjectId);

  List<Lecture> getAllByStudentId(Long studentId);

  List<Lecture> getAllByTeacherId(Long teacherId);

  List<Lecture> getAllByLectureRoomId(Long lectureRoomId);

  List<Lecture> getAll();

}
