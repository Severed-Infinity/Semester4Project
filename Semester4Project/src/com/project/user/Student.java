package com.project.user;

import com.project.controller.*;

import java.time.*;

public class Student extends User {
  protected Student(
      final String code,
      final String firstName,
      final String lastName,
      final String password,
      final LocalDate dateOfBirth
  ) {
    super(code, firstName, lastName, password, dateOfBirth);
  }
}
