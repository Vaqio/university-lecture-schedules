package com.github.vaqio.university.lecture.schedules.repository.model.audit;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class DateAudit {

  @Temporal(TemporalType.TIMESTAMP)
  @CreatedDate
  @JsonIgnore
  @Column(name = "created_at", updatable = false, nullable = false)
  private Date createdAt;

  @Temporal(TemporalType.TIMESTAMP)
  @LastModifiedDate
  @JsonIgnore
  @Column(name = "created_at", updatable = false, nullable = false)
  private Date updatedAt;

}
