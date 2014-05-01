package com.project.gui;

import com.project.constants.*;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by david on 3/12/14.
 */
class UpdateModuleView extends ModuleView {
  private static final long serialVersionUID = -6559491207408495021L;

  UpdateModuleView() {
    super();

    //        setSize( getParent().getWidth(), getParent().getHeight() );
    this.setLayout(new GridBagLayout());
    final GridBagConstraints constraints = new GridBagConstraints();

          /*
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
    this.setBorder(
        new TitledBorder(UIManager.getBorder("TitleBorder.border"), StringConstants.ADD_NEW_COURSE,
            TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));

    //labels

    /**
     * reflects the type COURSES the module can belong to
     */
    this.typeOf = new JLabel(StringConstants.TYPE_OF_MODULE);
    constraints.gridx = 0;
    constraints.gridy = 0;
    this.add(this.typeOf, constraints);

    this.nameOf = new JLabel(StringConstants.NAME_OF_MODULE);
    constraints.gridx = 0;
    constraints.gridy = 1;
    this.add(this.nameOf, constraints);

    this.codeFor = new JLabel(StringConstants.TYPECODE);
    constraints.gridx = 2;
    constraints.gridy = 1;
    this.add(this.codeFor, constraints);

    /**
     * possibly reflects the head of the course
     */
    this.headOf = new JLabel(StringConstants.HEAD_OF_MODULE);
    constraints.gridx = 0;
    constraints.gridy = 2;
    this.add(this.headOf, constraints);

    /**
     * the year the module belongs to
     */
    this.yearOf = new JLabel(StringConstants.THE_MODULE_YEAR);
    constraints.gridx = 2;
    constraints.gridy = 2;
    this.add(this.yearOf, constraints);

    this.lengthOf = new JLabel(StringConstants.LENGTH_OF_MODULE);
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

    this.selectComponent = new JLabel(StringConstants.SELECT_LECTURER);
    constraints.gridx = 0;
    constraints.gridy = 5;
    this.add(this.selectComponent, constraints);

    this.listOf = new JLabel(StringConstants.LECTURERS);
    constraints.gridx = 0;
    constraints.gridy = 6;
    this.add(this.listOf, constraints);

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

    this.head = new JTextField(15);
    constraints.gridx = 1;
    constraints.gridy = 2;
    this.add(this.head, constraints);

    this.year = new JTextField(15);
    constraints.gridx = 3;
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
    this.typeOptions = new JComboBox<>(new DefaultComboBoxModel<String>(new String[]
        {StringConstants
            .FULL_TIME,
            StringConstants.PART_TIME}));
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

    //        COURSE_MODULES.setMinimumSize( new Dimension( 0, 200 ) );
    this.subComponents = new JList<>();
    constraints.gridx = 1;
    constraints.gridy = 6;
    constraints.fill = GridBagConstraints.BOTH;
    //    subComponents.setBackground(Color.BLUE);
    this.add(this.subComponents, constraints);

    //        constraints.fill = GridBagConstraints.LINE_START;
    //button components
    this.addComponent = new JButton(StringConstants.ADD_LECTURER);
    constraints.gridx = 2;
    constraints.gridy = 5;
    this.add(this.addComponent, constraints);

    //todo make sure it calls the user type lecturer
    this.createNew = new JButton(StringConstants.CREATE_NEW_LECTURER);
    this.createNew.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent actionEvent) {
        UpdateModuleView.this.setCreateNewPanel(new JFrame());
        final JFrame newPanel = UpdateModuleView.this.getCreateNewPanel();
        newPanel.add(new UserView());
      }
    });
    constraints.gridx = 3;
    constraints.gridy = 5;
    this.add(this.createNew, constraints);

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

    this.confirm = new JButton(StringConstants.CONFIRM);
    constraints.fill = GridBagConstraints.REMAINDER;
    constraints.insets = new Insets(90, 0, 10, 10);
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



