package com.project.controller;

import java.time.*;

/**
 * The type User.
 */
public abstract class User {
  private String code, firstName, lastName, password;
  private LocalDate dateOfBirth; // can be converted directly to SQl Date

  /**
   * Instantiates a new User.
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
  protected User(
      final String code,
      final String firstName,
      final String lastName,
      final String password,
      final LocalDate dateOfBirth
  ) {
    this.setCode(code);
    this.setFirstName(firstName);
    this.setLastName(lastName);
    this.setPassword(password);
    this.setDateOfBirth(dateOfBirth);
  }

  /**
   * Gets date of birth.
   *
   * @return the date of birth
   */
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  /**
   * Sets date of birth.
   *
   * @param dateOfBirth
   *     the date of birth
   */
  void setDateOfBirth(final LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  /**
   * Gets password.
   *
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * Sets password.
   *
   * @param password
   *     the password
   */
  void setPassword(final String password) {
    this.password = password;
  }

  /**
   * Gets last name.
   *
   * @return the last name
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Sets last name.
   *
   * @param lastName
   *     the last name
   */
  void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  /**
   * Gets first name.
   *
   * @return the first name
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Sets first name.
   *
   * @param firstName
   *     the first name
   */
  void setFirstName(final String firstName) {
    this.firstName = firstName;
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
}
