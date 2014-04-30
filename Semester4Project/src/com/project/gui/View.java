package com.project.gui;

import com.project.database.*;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings ("serial")
public abstract class View extends JPanel {
  /**
   * Inputs for the Views, they relate directly to components of similar names
   */
  JTextField name;
  JTextField code;
  JTextField length;
  JTextField head;
  JTextField year;
  JTextField semester;
  /**
   * Controls for the Views, createNew and addComponent refer directly to the sub components
   * of the Views main type in general
   */
  JButton confirm;
  JButton cancel;
  JButton clear;
  JButton createNew;
  JButton addComponent;
  /**
   * Different labels that directly relate to all components of similar names
   * The text naming convention is label name then views main type with a
   * few expects, they are the ones with out of or for
   */
  JLabel typeOf;
  JLabel nameOf;
  JLabel codeFor;
  JLabel lengthOf;
  JLabel departmentContaining;
  JLabel headOf;
  JLabel selectComponent;
  JLabel listOf;
  JLabel yearOf;
  JLabel semesters;
  /** any object that extends object can belong in type options */
  JComboBox<String> typeOptions;
  /*
   * drop downs to interacting with different types of components and options
   */
  /** any type that extends object that is a sub component of the implementing class */
  JComboBox<?> subComponent;
  /** any type that extends object that is a parent component of the implementing class */
  JComboBox<?> parentComponent;
  /**
   * A list used in conjunction with controls and combo box to create a list of
   * components to be added to main type
   */
  JList<Module> subComponents;
  private JFrame createNewPanel;

  //    protected ArrayList<View> views = new ArrayList<>();

  public View() {
    setBackground(Color.white);
  }

  JFrame getCreateNewPanel() {
    return createNewPanel;
  }

  void setCreateNewPanel(final JFrame createNewPanel) {
    this.createNewPanel = createNewPanel;
    getCreateNewPanel().setSize(900, 500);
    getCreateNewPanel().setLocationRelativeTo(null);
    getCreateNewPanel().setVisible(true);
  }

  //    public ArrayList<View> getViews () {
  //        return views;
  //    }

}
