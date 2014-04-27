package com.project.gui;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

/**
 * Created by david on 3/12/14.
 */
class UpdateUserView extends UserView {
  public UpdateUserView() {
    //        setSize( getParent().getWidth(), getParent().getHeight() );
    setLayout(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();

    /**
     constraints

     */
    constraints.weightx = 1.0;
    constraints.weighty = 1.0;
    //        constraints.gridwidth = 1;
    constraints.anchor = GridBagConstraints.NORTHEAST;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.insets = new Insets(15, 15, 0, 2);
    constraints.ipadx = 5;
    constraints.ipady = 5;

    //Todo add all components to the view
    //Todo apply constraints to components
    setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "Add New Course",
        TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));

    //labels

    typeOf = new JLabel("Type of User");
    constraints.gridx = 0;
    constraints.gridy = 0;
    add(typeOf, constraints);

    nameOf = new JLabel("Name of User");
    constraints.gridx = 0;
    constraints.gridy = 1;
    add(nameOf, constraints);

    codeFor = new JLabel("ID");
    constraints.gridx = 2;
    constraints.gridy = 1;
    add(codeFor, constraints);

    final JLabel passwordOf = new JLabel("Password");
    constraints.gridx = 2;
    constraints.gridy = 2;
    add(passwordOf, constraints);

    yearOf = new JLabel("Date of Birth");
    constraints.gridx = 0;
    constraints.gridy = 2;
    add(yearOf, constraints);

    /**
     * search condition for drop downs
     * if the length is 2, then only show course
     * of 2 years, etc.
     * max 4, min 2.
     */
    lengthOf = new JLabel("Length of Course");
    constraints.gridx = 0;
    constraints.gridy = 3;
    add(lengthOf, constraints);

    semesters = new JLabel("Number of Semesters");
    constraints.gridx = 2;
    constraints.gridy = 3;
    add(semesters, constraints);

    departmentContaining = new JLabel("Department");
    constraints.gridx = 0;
    constraints.gridy = 4;
    add(departmentContaining, constraints);

    selectComponent = new JLabel("Select Course");
    constraints.gridx = 0;
    constraints.gridy = 5;
    add(selectComponent, constraints);

    //        constraints.fill = GridBagConstraints.REMAINDER;
    //        constraints.insets = new Insets( 10, 10, 0, 100 );

    //textfields'
    name = new JTextField(15);
    constraints.gridx = 1;
    constraints.gridy = 1;
    add(name, constraints);

    code = new JTextField(15);
    constraints.gridx = 3;
    constraints.gridy = 1;
    add(code, constraints);

    final JTextField password = new JTextField(15);
    constraints.gridx = 3;
    constraints.gridy = 2;
    add(password, constraints);

    year = new JTextField(15);
    constraints.gridx = 1;
    constraints.gridy = 2;
    add(year, constraints);

    length = new JTextField(15);
    constraints.gridx = 1;
    constraints.gridy = 3;
    add(length, constraints);

    semester = new JTextField(15);
    constraints.gridx = 3;
    constraints.gridy = 3;
    add(semester, constraints);

    //combo boxes
    //todo get do get type
    typeOptions = new JComboBox<>(new DefaultComboBoxModel<>(new String[] {
        "Administrator",
        "Lecturer",
        "Student"}));
    constraints.gridx = 1;
    constraints.gridy = 0;
    add(typeOptions, constraints);

    //todo get departments
    parentComponent = new JComboBox<>();
    constraints.gridx = 1;
    constraints.gridy = 4;
    add(parentComponent, constraints);

    //todo get modules
    subComponent = new JComboBox<>();
    constraints.gridx = 1;
    constraints.gridy = 5;
    add(subComponent, constraints);

    //button components
    addComponent = new JButton("Add Course");
    constraints.gridx = 2;
    constraints.gridy = 5;
    add(addComponent, constraints);

    confirm = new JButton("Confirm");
    constraints.fill = GridBagConstraints.REMAINDER;
    constraints.insets = new Insets(130, 0, 10, 10);
    constraints.gridx = 3;
    constraints.gridy = 7;
    add(confirm, constraints);

    clear = new JButton("Clear");
    constraints.gridx = 4;
    constraints.gridy = 7;
    add(clear, constraints);

    cancel = new JButton("Cancel");
    constraints.gridx = 5;
    constraints.gridy = 7;
    add(cancel, constraints);

  }
}
