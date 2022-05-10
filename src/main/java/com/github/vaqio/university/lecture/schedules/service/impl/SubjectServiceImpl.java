package com.github.vaqio.university.lecture.schedules.service.impl;

import com.github.vaqio.university.lecture.schedules.controller.dto.SubjectDTO;
import com.github.vaqio.university.lecture.schedules.exception.SameValueException;
import com.github.vaqio.university.lecture.schedules.repository.SubjectRepository;
import com.github.vaqio.university.lecture.schedules.repository.model.Subject;
import com.github.vaqio.university.lecture.schedules.service.SubjectService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import java.util.List;

@Getter
@Service
public class SubjectServiceImpl implements SubjectService {

  private final SubjectRepository repository;

  @Autowired
  public SubjectServiceImpl(SubjectRepository repository) {
    this.repository = repository;
  }

  @Override
  public boolean existsById(Long id) {
    return this.repository.existsById(id);
  }

  @Override
  public boolean existsByName(String name) {
    return this.repository.existsByName(name);
  }

  @Override
  public Subject create(SubjectDTO subjectDTO) {
    if (this.repository.existsByNameIgnoreCase(subjectDTO.getName())) {
      throw new EntityExistsException("A subject with the given name already exists");
    }

    Subject subject = Subject.builder()
            .name(subjectDTO.getName())
            .build();

    this.repository.save(subject);
    return subject;
  }

  @Override
  public Subject updateName(Long id, String name) {
    Subject subject = this.repository.findById(id)
            .orElseThrow(EntityNotFoundException::new);
    if (name.equalsIgnoreCase(subject.getName())) {
      throw new SameValueException("The name is the same as currently");
    }

    subject.setName(name);
    this.repository.save(subject);
    return subject;
  }

  @Override
  public void deleteById(Long id) {
    if (!this.repository.existsById(id)) {
      throw new EntityNotFoundException("None room could be found by the given id");
    }

    this.repository.deleteById(id);
  }

  @Override
  public void deleteByName(String name) {
    if (!this.repository.existsByNameIgnoreCase(name)) {
      throw new EntityNotFoundException("None room could be found by the given id");
    }

    this.repository.deleteByNameIgnoreCase(name);
  }

  @Override
  public void deleteAll() {
    this.repository.deleteAll();
  }

  @Override
  public Subject getById(Long id) {
    return this.repository.findById(id)
            .orElseThrow(EntityNotFoundException::new);
  }

  @Override
  public Subject getByName(String name) {
    return this.repository.findByNameIgnoreCase(name)
            .orElseThrow(EntityNotFoundException::new);
  }

  @Override
  public List<Subject> getAll() {
    return this.repository.findAll();
  }

}
