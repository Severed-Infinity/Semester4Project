package com.project.user;

import java.sql.*;

/**
 * The type Admin.
 */
public class Admin extends Staff {
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
  private Admin(
      final String code,
      final String firstName,
      final String lastName,
      final Date dateOfBirth,
      final String password,
      final String title
  ) {
    super(code, firstName, lastName, dateOfBirth, password);
    /*
    The Title.
   */
    final String title1 = title;
  }

  public static Admin createAdmin(
      final String code,
      final String firstName,
      final String lastName,
      final Date dateOfBirth,
      final String password,
      final String title
  ) {return new Admin(code, firstName, lastName, dateOfBirth, password, title);}
}
