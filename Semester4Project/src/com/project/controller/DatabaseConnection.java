package com.project.controller;

import com.project.database.*;
import com.project.user.*;
import oracle.jdbc.pool.*;

import javax.swing.*;
import java.sql.*;

/**
 * Project Semester4Project
 *
 * This class is part of a project that is aimed at improving ITT's timetable
 * system
 *
 * Created by david on 3/18/14.
 */
public class DatabaseConnection {
  /**
   * The Run statement.
   */
  private RunStatement runStatement = new RunStatement();
  /**
   * The Database connection.
   */
  private Connection databaseConnection;
  /**
   * The Path.
   */
  private String path;

  /**
   * Instantiates a new Database connection.
   *
   * @param user
   *     the user
   * @param password
   *     the password
   */
  public DatabaseConnection(String user, String password) {
    createDatabaseConnection(user, password);
    setPath();
    createDatabaseFromDDL(getPath());
  }

  /**
   * Gets path.
   *
   * @return the path
   */
  private String getPath() {
    return path;
  }

  /**
   * Sets path.
   */
  private void setPath() {
    this.path = "TIMETABLE.DDL";
  }

  /**
   * Create database from dDL.
   *
   * @param path
   *     the path
   */
  private void createDatabaseFromDDL(String path) {
    new GetDatabaseDDL(path);
  }

  /**
   * Create database connection.
   *
   * @param user
   *     the user
   * @param password
   *     the password
   */
  private void createDatabaseConnection(String user, String password) {
    try {
      OracleDataSource dataSource = new OracleDataSource();
      try {
        //        dataSource.setURL("jdbc:oracle:thin:timetable//@localhost:1521:XE");
        dataSource.setURL("jdbc:oracle:thin://@localhost:1521:XE");
        // college source
        // dataSource.setURL("jdbc:oracle:thin:@//10.10.2.7:1521/global1");
        dataSource.setUser(user);
        dataSource.setPassword(password);

        setDatabaseConnection(dataSource.getConnection());
        checkUser(user, password);

      } catch (SQLException e) {
        System.out.println(e.getMessage());
        JOptionPane.showMessageDialog(null, "User ID or Password is incorrect", "Login Error",
            JOptionPane.WARNING_MESSAGE, null);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Check password.
   *
   * @param user
   *     the user
   * @param password
   *     the password
   *
   * @return boolean boolean
   *
   * @throws SQLException
   *     the sQL exception
   */
  private boolean checkUser(
      String user,
      String password
  ) throws SQLException {
    //todo change to check userArray
    for (User userCheck : RunStatement.users) {
      if (user.equals(userCheck.getCode()) && password.equals(userCheck.getPassword())) {
        if (userCheck instanceof Student) {
          //set view to timetable view
        } else if (userCheck instanceof Admin) {
          //set view to admin view
        } else if (userCheck instanceof Lecturer) {
          //set view to timetable view
        }
      }
    }
    runStatement.setQueryType(getDatabaseConnection().createStatement());
    runStatement.setResultSet(runStatement.getQueryType().executeQuery(
        "SELECT USER_ID, " +
            "" + "treat(USER_OBJ AS TIMETABLE_USER_OBJ).USER_PASSWORD FROM TIMETABLE" +
            ".TIMETABLE_USERS"
    ));
    while (runStatement.getResultSet().next()) {
      if (user.equals(runStatement.getResultSet().getString(1)) && password.equals(
          runStatement.getResultSet
              ().getString(2)
      )) {
        System.out.println("connected to source");
        System.out.printf("%s, %s \n", user, password);
        return true;
      }
    }
    endConnection();
    JOptionPane.showMessageDialog(null, "User ID or Password is incorrect", "Login Error",
        JOptionPane.WARNING_MESSAGE, null);
    return false;
  }

  /**
   * Gets database connection.
   *
   * @return the database connection
   */
  public Connection getDatabaseConnection() {
    return databaseConnection;
  }

  /**
   * Sets database connection.
   *
   * @param databaseConnection
   *     the database connection
   */
  private void setDatabaseConnection(Connection databaseConnection) {
    this.databaseConnection = databaseConnection;
  }

  /**
   * End connection.
   */
  public void endConnection() {
    try {
      System.out.println("Closing Connection");
      getDatabaseConnection().close();
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }

}
