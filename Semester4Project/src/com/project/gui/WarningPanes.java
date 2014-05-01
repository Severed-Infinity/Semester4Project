package com.project.gui;

import javax.swing.*;

class WarningPanes {
  private static final String SEARCH_RETURNED_NO_RESULTS = "Search returned no results";
  private static final String PLEASE_SELECT_A_COURSE = "Please select a Course";
  private static final String PLEASE_SELECT_A_MODULE = "Please select a Module";
  private static final String PLEASE_SELECT_A_USER = "Please select a User";
  private static final String ARE_YOU_SURE_YOU_WANT_TO_CLEAR_ALL_FIELDS = "Are you sure you want " +
      "to clear all fields?";
  private static final String ARE_YOU_SURE_YOU_WANT_TO_ADD_TO_THE_DATABASE = "Are you sure you " +
      "want to add to the database";

  // TODO place warning panes within there appropriate classes
  public static void main(final String[] args) {

    //        JOptionPane.showMessageDialog( null, "User ID or Password is incorrect", null,
    // JOptionPane.WARNING_MESSAGE, null );
    JOptionPane.showMessageDialog(null, SEARCH_RETURNED_NO_RESULTS, null,
        JOptionPane.WARNING_MESSAGE, null);
    JOptionPane.showMessageDialog(null, PLEASE_SELECT_A_COURSE, null, JOptionPane.WARNING_MESSAGE,
        null);
    JOptionPane.showMessageDialog(null, PLEASE_SELECT_A_MODULE, null, JOptionPane.WARNING_MESSAGE,
        null);
    JOptionPane.showMessageDialog(null, PLEASE_SELECT_A_USER, null, JOptionPane.WARNING_MESSAGE,
        null);
    JOptionPane.showConfirmDialog(null, ARE_YOU_SURE_YOU_WANT_TO_CLEAR_ALL_FIELDS, null,
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    JOptionPane.showConfirmDialog(null, ARE_YOU_SURE_YOU_WANT_TO_ADD_TO_THE_DATABASE, null,
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
  }

}
