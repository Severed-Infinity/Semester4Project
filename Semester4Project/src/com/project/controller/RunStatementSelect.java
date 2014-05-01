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
public class RunStatementSelect extends RunStatement {
  /**
   * The constant STUDENT_LAST_NAME.
   */
  private static final String STUDENT_LAST_NAME =
      "treat(USER_OBJ AS TIMETABLE_USER_OBJ_STUDENT).USER_NAME_LAST, ";
  /**
   * The constant STUDENT_DATE_OF_BIRTH.
   */
  private static final String STUDENT_DATE_OF_BIRTH = String.format(
      "treat(USER_OBJ AS TIMETABLE_USER_OBJ_STUDENT).DATE_OF_BIRTH, ");
  /**
   * The constant STUDENT_PASSWORD.
   */
  private static final String STUDENT_PASSWORD = String.format(
      "treat(USER_OBJ AS TIMETABLE_USER_OBJ_STUDENT).USER_PASSWORD, ");
  /**
   * The constant STUDENT_COURSE_CODE.
   */
  private static final String STUDENT_COURSE_CODE = String.format(
      "treat(USER_OBJ AS TIMETABLE_USER_OBJ_STUDENT).COURSE_CODE, ");
  /**
   * The constant STUDENT_REPEATING.
   */
  private static final String STUDENT_REPEATING =
      "treat(USER_OBJ AS TIMETABLE_USER_OBJ_STUDENT).REPEAT_STUDENT FROM ";
  /**
   * The constant STUDENT_TYPE.
   */
  private static final String
      STUDENT_TYPE = String.format(
      "TIMETABLE.TIMETABLE_USERS WHERE USER_OBJ IS OF (TIMETABLE_USER_OBJ_STUDENT)");
  /**
   * The constant SELECT_FROM_TIMETABLE_TIMETABLE.
   */
  private static final String SELECT_FROM_TIMETABLE_TIMETABLE = "SELECT * FROM TIMETABLE_TIMETABLE";
  /**
   * The constant ALL_FROM_DEPARTMENT.
   */
  private static final String ALL_FROM_DEPARTMENT = String.format(
      "SELECT * FROM TIMETABLE.TIMETABLE_DEPARTMENT");
  /**
   * The constant SELECT_FROM_TIMETABLE_SCHOOL.
   */
  private static final String SELECT_FROM_TIMETABLE_SCHOOL = "SELECT * FROM TIMETABLE_SCHOOL";
  /**
   * The constant ALL_FROM_COURSE.
   */
  private static final String ALL_FROM_COURSE = String.format(
      "SELECT * FROM TIMETABLE.TIMETABLE_COURSE");
  /**
   * The constant SELECT_FROM_TIMETABLE_MODULE.
   */
  private static final String SELECT_FROM_TIMETABLE_MODULE = "SELECT * FROM TIMETABLE_MODULE";
  /**
   * The constant SELECT_FROM_CLASS_PERIOD.
   */
  private static final String SELECT_FROM_CLASS_PERIOD = "SELECT * FROM CLASS_PERIOD";
  /**
   * The constant SELECT_FROM_COURSE_MODULE.
   */
  private static final String SELECT_FROM_COURSE_MODULE = "SELECT * FROM COURSE_MODULE";
  /**
   * The constant SELECT_FROM_MODULE_LECTURER.
   */
  private static final String SELECT_FROM_MODULE_LECTURER = "SELECT * FROM MODULE_LECTURER";
  /**
   * The constant SELECT_FROM_TIMETABLE_ROOM.
   */
  private static final String SELECT_FROM_TIMETABLE_ROOM = "SELECT * FROM TIMETABLE_ROOM";

  /**
   * Instantiates a new Run statement select.
   */
  private RunStatementSelect() {super();}

  /**
   * Create run statement select.
   *
   * @return the run statement select
   */
  public static RunStatementSelect createRunStatementSelect() {return new RunStatementSelect();}

  /**
   * Query USERS.
   */
  public void queryUsers() {
    System.out.println("Querying Users");
    this.queryStudents();
    this.queryLecturers();
    this.queryAdmins();
    User.USERS.addAll(User.STUDENTS);
    User.USERS.addAll(User.LECTURERS);
    User.USERS.addAll(User.ADMINS);
    for (final User user : User.USERS) {
      user.toString();
    }
  }

  /**
   * Query LECTURERS.
   */
  public void queryLecturers() {
    try {
      this.setQueryType(this.getConnection().createStatement());
      this.setResultSet(
          this.getQueryType().executeQuery(
              String.format(
                  "SELECT USER_ID, treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER)" +
                      ".USER_NAME_FIRST, treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER)" +
                      ".USER_NAME_LAST, treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER)" +
                      ".DATE_OF_BIRTH, treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER)" +
                      ".USER_PASSWORD, treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).HOURS_WEEK " +
                      "FROM TIMETABLE.TIMETABLE_USERS WHERE USER_OBJ IS OF " +
                      "(TIMETABLE_USER_OBJ_LECTURER)"
              )
          )
      );
      while (this.getResultSet().next()) {
        final Lecturer lecturer = Lecturer.createLecturer(this.getResultSet().getString(1),
            this.getResultSet().getString(2),
            this.getResultSet().getString(3), Date.valueOf(this.getResultSet().getString(4)),
            this.getResultSet().getString(5),
            this.getResultSet().getInt(6), this.getResultSet().getInt(7));
        User.LECTURERS.add(lecturer);
      }
    } catch (final SQLException exception) {
      System.out.println(exception.getMessage());
    }
  }

  /**
   * Query ADMINS.
   */
  public void queryAdmins() {
    try {
      this.setQueryType(this.getConnection().createStatement());
      this.setResultSet(
          this.getQueryType().executeQuery(
              String.format(
                  "SELECT USER_ID, treat(USER_OBJ AS TIMETABLE_USER_OBJ_ADMIN).USER_NAME_FIRST, " +
                      "treat(USER_OBJ AS TIMETABLE_USER_OBJ_ADMIN).USER_NAME_LAST, " +
                      "treat(USER_OBJ AS TIMETABLE_USER_OBJ_ADMIN).DATE_OF_BIRTH, " +
                      "treat(USER_OBJ AS TIMETABLE_USER_OBJ_ADMIN).USER_PASSWORD, " +
                      "treat(USER_OBJ AS TIMETABLE_USER_OBJ_ADMIN).TITLE FROM TIMETABLE" +
                      ".TIMETABLE_USERS WHERE USER_OBJ IS OF (TIMETABLE_USER_OBJ_ADMIN)"
              )
          )
      );
      while (this.getResultSet().next()) {
        final Admin admin = Admin.createAdmin(this.getResultSet().getString(1),
            this.getResultSet().getString(2),
            this.getResultSet().getString(3), Date.valueOf(this.getResultSet().getString(4)),
            this.getResultSet().getString(5)
            , this.getResultSet().getString(6));
        User.ADMINS.add(admin);
      }
    } catch (final SQLException exception) {
      System.out.println(exception.getMessage());
    }
  }

  /**
   * Query STUDENTS.
   */
  public void queryStudents() {
    try {
      this.setQueryType(this.getConnection().createStatement());
      this.setResultSet(
          this.getQueryType().executeQuery(
              String.format(
                  "SELECT USER_ID, treat(USER_OBJ AS TIMETABLE_USER_OBJ_STUDENT).USER_NAME_FIRST," +
                      " %s%s%s%s%s%s",
                  STUDENT_LAST_NAME, STUDENT_DATE_OF_BIRTH, STUDENT_PASSWORD, STUDENT_COURSE_CODE,
                  STUDENT_REPEATING, STUDENT_TYPE
              )
          )
      );
      while (this.getResultSet().next()) {
        final Student student = Student.createStudent(this.getResultSet().getString(1),
            this.getResultSet().getString(2),
            this.getResultSet().getString(3), Date.valueOf(this.getResultSet().getString(4)),
            this.getResultSet().getString(5),
            this.getResultSet().getString(6),
            Boolean.parseBoolean(String.valueOf(this.getResultSet().getInt(7))));
        User.STUDENTS.add(student);
      }
    } catch (final SQLException exception) {
      System.out.println(exception.getMessage());
    }
  }

  /**
   * Query TIMETABLES.
   */
  public void queryTimetables() {
    try {
      this.setQueryType(this.getConnection().createStatement());
      this.setResultSet(this.getQueryType().executeQuery(SELECT_FROM_TIMETABLE_TIMETABLE));
      while (this.getResultSet().next()) {
        final Timetable timetable = Timetable.createTimetable(this.getResultSet().getInt(1),
            this.getResultSet().getInt(2));
        Timetable.TIMETABLES.add(timetable);
      }
    } catch (final SQLException exception) {
      System.out.println(exception.getMessage());
    }
  }

  /**
   * Query department.
   */
  public void queryDepartment() {
    try {
      this.setQueryType(this.getConnection().createStatement());
      this.setResultSet(this.getQueryType().executeQuery(ALL_FROM_DEPARTMENT));
      while (this.getResultSet().next()) {
        final Department department = Department.createDepartment(this.getResultSet().getString(1),
            this.getResultSet().getString(2),
            this.getResultSet().getString(3), this.getResultSet().getString(4));
        Department.DEPARTMENTS.add(department);
      }
    } catch (final SQLException exception) {
      System.out.println(exception.getMessage());
    }
  }

  /**
   * Query school.
   */
  public void querySchool() {
    try {
      this.setQueryType(this.getConnection().createStatement());
      this.setResultSet(this.getQueryType().executeQuery(SELECT_FROM_TIMETABLE_SCHOOL));
      while (this.getResultSet().next()) {
        final School school = School.createSchool(this.getResultSet().getString(1),
            this.getResultSet().getString(2));
        School.SCHOOLS.add(school);
      }
    } catch (final SQLException exception) {
      System.out.println(exception.getMessage());
    }
  }

  /**
   * Query course.
   */
  public void queryCourse() {
    try {
      this.setQueryType(this.getConnection().createStatement());
      this.setResultSet(this.getQueryType().executeQuery(ALL_FROM_COURSE));
      while (this.getResultSet().next()) {
        final Course course = Course.createCourse(this.getResultSet().getString(1),
            this.getResultSet().getString(2),
            this.getResultSet().getString(3), this.getResultSet().getString(4),
            this.getResultSet().getString(5),
            this.getResultSet().getInt(6), this.getResultSet().getInt(7),
            this.getResultSet().getInt(8), this.getResultSet().getInt(9));
        Course.COURSES.add(course);
      }
    } catch (final SQLException exception) {
      System.out.println(exception.getMessage());
    }
  }

  /**
   * Query module.
   */
  public void queryModule() {
    try {
      this.setQueryType(this.getConnection().createStatement());
      this.setResultSet(this.getQueryType().executeQuery(SELECT_FROM_TIMETABLE_MODULE));
      while (this.getResultSet().next()) {
        final Module module = Module.createModule(this.getResultSet().getInt(1),
            this.getResultSet().getString(2),
            this.getResultSet().getInt(3), this.getResultSet().getInt(4),
            this.getResultSet().getInt(5),
            this.getResultSet().getInt(6));
        Module.MODULES.add(module);
      }
    } catch (final SQLException exception) {
      System.out.println(exception.getMessage());
    }
  }

  /**
   * Query class period.
   */
  public void queryClassPeriod() {
    try {
      this.setQueryType(this.getConnection().createStatement());
      this.setResultSet(this.getQueryType().executeQuery(SELECT_FROM_CLASS_PERIOD));
      while (this.getResultSet().next()) {
        final ClassPeriod classPeriod = ClassPeriod.createClassPeriod(this.getResultSet().getInt(1),
            this.getResultSet().getString(2), this.getResultSet().getInt(3));
        ClassPeriod.CLASS_PERIODS.add(classPeriod);
      }
    } catch (final SQLException exception) {
      System.out.println(exception.getMessage());
    }
  }

  /**
   * Query course module.
   */
  public void queryCourseModule() {
    try {
      this.setQueryType(this.getConnection().createStatement());
      this.setResultSet(this.getQueryType().executeQuery(SELECT_FROM_COURSE_MODULE));
      while (this.getResultSet().next()) {
        final CourseModule courseModule = CourseModule.createCourseModule(
            this.getResultSet().getString(1),
            this.getResultSet().getInt(2), this.getResultSet().getInt(3),
            this.getResultSet().getInt(4));
        CourseModule.COURSE_MODULES.add(courseModule);
      }
    } catch (final SQLException exception) {
      System.out.println(exception.getMessage());
    }
  }

  /**
   * Query module lecturer.
   */
  public void queryModuleLecturer() {
    try {
      this.setQueryType(this.getConnection().createStatement());
      this.setResultSet(this.getQueryType().executeQuery(SELECT_FROM_MODULE_LECTURER));
      while (this.getResultSet().next()) {
        final ModuleLecturer moduleLecturer = ModuleLecturer.createModuleLecturer(
            this.getResultSet().getInt(1),
            this.getResultSet().getInt(2));
        ModuleLecturer.MODULE_LECTURERS.add(moduleLecturer);
      }
    } catch (final SQLException exception) {
      System.out.println(exception.getMessage());
    }
  }

  /**
   * Query room.
   */
  public void queryRoom() {
    try {
      this.setQueryType(this.getConnection().createStatement());
      this.setResultSet(this.getQueryType().executeQuery(SELECT_FROM_TIMETABLE_ROOM));
      while (this.getResultSet().next()) {
        final Room room = Room.createRoom(this.getResultSet().getInt(1),
            this.getResultSet().getInt(2),
            this.getResultSet().getString(3), this.getResultSet().getBoolean(4),
            this.getResultSet().getInt(5));
        Room.ROOMS.add(room);
      }
    } catch (final SQLException exception) {
      System.out.println(exception.getMessage());
    }
  }

}
