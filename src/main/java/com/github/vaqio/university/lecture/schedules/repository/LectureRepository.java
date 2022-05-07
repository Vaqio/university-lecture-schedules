package com.github.vaqio.university.lecture.schedules.repository;

import com.github.vaqio.university.lecture.schedules.repository.model.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LectureRepository extends JpaRepository<Lecture, Long> {

  Optional<Lecture> findByName(String name);

  Optional<Lecture> findByNameIgnoreCase(String name);

  List<Lecture> findAllBySubjectId(Long subjectId);

  List<Lecture> findAllByStudentId(Long studentId);

  List<Lecture> findAllByTeacherId(Long teacherId);

  List<Lecture> findAllByLectureRoomId(Long lectureRoomId);

  boolean existsByName(String name);

  boolean existsByNameIgnoreCase(String name);

  void deleteByName(String name);

  void deleteByNameIgnoreCase(String name);

}
