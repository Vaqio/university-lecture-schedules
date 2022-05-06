package com.github.vaqio.university.lecture.schedules.repository;

import com.github.vaqio.university.lecture.schedules.repository.model.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectureRepository extends JpaRepository<Lecture, Long> {

}
