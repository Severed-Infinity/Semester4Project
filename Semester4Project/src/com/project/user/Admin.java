package com.project.user;

import java.sql.*;

/**
 * The type Admin.
 */
public class Admin extends Staff {
  /**
   * The Title.
   */
  private final String title;

  /**
   * Instantiates a new Admin.
   *
   * @param code
   *     the code
   * @param firstName
   *     the first name
   * @param lastName
   *     the last name
   * @param password
   *     the password
   * @param dateOfBirth
   *     the date of birth
   * @param title
   *     the title
   */
  public Admin(
      final String code,
      final String firstName,
      final String lastName,
      final Date dateOfBirth,
      final String password,
      final String title
  ) {
    super(code, firstName, lastName, dateOfBirth, password);
    this.title = title;
  }
}
