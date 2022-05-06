package com.github.vaqio.university.lecture.schedules.repository.model.audit;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable<T> {

  @CreatedBy
  @Column(name = "last_modified_by", updatable = false, nullable = false)
  private T createdBy;

  @Temporal(TemporalType.TIMESTAMP)
  @CreatedDate
  @Column(name = "created_at", updatable = false, nullable = false)
  private Date creationDate;

  @LastModifiedBy
  @Column(name = "last_modified_by", updatable = false, nullable = false)
  private T lastModifiedBy;

  @Temporal(TemporalType.TIMESTAMP)
  @LastModifiedDate
  @Column(name = "created_at", updatable = false, nullable = false)
  private Date lastModifiedDate;

}
