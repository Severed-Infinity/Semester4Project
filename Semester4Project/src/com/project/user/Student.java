package com.project.user;

import com.project.controller.*;

import java.time.*;

public class Student extends User {
  private final int courseCode;
  private final boolean repeatStudent;

  public Student(
      final String code,
      final String firstName,
      final String lastName,
      final String password,
      final LocalDate dateOfBirth,
      int courseCode,
      boolean repeatStudent
  ) {
    super(code, firstName, lastName, password, dateOfBirth);
    this.courseCode = courseCode;
    this.repeatStudent = repeatStudent;
  }

  public boolean isRepeatStudent() {
    return repeatStudent;
  }

  public int getCourseCode() {
    return courseCode;
  }
}
