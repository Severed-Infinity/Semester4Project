package com.project.controller;

import com.project.database.*;
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
  private final RunStatementSelect runStatementSelect = new RunStatementSelect();
  /**
   * The Database connection.
   */
  private Connection databaseConnection;
  /**
   * The Path.
   */
  private String path;
  private User user;

  /**
   * Instantiates a new Database connection.
   *
   * @param user
   *     the user
   * @param password
   *     the password
   */
  public DatabaseConnection(String user, String password) {
    try {
      createDatabaseConnection(user, password);
    } catch (SQLException e) {
      e.printStackTrace();
    }
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
  private void createDatabaseConnection(String user, String password) throws SQLException {
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

      } catch (SQLException e) {
        System.out.println(e.getMessage());
        JOptionPane.showMessageDialog(null, "User ID or Password is incorrect", "Login Error",
            JOptionPane.WARNING_MESSAGE, null);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      runStatementSelect.queryUsers(databaseConnection);
      if (checkUser(user, password) == null) {
        this.endConnection();
      } else {
        this.setUser(checkUser(user, password));
      }
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
   */
  private User checkUser(
      String user,
      String password
  ) {
    for (User userCheck : User.users) {
      if (user.equals(userCheck.getCode()) && password.equals(userCheck.getPassword())) {
        //        changeView(userCheck);
        return userCheck;
      }
    }
    //    runStatement.setQueryType(getDatabaseConnection().createStatement());
    //    runStatement.setResultSet(runStatement.getQueryType().executeQuery(
    //        "SELECT USER_ID, " +
    //            "" + "treat(USER_OBJ AS TIMETABLE_USER_OBJ).USER_PASSWORD FROM TIMETABLE" +
    //            ".TIMETABLE_USERS"
    //    ));
    //    while (runStatement.getResultSet().next()) {
    //      if (user.equals(runStatement.getResultSet().getString(1)) && password.equals(
    //          runStatement.getResultSet
    //              ().getString(2)
    //      )) {
    //        System.out.println("connected to source");
    //        System.out.printf("%s, %s \n", user, password);
    //        return true;
    //      }
    //    }
    //    endConnection();
    JOptionPane.showMessageDialog(null, "User ID or Password is incorrect", "Login Error",
        JOptionPane.WARNING_MESSAGE, null);
    return null;
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

  public User getUser() {
    return user;
  }

  public void setUser(final User user) {
    this.user = user;
  }
}
