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
  private static final String STUDENT_LAST_NAME =
      "treat(USER_OBJ AS TIMETABLE_USER_OBJ_STUDENT).USER_NAME_LAST, ";
  private static final String STUDENT_DATE_OF_BIRTH = "treat" +
      "(USER_OBJ AS TIMETABLE_USER_OBJ_STUDENT).DATE_OF_BIRTH, ";
  private static final String STUDENT_PASSWORD = "treat" +
      "(USER_OBJ AS TIMETABLE_USER_OBJ_STUDENT).USER_PASSWORD, ";
  private static final String STUDENT_COURSE_CODE = "treat" +
      "(USER_OBJ AS TIMETABLE_USER_OBJ_STUDENT).COURSE_CODE, ";
  private static final String STUDENT_REPEATING =
      "treat(USER_OBJ AS TIMETABLE_USER_OBJ_STUDENT).REPEAT_STUDENT FROM ";
  private static final String
      STUDENT_TYPE = "TIMETABLE" +
      ".TIMETABLE_USERS WHERE USER_OBJ IS OF (TIMETABLE_USER_OBJ_STUDENT)";
  private static final String SELECT_FROM_TIMETABLE_TIMETABLE = "SELECT * FROM TIMETABLE_TIMETABLE";
  private static final String ALL_FROM_DEPARTMENT = "SELECT * FROM " +
      "TIMETABLE.TIMETABLE_DEPARTMENT";
  private static final String SELECT_FROM_TIMETABLE_SCHOOL = "SELECT * FROM TIMETABLE_SCHOOL";
  private static final String ALL_FROM_COURSE = "SELECT * FROM TIMETABLE" +
      ".TIMETABLE_COURSE";
  private static final String SELECT_FROM_TIMETABLE_MODULE = "SELECT * FROM TIMETABLE_MODULE";
  private static final String SELECT_FROM_CLASS_PERIOD = "SELECT * FROM CLASS_PERIOD";
  private static final String SELECT_FROM_COURSE_MODULE = "SELECT * FROM COURSE_MODULE";
  private static final String SELECT_FROM_MODULE_LECTURER = "SELECT * FROM MODULE_LECTURER";
  private static final String SELECT_FROM_TIMETABLE_ROOM = "SELECT * FROM TIMETABLE_ROOM";

  private RunStatementSelect() {super();}

  public static RunStatementSelect createRunStatementSelect() {return new RunStatementSelect();}

  /**
   * Query USERS.
   *
   * @param connection
   *     the connection
   */
  public void queryUsers(final Connection connection) {
    System.out.println("Querying Users");
    this.queryStudents(connection);
    this.queryLecturers(connection);
    this.queryAdmins(connection);
    User.USERS.addAll(User.STUDENTS);
    User.USERS.addAll(User.LECTURERS);
    User.USERS.addAll(User.ADMINS);
    for (final User user : User.USERS) {
      final Class<? extends User> userClass = user.getClass();
      System.out.printf("%s, %s,%s%n", user.getCode(), user.getFirstName(),
          userClass.getName());
    }
  }

  /**
   * Query LECTURERS.
   *
   * @param connection
   *     the connection
   */
  private void queryLecturers(final Connection connection) {
    try {
      this.setQueryType(connection.createStatement());
      this.setResultSet(
          this.getQueryType().executeQuery(
              "SELECT USER_ID, treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).USER_NAME_FIRST, " +
                  "treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).USER_NAME_LAST, " +
                  "treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).DATE_OF_BIRTH, " +
                  "treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).USER_PASSWORD, " +
                  "treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).HOURS_WEEK " +
                  "FROM TIMETABLE.TIMETABLE_USERS WHERE USER_OBJ IS OF " +
                  "(TIMETABLE_USER_OBJ_LECTURER)"
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
   *
   * @param connection
   *     the connection
   */
  private void queryAdmins(final Connection connection) {
    try {
      this.setQueryType(connection.createStatement());
      this.setResultSet(
          this.getQueryType().executeQuery(
              "SELECT USER_ID, treat(USER_OBJ AS TIMETABLE_USER_OBJ_ADMIN).USER_NAME_FIRST, " +
                  "treat(USER_OBJ AS TIMETABLE_USER_OBJ_ADMIN).USER_NAME_LAST, " +
                  "treat(USER_OBJ AS TIMETABLE_USER_OBJ_ADMIN).DATE_OF_BIRTH, " +
                  "treat(USER_OBJ AS TIMETABLE_USER_OBJ_ADMIN).USER_PASSWORD, " +
                  "treat(USER_OBJ AS TIMETABLE_USER_OBJ_ADMIN).TITLE " +
                  "FROM TIMETABLE.TIMETABLE_USERS WHERE USER_OBJ IS OF (TIMETABLE_USER_OBJ_ADMIN)"
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
   *
   * @param connection
   *     the connection
   */
  private void queryStudents(final Connection connection) {
    try {
      this.setQueryType(connection.createStatement());
      this.setResultSet(
          this.getQueryType().executeQuery(
              "SELECT USER_ID, treat(USER_OBJ AS TIMETABLE_USER_OBJ_STUDENT).USER_NAME_FIRST, " +
                  STUDENT_LAST_NAME +
                  STUDENT_DATE_OF_BIRTH +
                  STUDENT_PASSWORD +
                  STUDENT_COURSE_CODE +
                  STUDENT_REPEATING +
                  STUDENT_TYPE
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
   *
   * @param connection
   *     the connection
   */
  public void queryTimetables(final Connection connection) {
    try {
      this.setQueryType(connection.createStatement());
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
   *
   * @param connection
   *     the connection
   */
  public void queryDepartment(final Connection connection) {
    try {
      this.setQueryType(connection.createStatement());
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
   *
   * @param connection
   *     the connection
   */
  public void querySchool(final Connection connection) {
    try {
      this.setQueryType(connection.createStatement());
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
   *
   * @param connection
   *     the connection
   */
  public void queryCourse(final Connection connection) {
    try {
      this.setQueryType(connection.createStatement());
      this.setResultSet(this.getQueryType().executeQuery(ALL_FROM_COURSE));
      while (this.getResultSet().next()) {
        final Course course = Course.createCourse(this.getResultSet().getString(1),
            this.getResultSet().getString(2),
            this.getResultSet().getString(3), this.getResultSet().getString(4),
            this.getResultSet().getString(5),
            this.getResultSet().getString(6), this.getResultSet().getInt(7),
            this.getResultSet().getInt(8), this.getResultSet().getInt(9),
            this.getResultSet().getInt(10));
        Course.COURSES.add(course);
      }
    } catch (final SQLException exception) {
      System.out.println(exception.getMessage());
    }
  }

  /**
   * Query module.
   *
   * @param connection
   *     the connection
   */
  public void queryModule(final Connection connection) {
    try {
      this.setQueryType(connection.createStatement());
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
   *
   * @param connection
   *     the connection
   */
  public void queryClassPeriod(final Connection connection) {
    try {
      this.setQueryType(connection.createStatement());
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
   *
   * @param connection
   *     the connection
   */
  public void queryCourseModule(final Connection connection) {
    try {
      this.setQueryType(connection.createStatement());
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
   *
   * @param connection
   *     the connection
   */
  public void queryModuleLecturer(final Connection connection) {
    try {
      this.setQueryType(connection.createStatement());
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
   *
   * @param connection
   *     the connection
   */
  public void queryRoom(final Connection connection) {
    try {
      this.setQueryType(connection.createStatement());
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
