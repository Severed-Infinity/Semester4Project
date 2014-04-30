package com.project.user;

import com.project.database.*;

import java.sql.*;

public class Lecturer extends Staff {
  private final int hoursWeek;
  private final int timetableCode;

  public Lecturer(
      final String code,
      final String firstName,
      final String lastName,
      final Date dateOfBirth,
      final String password,
      final int hoursWeek,
      final int timetableCode
  ) {
    super(code, firstName, lastName, dateOfBirth, password);
    this.hoursWeek = hoursWeek;
    this.timetableCode = timetableCode;

  }

  public Timetable getTimetable() {
    for (Timetable timetable : Timetable.timetables) {
      if (timetable.getCode() == timetableCode) {
        return timetable;
      }
    }
    return null;
  }

  public int getHoursWeek() {
    return hoursWeek;
  }
}
