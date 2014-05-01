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
  private String sqlStatement;
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

  /**
   * Gets query preparation.
   *
   * @return the query preparation
   */
  public PreparedStatement getQueryPreparation() {
    return this.queryPreparation;
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
   * Gets ddl.
   *
   * @return the ddl
   */
  public GetDatabaseDDL getDdl() {
    return this.ddl;
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

  @Override
  public String toString() {
    return "RunStatement{" +
        "sqlStatement='" + this.sqlStatement + '\'' +
        ", queryType=" + this.queryType +
        ", ddl=" + this.ddl +
        ", queryPreparation=" + this.queryPreparation +
        ", resultSet=" + this.resultSet +
        '}';
  }
}
