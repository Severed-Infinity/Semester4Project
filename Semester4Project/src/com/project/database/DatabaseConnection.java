package com.project.database;

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
  public RunStatement runStatement;
  private Connection databaseConnection;
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
    setPath("TIMETABLE.DDL");
    createDatabaseFromDDL(getPath());
  }

  /**
   * Gets path.
   *
   * @return the path
   */
  public String getPath() {
    return path;
  }

  /**
   * Sets path.
   *
   * @param path
   *     the path
   */
  public void setPath(final String path) {
    this.path = path;
  }

  /**
   * Create database from dDL.
   *
   * @param path
   *     the path
   */
  public void createDatabaseFromDDL(String path) {
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
        dataSource.setURL("jdbc:oracle:thin:timetable//@localhost:1521:XE");
        //               dataSource.setURL( "jdbc:oracle:thin:HR/david@localhost:1521:XE" );
        //                also works the
        // same.
        // dataSource.setURL(
        // "jdbc:oracle:thin:@//localhost:1521/timetable" );

        // college source
        // dataSource.setURL("jdbc:oracle:thin:@//10.10.2.7:1521/global1");
        dataSource.setUser(user);
        dataSource.setPassword(password);

        setDatabaseConnection(dataSource.getConnection());
        if (!checkPassword(dataSource.getConnection(), user, password)) {
          dataSource.getConnection().close();
        }
        System.out.println("connected to source");
      } catch (SQLException e) {
        System.out.println(e.getMessage());
        JOptionPane.showMessageDialog(null, "User ID or Password is incorrect", "Login Error",
            JOptionPane.WARNING_MESSAGE, null);
      }
    } catch (Exception e) {
      System.exit(0);
    }
  }

  /**
   * Check password.
   *
   * @param connection
   *     the connection
   * @param user
   *     the user
   * @param password
   *     the password
   *
   * @return boolean
   *
   * @throws SQLException
   *     the sQL exception
   */
  public boolean checkPassword(
      Connection connection, String user,
      String password
  ) throws SQLException {

    runStatement.setQueryType(connection.createStatement());
    runStatement.setResultSet(runStatement.getQueryType().executeQuery(
        "SELECT treat(USER_OBJ AS TIMETABLE_USER_OBJ).USER_ID, " +
            "" + "treat(USER_OBJ AS TIMETABLE_USER_OBJ).USER_PASSWORD FROM TIMETABLE" +
            ".TIMETABLE_USERS"
    ));
    while (runStatement.getResultSet().next()) {
      if (user.equals(runStatement.getResultSet().getString(1)) && password.equals(
          runStatement.getResultSet
              ().getString(2)
      )) {
        System.out.printf("%s, %s", user, password);
        return true;
      }
    }
    return false;
  }

  /**
   * End connection.
   */
  public void endConnection() {

    try {
      System.out.println("Closing Connection");
      getDatabaseConnection().close();
      // System.out.println( "Successfully tested password" );
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

}
