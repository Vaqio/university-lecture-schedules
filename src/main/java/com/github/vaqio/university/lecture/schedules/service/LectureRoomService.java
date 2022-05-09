package com.github.vaqio.university.lecture.schedules.service;

import com.github.vaqio.university.lecture.schedules.controller.dto.LectureRoomDTO;
import com.github.vaqio.university.lecture.schedules.repository.model.LectureRoom;

import java.util.List;
import java.util.Optional;

public interface LectureRoomService {

  boolean existsById(Long id);

  boolean existsByRoomNumber(String roomNumber);

  LectureRoom create(LectureRoomDTO lectureRoomDTO);

  LectureRoom updateRoomNumber(Long id, String roomNumber);

  void deleteById(Long id);

  void deleteByRoomNumber(String roomNumber);

  void deleteAll();

  LectureRoom getById(Long id);

  LectureRoom getByRoomNumber(String roomNumber);

  List<LectureRoom> getAll();

}
