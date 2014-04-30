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
public class Department {
  /**
   * The Departments.
   */
  public static final LinkedList<Department> departments = new LinkedList<>();
  /**
   * The Code.
   */
  private String code;
  /**
   * The Name.
   */
  private String name;
  /**
   * The Head.
   */
  private String head;
  /**
   * The School code.
   */
  private String schoolCode;

  /**
   * Instantiates a new Department.
   *
   * @param code
   *     the code
   * @param name
   *     the name
   * @param head
   *     the head
   * @param schoolCode
   *     the school code
   */
  public Department(
      final String code,
      final String name,
      final String head,
      final String schoolCode
  ) {
    this.setCode(code);
    this.setName(name);
    this.setHead(head);
    this.setSchoolCode(schoolCode);
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
   * Gets school code.
   * compare to existing schools, if non-existent
   *
   * @return the school code
   */
  public String getSchoolCode() {
    return schoolCode;
  }

  /**
   * Sets school code.
   *
   * @param schoolCode
   *     the school code
   */
  void setSchoolCode(final String schoolCode) {
    this.schoolCode = schoolCode;
  }
}
