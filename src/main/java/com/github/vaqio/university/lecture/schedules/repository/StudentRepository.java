package com.github.vaqio.university.lecture.schedules.repository;

import com.github.vaqio.university.lecture.schedules.repository.model.account.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

  Optional<Student> findByEmail(String email);

  Optional<Student> findByEmailIgnoreCase(String email);

  List<Student> findAllByFirstName(String firstName);

  List<Student> findAllByLastName(String lastName);

  boolean existsByEmail(String email);

  boolean existsByEmailIgnoreCase(String email);

  void deleteByEmail(String email);

  void deleteByEmailIgnoreCase(String email);

}
