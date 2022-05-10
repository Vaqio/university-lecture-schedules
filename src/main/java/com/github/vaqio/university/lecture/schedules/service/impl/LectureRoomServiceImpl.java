package com.github.vaqio.university.lecture.schedules.service.impl;

import com.github.vaqio.university.lecture.schedules.controller.dto.LectureRoomDTO;
import com.github.vaqio.university.lecture.schedules.exception.SameValueException;
import com.github.vaqio.university.lecture.schedules.repository.LectureRoomRepository;
import com.github.vaqio.university.lecture.schedules.repository.model.LectureRoom;
import com.github.vaqio.university.lecture.schedules.service.LectureRoomService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import java.util.List;

@Getter
@Service
public class LectureRoomServiceImpl implements LectureRoomService {
  
  private final LectureRoomRepository repository;

  @Autowired
  public LectureRoomServiceImpl(LectureRoomRepository repository) {
    this.repository = repository;
  }
  
  @Override
  public boolean existsById(Long id) {
    return this.repository.existsById(id);
  }

  @Override
  public boolean existsByRoomNumber(String roomNumber) {
    return this.repository.existsByRoomNumberIgnoreCase(roomNumber);
  }

  @Override
  public LectureRoom create(LectureRoomDTO lectureRoomDTO) {
    if (this.repository.existsByRoomNumberIgnoreCase(lectureRoomDTO.getRoomNumber())) {
      throw new EntityExistsException("A room with the given room-number already exists");
    }

    LectureRoom lectureRoom = LectureRoom.builder()
            .roomNumber(lectureRoomDTO.getRoomNumber())
            .build();
    
    this.repository.save(lectureRoom);
    return lectureRoom;
  }

  @Override
  public LectureRoom updateRoomNumber(Long id, String roomNumber) {
    LectureRoom lectureRoom = this.repository.findById(id)
            .orElseThrow(EntityNotFoundException::new);
    if (roomNumber.equalsIgnoreCase(lectureRoom.getRoomNumber())) {
      throw new SameValueException("The room number is the same as currently");
    }

    lectureRoom.setRoomNumber(roomNumber);
    this.repository.save(lectureRoom);
    return lectureRoom;
  }

  @Override
  public void deleteById(Long id) {
    if (!this.repository.existsById(id)) {
      throw new EntityNotFoundException("None room could be found by the given id");
    }

    this.repository.deleteById(id);
  }

  @Override
  public void deleteByRoomNumber(String roomNumber) {
    if (!this.repository.existsByRoomNumberIgnoreCase(roomNumber)) {
      throw new EntityNotFoundException("None room could be found by the given id");
    }

    this.repository.deleteByRoomNumberIgnoreCase(roomNumber);
  }

  @Override
  public void deleteAll() {
    this.repository.deleteAll();
  }

  @Override
  public LectureRoom getById(Long id) {
    return this.repository.findById(id)
            .orElseThrow(EntityNotFoundException::new);
  }

  @Override
  public LectureRoom getByRoomNumber(String roomNumber) {
    return this.repository.findByRoomNumberIgnoreCase(roomNumber)
            .orElseThrow(EntityNotFoundException::new);
  }

  @Override
  public List<LectureRoom> getAll() {
    return this.repository.findAll();
  }

}
