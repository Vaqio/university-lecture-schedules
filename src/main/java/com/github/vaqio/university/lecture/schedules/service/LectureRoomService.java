package com.github.vaqio.university.lecture.schedules.service;

import com.github.vaqio.university.lecture.schedules.controller.dto.LectureRoomDTO;
import com.github.vaqio.university.lecture.schedules.repository.model.LectureRoom;

import java.util.List;
import java.util.Optional;

public interface LectureRoomService {

  boolean existsById(Long id);

  boolean existsByRoomNumber(String roomNumber);

  Optional<LectureRoom> create(LectureRoomDTO lectureRoomDTO);

  Optional<LectureRoom> update(Long id, LectureRoomDTO lectureRoomDTO);

  void deleteById(Long id);

  void deleteByRoomNumber(String roomNumber);

  void deleteAll();

  Optional<LectureRoom> getById(Long id);

  Optional<LectureRoom> getByRoomNumber(String roomNumber);

  List<LectureRoom> getAll();

}
