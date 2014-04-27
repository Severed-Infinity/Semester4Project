package com.project.controller;

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
  private String code, name;
  private int semester, weeklyHours, lecturers;
  //if this was java based only, then lecturers among other things could be objects of type user

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
   *     the lecturers
   */
  public Module(
      final String code,
      final String name,
      final int semester,
      final int weeklyHours,
      final int lecturers
  ) {
    this.setCode(code);
    this.setName(name);
    this.setSemester(semester);
    this.setWeeklyHours(weeklyHours);
    this.setLecturers(lecturers);
  }

  /**
   * Gets code.
   *
   * @return the code
   */
  public String getCode() {
    return code;
  }

  /**
   * Sets code.
   *
   * @param code
   *     the code
   */
  void setCode(final String code) {
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
   * @param name
   *     the name
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
   * @param semester
   *     the semester
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
   * @param weeklyHours
   *     the weekly hours
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
   * @param lecturers
   *     the lecturers
   */
  void setLecturers(final int lecturers) {
    this.lecturers = lecturers;
  }
}
