package com.project.user;

import java.sql.*;

public class Lecturer extends Staff {
  private final int hoursWeek;

  public Lecturer(
      final String code,
      final String firstName,
      final String lastName,
      final Date dateOfBirth,
      final String password,
      final int hoursWeek
  ) {
    super(code, firstName, lastName, dateOfBirth, password);
    this.hoursWeek = hoursWeek;
  }

  public int getHoursWeek() {
    return hoursWeek;
  }
}
