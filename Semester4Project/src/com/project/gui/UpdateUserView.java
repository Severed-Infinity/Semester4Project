package com.project.gui;

import javax.swing.*;
import javax.swing.border.*;

/**
 * Created by david on 3/12/14.
 */
public class UpdateUserView {




    JPanel updateUser = new JPanel();
    updateUser.setLayout( null );
    updateUser.setBorder( new TitledBorder( UIManager.getBorder( "TitledBorder.border" ),

    "Add New User", TitledBorder.CENTER, TitledBorder.TOP, null, new Color( 0, 0, 0 ) ) );
    mainView.add( updateUser, "name_183142460631028" );

    JLabel label_35 = new JLabel( "Type of User" );
    label_35.setBounds( 35, 33, 95, 14 );
    updateUser.add( label_35 );

    JComboBox<String> comboBox_17 = new JComboBox<String>();
    comboBox_17.setBounds( 140, 30, 120, 20 );
    updateUser.add( comboBox_17 );

    JLabel label_36 = new JLabel( "Name" );
    label_36.setBounds( 35, 66, 95, 14 );
    updateUser.add( label_36 );

    textField_29 = new JTextField();
    textField_29.setColumns( 10 );
    textField_29.setBounds( 140, 63, 120, 20 );
    updateUser.add( textField_29 );

    JLabel label_37 = new JLabel( "Title" );
    label_37.setBounds( 350, 66, 95, 14 );
    updateUser.add( label_37 );

    textField_30 = new JTextField();
    textField_30.setColumns( 10 );
    textField_30.setBounds( 467, 63, 120, 20 );
    updateUser.add( textField_30 );

    JLabel label_38 = new JLabel( "ID" );
    label_38.setBounds( 35, 91, 95, 14 );
    updateUser.add( label_38 );

    textField_31 = new JTextField();
    textField_31.setColumns( 10 );
    textField_31.setBounds( 140, 88, 120, 20 );
    updateUser.add( textField_31 );

    JLabel label_39 = new JLabel( "Department" );
    label_39.setBounds( 35, 116, 95, 14 );
    updateUser.add( label_39 );

    JComboBox<String> comboBox_18 = new JComboBox<String>();
    comboBox_18.setBounds( 140, 113, 192, 20 );
    updateUser.add( comboBox_18 );

    JLabel label_40 = new JLabel( "Course" );
    label_40.setBounds( 35, 141, 95, 14 );
    updateUser.add( label_40 );

    JComboBox<String> comboBox_19 = new JComboBox<String>();
    comboBox_19.setBounds( 140, 138, 120, 20 );
    updateUser.add( comboBox_19 );

    JLabel label_41 = new JLabel( "Course Code: " );
    label_41.setBounds( 35, 166, 225, 14 );
    updateUser.add( label_41 );

    JLabel label_42 = new JLabel( "Years" );
    label_42.setBounds( 350, 141, 62, 14 );
    updateUser.add( label_42 );

    textField_32 = new JTextField();
    textField_32.setColumns( 10 );
    textField_32.setBounds( 467, 138, 120, 20 );
    updateUser.add( textField_32 );

    JLabel label_43 = new JLabel( "Teaches" );
    label_43.setBounds( 35, 191, 95, 14 );
    updateUser.add( label_43 );

    JComboBox<String> comboBox_20 = new JComboBox<String>();
    comboBox_20.setBounds( 140, 188, 192, 20 );
    updateUser.add( comboBox_20 );

    JButton button_17 = new JButton( "Add Module" );
    button_17.setBounds( 350, 187, 95, 23 );
    updateUser.add( button_17 );

    JButton button_18 = new JButton( "Confirm" );
    button_18.setBounds( 467, 360, 89, 23 );
    updateUser.add( button_18 );

    JButton button_19 = new JButton( "Cancel" );
    button_19.setBounds( 665, 360, 89, 23 );
    updateUser.add( button_19 );

    JButton button_20 = new JButton( "Clear" );
    button_20.setBounds( 566, 360, 89, 23 );
    updateUser.add( button_20 );

    JLabel label_44 = new JLabel( "Modules: " );
    label_44.setBounds( 35, 216, 95, 14 );
    updateUser.add( label_44 );

    JList<String> list_5 = new JList<String>();
    list_5.setBounds( 140, 214, 192, 125 );
    updateUser.add( list_5 );

    JLabel label_45 = new JLabel( "Number of Semesters: " );
    label_45.setBounds( 350, 166, 237, 14 );
    updateUser.add( label_45 );

    JLabel label_46 = new JLabel( "Password" );
    label_46.setBounds( 350, 91, 95, 14 );
    updateUser.add( label_46 );

    textField_33 = new JTextField();
    textField_33.setColumns( 10 );
    textField_33.setBounds( 467, 88, 120, 20 );
    updateUser.add( textField_33 );

}
