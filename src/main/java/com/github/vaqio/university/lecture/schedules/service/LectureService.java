package com.github.vaqio.university.lecture.schedules.service;

import com.github.vaqio.university.lecture.schedules.controller.dto.LectureDTO;
import com.github.vaqio.university.lecture.schedules.repository.model.Lecture;

import java.util.List;
import java.util.Optional;

public interface LectureService {

  boolean existsById(Long id);

  boolean existsByName(String name);

  LectureDTO create(LectureDTO lectureDTO);

  LectureDTO update(Long id, LectureDTO lectureDTO);

  void deleteById(Long id);

  void deleteAll();

  Optional<LectureDTO> getById(Long id);

  List<Lecture> getAllByName(String name);

  List<Lecture> getAllBySubjectId(Long subjectId);

  List<Lecture> getAllByStudentId(Long studentId);

  List<Lecture> getAllByTeacherId(Long teacherId);

  List<Lecture> getAllByLectureRoomId(Long lectureRoomId);

  List<LectureDTO> getAll();

}