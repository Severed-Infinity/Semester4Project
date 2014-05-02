package com.project.database;

import java.text.*;
import java.util.*;

/**
 * Project Semester4Project
 *
 * This class is part of a project
 * that is aimed at improving ITT's
 * timetable system
 *
 * Created by david on 4/17/2014.
 */
public class School {
  /**
   * The Schools.
   */
  public static final Collection<School> SCHOOLS = new LinkedList<>();
  private final String code;
  private final String name;

  private School(final String code, final String name) {
    this.code = code;
    this.name = name;
  }

  public static School createSchool(final String code, final String name) {
    return new School(code, name);
  }
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  public String getCode() {
  //    return this.code;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  final void setCode(final String code) {
  //    this.code = code;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  public String getName() {
  //    return this.name;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  final void setName(final String name) {
  //    this.name = name;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)

  @Override
  public String toString() {
    return MessageFormat.format("School'{'code=''{0}'', name=''{1}'''}'", this.code, this.name);
  }
}
