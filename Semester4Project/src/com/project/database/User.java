package com.project.database;

import com.project.user.*;

import java.sql.Date;
import java.text.*;
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
  private final String code;
  private final String firstName;
  private final String lastName;
  private final String password;
  private final Date dateOfBirth; // can be converted directly to SQl Date

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
   * Gets password.
   *
   * @return the password
   */
  public String getPassword() {
    return this.password;
  }

  /**
   * Gets code.
   *
   * @return the code
   */
  public String getCode() {
    return this.code;
  }

  @Override
  public String toString() {
    return MessageFormat.format(
        "User'{'code=''{0}'', firstName=''{1}'', lastName=''{2}'', password=''{3}'', " +
            "dateOfBirth={4}'}'",
        this.code, this.firstName, this.lastName, this.password, this.dateOfBirth
    );
  }
}
