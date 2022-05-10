package com.github.vaqio.university.lecture.schedules.exception;

public class SameValueException extends RuntimeException {

  public SameValueException(String message) {
    super(message);
  }

  public SameValueException(String message, Throwable throwable) {
    super(message, throwable);
  }

}
