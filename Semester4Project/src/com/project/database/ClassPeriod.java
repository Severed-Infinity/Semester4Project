package com.project.database;

import java.text.*;
import java.util.*;

/**
 * Project Semester4Project
 *
 * This class is part of a project
 * that is aimed at improving IT Tallaght's
 * timetable system
 *
 * Created by david on 4/30/2014.
 */
public class ClassPeriod {
  public static final Deque<ClassPeriod> CLASS_PERIODS = null;
  private final int module;
  private final String time;
  private final int roomNumber;

  private ClassPeriod(final int module, final String time, final int roomNumber) {
    this.module = module;
    this.time = time;
    this.roomNumber = roomNumber;
  }

  public static ClassPeriod createClassPeriod(
      final int module,
      final String time,
      final int roomNumber
  ) {return new ClassPeriod(module, time, roomNumber);}

  public int getModule() {
    return this.module;
  }

  public String getTime() {
    return this.time;
  }

  public int getRoomNumber() {
    return this.roomNumber;
  }

  @Override
  public String toString() {
    return MessageFormat.format("ClassPeriod'{'module={0}, time=''{1}'', roomNumber={2}'}'",
        this.module,
        this.time, this.roomNumber);
  }
}