package com.project.database;

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
public class Module {
  /**
   * The Modules.
   */
  public static LinkedList<Module> modules = new LinkedList<>();
  /**
   * The Name.
   */
  private String name;
  /**
   * The Code.
   */
  private int code, /**
   * The Course code.
   */
  courseCode, /**
   * The Semester.
   */
  semester, /**
   * The Weekly hours.
   */
  weeklyHours, /**
   * The Lecturers.
   */
  lecturers;

  /**
   * Gets course code.
   *
   * @return the course code
   */
  public int getCourseCode() {
    return courseCode;
  }

  /**
   * Instantiates a new Module.
   * @param code      the code
   * @param name      the name
   * @param semester      the semester
   * @param weeklyHours      the weekly hours
   * @param lecturers the lecturers
   * @param courseCode the course code
   */
  public Module(
      final int code,
      final String name,
      final int semester,
      final int weeklyHours,
      final int lecturers,
      final int courseCode
  ) {

    this.setCode(code);
    this.setName(name);
    this.setSemester(semester);
    this.setWeeklyHours(weeklyHours);
    this.setLecturers(lecturers);
    this.courseCode = courseCode;
  }

  /**
   * Gets code.
   *
   * @return the code
   */
  public int getCode() {
    return code;
  }

  /**
   * Sets code.
   *
   * @param code      the code
   */
  void setCode(final int code) {
    this.code = code;
  }

  /**
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets name.
   *
   * @param name      the name
   */
  void setName(final String name) {
    this.name = name;
  }

  /**
   * Gets semester.
   *
   * @return the semester
   */
  public int getSemester() {
    return semester;
  }

  /**
   * Sets semester.
   *
   * @param semester      the semester
   */
  void setSemester(final int semester) {
    this.semester = semester;
  }

  /**
   * Gets weekly hours.
   *
   * @return the weekly hours
   */
  public int getWeeklyHours() {
    return weeklyHours;
  }

  /**
   * Sets weekly hours.
   *
   * @param weeklyHours      the weekly hours
   */
  void setWeeklyHours(final int weeklyHours) {
    this.weeklyHours = weeklyHours;
  }

  /**
   * Gets lecturers.
   *
   * @return the lecturers
   */
  public int getLecturers() {
    return lecturers;
  }

  /**
   * Sets lecturers.
   *
   * @param lecturers      the lecturers
   */
  void setLecturers(final int lecturers) {
    this.lecturers = lecturers;
  }
}
