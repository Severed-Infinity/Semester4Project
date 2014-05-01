package com.project.main;

import com.project.gui.*;

final class TimetableMain {
  public static void main(final String[] args) {
    try {
      final TimetableLogin login = TimetableLogin.createTimetableLogin();
      login.setVisible(true);
    } catch (final Throwable throwable) {
      throwable.printStackTrace();
    }

  }

}
