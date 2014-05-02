package com.project.controller;

import com.project.database.*;
import com.project.user.*;

import java.sql.*;

/**
 * Project Semester4Project
 *
 * This class is part of a project
 * that is aimed at improving ITT's
 * timetable system
 *
 * Created by david on 4/30/2014.
 */
class RunStatementDelete extends RunStatement {
  public void deleteUser(
      final Connection connection,
      final User user
  ) {
    try {
      final String sqlStatement = "DELETE FROM TIMETABLE_USERS WHERE USER_ID = ?";
      this.setQueryPreparation(connection.prepareStatement(sqlStatement));
      this.getQueryPreparation().setString(1, user.getCode());
      this.getQueryPreparation().executeUpdate();
      if (user instanceof Lecturer) {
        this.deleteTimetable(connection, ((Lecturer)user).getTimetable());
      }
      User.USERS.remove(user);
    } catch (final SQLException e) {
      e.printStackTrace();

    }

  }

  public void deleteTimetable(final Connection connection, final Timetable timetable) {
    try {
      final String sqlStatement = "DELETE FROM TIMETABLE_TIMETABLE WHERE TIMETABLE_ID = ?";
      this.setQueryPreparation(connection.prepareStatement(sqlStatement));
      this.getQueryPreparation().setInt(1, timetable.getCode());
      this.getQueryPreparation().executeUpdate();
      Timetable.TIMETABLES.remove(timetable);
    } catch (final SQLException e) {
      e.getMessage();
      e.printStackTrace();

    }
  }

  public void deleteCourse(
      final Connection connection, final Course course
  ) {
    try {
      final String sqlStatement = "DELETE FROM TIMETABLE_COURSE WHERE COURSE_CODE = ?";
      this.setQueryPreparation(connection.prepareStatement(sqlStatement));
      this.getQueryPreparation().setString(1, course.getCode());
      this.getQueryPreparation().executeUpdate();
      for (CourseModule courseModule : CourseModule.COURSE_MODULES) {
        if (courseModule.getCourseCode().equals(course.getCode())) {
          this.deleteCourseModule(connection, courseModule);
        }
      }
      Course.COURSES.remove(course);
    } catch (final SQLException e) {
      e.getMessage();
      e.printStackTrace();

    }
  }

  public void deleteCourseModule(
      final Connection connection, final CourseModule courseModule
  ) {
    try {
      final String sqlStatement = "DELETE FROM COURSE_MODULE WHERE COURSE_CODE = ?";
      this.setQueryPreparation(connection.prepareStatement(sqlStatement));
      this.getQueryPreparation().setString(1, courseModule.getCourseCode());
      this.getQueryPreparation().executeUpdate();
      CourseModule.COURSE_MODULES.remove(courseModule);
    } catch (final SQLException e) {
      e.getMessage();
      e.printStackTrace();

    }
  }

  public void deleteModule(
      final Connection connection, final Module module
  ) {
    try {
      final String sqlStatement = "DELETE FROM TIMETABLE_MODULE WHERE MODULE_CODE = ?";
      this.setQueryPreparation(connection.prepareStatement(sqlStatement));
      this.getQueryPreparation().setInt(1, module.getCode());
      this.getQueryPreparation().executeUpdate();
      for (CourseModule courseModule : CourseModule.COURSE_MODULES) {
        if (courseModule.getModuleCode() == module.getCode()) {
          this.deleteCourseModule(connection, courseModule);
        }
      }
      for (ModuleLecturer moduleLecturer : ModuleLecturer.MODULE_LECTURERS) {
        if (moduleLecturer.getModuleCode() == module.getCode()) {
          this.deleteModuleLecturer(connection, moduleLecturer);
        }
      }
      Module.MODULES.remove(module);
    } catch (final SQLException e) {
      e.getMessage();
      e.printStackTrace();

    }
  }

  public void deleteModuleLecturer(
      final Connection connection,
      final ModuleLecturer moduleLecturer
  ) {
    try {
      final String sqlStatement = "DELETE FROM MODULE_LECTURER WHERE MODULE_CODE = ?";
      this.setQueryPreparation(connection.prepareStatement(sqlStatement));
      this.getQueryPreparation().setInt(1, moduleLecturer.getModuleCode());
      this.getQueryPreparation().executeUpdate();
      ModuleLecturer.MODULE_LECTURERS.remove(moduleLecturer);

    } catch (final SQLException e) {
      e.getMessage();
      e.printStackTrace();

    }
  }

  public void deleteClassPeriod(
      final Connection connection,
      final int moduleCode,
      final int roomNumber
  ) {
    try {
      final String sqlStatement = "DELETE FROM CLASS_PERIOD WHERE MODULE = ?";
      this.setQueryPreparation(connection.prepareStatement(sqlStatement));
      this.getQueryPreparation().setInt(1, moduleCode);
      this.getQueryPreparation().executeUpdate();

    } catch (final SQLException e) {
      e.getMessage();
      e.printStackTrace();

    }
  }

  public void deleteModuleLecturer(
      final Connection connection,
      final String userCode
  ) {
    try {
      final String sqlStatement = "DELETE FROM MODULE_LECTURER WHERE USER_ID = ?";
      this.setQueryPreparation(connection.prepareStatement(sqlStatement));
      this.getQueryPreparation().setString(1, userCode);
      this.getQueryPreparation().executeUpdate();

    } catch (final SQLException e) {
      e.getMessage();
      e.printStackTrace();

    }
  }

}
