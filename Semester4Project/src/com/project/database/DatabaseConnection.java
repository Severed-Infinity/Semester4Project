package com.project.database;

import oracle.jdbc.pool.*;

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
  private Connection databaseConnection;
  private ResultSet resultSet;
  private Statement statement;
  private PreparedStatement preparedStatement;

  public DatabaseConnection(String user, String password) {
    createDatabaseConnection(user, password);
  }

  public void createDatabaseConnection(String user, String password) {

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

        // checkPassword( user, password );

        setDatabaseConnection(dataSource.getConnection());
        System.out.println("connected to source");
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    } catch (Exception e) {
      //            System.out.println( e.getMessage() );
      System.exit(0);
    }
  }

  //    public boolean checkPassword ( String user, String password ) {
  //
  //        String userPassword = null;
  //        try {
  //            setPreparedStatement( getDatabaseConnection().prepareStatement( "select userName,
  // userPassword from User where name = '" +
  //                            user + "'"
  //                                                                          ) );
  //            setResultSet( (ResultSet) getPreparedStatement() );
  //            while ( getResultSet().next() ) {
  //                getResultSet().getString( "userPassword" );
  //                userPassword = String.valueOf( getResultSet() );
  //
  //                System.out.println( "Successful test" );
  //            }
  //        } catch ( SQLException e ) {
  //            // e.printStackTrace();
  //            System.out.println( e.getMessage() );
  //        }
  //        endConnection();
  //        assert userPassword != null;
  //        return password.length() == userPassword.length();
  //    }

  public PreparedStatement getPreparedStatement() {

    return preparedStatement;
  }

  public void setPreparedStatement(PreparedStatement preparedStatement) {

    this.preparedStatement = preparedStatement;
  }

  public ResultSet getResultSet() {

    return resultSet;
  }

  public void setResultSet(ResultSet resultSet) {

    this.resultSet = resultSet;
  }

  public void endConnection() {

    try {
      System.out.println("Closing Connection");
      getDatabaseConnection().close();
      // System.out.println( "Successfully tested password" );
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }

  public Connection getDatabaseConnection() {

    return databaseConnection;
  }

  public void setDatabaseConnection(Connection databaseConnection) {

    this.databaseConnection = databaseConnection;
  }

  public Statement getStatement() {

    return statement;
  }

  public void setStatement(Statement statement) {

    this.statement = statement;
  }
}
