package com.project.gui;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by david on 3/12/14.
 */
class ModuleView extends View {
  public ModuleView() {

    //        setSize( getParent().getWidth(), getParent().getHeight() );
    setLayout(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();

          /*
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

    /**
     * reflects the type courses the module can belong to
     */
    typeOf = new JLabel("Type of Module");
    constraints.gridx = 0;
    constraints.gridy = 0;
    add(typeOf, constraints);

    nameOf = new JLabel("Name of Module");
    constraints.gridx = 0;
    constraints.gridy = 1;
    add(nameOf, constraints);

    codeFor = new JLabel("Code");
    constraints.gridx = 2;
    constraints.gridy = 1;
    add(codeFor, constraints);

    /**
     * possibly reflects the head of the course
     */
    headOf = new JLabel("Head of Module");
    constraints.gridx = 0;
    constraints.gridy = 2;
    add(headOf, constraints);

    /**
     * the year the module belongs to
     */
    yearOf = new JLabel("The Module Year");
    constraints.gridx = 2;
    constraints.gridy = 2;
    add(yearOf, constraints);

    lengthOf = new JLabel("Length of Module");
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

    selectComponent = new JLabel("Select Lecturer");
    constraints.gridx = 0;
    constraints.gridy = 5;
    add(selectComponent, constraints);

    listOf = new JLabel("Lecturers:");
    constraints.gridx = 0;
    constraints.gridy = 6;
    add(listOf, constraints);

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

    head = new JTextField(15);
    constraints.gridx = 1;
    constraints.gridy = 2;
    add(head, constraints);

    year = new JTextField(15);
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
    parentComponent = new JComboBox<>();
    constraints.gridx = 1;
    constraints.gridy = 4;
    add(parentComponent, constraints);

    //todo get modules
    subComponent = new JComboBox<>();
    constraints.gridx = 1;
    constraints.gridy = 5;
    add(subComponent, constraints);

    //        courseModules.setMinimumSize( new Dimension( 0, 200 ) );
    subComponents = new JList<>();
    constraints.gridx = 1;
    constraints.gridy = 6;
    constraints.fill = GridBagConstraints.BOTH;
    //    subComponents.setBackground(Color.BLUE);
    add(subComponents, constraints);

    //        constraints.fill = GridBagConstraints.LINE_START;
    //button components
    addComponent = new JButton("Add Lecturer");
    constraints.gridx = 2;
    constraints.gridy = 5;
    add(addComponent, constraints);

    //todo make sure it calls the user type lecturer
    createNew = new JButton("Create New Lecturer");
    createNew.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {
        ModuleView.this.setCreateNewPanel(new JFrame());
        ModuleView.this.getCreateNewPanel().add(new UserView());
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



