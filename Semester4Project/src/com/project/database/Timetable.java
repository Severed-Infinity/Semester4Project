package com.project.database;

import javax.swing.*;
import java.util.*;

/**
 * Project Semester4Project
 *
 * This class is part of a project
 * that is aimed at improving ITT's
 * timetable system
 *
 * Created by david on 4/29/2014.
 */
public class Timetable {
  public static final Collection<Timetable> TIMETABLES = new LinkedList<>();
  private static final String COULD_NOT_LOAD_A_VIEW = "Could not load a View";
  private int code;

  private Timetable() {
    final JTextField unknownLogin = new JTextField();
    unknownLogin.setText(COULD_NOT_LOAD_A_VIEW);
  }

  private Timetable(final int code, final int timeSlots) {
    this.code = code;
    final int timeSlot = timeSlots;
  }

  public static Timetable createTimetable() {return new Timetable();}

  public static Timetable createTimetable(
      final int code,
      final int timeSlots
  ) {return new Timetable(code, timeSlots);}

  public int getCode() {
    return this.code;
  }

  @Override
  public String toString() {
    return "Timetable{" +
        "code=" + this.code +
        '}';
  }
}
