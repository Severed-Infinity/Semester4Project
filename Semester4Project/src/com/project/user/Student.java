package com.project.user;

import com.project.database.*;

import java.sql.*;

public class Student extends User {
  private final int courseCode;
  private final boolean repeatStudent;

  public Student(
      final String code,
      final String firstName,
      final String lastName,
      final Date dateOfBirth,
      final String password,
      int courseCode,
      boolean repeatStudent
  ) {
    super(code, firstName, lastName, dateOfBirth, password);
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
