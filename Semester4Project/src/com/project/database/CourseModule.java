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
 * Created by david on 4/30/2014.
 */
public class CourseModule {
  public static final Deque<CourseModule> COURSE_MODULES = null;
  private final String courseCode;
  private final int moduleCode;
  private final int semester;
  private final int year;

  private CourseModule(
      final String courseCode,
      final int moduleCode,
      final int semester,
      final int year
  ) {
    this.courseCode = courseCode;
    this.moduleCode = moduleCode;
    this.semester = semester;
    this.year = year;
  }

  public static CourseModule createCourseModule(
      final String courseCode,
      final int moduleCode,
      final int semester,
      final int year
  ) {return new CourseModule(courseCode, moduleCode, semester, year);}

  public String getCourseCode() {
    return this.courseCode;
  }

  public int getModuleCode() {
    return this.moduleCode;
  }

  public int getSemester() {
    return this.semester;
  }

  public int getYear() {
    return this.year;
  }

  @Override
  public String toString() {
    return MessageFormat.format(
        "CourseModule'{'courseCode=''{0}'', moduleCode={1}, semester={2}, year={3}'}'",
        this.courseCode, this.moduleCode, this.semester, this.year);
  }
}
