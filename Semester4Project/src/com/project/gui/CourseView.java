package com.project.gui;

import com.project.database.*;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by david on 3/12/14.
 */
class CourseView extends View {
  CourseView() {
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

    setBorder(new TitledBorder(UIManager.getBorder("TitleBorder.border"), "Add New Course",
        TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));

    //labels

    typeOf = new JLabel("Type of Course");
    constraints.gridx = 0;
    constraints.gridy = 0;
    add(typeOf, constraints);

    nameOf = new JLabel("Name of Course");
    constraints.gridx = 0;
    constraints.gridy = 1;
    add(nameOf, constraints);

    codeFor = new JLabel("Code");
    constraints.gridx = 2;
    constraints.gridy = 1;
    add(codeFor, constraints);

    headOf = new JLabel("Head of Course");
    constraints.gridx = 0;
    constraints.gridy = 2;
    add(headOf, constraints);

    yearOf = new JLabel("The Course Year");
    constraints.gridx = 2;
    constraints.gridy = 2;
    add(yearOf, constraints);

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

    selectComponent = new JLabel("Select Module");
    constraints.gridx = 0;
    constraints.gridy = 5;
    add(selectComponent, constraints);

    listOf = new JLabel("Modules:");
    constraints.gridx = 0;
    constraints.gridy = 6;
    add(listOf, constraints);

    //        constraints.fill = GridBagConstraints.REMAINDER;
    //        constraints.insets = new Insets( 10, 10, 0, 100 );

    //textfields'
    name = new JTextField(20);
    constraints.gridx = 1;
    constraints.gridy = 1;
    add(name, constraints);

    code = new JTextField(20);
    constraints.gridx = 3;
    constraints.gridy = 1;
    add(code, constraints);

    head = new JTextField(20);
    constraints.gridx = 1;
    constraints.gridy = 2;
    add(head, constraints);

    year = new JTextField(20);
    constraints.gridx = 3;
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
    typeOptions = new JComboBox<>(new DefaultComboBoxModel<>(new String[] {"Full Time",
        "Part Time"}));
    constraints.gridx = 1;
    constraints.gridy = 0;
    add(typeOptions, constraints);

    //todo get departments
    parentComponent = new JComboBox<Department>();
    constraints.gridx = 1;
    constraints.gridy = 4;
    add(parentComponent, constraints);

    //todo get modules
    subComponent = new JComboBox<Module>();
    constraints.gridx = 1;
    constraints.gridy = 5;
    add(subComponent, constraints);

    //        courseModules.setMinimumSize( new Dimension( 0, 200 ) );
    //todo work on list adding and removing
    subComponents = new JList<>();
    constraints.gridx = 1;
    constraints.gridy = 6;
    constraints.fill = GridBagConstraints.BOTH;
    //    subComponents.setBackground(Color.BLUE);
    add(subComponents, constraints);

    //        constraints.fill = GridBagConstraints.LINE_START;
    //button components
    addComponent = new JButton("Add Module");
    constraints.gridx = 2;
    constraints.gridy = 5;
    add(addComponent, constraints);

    createNew = new JButton("Create New Module");
    createNew.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {
        CourseView.this.setCreateNewPanel(new JFrame());
        CourseView.this.getCreateNewPanel().add(new ModuleView());
      }
    });
    constraints.gridx = 3;
    constraints.gridy = 5;
    add(createNew, constraints);

    //        moduleOptions = new Container();
    //        moduleOptionLayout = new GroupLayout( moduleOptions );
    //        moduleOptionLayout.setHorizontalGroup( moduleOptionLayout.createParallelGroup(
    // Alignment.LEADING )
    //                                                                 .addGroup(
    // moduleOptionLayout.createSequentialGroup()
    //
    //   .addComponent( addModule )
    //
    //   .addGap( 5 )
    //
    //   .addComponent( createNewModule )
    //                                                                          ) );
    //        moduleOptionLayout.setVerticalGroup( moduleOptionLayout.createParallelGroup(
    // Alignment.LEADING )
    //                                                               .addGroup(
    // moduleOptionLayout.createSequentialGroup()
    //
    // .addGroup( moduleOptionLayout
    //
    //         .createParallelGroup( Alignment.BASELINE )
    //
    //         .addComponent( addModule )
    //
    //         .addComponent( createNewModule ) )
    //                                                                        ) );
    //        constraints.gridx = 3;
    //        constraints.gridy = 5;
    //             constraints.gridwidth = 2;
    //        add( moduleOptions, constraints );
    //        moduleOptions.setLayout( moduleOptionLayout );

    //        constraints.anchor = GridBagConstraints.SOUTHEAST;

    confirm = new JButton("Confirm");
    constraints.fill = GridBagConstraints.REMAINDER;
    constraints.insets = new Insets(90, 0, 10, 10);
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

    //        optionLayout = new Container();
    //        optionButtonLayout = new GroupLayout( optionLayout );
    //        optionButtonLayout.setHorizontalGroup( optionButtonLayout.createParallelGroup(
    // Alignment.LEADING )
    //                                                                 .addGroup(
    // optionButtonLayout.createSequentialGroup()
    //
    //   .addComponent( confirm )
    //
    //   .addGap( 10 )
    //
    //   .addComponent( clear )
    //
    //   .addGap( 10 )
    //
    //   .addComponent( cancel )
    //                                                                          ) );
    //        optionButtonLayout.setVerticalGroup( optionButtonLayout.createParallelGroup(
    // Alignment.LEADING )
    //                                                               .addGroup(
    // optionButtonLayout.createSequentialGroup()
    //
    // .addGroup( optionButtonLayout
    //
    //         .createParallelGroup( Alignment.BASELINE )
    //
    //         .addComponent( confirm )
    //
    //         .addComponent( clear )
    //
    //         .addComponent( cancel ) )
    //                                                                        ) );
    //
    //        constraints.gridx = 3;
    //        constraints.gridy = 10;
    //        //        constraints.gridwidth = 3;
    //        constraints.fill = GridBagConstraints.HORIZONTAL;
    //        add( optionLayout, constraints );
    //        optionLayout.setLayout( optionButtonLayout );

  }
}
