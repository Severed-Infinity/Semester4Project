package com.project.database;

import com.project.controller.*;

import java.sql.*;
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
  public static LinkedList<Department> departments;
  public static LinkedList<Course> courses;
  public static LinkedList<Module> modules;
  public static LinkedList<User> users;
  public static LinkedList<School> schools;
  private Statement queryType;
  private GetDatabaseDDL ddl;
  private PreparedStatement queryPreparation;
  private ResultSet resultSet;

  public void queryCourse(Connection connection) {
    try {
      setQueryType(connection.createStatement());
      setResultSet(getQueryType().executeQuery("SELECT * FROM TIMETABLE_COURSE"));
      while (getResultSet().next()) {
        Course course = new Course(getResultSet().getString(1), getResultSet().getString(2),
            getResultSet().getString(3), getResultSet().getString(4), getResultSet().getString(5),
            getResultSet().getString(6), getResultSet().getInt(7),
            getResultSet().getInt(8), getResultSet().getInt(9));
        courses.add(course);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public Statement getQueryType() {
    return queryType;
  }

  public void setQueryType(final Statement queryType) {
    this.queryType = queryType;
  }

  public ResultSet getResultSet() {
    return resultSet;
  }

  public void setResultSet(final ResultSet resultSet) {
    this.resultSet = resultSet;
  }

  public void queryDepartment(Connection connection) {
    try {
      setQueryType(connection.createStatement());
      setResultSet(getQueryType().executeQuery("SELECT * FROM TIMETABLE_DEPARTMENT"));
      while (getResultSet().next()) {
        Department department = new Department(getResultSet().getString(1),
            getResultSet().getString(2),
            getResultSet().getString(3), getResultSet().getString(4), getResultSet().getString(5));
        departments.add(department);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void querySchool(Connection connection) {
    try {
      setQueryType(connection.createStatement());
      setResultSet(getQueryType().executeQuery("SELECT * FROM TIMETABLE_SCHOOL"));
      while (getResultSet().next()) {
        School school = new School(getResultSet().getString(1), getResultSet().getString(2));
        schools.add(school);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public GetDatabaseDDL getDdl() {
    return ddl;
  }

  public void setDdl(final GetDatabaseDDL ddl) {
    this.ddl = ddl;
  }

  public PreparedStatement getQueryPreparation() {
    return queryPreparation;
  }

  public void setQueryPreparation(final PreparedStatement queryPreparation) {
    this.queryPreparation = queryPreparation;
  }
/*
the goal with this class is to pass in a SQL statement and using that statement
run the query with the current connected database

e.g take a pre-made database.DDL and running into a new oracle connection such that it
stays up to date in all locations.

or add a new insert to the DDL file that will be called as stated above.
 */
}
