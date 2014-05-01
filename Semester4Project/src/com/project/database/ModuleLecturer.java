package com.project.database;

import java.util.*;

/**
 * Project Semester4Project
 *
 * This class is part of a project
 * that is aimed at improving ITT's
 * timetable system
 *
 * Created by david on 4/30/2014.
 */
public class ModuleLecturer {
  public static final Deque<ModuleLecturer> MODULE_LECTURERS = null;
  private final int moduleCode;
  private final int userCode;

  private ModuleLecturer(final int moduleCode, final int userCode) {

    this.moduleCode = moduleCode;
    this.userCode = userCode;
  }

  public static ModuleLecturer createModuleLecturer(
      final int moduleCode,
      final int userCode
  ) {return new ModuleLecturer(moduleCode, userCode);}

  public int getModuleCode() {
    return this.moduleCode;
  }

  public int getUserCode() {
    return this.userCode;
  }

  @Override
  public String toString() {
    return "ModuleLecturer{" +
        "moduleCode=" + this.moduleCode +
        ", userCode=" + this.userCode +
        '}';
  }
}
