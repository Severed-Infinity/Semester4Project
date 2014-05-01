package com.project.database;

import com.project.user.*;

import java.sql.Date;
import java.util.*;

/**
 * The type User.
 */
public abstract class User {
  /**
   * The Users.
   */
  public static final Collection<User> USERS = new LinkedList<>();
  /**
   * The Students.
   */
  public static final Collection<Student> STUDENTS = new ArrayList<>(500);
  /**
   * The Lecturers.
   */
  public static final Collection<Lecturer> LECTURERS = new ArrayList<>(500);
  /**
   * The Admins.
   */
  public static final Collection<Admin> ADMINS = new ArrayList<>(500);
  private String code, firstName, lastName, password;
  private Date dateOfBirth; // can be converted directly to SQl Date

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
   */
  protected User(
      final String code,
      final String firstName,
      final String lastName,
      final Date dateOfBirth,
      final String password
  ) {
    this.code = code;
    this.firstName = firstName;
    this.lastName = lastName;
    this.password = password;
    this.dateOfBirth = dateOfBirth;
  }

  /**
   * Gets date of birth.
   *
   * @return the date of birth
   */
  public Date getDateOfBirth() {
    return (Date)this.dateOfBirth.clone();
  }

  /**
   * Sets date of birth.
   *
   * @param dateOfBirth
   *     the date of birth
   */
  final void setDateOfBirth(final Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  /**
   * Gets password.
   *
   * @return the password
   */
  public String getPassword() {
    return this.password;
  }

  /**
   * Sets password.
   *
   * @param password
   *     the password
   */
  final void setPassword(final String password) {
    this.password = password;
  }

  /**
   * Gets last name.
   *
   * @return the last name
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * Sets last name.
   *
   * @param lastName
   *     the last name
   */
  final void setLastName(final String lastName) {
    this.lastName = lastName;
  }

  /**
   * Gets first name.
   *
   * @return the first name
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Sets first name.
   *
   * @param firstName
   *     the first name
   */
  final void setFirstName(final String firstName) {
    this.firstName = firstName;
  }

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

  @Override
  public String toString() {
    return "User{" +
        "code='" + this.code + '\'' +
        ", firstName='" + this.firstName + '\'' +
        ", lastName='" + this.lastName + '\'' +
        ", password='" + this.password + '\'' +
        ", dateOfBirth=" + this.dateOfBirth +
        '}';
  }
}
