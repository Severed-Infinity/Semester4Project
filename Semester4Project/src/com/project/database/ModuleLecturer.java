package com.project.database;

import java.text.*;
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
  private final String userCode;

  private ModuleLecturer(final int moduleCode, final String userCode) {
    this.moduleCode = moduleCode;
    this.userCode = userCode;
  }

  public static ModuleLecturer createModuleLecturer(
      final int moduleCode,
      final String userCode
  ) {return new ModuleLecturer(moduleCode, userCode);}

  public int getModuleCode() {
    return this.moduleCode;
  }

  public String getUserCode() {
    return this.userCode;
  }

  @Override
  public String toString() {
    return MessageFormat.format("ModuleLecturer'{'moduleCode={0}, userCode={1}'}'", this.moduleCode,
        this.userCode);
  }
}
