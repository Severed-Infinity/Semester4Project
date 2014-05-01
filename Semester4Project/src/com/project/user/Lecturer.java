package com.project.user;

import com.project.database.*;

import java.sql.*;

public class Lecturer extends Staff {
  private final int hoursWeek;
  private final int timetableCode;

  private Lecturer(
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

  public static Lecturer createLecturer(
      final String code,
      final String firstName,
      final String lastName,
      final Date dateOfBirth,
      final String password,
      final int hoursWeek,
      final int timetableCode
  ) {
    return new Lecturer(code, firstName, lastName, dateOfBirth, password, hoursWeek, timetableCode);
  }

  public Timetable getTimetable() {
    Timetable timetableReturn = null;
    for (final Timetable timetable : Timetable.TIMETABLES) {
      if (timetable.getCode() == this.timetableCode) {
        timetableReturn = timetable;
      }
    }
    return timetableReturn;
  }

  public int getHoursWeek() {
    return this.hoursWeek;
  }

  @Override
  public String toString() {
    return "Lecturer{" +
        "hoursWeek=" + this.hoursWeek +
        ", timetableCode=" + this.timetableCode +
        '}';
  }
}
