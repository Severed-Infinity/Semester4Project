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
  public static final Collection<Module> MODULES = new LinkedList<>();
  private final int /**
   * The Course code.
   */
      courseCode;
  /**
   * The Name.
   */
  private String name;
  /**
   * The Code.
   */
  private int code;
  private int /**
   * The Semester.
   */
      semester;
  private int /**
   * The Weekly hours.
   */
      weeklyHours;
  private int /**
   * The Lecturers.
   */
      lecturers;

  /**
   * Instantiates a new Module.
   *
   * @param code
   *     the code
   * @param name
   *     the name
   * @param semester
   *     the semester
   * @param weeklyHours
   *     the weekly hours
   * @param lecturers
   *     the LECTURERS
   * @param courseCode
   *     the course code
   */
  private Module(
      final int code,
      final String name,
      final int semester,
      final int weeklyHours,
      final int lecturers,
      final int courseCode
  ) {

    this.code = code;
    this.name = name;
    this.semester = semester;
    this.weeklyHours = weeklyHours;
    this.lecturers = lecturers;
    this.courseCode = courseCode;
  }

  public static Module createModule(
      final int code,
      final String name,
      final int semester,
      final int weeklyHours,
      final int lecturers,
      final int courseCode
  ) {return new Module(code, name, semester, weeklyHours, lecturers, courseCode);}

  /**
   * Gets course code.
   *
   * @return the course code
   */
  public int getCourseCode() {
    return this.courseCode;
  }

  /**
   * Gets code.
   *
   * @return the code
   */
  public int getCode() {
    return this.code;
  }

  /**
   * Sets code.
   *
   * @param code
   *     the code
   */
  final void setCode(final int code) {
    this.code = code;
  }

  /**
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Sets name.
   *
   * @param name
   *     the name
   */
  final void setName(final String name) {
    this.name = name;
  }

  /**
   * Gets semester.
   *
   * @return the semester
   */
  public int getSemester() {
    return this.semester;
  }

  /**
   * Sets semester.
   *
   * @param semester
   *     the semester
   */
  final void setSemester(final int semester) {
    this.semester = semester;
  }

  /**
   * Gets weekly hours.
   *
   * @return the weekly hours
   */
  public int getWeeklyHours() {
    return this.weeklyHours;
  }

  /**
   * Sets weekly hours.
   *
   * @param weeklyHours
   *     the weekly hours
   */
  final void setWeeklyHours(final int weeklyHours) {
    this.weeklyHours = weeklyHours;
  }

  /**
   * Gets LECTURERS.
   *
   * @return the LECTURERS
   */
  public int getLecturers() {
    return this.lecturers;
  }

  /**
   * Sets LECTURERS.
   *
   * @param lecturers
   *     the LECTURERS
   */
  final void setLecturers(final int lecturers) {
    this.lecturers = lecturers;
  }

  @Override
  public String toString() {
    return "Module{" +
        "courseCode=" + this.courseCode +
        ", name='" + this.name + '\'' +
        ", code=" + this.code +
        ", semester=" + this.semester +
        ", weeklyHours=" + this.weeklyHours +
        ", lecturers=" + this.lecturers +
        '}';
  }
}
