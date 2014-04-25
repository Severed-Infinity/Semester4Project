package com.project.user;

import java.time.*;

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
   */
  protected Admin(
      final String code,
      final String firstName,
      final String lastName,
      final String password,
      final LocalDate dateOfBirth
  ) {
    super(code, firstName, lastName, password, dateOfBirth);
  }
}
