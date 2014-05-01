package com.project.user;

import com.project.database.*;

import java.sql.*;
import java.text.*;

public class Student extends User {
  private final String courseCode;
  private final boolean repeatStudent;

  private Student(
      final String code,
      final String firstName,
      final String lastName,
      final Date dateOfBirth,
      final String password,
      final String courseCode,
      final boolean repeatStudent
  ) {
    super(code, firstName, lastName, dateOfBirth, password);
    this.courseCode = courseCode;
    this.repeatStudent = repeatStudent;
  }

  public static Student createStudent(
      final String code,
      final String firstName,
      final String lastName,
      final Date dateOfBirth,
      final String password,
      final String courseCode,
      final boolean repeatStudent
  ) {
    return new Student(code, firstName, lastName, dateOfBirth, password, courseCode, repeatStudent);
  }

  public boolean isRepeatStudent() {
    return this.repeatStudent;
  }

  public Course getCourseCode() {
    Course courseReturn = null;
    for (final Course course : Course.COURSES) {
      final String code = course.getCode();
      if (code.equals(this.courseCode)) {
        courseReturn = course;

      }
    }
    return courseReturn;
  }

  @Override
  public String toString() {
    return MessageFormat.format("Student'{'courseCode=''{0}'', repeatStudent={1}'}'",
        this.courseCode,
        this.repeatStudent);
  }
}
