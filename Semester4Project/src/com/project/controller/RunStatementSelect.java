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
   * Query users.
   *
   * @param connection      the connection
   */
  public void queryUsers(Connection connection) {
    System.out.println("Querying Users");
    queryStudents(connection);
    queryLecturers(connection);
    queryAdmins(connection);
    User.users.addAll(User.students);
    User.users.addAll(User.lecturers);
    User.users.addAll(User.admins);
    for (User user : User.users) {
      System.out.printf("%s, %s,%s%n", user.getCode(), user.getFirstName(),
          user.getClass().getName());
    }
  }

  /**
   * Query lecturers.
   *
   * @param connection      the connection
   */
  private void queryLecturers(final Connection connection) {
    try {
      setQueryType(connection.createStatement());
      setResultSet(
          getQueryType().executeQuery(
              "SELECT USER_ID, treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).USER_NAME_FIRST, " +
                  "treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).USER_NAME_LAST, " +
                  "treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).DATE_OF_BIRTH, " +
                  "treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).USER_PASSWORD, " +
                  "treat(USER_OBJ AS TIMETABLE_USER_OBJ_LECTURER).HOURS_WEEK " +
                  "FROM TIMETABLE.TIMETABLE_USERS WHERE USER_OBJ IS OF " +
                  "(TIMETABLE_USER_OBJ_LECTURER)"
          )
      );
      while (getResultSet().next()) {
        Lecturer Lecturer = new Lecturer(getResultSet().getString(1), getResultSet().getString(2),
            getResultSet().getString(3), Date.valueOf(getResultSet().getString(4)),
            getResultSet().getString(5),
            getResultSet().getInt(6), getResultSet().getInt(7));
        User.lecturers.add(Lecturer);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Query admins.
   *
   * @param connection      the connection
   */
  private void queryAdmins(final Connection connection) {
    try {
      setQueryType(connection.createStatement());
      setResultSet(
          getQueryType().executeQuery(
              "SELECT USER_ID, treat(USER_OBJ AS TIMETABLE_USER_OBJ_ADMIN).USER_NAME_FIRST, " +
                  "treat(USER_OBJ AS TIMETABLE_USER_OBJ_ADMIN).USER_NAME_LAST, " +
                  "treat(USER_OBJ AS TIMETABLE_USER_OBJ_ADMIN).DATE_OF_BIRTH, " +
                  "treat(USER_OBJ AS TIMETABLE_USER_OBJ_ADMIN).USER_PASSWORD, " +
                  "treat(USER_OBJ AS TIMETABLE_USER_OBJ_ADMIN).TITLE " +
                  "FROM TIMETABLE.TIMETABLE_USERS WHERE USER_OBJ IS OF (TIMETABLE_USER_OBJ_ADMIN)"
          )
      );
      while (getResultSet().next()) {
        Admin admin = new Admin(getResultSet().getString(1), getResultSet().getString(2),
            getResultSet().getString(3), Date.valueOf(getResultSet().getString(4)),
            getResultSet().getString(5)
            , getResultSet().getString(6));
        User.admins.add(admin);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Query students.
   *
   * @param connection      the connection
   */
  private void queryStudents(final Connection connection) {
    try {
      setQueryType(connection.createStatement());
      setResultSet(
          getQueryType().executeQuery(
              "SELECT USER_ID, treat(USER_OBJ AS TIMETABLE_USER_OBJ_STUDENT).USER_NAME_FIRST, " +
                  "treat(USER_OBJ AS TIMETABLE_USER_OBJ_STUDENT).USER_NAME_LAST, " +
                  "treat(USER_OBJ AS TIMETABLE_USER_OBJ_STUDENT).DATE_OF_BIRTH, " +
                  "treat(USER_OBJ AS TIMETABLE_USER_OBJ_STUDENT).USER_PASSWORD, " +
                  "treat(USER_OBJ AS TIMETABLE_USER_OBJ_STUDENT).COURSE_CODE, " +
                  "treat(USER_OBJ AS TIMETABLE_USER_OBJ_STUDENT).REPEAT_STUDENT FROM " +
                  "TIMETABLE.TIMETABLE_USERS WHERE USER_OBJ IS OF (TIMETABLE_USER_OBJ_STUDENT)"
          )
      );
      while (getResultSet().next()) {
        Student student = new Student(getResultSet().getString(1), getResultSet().getString(2),
            getResultSet().getString(3), Date.valueOf(getResultSet().getString(4)),
            getResultSet().getString(5),
            getResultSet().getString(6),
            Boolean.parseBoolean(String.valueOf((getResultSet().getInt(7)))));
        User.students.add(student);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Query timetables.
   *
   * @param connection the connection
   */
  public void queryTimetables(final Connection connection) {
    try {
      setQueryType(connection.createStatement());
      setResultSet(getQueryType().executeQuery("SELECT * FROM TIMETABLE_TIMETABLE"));
      while (getResultSet().next()) {
        Timetable timetable = new Timetable(getResultSet().getInt(1), getResultSet().getInt(2));
        Timetable.timetables.add(timetable);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Query department.
   *
   * @param connection      the connection
   */
  public void queryDepartment(Connection connection) {
    try {
      setQueryType(connection.createStatement());
      setResultSet(getQueryType().executeQuery("SELECT * FROM TIMETABLE.TIMETABLE_DEPARTMENT"));
      while (getResultSet().next()) {
        Department department = new Department(getResultSet().getString(1),
            getResultSet().getString(2),
            getResultSet().getString(3), getResultSet().getString(4));
        Department.departments.add(department);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Query school.
   *
   * @param connection      the connection
   */
  public void querySchool(Connection connection) {
    try {
      setQueryType(connection.createStatement());
      setResultSet(getQueryType().executeQuery("SELECT * FROM TIMETABLE_SCHOOL"));
      while (getResultSet().next()) {
        School school = new School(getResultSet().getString(1), getResultSet().getString(2));
        School.schools.add(school);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Query course.
   *
   * @param connection      the connection
   */
  public void queryCourse(Connection connection) {
    try {
      setQueryType(connection.createStatement());
      setResultSet(getQueryType().executeQuery("SELECT * FROM TIMETABLE.TIMETABLE_COURSE"));
      while (getResultSet().next()) {
        Course course = new Course(getResultSet().getString(1), getResultSet().getString(2),
            getResultSet().getString(3), getResultSet().getString(4), getResultSet().getString(5),
            getResultSet().getString(6), getResultSet().getInt(7),
            getResultSet().getInt(8), getResultSet().getInt(9), getResultSet().getInt(10));
        Course.courses.add(course);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Query module.
   *
   * @param connection the connection
   */
  public void queryModule(Connection connection) {
    try {
      setQueryType(connection.createStatement());
      setResultSet(getQueryType().executeQuery("SELECT * FROM TIMETABLE_MODULE"));
      while (getResultSet().next()) {
        Module module = new Module(getResultSet().getInt(1), getResultSet().getString(2),
            getResultSet().getInt(3), getResultSet().getInt(4), getResultSet().getInt(5),
            getResultSet().getInt(6));
        Module.modules.add(module);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Query class period.
   *
   * @param connection the connection
   */
  public void queryClassPeriod(Connection connection) {
    try {
      setQueryType(connection.createStatement());
      setResultSet(getQueryType().executeQuery("SELECT * FROM CLASS_PERIOD"));
      while (getResultSet().next()) {
        ClassPeriod classPeriod = new ClassPeriod(getResultSet().getInt(1),
            getResultSet().getString(2), getResultSet().getInt(3));
        ClassPeriod.classPeriods.add(classPeriod);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Query course module.
   *
   * @param connection the connection
   */
  public void queryCourseModule(Connection connection) {
    try {
      setQueryType(connection.createStatement());
      setResultSet(getQueryType().executeQuery("SELECT * FROM COURSE_MODULE"));
      while (getResultSet().next()) {
        CourseModule courseModule = new CourseModule(getResultSet().getString(1),
            getResultSet().getInt(2), getResultSet().getInt(3), getResultSet().getInt(4));
        CourseModule.courseModules.add(courseModule);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Query module lecturer.
   *
   * @param connection the connection
   */
  public void queryModuleLecturer(Connection connection) {
    try {
      setQueryType(connection.createStatement());
      setResultSet(getQueryType().executeQuery("SELECT * FROM module_lecturer"));
      while (getResultSet().next()) {
        ModuleLecturer moduleLecturer = new ModuleLecturer(getResultSet().getInt(1),
            getResultSet().getInt(2));
        ModuleLecturer.moduleLectuers.add(moduleLecturer);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Query room.
   *
   * @param connection the connection
   */
  public void queryRoom(Connection connection) {
    try {
      setQueryType(connection.createStatement());
      setResultSet(getQueryType().executeQuery("SELECT * FROM TIMETABLE_ROOM"));
      while (getResultSet().next()) {
        Room room = new Room(getResultSet().getInt(1), getResultSet().getInt(2),
            getResultSet().getString(3), getResultSet().getBoolean(4), getResultSet().getInt(5));
        Room.rooms.add(room);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

}
