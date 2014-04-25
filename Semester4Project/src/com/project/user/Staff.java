package com.project.user;

import com.project.controller.*;

import java.time.*;

public abstract class Staff extends User {
  protected Staff(
      final String code,
      final String firstName,
      final String lastName,
      final String password,
      final LocalDate dateOfBirth
  ) {
    super(code, firstName, lastName, password, dateOfBirth);
  }
}
