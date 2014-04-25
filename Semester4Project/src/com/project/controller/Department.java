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
public class Department {
  private String code, name, head, assistants, schoolCode;

  /**
   * Instantiates a new Department.
   *
   * @param code
   *     the code
   * @param name
   *     the name
   * @param head
   *     the head
   * @param assistants
   *     the assistants
   * @param schoolCode
   *     the school code
   */
  public Department(
      final String code,
      final String name,
      final String head,
      final String assistants,
      final String schoolCode
  ) {
    this.setCode(code);
    this.setName(name);
    this.setHead(head);
    this.setAssistants(assistants);
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
  public void setCode(final String code) {
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
  public void setName(final String name) {
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
  public void setHead(final String head) {
    this.head = head;
  }

  /**
   * Gets assistants.
   *
   * @return the assistants
   */
  public String getAssistants() {
    return assistants;
  }

  /**
   * Sets assistants.
   *
   * @param assistants
   *     the assistants
   */
  public void setAssistants(final String assistants) {
    this.assistants = assistants;
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
  public void setSchoolCode(final String schoolCode) {
    this.schoolCode = schoolCode;
  }
}
