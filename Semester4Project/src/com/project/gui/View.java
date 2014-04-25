package com.project.gui;

import com.project.controller.*;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings ("serial")
public abstract class View extends JPanel {
  /**
   * Inputs for the Views, they relate directly to components of similar names
   */
  protected JTextField name, code, length, head, year, semester;
  /**
   * Controls for the Views, createNew and addComponent refer directly to the sub components
   * of the Views main type in general
   */
  protected JButton confirm, cancel, clear, createNew, addComponent;
  /**
   * Different labels that directly relate to all components of similar names
   * The text naming convention is label name then views main type with a
   * few expects, they are the ones with out of or for
   */
  protected JLabel typeOf, nameOf, codeFor, lengthOf, departmentContaining, headOf,
      selectComponent,
      listOf, yearOf, semesters;
  protected JFrame createNewPanel;
  /*
   * drop downs to interacting with different types of components and options
   */
  /** any object that extends object can belong in type options */
  protected JComboBox<String> typeOptions;
  /** any type that extends object that is a sub component of the implementing class */
  protected JComboBox<?> subComponent;
  /** any type that extends object that is a parent component of the implementing class */
  protected JComboBox<?> parentComponent;
  /**
   * A list used in conjunction with controls and combo box to create a list of
   * components to be added to main type
   */
  protected JList<Module> subComponents;

  //    protected ArrayList<View> views = new ArrayList<>();

  public View() {
    setBackground(Color.white);
  }

  public JFrame getCreateNewPanel() {
    return createNewPanel;
  }

  public void setCreateNewPanel(final JFrame createNewPanel) {
    this.createNewPanel = createNewPanel;
    getCreateNewPanel().setSize(900, 500);
    getCreateNewPanel().setLocationRelativeTo(null);
    getCreateNewPanel().setVisible(true);
  }

  //    public ArrayList<View> getViews () {
  //        return views;
  //    }

}
