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
public class RunStatementAdd extends RunStatement {
  private RunStatementAdd() {}

  public static RunStatementAdd createRunStatementAdd() {return new RunStatementAdd();}

  private void addLecturers(
      final String code, final String firstName, final String lastName, final Date dateOfBirth,
      final String password, final int hoursWeek, final int timetableCode
  ) {
    try {
      this.setQueryPreparation(
          this.getConnection().prepareStatement(
              "INSERT INTO TIMETABLE_USERS (USER_ID, USER_OBJ) VALUES (?, " +
                  "Timetable_user_obj_lecturer(?,?,?,?,?,?))"
          )
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
          this.getConnection().prepareStatement(
              "INSERT INTO TIMETABLE_USERS (USER_ID, USER_OBJ) VALUES (?, " +
                  "Timetable_user_obj_student(?,?,?,?,?,?))"
          )
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
          this.getConnection().prepareStatement(
              "INSERT INTO TIMETABLE_USERS (USER_ID, USER_OBJ) VALUES (?, " +
                  "Timetable_user_obj_student(?,?,?,?,?))"
          )
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

  public void addModule(
      final int code, final String name, final int semester,
      final int weeklyHours, final String lecturers, final int courseCode
  ) {
    try {
      this.setQueryPreparation(
          this.getConnection().prepareStatement(
              "INSERT INTO TIMETABLE_MODULE (MODULE_CODE, MODULE_NAME, COURSE_ID," +
                  "SEMESTER, WEEKLY_HOURS, LECTURERS) VALUES (?,?,?,?,?,?)"
          )
      );
      Module.MODULES.add(Module.createModule(code, name, courseCode, semester,
          weeklyHours, lecturers));
      this.getQueryPreparation().setInt(1, code);
      this.getQueryPreparation().setString(2, name);
      this.getQueryPreparation().setInt(3, semester);
      this.getQueryPreparation().setInt(4, weeklyHours);
      this.getQueryPreparation().setString(5, lecturers);
      this.getQueryPreparation().setInt(6, courseCode);
      this.getQueryPreparation().executeQuery();
    } catch (final SQLException exception) {
      exception.printStackTrace();
    }
  }

  public void addDepartment(
      final String code, final String name, final String head, final String schoolCode
  ) {
    try {
      this.setQueryPreparation(
          this.getConnection().prepareStatement(
              "INSERT INTO TIMETABLE_DEPARTMENT (DEPARTMENT_ID, DEPARTMENT_NAME, DEPARTMENT_HEAD," +
                  " SCHOOL_ID) VALUES (?,?,?,?)"
          )
      );
      Department.DEPARTMENTS.add(Department.createDepartment(code, name, head, schoolCode));
      this.getQueryPreparation().setString(1, code);
      this.getQueryPreparation().setString(2, name);
      this.getQueryPreparation().setString(3, head);
      this.getQueryPreparation().setString(4, schoolCode);
      this.getQueryPreparation().executeQuery();
    } catch (final SQLException exception) {
      exception.printStackTrace();
    }
  }

  public void addClassPeriod(
      final int module, final String time, final int roomNumber
  ) {
    try {
      this.setQueryPreparation(
          this.getConnection().prepareStatement(
              "INSERT INTO CLASS_PERIOD (MODULE, TIME, ROOM_NUMBER)"
                  + " VALUES (?,?,?)"
          )
      );
      ClassPeriod.CLASS_PERIODS.add(ClassPeriod.createClassPeriod(module, time, roomNumber));
      this.getQueryPreparation().setInt(1, module);
      this.getQueryPreparation().setString(2, time);
      this.getQueryPreparation().setInt(3, roomNumber);
      this.getQueryPreparation().executeQuery();
    } catch (final SQLException exception) {
      exception.printStackTrace();
    }
  }

  public void addCourseModule(
      final String courseCode, final int moduleCode, final int semester, final int year
  ) {
    try {
      this.setQueryPreparation(
          this.getConnection().prepareStatement(
              "INSERT INTO COURSE_MODULE (COURSE_CODE, MODULE_CODE, SEMESTER," +
                  "YEAR) VALUES (?,?,?,?)"
          )
      );
      CourseModule.COURSE_MODULES.add(
          CourseModule.createCourseModule(courseCode, moduleCode, semester, year));
      this.getQueryPreparation().setString(1, courseCode);
      this.getQueryPreparation().setInt(2, moduleCode);
      this.getQueryPreparation().setInt(3, semester);
      this.getQueryPreparation().setInt(4, year);
      this.getQueryPreparation().executeQuery();
    } catch (final SQLException exception) {
      exception.printStackTrace();
    }
  }

  public void addModuleLecturer(
      final int moduleCode, final String userCode
  ) {
    try {
      this.setQueryPreparation(
          this.getConnection().prepareStatement(
              "INSERT INTO MODULE_LECTURER (MODULE_CODE, USER_ID)"
                  + " VALUES (?,?)"
          )
      );
      ModuleLecturer.MODULE_LECTURERS.add(
          ModuleLecturer.createModuleLecturer(moduleCode, userCode));
      this.getQueryPreparation().setInt(1, moduleCode);
      this.getQueryPreparation().setString(2, userCode);
      this.getQueryPreparation().executeQuery();
    } catch (final SQLException exception) {
      exception.printStackTrace();
    }
  }

  public void addRoom(
      final int roomNumber, final int roomSeating, final String departmnetCode, final Boolean lab,
      final int shareRoomNumber
  ) {
    try {
      this.setQueryPreparation(
          this.getConnection().prepareStatement(
              "INSERT INTO TIMETABLE_ROOM(ROOM_NUMBER, ROOM_SEATING, DEPARTMENT_ID," +
                  "LAB, SHARED_ROOM_NUMBER) VALUES (?,?,?,?,?)"
          )
      );
      Room.ROOMS.add(
          Room.createRoom(roomNumber, roomSeating, departmnetCode, lab, shareRoomNumber));
      this.getQueryPreparation().setInt(1, roomNumber);
      this.getQueryPreparation().setInt(2, roomSeating);
      this.getQueryPreparation().setString(3, departmnetCode);
      this.getQueryPreparation().setBoolean(4, lab);
      this.getQueryPreparation().setInt(5, shareRoomNumber);
      this.getQueryPreparation().executeQuery();
    } catch (final SQLException exception) {
      exception.printStackTrace();
    }
  }

  public void addSchool(
      final String code, final String name
  ) {
    try {
      this.setQueryPreparation(
          this.getConnection().prepareStatement(
              "INSERT INTO TIMETABLE_SCHOOL (SCHOOL_ID, SCHOOL_NAME)"
                  + " VALUES (?,?)"
          )
      );
      School.SCHOOLS.add(School.createSchool(code, name));
      this.getQueryPreparation().setString(1, code);
      this.getQueryPreparation().setString(2, name);
      this.getQueryPreparation().executeQuery();
    } catch (final SQLException exception) {
      exception.printStackTrace();
    }
  }

  public void addTimetable(
      final int code, final int timeSlots
  ) {
    try {
      this.setQueryPreparation(
          this.getConnection().prepareStatement(
              "INSERT INTO TIMETABLE_TIMETABLE (TIMETABLE_ID, TIME_SLOT)"
                  + " VALUES (?,?)"
          )
      );
      Timetable.TIMETABLES.add(Timetable.createTimetable(code, timeSlots));
      this.getQueryPreparation().setInt(1, code);
      this.getQueryPreparation().setInt(2, timeSlots);
      this.getQueryPreparation().executeQuery();
    } catch (final SQLException exception) {
      exception.printStackTrace();
    }
  }

}
