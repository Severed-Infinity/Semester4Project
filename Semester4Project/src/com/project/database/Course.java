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
public class Course {
  /**
   * The Courses.
   */
  public static final Collection<Course> COURSES = new LinkedList<>();
  /**
   * The Timetable.
   */
  private final int timetable;
  /**
   * The Code.
   */
  private String code, /**
   * The Name.
   */
  name, /**
   * The Type.
   */
  type, /**
   * The Head.
   */
  head, /**
   * The Department code.
   */
  departmentCode, /**
   * The Modules.
   */
  modules;
  /**
   * The Length.
   */
  private int length, /**
   * The Year.
   */
  year, /**
   * The Semester.
   */
  semester;

  /**
   * Instantiates a new Course.
   *
   * @param code
   *     the code
   * @param name
   *     the name
   * @param type
   *     the type
   * @param head
   *     the head
   * @param departmentCode
   *     the department code
   * @param modules
   *     the MODULES
   * @param length
   *     the length
   * @param year
   *     the year
   * @param semester
   *     the semester
   * @param timetable
   *     the timetable
   */
  private Course(
      final String code,
      final String name,
      final String type,
      final String head,
      final String departmentCode,
      final String modules,
      final int length,
      final int year,
      final int semester,
      final int timetable
  ) {
    this.timetable = timetable;
    this.code = code;
    this.name = name;
    this.type = type;
    this.head = head;
    this.departmentCode = departmentCode;
    this.modules = modules;
    this.length = length;
    this.year = year;
    this.semester = semester;
  }

  public static Course createCourse(
      final String code,
      final String name,
      final String type,
      final String head,
      final String departmentCode,
      final String modules,
      final int length,
      final int year,
      final int semester,
      final int timetable
  ) {
    return new Course(code, name, type, head, departmentCode, modules, length, year, semester,
        timetable);
  }

  /**
   * Gets code.
   *
   * @return the code
   */
  public String getCode() {
    return this.code;
  }

  /**
   * Sets code.
   *
   * @param code
   *     the code
   */
  final void setCode(final String code) {
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
   * Gets type.
   *
   * @return the type
   */
  public String getType() {
    return this.type;
  }

  /**
   * Sets type.
   *
   * @param type
   *     the type
   */
  final void setType(final String type) {
    this.type = type;
  }

  /**
   * Gets head.
   *
   * @return the head
   */
  public String getHead() {
    return this.head;
  }

  /**
   * Sets head.
   *
   * @param head
   *     the head
   */
  final void setHead(final String head) {
    this.head = head;
  }

  /**
   * Gets department code.
   * compare to existing DEPARTMENTS, if non-existent
   *
   * @return the department code
   */
  public String getDepartmentCode() {
    return this.departmentCode;
  }

  /**
   * Sets department code.
   *
   * @param departmentCode
   *     the department code
   */
  final void setDepartmentCode(final String departmentCode) {
    this.departmentCode = departmentCode;
  }

  /**
   * Gets MODULES.
   *
   * @return the MODULES
   */
  public String getModules() {
    return this.modules;
  }

  /**
   * Sets MODULES.
   *
   * @param modules
   *     the MODULES
   */
  final void setModules(final String modules) {
    this.modules = modules;
  }

  /**
   * Gets length.
   *
   * @return the length
   */
  public int getLength() {
    return this.length;
  }

  /**
   * Sets length.
   *
   * @param length
   *     the length
   */
  final void setLength(final int length) {
    this.length = length;
  }

  /**
   * Gets year.
   *
   * @return the year
   */
  public int getYear() {
    return this.year;
  }

  /**
   * Sets year.
   *
   * @param year
   *     the year
   */
  final void setYear(final int year) {
    this.year = year;
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
   * Gets timetable.
   *
   * @return the timetable
   */
  public Timetable getTimetable() {
    Timetable timetableReturn = null;
    for (final Timetable timetableCheck : Timetable.TIMETABLES) {
      if (this.timetable == timetableCheck.getCode()) {
        timetableReturn = timetableCheck;
      }
    }

    return timetableReturn;
  }

  @Override
  public String toString() {
    return "Course{" +
        "timetable=" + this.timetable +
        ", code='" + this.code + '\'' +
        ", name='" + this.name + '\'' +
        ", type='" + this.type + '\'' +
        ", head='" + this.head + '\'' +
        ", departmentCode='" + this.departmentCode + '\'' +
        ", modules='" + this.modules + '\'' +
        ", length=" + this.length +
        ", year=" + this.year +
        ", semester=" + this.semester +
        '}';
  }
}
