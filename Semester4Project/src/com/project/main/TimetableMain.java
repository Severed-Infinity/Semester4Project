package com.project.main;

import com.project.gui.*;

final class TimetableMain {
  public static void main(final String[] args) {
    try {
      final Login login = Login.createLogin();
      login.setVisible(true);
    } catch (final Throwable throwable) {
      throwable.printStackTrace();
    }

  }

}
