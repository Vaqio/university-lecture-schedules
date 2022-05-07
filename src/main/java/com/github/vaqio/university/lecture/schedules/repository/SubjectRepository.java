package com.github.vaqio.university.lecture.schedules.repository;

import com.github.vaqio.university.lecture.schedules.repository.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

  Optional<Subject> findByName(String name);

  Optional<Subject> findByNameIgnoreCase(String name);

  boolean existsByName(String name);

  boolean existsByNameIgnoreCase(String name);

  void deleteByName(String name);

  void deleteByNameIgnoreCase(String name);

}
