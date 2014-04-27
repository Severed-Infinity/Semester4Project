package com.project.gui;

import javax.swing.*;

class WarningPanes {
  // TODO place warning panes within there appropriate classes
  public WarningPanes() {

    // TODO Auto-generated constructor stub
  }

  public static void main(String[] args) {

    //        JOptionPane.showMessageDialog( null, "User ID or Password is incorrect", null,
    // JOptionPane.WARNING_MESSAGE, null );
    JOptionPane.showMessageDialog(null, "Search returned no results", null,
        JOptionPane.WARNING_MESSAGE, null);
    JOptionPane.showMessageDialog(null, "Please select a Course", null, JOptionPane.WARNING_MESSAGE,
        null);
    JOptionPane.showMessageDialog(null, "Please select a Module", null, JOptionPane.WARNING_MESSAGE,
        null);
    JOptionPane.showMessageDialog(null, "Please select a User", null, JOptionPane.WARNING_MESSAGE,
        null);
    JOptionPane.showConfirmDialog(null, "Are you sure you want to clear all fields?", null,
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    JOptionPane.showConfirmDialog(null, "Are you sure you want to add to the database", null,
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
  }

}
