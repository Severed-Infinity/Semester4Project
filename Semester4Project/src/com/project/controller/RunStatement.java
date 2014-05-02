package com.project.controller;

import java.sql.*;

/**
 * Project Semester4Project
 *
 * This class is part of a project
 * that is aimed at improving ITT's
 * timetable system
 *
 * Created by david on 3/25/2014.
 */
class RunStatement {
  /**
   * The Query type.
   */
  private Statement queryType;
  /**
   * The Query preparation.
   */
  private PreparedStatement queryPreparation;
  /**
   * The Result set.
   */
  private ResultSet resultSet;
  private Connection connection;

  /**
   * Gets query type.
   *
   * @return the query type
   */
  Statement getQueryType() {
    return this.queryType;
  }

  /**
   * Sets query type.
   *
   * @param queryType
   *     the query type
   */
  void setQueryType(final Statement queryType) {
    this.queryType = queryType;
  }

  /**
   * Gets result set.
   *
   * @return the result set
   */
  ResultSet getResultSet() {
    return this.resultSet;
  }

  /**
   * Sets result set.
   *
   * @param resultSet
   *     the result set
   */
  void setResultSet(final ResultSet resultSet) {
    this.resultSet = resultSet;
  }
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  /**
  //   * Gets ddl.
  //   *
  //   * @return the ddl
  //   */
  //  public GetDatabaseDDL getDdl() {
  //    return this.ddl;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  /**
  //   * Sets ddl.
  //   *
  //   * @param ddl
  //   *     the ddl
  //   */
  //  public void setDdl(final GetDatabaseDDL ddl) {
  //    this.ddl = ddl;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)

  Connection getConnection() {
    if (this.connection == null) {
      System.out.println("Connection not Found");
    }
    return this.connection;
  }

  public void setConnection(final Connection connection) {
    this.connection = connection;
  }

  PreparedStatement getQueryPreparation() {
    return this.queryPreparation;
  }

  void setQueryPreparation(final PreparedStatement queryPreparation) {
    this.queryPreparation = queryPreparation;
  }

  @Override
  public String toString() {
    return "RunStatement{" +
        "queryType=" + this.queryType +
        ", queryPreparation=" + this.queryPreparation +
        ", resultSet=" + this.resultSet +
        ", connection=" + this.connection +
        '}';
  }
}
