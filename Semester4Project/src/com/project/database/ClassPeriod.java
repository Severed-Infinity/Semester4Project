package com.project.database;

import java.util.*;

/**
 * Project Semester4Project
 *
 * This class is part of a project
 * that is aimed at improving ITT's
 * timetable system
 *
 * Created by david on 4/30/2014.
 */
public class ClassPeriod {
  public static LinkedList<ClassPeriod> classPeriods;
  private int module;
  private String time;
  private int roomNumber;

  public ClassPeriod(final int module, final String time, final int roomNumber) {

    this.module = module;
    this.time = time;
    this.roomNumber = roomNumber;
  }

  public int getModule() {
    return module;
  }

  public String getTime() {
    return time;
  }

  public int getRoomNumber() {
    return roomNumber;
  }
}
