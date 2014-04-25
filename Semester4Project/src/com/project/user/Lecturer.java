package com.project.user;

import java.time.*;

public class Lecturer extends Staff {
  protected Lecturer(
      final String code,
      final String firstName,
      final String lastName,
      final String password,
      final LocalDate dateOfBirth
  ) {
    super(code, firstName, lastName, password, dateOfBirth);
  }
}
