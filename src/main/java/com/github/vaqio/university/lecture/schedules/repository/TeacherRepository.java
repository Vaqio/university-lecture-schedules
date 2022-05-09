package com.github.vaqio.university.lecture.schedules.repository;

import com.github.vaqio.university.lecture.schedules.repository.model.account.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

  Optional<Teacher> findByName(String name);

  Optional<Teacher> findByNameIgnoreCase(String name);

  List<Teacher> findAllBySubjectId(Long subjectId);

  boolean existsByName(String name);

  boolean existsByNameIgnoreCase(String name);

  void deleteByName(String name);

  void deleteByNameIgnoreCase(String name);

}
