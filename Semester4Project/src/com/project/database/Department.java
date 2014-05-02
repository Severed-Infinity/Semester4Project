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
  private final String code;
  /**
   * The Name.
   */
  private final String name;
  /**
   * The Head.
   */
  private final String head;
  /**
   * The School code.
   */
  private final String schoolCode;

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
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  /**
  //   * Gets code.
  //   *
  //   * @return the code
  //   */
  //  public String getCode() {
  //    return this.code;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  /**
  //   * Sets code.
  //   *
  //   * @param code
  //   *     the code
  //   */
  //  final void setCode(final String code) {
  //    this.code = code;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  /**
  //   * Gets name.
  //   *
  //   * @return the name
  //   */
  //  public String getName() {
  //    return this.name;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  /**
  //   * Sets name.
  //   *
  //   * @param name
  //   *     the name
  //   */
  //  final void setName(final String name) {
  //    this.name = name;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  /**
  //   * Gets head.
  //   *
  //   * @return the head
  //   */
  //  public String getHead() {
  //    return this.head;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  /**
  //   * Sets head.
  //   *
  //   * @param head
  //   *     the head
  //   */
  //  final void setHead(final String head) {
  //    this.head = head;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  /**
  //   * Gets school code.
  //   * compare to existing SCHOOLS, if non-existent
  //   *
  //   * @return the school code
  //   */
  //  public String getSchoolCode() {
  //    return this.schoolCode;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  /**
  //   * Sets school code.
  //   *
  //   * @param schoolCode
  //   *     the school code
  //   */
  //  final void setSchoolCode(final String schoolCode) {
  //    this.schoolCode = schoolCode;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)

  @Override
  public String toString() {
    return MessageFormat.format(
        "Department'{'code=''{0}'', name=''{1}'', head=''{2}'', schoolCode=''{3}'''}'",
        this.code, this.name, this.head, this.schoolCode);
  }
}
