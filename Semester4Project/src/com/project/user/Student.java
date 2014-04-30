package com.project.user;

import com.project.database.*;

import java.sql.*;

public class Student extends User {
  private final String courseCode;
  private final boolean repeatStudent;

  public Student(
      final String code,
      final String firstName,
      final String lastName,
      final Date dateOfBirth,
      final String password,
      String courseCode,
      boolean repeatStudent
  ) {
    super(code, firstName, lastName, dateOfBirth, password);
    this.courseCode = courseCode;
    this.repeatStudent = repeatStudent;
  }

  public boolean isRepeatStudent() {
    return repeatStudent;
  }

  public Course getCourseCode() {
    for (Course course : Course.courses) {
      if (course.getCode().equals(courseCode)) {
        return course;
      }
    }
    return null;
  }
}
