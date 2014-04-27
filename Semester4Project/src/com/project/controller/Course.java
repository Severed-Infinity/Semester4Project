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
public class Course {
  private String code, name, type, head, departmentCode, modules;
  private int length, year, semester;

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
   *     the modules
   * @param length
   *     the length
   * @param year
   *     the year
   * @param semester
   *     the semester
   */
  public Course(
      final String code,
      final String name,
      final String type,
      final String head,
      final String departmentCode,
      final String modules,
      final int length,
      final int year,
      final int semester
  ) {
    this.setCode(code);
    this.setName(name);
    this.setType(type);
    this.setHead(head);
    this.setDepartmentCode(departmentCode);
    this.setModules(modules);
    this.setLength(length);
    this.setYear(year);
    this.setSemester(semester);
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
   * Gets type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Sets type.
   *
   * @param type
   *     the type
   */
  void setType(final String type) {
    this.type = type;
  }

  /**
   * Gets head.
   *
   * @return the head
   */
  public String getHead() {
    return head;
  }

  /**
   * Sets head.
   *
   * @param head
   *     the head
   */
  void setHead(final String head) {
    this.head = head;
  }

  /**
   * Gets department code.
   * compare to existing departments, if non-existent
   *
   * @return the department code
   */
  public String getDepartmentCode() {
    return departmentCode;
  }

  /**
   * Sets department code.
   *
   * @param departmentCode
   *     the department code
   */
  void setDepartmentCode(final String departmentCode) {
    this.departmentCode = departmentCode;
  }

  /**
   * Gets modules.
   *
   * @return the modules
   */
  public String getModules() {
    return modules;
  }

  /**
   * Sets modules.
   *
   * @param modules
   *     the modules
   */
  void setModules(final String modules) {
    this.modules = modules;
  }

  /**
   * Gets length.
   *
   * @return the length
   */
  public int getLength() {
    return length;
  }

  /**
   * Sets length.
   *
   * @param length
   *     the length
   */
  void setLength(final int length) {
    this.length = length;
  }

  /**
   * Gets year.
   *
   * @return the year
   */
  public int getYear() {
    return year;
  }

  /**
   * Sets year.
   *
   * @param year
   *     the year
   */
  void setYear(final int year) {
    this.year = year;
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
}
