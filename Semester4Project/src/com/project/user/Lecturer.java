package com.project.user;

import java.time.*;

public class Lecturer extends Staff {
  private final int hoursWeek;

  public Lecturer(
      final String code,
      final String firstName,
      final String lastName,
      final String password,
      final LocalDate dateOfBirth,
      final int hoursWeek
  ) {
    super(code, firstName, lastName, password, dateOfBirth);
    this.hoursWeek = hoursWeek;
  }

  public int getHoursWeek() {
    return hoursWeek;
  }
}
