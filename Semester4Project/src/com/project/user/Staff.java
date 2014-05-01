package com.project.user;

import com.project.database.*;

import java.sql.*;

class Staff extends User {
  Staff(
      final String code,
      final String firstName,
      final String lastName,
      final Date dateOfBirth,
      final String password
  ) {
    super(code, firstName, lastName, dateOfBirth, password);
  }
}
