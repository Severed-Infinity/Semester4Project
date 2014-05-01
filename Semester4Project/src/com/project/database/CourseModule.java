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
    return "CourseModule{" +
        "courseCode='" + this.courseCode + '\'' +
        ", moduleCode=" + this.moduleCode +
        ", semester=" + this.semester +
        ", year=" + this.year +
        '}';
  }
}
