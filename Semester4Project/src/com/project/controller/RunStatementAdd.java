package com.project.controller;

import com.project.database.*;
import com.project.user.*;

import java.sql.*;

/**
 * Project Semester4Project
 *
 * This class is part of a project
 * that is aimed at improving ITT's
 * timetable system
 *
 * Created by david on 4/30/2014.
 */
class RunStatementAdd extends RunStatement {
  public void addLecturers(
      final String code, final String firstName, final String lastName, final Date dateOfBirth,
      final String password, final int hoursWeek, final int timetableCode
  ) {
    try {
      this.setQueryPreparation(
          this.getConnection().prepareStatement(String.format(
              "INSERT INTO TIMETABLE_USERS (USER_ID, USER_OBJ) VALUES (?, " +
                  "Timetable_user_obj_lecturer(?,?,?,?,?,?))"
          ))
      );
      User.LECTURERS.add(
          Lecturer.createLecturer(code, firstName, lastName, dateOfBirth, password, hoursWeek,
              timetableCode)
      );
      this.getQueryPreparation().setString(1, code);
      this.getQueryPreparation().setString(2, firstName);
      this.getQueryPreparation().setString(3, lastName);
      this.getQueryPreparation().setDate(4, dateOfBirth);
      this.getQueryPreparation().setString(5, password);
      this.getQueryPreparation().setInt(6, hoursWeek);
      this.getQueryPreparation().setInt(7, timetableCode);
      this.getQueryPreparation().executeQuery();
    } catch (final SQLException exception) {
      exception.printStackTrace();
    }

  }

  public void addStudent(
      final String code, final String firstName, final String lastName, final Date dateOfBirth,
      final String password, final String courseCode, final boolean repeatStudent
  ) {
    try {
      this.setQueryPreparation(
          this.getConnection().prepareStatement(String.format(
              "INSERT INTO TIMETABLE_USERS (USER_ID, USER_OBJ) VALUES (?, " +
                  "Timetable_user_obj_student(?,?,?,?,?,?))"
          ))
      );
      User.USERS.add(
          Student.createStudent(code, firstName, lastName, dateOfBirth, password, courseCode,
              repeatStudent)
      );
      this.getQueryPreparation().setString(1, code);
      this.getQueryPreparation().setString(2, firstName);
      this.getQueryPreparation().setString(3, lastName);
      this.getQueryPreparation().setDate(4, dateOfBirth);
      this.getQueryPreparation().setString(5, password);
      this.getQueryPreparation().setString(6, courseCode);
      final int repeat = repeatStudent ? 1 : 0;
      this.getQueryPreparation().setInt(7, repeat);
      this.getQueryPreparation().executeQuery();
    } catch (final SQLException exception) {
      exception.printStackTrace();
    }

  }

  public void addAdmin(
      final String code, final String firstName, final String lastName, final Date dateOfBirth,
      final String password, final String title
  ) {
    try {
      this.setQueryPreparation(
          this.getConnection().prepareStatement(String.format(
              "INSERT INTO TIMETABLE_USERS (USER_ID, USER_OBJ) VALUES (?, " +
                  "Timetable_user_obj_student(?,?,?,?,?))"
          ))
      );
      User.USERS.add(
          Admin.createAdmin(code, firstName, lastName, dateOfBirth, password, title)
      );
      this.getQueryPreparation().setString(1, code);
      this.getQueryPreparation().setString(2, firstName);
      this.getQueryPreparation().setString(3, lastName);
      this.getQueryPreparation().setDate(4, dateOfBirth);
      this.getQueryPreparation().setString(5, password);
      this.getQueryPreparation().setString(6, title);
      this.getQueryPreparation().executeQuery();
    } catch (final SQLException exception) {
      exception.printStackTrace();
    }

  }

  public void addCourse(
      final String code, final String courseName, final String courseType,
      final String headOfCourse, final String department,
      final int lengthOfCourse,
      final int year, final int semester, final int timetable
  ) {
    try {
      this.setQueryPreparation(
          this.getConnection().prepareStatement(
              "INSERT INTO TIMETABLE_COURSE (COURSE_CODE, COURSE_NAME, COURSE_TYPE, " +
                  "COURSE_LENGTH, COURSE_YEAR, COURSE_SEMESTER, COURSE_HEAD, DEPARTMENT_ID, " +
                  " TIMETABLE_ID) VALUES (?,?,?,?,?,?,?,?,?)"
          )
      );
      Course.COURSES.add(Course.createCourse(code, courseName, courseType, headOfCourse, department,
          lengthOfCourse, year, semester, timetable));
      this.getQueryPreparation().setString(1, code);
      this.getQueryPreparation().setString(2, courseName);
      this.getQueryPreparation().setString(3, courseType);
      this.getQueryPreparation().setInt(4, lengthOfCourse);
      this.getQueryPreparation().setInt(5, year);
      this.getQueryPreparation().setInt(6, semester);
      this.getQueryPreparation().setString(7, headOfCourse);
      this.getQueryPreparation().setString(8, department);
      this.getQueryPreparation().setInt(9, timetable);
      this.getQueryPreparation().executeQuery();
    } catch (final SQLException exception) {
      exception.printStackTrace();
    }

  }
}
