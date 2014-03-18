package com.project.database;

import oracle.jdbc.pool.*;

import java.sql.*;

/**
 * Project Semester4Project
 *
 * This class is part of a project
 * that is aimed at improving ITT's
 * timetable system
 *
 * Created by david on 3/18/14.
 */
public class DatabaseConnection {

    private Connection databaseConnection;
    private ResultSet resultSet;
    private Statement statement;

    public void databaseConnection (String user, String password) throws SQLException {
        try {


        OracleDataSource dataSource = new OracleDataSource();
        dataSource.setURL( "jdbc:oracle:thin:HR/@localhost:1521:XE" );
        dataSource.setUser( user );
        dataSource.setPassword( password );
        
        setDatabaseConnection( dataSource.getConnection() );
        } catch ( Exception e ) {
            System.out.println("failed to connect");
            System.exit( 0 );
        }
    }

    public ResultSet getResultSet () {
        return resultSet;
    }

    public void setResultSet ( ResultSet resultSet ) {
        this.resultSet = resultSet;
    }

    public Statement getStatement () {
        return statement;
    }

    public void setStatement ( Statement statement ) {
        this.statement = statement;
    }

    public Connection getDatabaseConnection () {
        return databaseConnection;
    }

    public void setDatabaseConnection ( Connection databaseConnection ) {
        this.databaseConnection = databaseConnection;
    }
}
