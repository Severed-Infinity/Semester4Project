package com.project.user;

import com.project.controller.*;

import java.time.*;

abstract class Staff extends User {
  Staff(
      final String code,
      final String firstName,
      final String lastName,
      final String password,
      final LocalDate dateOfBirth
  ) {
    super(code, firstName, lastName, password, dateOfBirth);
  }
}
