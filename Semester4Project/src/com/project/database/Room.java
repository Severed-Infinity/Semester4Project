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
public class Room {
  public static LinkedList<Room> rooms;
  private int roomNumber;
  private int roomSeating;
  private String departmentCode;
  private boolean lab;
  private int shareRoomNumber;

  public int getRoomNumber() {
    return roomNumber;
  }

  public int getRoomSeating() {
    return roomSeating;
  }

  public String getDepartmentCode() {
    return departmentCode;
  }

  public boolean isLab() {
    return lab;
  }

  public int getShareRoomNumber() {
    return shareRoomNumber;
  }

  public Room(
      final int roomNumber,
      final int roomSeating,
      final String departmentCode,
      final boolean lab,
      final int shareRoomNumber
  ) {

    this.roomNumber = roomNumber;
    this.roomSeating = roomSeating;
    this.departmentCode = departmentCode;
    this.lab = lab;
    this.shareRoomNumber = shareRoomNumber;
  }
}
