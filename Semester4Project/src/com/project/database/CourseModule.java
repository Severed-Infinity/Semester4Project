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
public class CourseModule {
  public static LinkedList<CourseModule> courseModules;
  private String courseCode;
  private int moduleCode;
  private int semester;
  private int year;

  public CourseModule(
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

  public String getCourseCode() {
    return courseCode;
  }

  public int getModuleCode() {
    return moduleCode;
  }

  public int getSemester() {
    return semester;
  }

  public int getYear() {
    return year;
  }
}
