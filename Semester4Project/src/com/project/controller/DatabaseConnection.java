package com.project.controller;

import com.project.database.*;
import oracle.jdbc.pool.*;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.text.*;

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
   * The Database connection.
   */
  private Connection databaseConnection;
  /**
   * The Path.
   */
  private String path;
  private User user;

  private DatabaseConnection() {}

  public static DatabaseConnection createDatabaseConnection() {return new DatabaseConnection();}

  /**
   * Sets path.
   */
  private void setPath() {
    this.path = "TIMETABLE.DDL";
  }

  /**
   * Create database connection.
   *
   * @param user
   *     the user
   * @param password
   *     the password
   */
  //todo have this return a connection
  public void createConnection(final String user, final String password) {
    try {
      final OracleDataSource dataSource = new OracleDataSource();
      //        dataSource.setURL("jdbc:oracle:thin:timetable//@localhost:1521:XE");
      dataSource.setURL("jdbc:oracle:thin://@localhost:1521:XE");
      // college source
      // dataSource.setURL("jdbc:oracle:thin:@//10.10.2.7:1521/global1");
      dataSource.setUser(user);
      dataSource.setPassword(password);
      final RunStatement runStatement = new RunStatement();
      runStatement.setConnection(this.databaseConnection = dataSource
          .getConnection());

    } catch (final SQLException | HeadlessException exception) {
      JOptionPane.showMessageDialog(null, "User ID or Password is incorrect", "Login Error",
          JOptionPane.WARNING_MESSAGE, null);
      exception.printStackTrace();
    } catch (final RuntimeException exception) {
      System.out.println(exception.getMessage());
    } finally {
      RunStatementSelect.createRunStatementSelect().queryUsers();
      if (userReturn(user, password) == null) {
        this.endConnection();
      } else {
        this.user = userReturn(user, password);
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
  private static User userReturn(
      final String user,
      final String password
  ) {
    User userReturn = null;
    for (final User userCheck : User.USERS) {
      if (user.equals(userCheck.getCode()) && password.equals(userCheck.getPassword())) {
        //        changeView(userCheck);
        userReturn = userCheck;
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
    return userReturn;
  }

  /**
   * End connection.
   */
  public void endConnection() {
    try {
      System.out.println("Closing Connection");
      this.databaseConnection.close();
    } catch (final SQLException exception) {
      exception.printStackTrace();
    }

  }

  /**
   * Gets path.
   *
   * @return the path
   */
  private String getPath() {
    return this.path;
  }

  /**
   * Gets database connection.
   *
   * @return the database connection
   */
  public Connection getDatabaseConnection() {
    return this.databaseConnection;
  }

  /**
   * Sets database connection.
   *
   * @param databaseConnection
   *     the database connection
   */
  private void setDatabaseConnection(final Connection databaseConnection) {
    this.databaseConnection = databaseConnection;
  }

  public User getUser() {
    return this.user;
  }

  void setUser(final User user) {
    this.user = user;
  }

  @Override
  public String toString() {
    return MessageFormat.format(
        "DatabaseConnection'{', databaseConnection={0}, path=''{1}'', user={2}'}'",
        this.databaseConnection, this.path, this.user);
  }
}
