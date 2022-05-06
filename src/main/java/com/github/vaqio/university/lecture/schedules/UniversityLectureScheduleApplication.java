package com.github.vaqio.university.lecture.schedules;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class UniversityLectureScheduleApplication {

  public static void main(String[] args) {
    SpringApplication.run(UniversityLectureScheduleApplication.class, args);
  }

}
