package com.project.gui;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

/**
 * Created by david on 3/12/14.
 */
public class UpdateCourseView extends View {

    //    private final Container moduleOptions;
    //    private final Container optionLayout;
    //    protected GroupLayout optionButtonLayout, moduleOptionLayout;
    protected JLabel typeOfCourse, nameOfCourse, codeForCourse, lengthOfCourse, yearOfCourse, semestersInCourse, departmentContainingCourse, headOfCourse, modulesInCourse, listOfModules;
    protected JTextField courseName, courseCode, courseLength, courseYear, courseSemester, courseHead;
    protected JButton addModule, createNewModule, update, delete, cancel;
    //todo change <types> to the correct types, for now string will do until classes are made
    protected JComboBox<String> courseTypeOptions, courseModule, courseDepartment;
    protected JList<String> courseModules;

    public UpdateCourseView () {
        //        setSize( getParent().getWidth(), getParent().getHeight() );
        setLayout( new GridBagLayout() );
        GridBagConstraints constraints = new GridBagConstraints();

          /*
        constraints

         */
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        //        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.NORTHEAST;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets( 15, 15, 0, 2 );
        constraints.ipadx = 5;
        constraints.ipady = 5;

        //Todo add all components to the view
        //Todo apply constraints to components
        setBorder( new TitledBorder( UIManager.getBorder( "TitleBorder.border" ), "Update Course", TitledBorder.CENTER,
                TitledBorder.TOP, null, new Color( 0, 0, 0 ) ) );

        //labels
        typeOfCourse = new JLabel( "Type of Course" );
        constraints.gridx = 0;
        constraints.gridy = 0;
        add( typeOfCourse, constraints );

        nameOfCourse = new JLabel( "Name" );
        constraints.gridx = 0;
        constraints.gridy = 1;
        add( nameOfCourse, constraints );

        codeForCourse = new JLabel( "Course Code" );
        constraints.gridx = 2;
        constraints.gridy = 1;
        add( codeForCourse, constraints );

        headOfCourse = new JLabel( "Course Head" );
        constraints.gridx = 0;
        constraints.gridy = 2;
        add( headOfCourse, constraints );

        departmentContainingCourse = new JLabel( "Department" );
        constraints.gridx = 0;
        constraints.gridy = 3;
        add( departmentContainingCourse, constraints );

        lengthOfCourse = new JLabel( "Course length" );
        constraints.gridx = 0;
        constraints.gridy = 4;
        add( lengthOfCourse, constraints );

        modulesInCourse = new JLabel( "Select Module" );
        constraints.gridx = 0;
        constraints.gridy = 5;
        add( modulesInCourse, constraints );

        listOfModules = new JLabel( "List of Modules:" );
        constraints.gridx = 0;
        constraints.gridy = 6;
        add( listOfModules, constraints );

        //        constraints.fill = GridBagConstraints.REMAINDER;
        //        constraints.insets = new Insets( 10, 10, 0, 100 );

        //textfields
        courseName = new JTextField( 15 );
        constraints.gridx = 1;
        constraints.gridy = 1;
        add( courseName, constraints );

        courseCode = new JTextField( 15 );
        constraints.gridx = 3;
        constraints.gridy = 1;
        add( courseCode, constraints );

        courseHead = new JTextField( 15 );
        constraints.gridx = 1;
        constraints.gridy = 2;
        add( courseHead, constraints );

        courseLength = new JTextField( 15 );
        constraints.gridx = 1;
        constraints.gridy = 4;
        add( courseLength, constraints );

        //combo boxes
        //todo get do get type
        courseTypeOptions = new JComboBox<>( new DefaultComboBoxModel<>( new String[]{ "Full time", "Part time" } ) );
        constraints.gridx = 1;
        constraints.gridy = 0;
        add( courseTypeOptions, constraints );

        //todo get departments
        courseDepartment = new JComboBox<>();
        constraints.gridx = 1;
        constraints.gridy = 3;
        add( courseDepartment, constraints );

        //todo get modules
        courseModule = new JComboBox<>();
        constraints.gridx = 1;
        constraints.gridy = 5;
        add( courseModule, constraints );

        courseModules = new JList<>();
        //        courseModules.setMinimumSize( new Dimension( 0, 200 ) );
        constraints.gridx = 1;
        constraints.gridy = 6;
        constraints.fill = GridBagConstraints.BOTH;
        courseModules.setBackground( Color.BLUE );
        add( courseModules, constraints );

        //        constraints.fill = GridBagConstraints.LINE_START;
        //button components
        addModule = new JButton( "Add Module" );
        constraints.gridx = 2;
        constraints.gridy = 5;
        add( addModule, constraints );

        createNewModule = new JButton( "Create New Module" );
        constraints.gridx = 3;
        constraints.gridy = 5;
        add( createNewModule, constraints );

        //        moduleOptions = new Container();
        //        moduleOptionLayout = new GroupLayout( moduleOptions );
        //        moduleOptionLayout.setHorizontalGroup( moduleOptionLayout.createParallelGroup( Alignment.LEADING )
        //                                                                 .addGroup( moduleOptionLayout.createSequentialGroup()
        //                                                                                              .addComponent( addModule )
        //                                                                                              .addGap( 5 )
        //                                                                                              .addComponent( createNewModule )
        //                                                                          ) );
        //        moduleOptionLayout.setVerticalGroup( moduleOptionLayout.createParallelGroup( Alignment.LEADING )
        //                                                               .addGroup( moduleOptionLayout.createSequentialGroup()
        //                                                                                            .addGroup( moduleOptionLayout
        //                                                                                                    .createParallelGroup( Alignment.BASELINE )
        //                                                                                                    .addComponent( addModule )
        //                                                                                                    .addComponent( createNewModule ) )
        //                                                                        ) );
        //        constraints.gridx = 3;
        //        constraints.gridy = 5;
        //             constraints.gridwidth = 2;
        //        add( moduleOptions, constraints );
        //        moduleOptions.setLayout( moduleOptionLayout );

        //        constraints.anchor = GridBagConstraints.SOUTHEAST;
        constraints.fill = GridBagConstraints.REMAINDER;
        constraints.insets = new Insets( 90, 0, 10, 10 );
        update = new JButton( "Update" );
        constraints.gridx = 3;
        constraints.gridy = 7;
        add( update, constraints );

        delete = new JButton( "Delete" );
        constraints.gridx = 4;
        constraints.gridy = 7;
        add( delete, constraints );

        cancel = new JButton( "Cancel" );
        constraints.gridx = 5;
        constraints.gridy = 7;
        add( cancel, constraints );

        //        optionLayout = new Container();
        //        optionButtonLayout = new GroupLayout( optionLayout );
        //        optionButtonLayout.setHorizontalGroup( optionButtonLayout.createParallelGroup( Alignment.LEADING )
        //                                                                 .addGroup( optionButtonLayout.createSequentialGroup()
        //                                                                                              .addComponent( confirm )
        //                                                                                              .addGap( 10 )
        //                                                                                              .addComponent( clear )
        //                                                                                              .addGap( 10 )
        //                                                                                              .addComponent( cancel )
        //                                                                          ) );
        //        optionButtonLayout.setVerticalGroup( optionButtonLayout.createParallelGroup( Alignment.LEADING )
        //                                                               .addGroup( optionButtonLayout.createSequentialGroup()
        //                                                                                            .addGroup( optionButtonLayout
        //                                                                                                    .createParallelGroup( Alignment.BASELINE )
        //                                                                                                    .addComponent( confirm )
        //                                                                                                    .addComponent( clear )
        //                                                                                                    .addComponent( cancel ) )
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
