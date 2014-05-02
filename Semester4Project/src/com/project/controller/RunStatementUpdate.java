package com.project.controller;

import java.sql.*;

/**
 * Project Semester4Project
 *
 * This class is part of a project that is aimed at improving ITT's timetable
 * system
 *
 * Created by david on 4/30/2014.
 */
class RunStatementUpdate extends RunStatement {
  public void updateLecturers(
      final Connection connection, final String code,
      final String firstName,
      final String lastName,
      final Date dateOfBirth,
      final String password,
      final int hoursWeek,
      final int timetableCode
  ) {
    try {
      final String updateString = "UPDATE TIMETABLE_USERS SET USER_ID =? , " +
          "USER_OBJ = (treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).USER_NAME_FIRST = " +
          "?, " +
          "treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).USER_NAME_LAST = ?, " +
          "treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).DATE_OF_BIRTH = ?, " +
          "treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).USER_PASSWORD = ?, " +
          "treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).HOURS_WEEK = ?, " +
          "treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).TIMETABLE_CODE = ?)";
      this.setQueryPreparation(connection.prepareStatement(updateString));
      this.setResultSet(this.getQueryPreparation().executeQuery());
    } catch (final SQLException e) {
      e.getMessage();
      e.printStackTrace();
    }
    try {
      while (this.getResultSet().next()) {
        this.getQueryPreparation().setString(1, code);
        this.getQueryPreparation().setString(2, firstName);
        this.getQueryPreparation().setString(3, lastName);
        this.getQueryPreparation().setDate(4, dateOfBirth);
        this.getQueryPreparation().setString(5, password);
        this.getQueryPreparation().setInt(6, hoursWeek);
        this.getQueryPreparation().setInt(7, timetableCode);
        this.getQueryPreparation().executeUpdate();
        System.out.println("Did this even run?");
      }
    } catch (final SQLException e) {
      e.printStackTrace();
    } catch (final RuntimeException e) {
      e.getMessage();
      e.printStackTrace();
    }
  }

  public void updateStudent(
      final Connection connection, final String code,
      final String firstName,
      final String lastName,
      final Date dateOfBirth,
      final String password,
      final String courseCode,
      final Boolean repeatStudent
  ) {
    try {
      final String updateString = "UPDATE TIMETABLE_USERS SET USER_ID =? , " +
          "USER_OBJ = (treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).USER_NAME_FIRST = " +
          "?, " +
          "treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).USER_NAME_LAST = ?, " +
          "treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).DATE_OF_BIRTH = ?, " +
          "treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).USER_PASSWORD = ?, " +
          "treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).HOURS_WEEK = ?, " +
          "treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).TIMETABLE_CODE = ?)";
      this.setQueryPreparation(connection.prepareStatement(updateString));
      this.setResultSet(this.getQueryPreparation().executeQuery());
    } catch (final SQLException e) {
      e.getMessage();
      e.printStackTrace();
    }
    try {
      while (this.getResultSet().next()) {
        this.getQueryPreparation().setString(1, code);
        this.getQueryPreparation().setString(2, firstName);
        this.getQueryPreparation().setString(3, lastName);
        this.getQueryPreparation().setDate(4, dateOfBirth);
        this.getQueryPreparation().setString(5, password);
        this.getQueryPreparation().setString(6, courseCode);
        this.getQueryPreparation().setBoolean(7, repeatStudent);
        this.getQueryPreparation().executeUpdate();
        System.out.println("Did this even run?");
      }
    } catch (final SQLException e) {
      e.printStackTrace();
    } catch (final RuntimeException e) {
      e.getMessage();
      e.printStackTrace();
    }
  }

  public void updateAdmin(
      final Connection connection, final String code,
      final String firstName,
      final String lastName,
      final Date dateOfBirth,
      final String password,
      final String title
  ) {
    try {
      final String updateString = "UPDATE TIMETABLE_USERS SET USER_ID =? , " +
          "USER_OBJ = (treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).USER_NAME_FIRST = " +
          "?, " +
          "treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).USER_NAME_LAST = ?, " +
          "treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).DATE_OF_BIRTH = ?, " +
          "treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).USER_PASSWORD = ?, " +
          "treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).HOURS_WEEK = ?, " +
          "treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).TIMETABLE_CODE = ?)";
      this.setQueryPreparation(connection.prepareStatement(updateString));
      this.setResultSet(this.getQueryPreparation().executeQuery());
    } catch (final SQLException e) {
      e.getMessage();
      e.printStackTrace();
    }
    try {
      while (this.getResultSet().next()) {
        this.getQueryPreparation().setString(1, code);
        this.getQueryPreparation().setString(2, firstName);
        this.getQueryPreparation().setString(3, lastName);
        this.getQueryPreparation().setDate(4, dateOfBirth);
        this.getQueryPreparation().setString(5, password);
        this.getQueryPreparation().setString(6, title);
        this.getQueryPreparation().executeUpdate();
        System.out.println("Did this even run?");
      }
    } catch (final SQLException e) {
      e.printStackTrace();
    } catch (final RuntimeException e) {
      e.getMessage();
      e.printStackTrace();
    }
  }

  public void updateCourse(
      final Connection connection, final String code,
      final String courseName,
      final String courseType,
      final String headOfCourse,
      final String department,
      final int lengthOfCourse,
      final int year,
      final int semester,
      final int timetable
  ) {
    try {
      final String updateString = "UPDATE TIMETABLE_COURSE SET COURSE_CODE = ?, COURSE_NAME = ?, " +
          "COURSE_TYPE = ?, COURSE_LENGTH = ?, COURSE_YEAR = ?, COURSE_SEMESTER = ?, " +
          "COURSE_HEAD = ?, DEPARTMENT_ID = ?, TIMETABLE_ID = ?";
      this.setQueryPreparation(connection.prepareStatement(updateString));
      this.setResultSet(this.getQueryPreparation().executeQuery());
    } catch (final SQLException e) {
      e.getMessage();
      e.printStackTrace();
    }
    try {
      while (this.getResultSet().next()) {
        this.getQueryPreparation().setString(1, code);
        this.getQueryPreparation().setString(2, courseName);
        this.getQueryPreparation().setString(3, courseType);
        this.getQueryPreparation().setString(4, headOfCourse);
        this.getQueryPreparation().setString(5, department);
        this.getQueryPreparation().setInt(6, lengthOfCourse);
        this.getQueryPreparation().setInt(7, year);
        this.getQueryPreparation().setInt(8, semester);
        this.getQueryPreparation().setInt(9, timetable);
        this.getQueryPreparation().executeUpdate();
        System.out.println("Did this even run?");
      }
    } catch (final SQLException e) {
      e.printStackTrace();
    } catch (final RuntimeException e) {
      e.getMessage();
      e.printStackTrace();
    }
  }

  public void updateModule(
      final Connection connection, final int code,
      final String name,
      final int semester,
      final int weeklyHours,
      final int lecturers,
      final int courseCode
  ) {
    try {
      final String updateString = "UPDATE TIMETABLE_MODULE SET MODULE_CODE = ?, MODULE_NAME = ?, " +
          "COURSE_ID = ?," + "SEMESTER = ?, WEEKLY_HOURS = ?, LECTURERS = ?";
      this.setQueryPreparation(connection.prepareStatement(updateString));
      this.setResultSet(this.getQueryPreparation().executeQuery());
    } catch (final SQLException e) {
      e.getMessage();
      e.printStackTrace();
    }
    try {
      while (this.getResultSet().next()) {
        this.getQueryPreparation().setInt(1, code);
        this.getQueryPreparation().setString(2, name);
        this.getQueryPreparation().setInt(3, semester);
        this.getQueryPreparation().setInt(4, weeklyHours);
        this.getQueryPreparation().setInt(5, lecturers);
        this.getQueryPreparation().setInt(6, courseCode);
        this.getQueryPreparation().executeUpdate();
        System.out.println("Did this even run?");
      }
    } catch (final SQLException e) {
      e.printStackTrace();
    } catch (final RuntimeException e) {
      e.getMessage();
      e.printStackTrace();
    }
  }

  public void updateTimetable(final Connection connection, final int code, final int timeSlots) {
    try {
      final String updateString = "UPDATE TIMETABLE_TIMETABLE SET TIMETABLE_ID = ?, TIME_SLOT = ? ";
      this.setQueryPreparation(connection.prepareStatement(updateString));
      this.setResultSet(this.getQueryPreparation().executeQuery());
    } catch (final SQLException e) {
      e.getMessage();
      e.printStackTrace();
    }
    try {
      while (this.getResultSet().next()) {
        this.getQueryPreparation().setInt(1, code);
        this.getQueryPreparation().setInt(2, timeSlots);
        this.getQueryPreparation().executeUpdate();
        System.out.println("Did this even run?");
      }
    } catch (final SQLException e) {
      e.printStackTrace();
    } catch (final RuntimeException e) {
      e.getMessage();
      e.printStackTrace();
    }
  }

}

