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
public class Department {
  /**
   * The Departments.
   */
  public static final Collection<Department> DEPARTMENTS = new LinkedList<>();
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
  private Department(
      final String code,
      final String name,
      final String head,
      final String schoolCode
  ) {
    this.code = code;
    this.name = name;
    this.head = head;
    this.schoolCode = schoolCode;
  }

  public static Department createDepartment(
      final String code,
      final String name,
      final String head,
      final String schoolCode
  ) {return new Department(code, name, head, schoolCode);}

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
   * Gets school code.
   * compare to existing SCHOOLS, if non-existent
   *
   * @return the school code
   */
  public String getSchoolCode() {
    return this.schoolCode;
  }

  /**
   * Sets school code.
   *
   * @param schoolCode
   *     the school code
   */
  final void setSchoolCode(final String schoolCode) {
    this.schoolCode = schoolCode;
  }

  @Override
  public String toString() {
    return MessageFormat.format(
        "Department'{'code=''{0}'', name=''{1}'', head=''{2}'', schoolCode=''{3}'''}'",
        this.code, this.name, this.head, this.schoolCode);
  }
}
