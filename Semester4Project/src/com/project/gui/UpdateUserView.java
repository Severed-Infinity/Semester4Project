package com.project.gui;

import com.project.constants.*;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

/**
 * Created by david on 3/12/14.
 */
class UpdateUserView extends UserView {
  private static final long serialVersionUID = 2857026444504054612L;

  UpdateUserView() {
    super();
    //        setSize( getParent().getWidth(), getParent().getHeight() );
    this.setLayout(new GridBagLayout());
    final GridBagConstraints constraints = new GridBagConstraints();
    /**
     constraints

     */
    constraints.weightx = 1.0;
    constraints.weighty = 1.0;
    //        constraints.gridwidth = 1;
    constraints.anchor = GridBagConstraints.FIRST_LINE_END;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.insets = new Insets(15, 15, 0, 2);
    constraints.ipadx = 5;
    constraints.ipady = 5;
    //Todo add all components to the view
    //Todo apply constraints to components
    this.setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"),
        StringConstants.ADD_NEW_COURSE,
        TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
    //labels
    this.typeOf = new JLabel(StringConstants.TYPE_OF_USER);
    constraints.gridx = 0;
    constraints.gridy = 0;
    this.add(this.typeOf, constraints);
    this.nameOf = new JLabel(StringConstants.NAME_OF_USER);
    constraints.gridx = 0;
    constraints.gridy = 1;
    this.add(this.nameOf, constraints);
    this.codeFor = new JLabel(StringConstants.TYPECODE);
    constraints.gridx = 2;
    constraints.gridy = 1;
    this.add(this.codeFor, constraints);
    final JLabel passwordOf = new JLabel(StringConstants.PASSWORD);
    constraints.gridx = 2;
    constraints.gridy = 2;
    this.add(passwordOf, constraints);
    this.yearOf = new JLabel(StringConstants.DATE_OF_BIRTH);
    constraints.gridx = 0;
    constraints.gridy = 2;
    this.add(this.yearOf, constraints);
    /**
     * search condition for drop downs
     * if the length is 2, then only show course
     * of 2 years, etc.
     * max 4, min 2.
     */
    this.lengthOf = new JLabel(StringConstants.LENGTH_OF_COURSE);
    constraints.gridx = 0;
    constraints.gridy = 3;
    this.add(this.lengthOf, constraints);
    this.semesters = new JLabel(StringConstants.NUMBER_OF_SEMESTERS);
    constraints.gridx = 2;
    constraints.gridy = 3;
    this.add(this.semesters, constraints);
    this.departmentContaining = new JLabel(StringConstants.DEPARTMENT);
    constraints.gridx = 0;
    constraints.gridy = 4;
    this.add(this.departmentContaining, constraints);
    this.selectComponent = new JLabel(StringConstants.SELECT_COURSE);
    constraints.gridx = 0;
    constraints.gridy = 5;
    this.add(this.selectComponent, constraints);
    //        constraints.fill = GridBagConstraints.REMAINDER;
    //        constraints.insets = new Insets( 10, 10, 0, 100 );
    //textfields'
    this.name = new JTextField(15);
    constraints.gridx = 1;
    constraints.gridy = 1;
    this.add(this.name, constraints);
    this.code = new JTextField(15);
    constraints.gridx = 3;
    constraints.gridy = 1;
    this.add(this.code, constraints);
    final JTextField password = new JTextField(15);
    constraints.gridx = 3;
    constraints.gridy = 2;
    this.add(password, constraints);
    this.year = new JTextField(15);
    constraints.gridx = 1;
    constraints.gridy = 2;
    this.add(this.year, constraints);
    this.length = new JTextField(15);
    constraints.gridx = 1;
    constraints.gridy = 3;
    this.add(this.length, constraints);
    this.semester = new JTextField(15);
    constraints.gridx = 3;
    constraints.gridy = 3;
    this.add(this.semester, constraints);
    //combo boxes
    //todo get do get type
    this.typeOptions = new JComboBox<>(new DefaultComboBoxModel<String>(new String[] {
        StringConstants.ADMINISTRATOR,
        StringConstants.LECTURER,
        StringConstants.STUDENT}));
    constraints.gridx = 1;
    constraints.gridy = 0;
    this.add(this.typeOptions, constraints);
    //todo get DEPARTMENTS
    this.parentComponent = new JComboBox<>();
    constraints.gridx = 1;
    constraints.gridy = 4;
    this.add(this.parentComponent, constraints);
    //todo get MODULES
    this.subComponent = new JComboBox<>();
    constraints.gridx = 1;
    constraints.gridy = 5;
    this.add(this.subComponent, constraints);
    //button components
    this.addComponent = new JButton(StringConstants.ADD_COURSE);
    constraints.gridx = 2;
    constraints.gridy = 5;
    this.add(this.addComponent, constraints);
    this.confirm = new JButton(StringConstants.CONFIRM);
    constraints.fill = GridBagConstraints.REMAINDER;
    constraints.insets = new Insets(130, 0, 10, 10);
    constraints.gridx = 3;
    constraints.gridy = 7;
    this.add(this.confirm, constraints);
    this.clear = new JButton(StringConstants.CLEAR);
    constraints.gridx = 4;
    constraints.gridy = 7;
    this.add(this.clear, constraints);
    this.cancel = new JButton(StringConstants.CANCEL);
    constraints.gridx = 5;
    constraints.gridy = 7;
    this.add(this.cancel, constraints);

  }
}
