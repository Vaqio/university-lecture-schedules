package com.github.vaqio.university.lecture.schedules.service;

import com.github.vaqio.university.lecture.schedules.controller.dto.LectureRoomDTO;

import java.util.List;
import java.util.Optional;

public interface LectureRoomService {

  boolean existsById(Long id);

  boolean existsByRoomNumber(String roomNumber);

  LectureRoomDTO create(LectureRoomDTO lectureRoomDTO);

  LectureRoomDTO update(Long id, LectureRoomDTO lectureRoomDTO);

  void deleteById(Long id);

  void deleteByRoomNumber(String roomNumber);

  void deleteAll();

  Optional<LectureRoomDTO> getById(Long id);

  Optional<LectureRoomDTO> getByRoomNumber(String roomNumber);

  List<LectureRoomDTO> getAll();

}
