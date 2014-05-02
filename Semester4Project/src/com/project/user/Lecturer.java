package com.project.user;

import com.project.database.*;

import java.sql.*;
import java.text.*;

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

  public int getTimetableCode() {
    return timetableCode;
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
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  public int getHoursWeek() {
  //    return this.hoursWeek;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)

  @Override
  public String toString() {
    return MessageFormat.format("Lecturer'{'hoursWeek={0}, timetableCode={1}'}'", this.hoursWeek,
        this.timetableCode);
  }
}
