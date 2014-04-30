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
  public static final LinkedList<Timetable> timetables = new LinkedList<>();
  private int timeSlot;
  private int code;

  public Timetable() {
    JTextField unknownLogin = new JTextField();
    unknownLogin.setText("Could not load a View");
  }

  public Timetable(final int code, final int timeSlots) {
    this.code = code;
    this.timeSlot = timeSlots;
  }

  public int getCode() {
    return code;
  }
}
