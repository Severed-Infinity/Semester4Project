package com.project.gui;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

/**
 * Created by david on 3/12/14.
 */
public class ModuleView extends View {

    private final JTextField txtModuleCode;
    private final JTextField txtModuleID;
    private final JTextField txtModuleDepartment;
    private final JTextField txtModuleLectuer;
    private final JTextField textField_15;
    private final JTextField textField_16;

    public ModuleView ( Container parent, String position, String title ) {
        super( parent, position, title, null );

        JPanel addNewModule = new JPanel();
        //        mainView.add( addNewModule, "name_814821531771" );
        addNewModule.setLayout( null );
        addNewModule.setBorder( new TitledBorder( UIManager.getBorder( "TitledBorder.border" ), "Add New Module", TitledBorder.CENTER, TitledBorder.TOP, null, new Color( 0, 0, 0 ) ) );

        JLabel label = new JLabel( "Type of Course" );
        label.setBounds( 35, 33, 95, 14 );
        addNewModule.add( label );

        JComboBox<String> comboBox_5 = new JComboBox<>();
        comboBox_5.setBounds( 140, 30, 120, 20 );
        addNewModule.add( comboBox_5 );

        JLabel label_2 = new JLabel( "Name" );
        label_2.setBounds( 35, 66, 95, 14 );
        addNewModule.add( label_2 );

        txtModuleCode = new JTextField();
        txtModuleCode.setColumns( 10 );
        txtModuleCode.setBounds( 140, 63, 120, 20 );
        addNewModule.add( txtModuleCode );

        JLabel lblModuleCode = new JLabel( "Module Code" );
        lblModuleCode.setBounds( 350, 66, 95, 14 );
        addNewModule.add( lblModuleCode );

        txtModuleID = new JTextField();
        txtModuleID.setColumns( 10 );
        txtModuleID.setBounds( 467, 63, 120, 20 );
        addNewModule.add( txtModuleID );

        JLabel label_6 = new JLabel( "ID" );
        label_6.setBounds( 35, 91, 95, 14 );
        addNewModule.add( label_6 );

        txtModuleDepartment = new JTextField();
        txtModuleDepartment.setColumns( 10 );
        txtModuleDepartment.setBounds( 140, 88, 120, 20 );
        addNewModule.add( txtModuleDepartment );

        JLabel label_7 = new JLabel( "Department" );
        label_7.setBounds( 35, 116, 95, 14 );
        addNewModule.add( label_7 );

        JLabel lblHoursAWeek = new JLabel( "Hours a Week" );
        lblHoursAWeek.setBounds( 350, 165, 95, 14 );
        addNewModule.add( lblHoursAWeek );

        txtModuleLectuer = new JTextField();
        txtModuleLectuer.setColumns( 10 );
        txtModuleLectuer.setBounds( 467, 162, 120, 20 );
        addNewModule.add( txtModuleLectuer );

        JLabel lblSelectLecturer = new JLabel( "Select Lecturer" );
        lblSelectLecturer.setBounds( 35, 191, 95, 14 );
        addNewModule.add( lblSelectLecturer );

        JComboBox<String> comboBox_7 = new JComboBox<String>();
        comboBox_7.setBounds( 140, 188, 192, 20 );
        addNewModule.add( comboBox_7 );

        JButton btnAddLecturer = new JButton( "Add Lecturer" );
        btnAddLecturer.setBounds( 350, 187, 95, 23 );
        addNewModule.add( btnAddLecturer );

        JButton button_5 = new JButton( "Confirm" );
        button_5.setBounds( 467, 360, 89, 23 );
        addNewModule.add( button_5 );

        JButton button_6 = new JButton( "Cancel" );
        button_6.setBounds( 665, 360, 89, 23 );
        addNewModule.add( button_6 );

        JButton button_7 = new JButton( "Clear" );
        button_7.setBounds( 566, 360, 89, 23 );
        addNewModule.add( button_7 );

        JLabel lblLecturers = new JLabel( "Lecturers: " );
        lblLecturers.setBounds( 35, 216, 95, 14 );
        addNewModule.add( lblLecturers );

        JList<String> list_2 = new JList<String>();
        list_2.setBounds( 140, 214, 192, 125 );
        addNewModule.add( list_2 );

        JLabel label_13 = new JLabel( "Number of Semesters" );
        label_13.setBounds( 350, 138, 110, 14 );
        addNewModule.add( label_13 );

        JLabel label_14 = new JLabel( "Password" );
        label_14.setBounds( 350, 91, 95, 14 );
        addNewModule.add( label_14 );

        textField_15 = new JTextField();
        textField_15.setColumns( 10 );
        textField_15.setBounds( 467, 88, 120, 20 );
        addNewModule.add( textField_15 );

        textField_16 = new JTextField();
        textField_16.setColumns( 10 );
        textField_16.setBounds( 467, 138, 120, 20 );
        addNewModule.add( textField_16 );

        JComboBox<String> comboBox_8 = new JComboBox<String>();
        comboBox_8.setBounds( 140, 113, 192, 20 );
        addNewModule.add( comboBox_8 );

        JButton btnCreateNewCourse = new JButton( "Create New Course" );
        btnCreateNewCourse.setBounds( 467, 187, 127, 23 );
        addNewModule.add( btnCreateNewCourse );

        JLabel label_5 = new JLabel( "Course" );
        label_5.setBounds( 35, 141, 95, 14 );
        addNewModule.add( label_5 );

        JComboBox<String> comboBox_9 = new JComboBox<String>();
        comboBox_9.setBounds( 140, 138, 120, 20 );
        addNewModule.add( comboBox_9 );

        JLabel label_15 = new JLabel( "Course Code: " );
        label_15.setBounds( 35, 165, 225, 14 );
        addNewModule.add( label_15 );
    }

}
