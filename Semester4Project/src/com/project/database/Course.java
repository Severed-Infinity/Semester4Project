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
  private final String code;
  private final String /**
   * The Name.
   */
      name;
  private final String /**
   * The Type.
   */
      type;
  private final String /**
   * The Head.
   */
      head;
  private final String /**
   * The Department code.
   */
      departmentCode;
  /**
   * The Length.
   */
  private final int length;
  private final int /**
   * The Year.
   */
      year;
  private final int /**
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
      final int length,
      final int year,
      final int semester,
      final int timetable
  ) {
    return new Course(code, name, type, head, departmentCode, length, year, semester,
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
  //   * Gets type.
  //   *
  //   * @return the type
  //   */
  //  public String getType() {
  //    return this.type;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  /**
  //   * Sets type.
  //   *
  //   * @param type
  //   *     the type
  //   */
  //  final void setType(final String type) {
  //    this.type = type;
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
  //   * Gets department code.
  //   * compare to existing DEPARTMENTS, if non-existent
  //   *
  //   * @return the department code
  //   */
  //  public String getDepartmentCode() {
  //    return this.departmentCode;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  /**
  //   * Sets department code.
  //   *
  //   * @param departmentCode
  //   *     the department code
  //   */
  //  final void setDepartmentCode(final String departmentCode) {
  //    this.departmentCode = departmentCode;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  /**
  //   * Gets length.
  //   *
  //   * @return the length
  //   */
  //  public int getLength() {
  //    return this.length;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  /**
  //   * Sets length.
  //   *
  //   * @param length
  //   *     the length
  //   */
  //  final void setLength(final int length) {
  //    this.length = length;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  /**
  //   * Gets year.
  //   *
  //   * @return the year
  //   */
  //  public int getYear() {
  //    return this.year;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  /**
  //   * Sets year.
  //   *
  //   * @param year
  //   *     the year
  //   */
  //  final void setYear(final int year) {
  //    this.year = year;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  /**
  //   * Gets semester.
  //   *
  //   * @return the semester
  //   */
  //  public int getSemester() {
  //    return this.semester;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  /**
  //   * Sets semester.
  //   *
  //   * @param semester
  //   *     the semester
  //   */
  //  final void setSemester(final int semester) {
  //    this.semester = semester;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  /**
  //   * Gets timetable.
  //   *
  //   * @return the timetable
  //   */
  //  public Timetable getTimetable() {
  //    Timetable timetableReturn = null;
  //    for (final Timetable timetableCheck : Timetable.TIMETABLES) {
  //      if (this.timetable == timetableCheck.getCode()) {
  //        timetableReturn = timetableCheck;
  //      }
  //    }
  //    return timetableReturn;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)

  @Override
  public String toString() {
    return MessageFormat.format(
        "Course'{'timetable={0}, code=''{1}'', name=''{2}'', type=''{3}'', head=''{4}'', " +
            "departmentCode=''{5}'', length={6}, year={7}, semester={8}'}'",
        this.timetable, this.code, this.name, this.type, this.head, this.departmentCode,
        this.length, this.year, this.semester
    );
  }
}
