package com.project.controller;

import com.project.database.*;
import com.project.user.*;

import java.sql.*;
import java.sql.Date;
import java.util.*;

/**
 * Project Semester4Project
 *
 * This class is part of a project
 * that is aimed at improving ITT's
 * timetable system
 *
 * Created by david on 3/25/2014.
 */
public class RunStatement {
  /**
   * The Modules.
   */
  public static LinkedList<Module> modules = new LinkedList<>();
  /**
   * The Departments.
   */
  private static LinkedList<Department> departments = new LinkedList<>();
  /**
   * The Courses.
   */
  private static LinkedList<Course> courses = new LinkedList<>();
  /**
   * The Users.
   */
  public static LinkedList<User> users = new LinkedList<>();
  /**
   * The Schools.
   */
  private static LinkedList<School> schools = new LinkedList<>();
  /**
   * The Students.
   */
  private ArrayList<Student> students = new ArrayList<>();
  /**
   * The Lecturers.
   */
  private ArrayList<Lecturer> lecturers = new ArrayList<>();
  /**
   * The Admins.
   */
  private ArrayList<Admin> admins = new ArrayList<>();
  /**
   * The Query type.
   */
  private Statement queryType;
  /**
   * The Ddl.
   */
  private GetDatabaseDDL ddl;
  /**
   * The Query preparation.
   */
  private PreparedStatement queryPreparation;
  /**
   * The Result set.
   */
  private ResultSet resultSet;
  private String sqlStatement;

  /**
   * Query users.
   *
   * @param connection
   *     the connection
   */
  public void queryUsers(Connection connection) {
    queryStudents(connection);
    queryLecturers(connection);
    queryAdmins(connection);
    users.addAll(students);
    users.addAll(lecturers);
    users.addAll(admins);
    for (User user : users) {
      System.out.println(user.getFirstName() + "," + user.getClass().getName());
    }
  }

  /**
   * Query lecturers.
   *
   * @param connection
   *     the connection
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
            getResultSet().getInt(6));
        lecturers.add(Lecturer);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Query admins.
   *
   * @param connection
   *     the connection
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
        admins.add(admin);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Query students.
   *
   * @param connection
   *     the connection
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
            getResultSet().getInt(6),
            Boolean.parseBoolean(String.valueOf((getResultSet().getInt(7)))));
        students.add(student);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Gets query type.
   *
   * @return the query type
   */
  public Statement getQueryType() {
    return queryType;
  }

  /**
   * Sets query type.
   *
   * @param queryType
   *     the query type
   */
  public void setQueryType(final Statement queryType) {
    this.queryType = queryType;
  }

  /**
   * Gets result set.
   *
   * @return the result set
   */
  public ResultSet getResultSet() {
    return resultSet;
  }

  /**
   * Sets result set.
   *
   * @param resultSet
   *     the result set
   */
  public void setResultSet(final ResultSet resultSet) {
    this.resultSet = resultSet;
  }

  /**
   * Query department.
   *
   * @param connection
   *     the connection
   */
  public void queryDepartment(Connection connection) {
    try {
      setQueryType(connection.createStatement());
      setResultSet(getQueryType().executeQuery("SELECT * FROM TIMETABLE.TIMETABLE_DEPARTMENT"));
      while (getResultSet().next()) {
        Department department = new Department(getResultSet().getString(1),
            getResultSet().getString(2),
            getResultSet().getString(3), getResultSet().getString(4), getResultSet().getString(5));
        departments.add(department);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Query school.
   *
   * @param connection
   *     the connection
   */
  public void querySchool(Connection connection) {
    sqlStatement = "SELECT * FROM TIMETABLE_SCHOOL";
    try {
      //      setQueryType(connection.createStatement());
      //      setResultSet(getQueryType().executeQuery(sqlStatement));
      setQueryPreparation(connection.prepareStatement(sqlStatement));
      setResultSet(getQueryPreparation().executeQuery());
      while (getResultSet().next()) {
        School school = new School(getResultSet().getString(1), getResultSet().getString(2));
        schools.add(school);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Gets query preparation.
   *
   * @return the query preparation
   */
  public PreparedStatement getQueryPreparation() {
    return queryPreparation;
  }

  /**
   * Sets query preparation.
   *
   * @param queryPreparation
   *     the query preparation
   */
  public void setQueryPreparation(final PreparedStatement queryPreparation) {
    this.queryPreparation = queryPreparation;
  }

  /**
   * Query course.
   *
   * @param connection
   *     the connection
   */
  public void queryCourse(Connection connection) {
    sqlStatement = "SELECT * FROM TIMETABLE.TIMETABLE_COURSE";
    try {
      //      setQueryType(connection.createStatement());
      //      setResultSet(getQueryType().executeQuery(sqlStatement));
      setQueryPreparation(connection.prepareStatement(sqlStatement));
      setResultSet(getQueryPreparation().executeQuery());
      while (getResultSet().next()) {
        Course course = new Course(getResultSet().getString(1), getResultSet().getString(2),
            getResultSet().getString(3), getResultSet().getString(4), getResultSet().getString(5),
            getResultSet().getString(6), getResultSet().getInt(7),
            getResultSet().getInt(8), getResultSet().getInt(9));
        courses.add(course);
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Gets ddl.
   *
   * @return the ddl
   */
  public GetDatabaseDDL getDdl() {
    return ddl;
  }

  /**
   * Sets ddl.
   *
   * @param ddl
   *     the ddl
   */
  public void setDdl(final GetDatabaseDDL ddl) {
    this.ddl = ddl;
  }

}
