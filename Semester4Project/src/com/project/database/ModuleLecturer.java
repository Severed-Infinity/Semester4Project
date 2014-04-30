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
  public static LinkedList<ModuleLecturer> moduleLectuers;
  private int moduleCode;
  private int userCode;

  public ModuleLecturer(final int moduleCode, final int userCode) {

    this.moduleCode = moduleCode;
    this.userCode = userCode;
  }

  public int getModuleCode() {
    return moduleCode;
  }

  public int getUserCode() {
    return userCode;
  }
}
