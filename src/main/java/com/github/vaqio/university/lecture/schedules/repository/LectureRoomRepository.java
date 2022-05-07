package com.github.vaqio.university.lecture.schedules.repository;

import com.github.vaqio.university.lecture.schedules.repository.model.LectureRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LectureRoomRepository extends JpaRepository<LectureRoom, Long> {

  Optional<LectureRoom> findByRoomNumber(String roomNumber);

  Optional<LectureRoom> findByRoomNumberIgnoreCase(String roomNumber);

  boolean existsByRoomNumber(String roomNumber);

  boolean existsByRoomNumberIgnoreCase(String roomNumber);

  void deleteByRoomNumber(String roomNumber);

  void deleteByRoomNumberIgnoreCase(String roomNumber);

}
