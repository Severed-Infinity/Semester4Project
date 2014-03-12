package com.project.gui;

import javax.swing.*;
import javax.swing.border.*;

/**
 * Created by david on 3/12/14.
 */
public class UpdateCourseView {
    JPanel updateCourse = new JPanel();
    updateCourse.setLayout( null );
    updateCourse.setBorder( new TitledBorder( UIManager.getBorder( "TitledBorder.border" ),

    "Add New Course", TitledBorder.CENTER, TitledBorder.TOP, null, new Color( 0, 0, 0 ) ) );
    mainView.add( updateCourse, "name_183053656053264" );

    JLabel label_8 = new JLabel( "Type of Course" );
    label_8.setBounds( 35, 33, 95, 14 );
    updateCourse.add( label_8 );

    JComboBox<String> comboBox_10 = new JComboBox<String>();
    comboBox_10.setBounds( 140, 30, 120, 20 );
    updateCourse.add( comboBox_10 );

    JLabel label_10 = new JLabel( "Name" );
    label_10.setBounds( 35, 66, 95, 14 );
    updateCourse.add( label_10 );

    textField_17 = new JTextField();
    textField_17.setColumns( 10 );
    textField_17.setBounds( 140, 63, 120, 20 );
    updateCourse.add( textField_17 );

    JLabel label_12 = new JLabel( "Course Code" );
    label_12.setBounds( 350, 66, 95, 14 );
    updateCourse.add( label_12 );

    textField_18 = new JTextField();
    textField_18.setColumns( 10 );
    textField_18.setBounds( 467, 63, 120, 20 );
    updateCourse.add( textField_18 );

    JLabel label_16 = new JLabel( "ID" );
    label_16.setBounds( 35, 91, 95, 14 );
    updateCourse.add( label_16 );

    textField_19 = new JTextField();
    textField_19.setColumns( 10 );
    textField_19.setBounds( 140, 88, 120, 20 );
    updateCourse.add( textField_19 );

    JLabel label_17 = new JLabel( "Department" );
    label_17.setBounds( 35, 116, 95, 14 );
    updateCourse.add( label_17 );

    JLabel label_18 = new JLabel( "Course Length" );
    label_18.setBounds( 35, 144, 95, 14 );
    updateCourse.add( label_18 );

    textField_20 = new JTextField();
    textField_20.setColumns( 10 );
    textField_20.setBounds( 140, 141, 120, 20 );
    updateCourse.add( textField_20 );

    JLabel label_19 = new JLabel( "Select Module" );
    label_19.setBounds( 35, 191, 95, 14 );
    updateCourse.add( label_19 );

    JComboBox<String> comboBox_11 = new JComboBox<String>();
    comboBox_11.setBounds( 140, 188, 192, 20 );
    updateCourse.add( comboBox_11 );

    JButton button_4 = new JButton( "Add Module" );
    button_4.setBounds( 350, 188, 95, 23 );
    updateCourse.add( button_4 );

    JButton button_8 = new JButton( "Confirm" );
    button_8.setBounds( 467, 360, 89, 23 );
    updateCourse.add( button_8 );

    JButton button_9 = new JButton( "Cancel" );
    button_9.setBounds( 665, 360, 89, 23 );
    updateCourse.add( button_9 );

    JButton button_10 = new JButton( "Clear" );
    button_10.setBounds( 566, 360, 89, 23 );
    updateCourse.add( button_10 );

    JLabel label_20 = new JLabel( "Modules: " );
    label_20.setBounds( 35, 216, 95, 14 );
    updateCourse.add( label_20 );

    JList<String> list_3 = new JList<String>();
    list_3.setBounds( 140, 214, 192, 125 );
    updateCourse.add( list_3 );

    JLabel label_21 = new JLabel( "Number of Semesters" );
    label_21.setBounds( 350, 144, 110, 14 );
    updateCourse.add( label_21 );

    JLabel label_22 = new JLabel( "Password" );
    label_22.setBounds( 350, 91, 95, 14 );
    updateCourse.add( label_22 );

    textField_21 = new JTextField();
    textField_21.setColumns( 10 );
    textField_21.setBounds( 467, 88, 120, 20 );
    updateCourse.add( textField_21 );

    textField_22 = new JTextField();
    textField_22.setColumns( 10 );
    textField_22.setBounds( 467, 141, 120, 20 );
    updateCourse.add( textField_22 );

    JComboBox<String> comboBox_12 = new JComboBox<String>();
    comboBox_12.setBounds( 140, 113, 192, 20 );
    updateCourse.add( comboBox_12 );

    JButton button_11 = new JButton( "Create New Module" );
    button_11.setBounds( 467, 188, 127, 23 );
    updateCourse.add( button_11 );
}
