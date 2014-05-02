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
public class Room {
  public static final Deque<Room> ROOMS = null;
  private final int roomNumber;
  private final int roomSeating;
  private final String departmentCode;
  private final boolean lab;
  private final int shareRoomNumber;

  private Room(
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

  public static Room createRoom(
      final int roomNumber,
      final int roomSeating,
      final String departmentCode,
      final boolean lab,
      final int shareRoomNumber
  ) {return new Room(roomNumber, roomSeating, departmentCode, lab, shareRoomNumber);}
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  public int getRoomNumber() {
  //    return this.roomNumber;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  public int getRoomSeating() {
  //    return this.roomSeating;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  public String getDepartmentCode() {
  //    return this.departmentCode;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  public boolean isLab() {
  //    return this.lab;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)
  // --Commented out by Inspection START (5/2/2014 12:40 PM):
  //  public int getShareRoomNumber() {
  //    return this.shareRoomNumber;
  //  }
  // --Commented out by Inspection STOP (5/2/2014 12:40 PM)

  @Override
  public String toString() {
    return MessageFormat.format(
        "Room'{'roomNumber={0}, roomSeating={1}, departmentCode=''{2}'', lab={3}, " +
            "shareRoomNumber={4}'}'",
        this.roomNumber, this.roomSeating, this.departmentCode, this.lab, this.shareRoomNumber
    );
  }
}
