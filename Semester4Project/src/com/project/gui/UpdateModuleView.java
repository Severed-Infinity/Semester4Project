package com.project.gui;

import javax.swing.*;
import javax.swing.border.*;

/**
 * Created by david on 3/12/14.
 */
public class UpdateModuleView {

    JPanel updateModule = new JPanel();
    updateModule.setLayout(null);
    updateModule.setBorder(new
    JLabel label_23 = new JLabel( "Type of Course" );

    "Add New Module",TitledBorder.CENTER,TitledBorder.TOP,null,new
    JComboBox<String> comboBox_13 = new JComboBox<String>();
    ));
    mainView.add(updateModule,"name_183096271792642");
    JLabel label_24 = new JLabel( "Name" );
    label_23.setBounds(35,33,95,14);
    updateModule.add(label_23);
    JLabel label_25 = new JLabel( "Module Code" );
    comboBox_13.setBounds(140,30,120,20);
    updateModule.add(comboBox_13);
    JLabel label_26 = new JLabel( "ID" );
    label_24.setBounds(35,66,95,14);
    updateModule.add(label_24);

    textField_23=new
    JLabel label_27 = new JLabel( "Department" );
    textField_23.setColumns(10);
    textField_23.setBounds(140,63,120,20);
    updateModule.add(textField_23);
    JLabel label_28 = new JLabel( "Hours a Week" );
    label_25.setBounds(350,66,95,14);
    updateModule.add(label_25);

    textField_24=new
    JLabel label_29 = new JLabel( "Select Lecturer" );
    textField_24.setColumns(10);
    textField_24.setBounds(467,63,120,20);
    updateModule.add(textField_24);
    JComboBox<String> comboBox_14 = new JComboBox<String>();
    label_26.setBounds(35,91,95,14);
    updateModule.add(label_26);

    textField_25=new
    JButton button_12 = new JButton( "Add Lecturer" );
    textField_25.setColumns(10);
    textField_25.setBounds(140,88,120,20);
    updateModule.add(textField_25);
    JButton button_13 = new JButton( "Confirm" );
    label_27.setBounds(35,116,95,14);
    updateModule.add(label_27);
    JButton button_14 = new JButton( "Cancel" );
    label_28.setBounds(350,165,95,14);
    updateModule.add(label_28);

    textField_26=new
    JButton button_15 = new JButton( "Clear" );
    textField_26.setColumns(10);
    textField_26.setBounds(467,162,120,20);
    updateModule.add(textField_26);
    JLabel label_30 = new JLabel( "Lecturers: " );
    label_29.setBounds(35,191,95,14);
    updateModule.add(label_29);
    JList<String> list_4 = new JList<String>();
    comboBox_14.setBounds(140,188,192,20);
    updateModule.add(comboBox_14);
    JLabel label_31 = new JLabel( "Number of Semesters" );
    button_12.setBounds(350,187,95,23);
    updateModule.add(button_12);
    JLabel label_32 = new JLabel( "Password" );
    button_13.setBounds(467,360,89,23);
    updateModule.add(button_13);
    JComboBox<String> comboBox_15 = new JComboBox<String>();
    button_14.setBounds(665,360,89,23);
    updateModule.add(button_14);
    JButton button_16 = new JButton( "Create New Course" );
    button_15.setBounds(566,360,89,23);
    updateModule.add(button_15);
    JLabel label_33 = new JLabel( "Course" );
    label_30.setBounds(35,216,95,14);
    updateModule.add(label_30);
    JComboBox<String> comboBox_16 = new JComboBox<String>();
    list_4.setBounds(140,214,192,125);
    updateModule.add(list_4);
    JLabel label_34 = new JLabel( "Course Code: " );
    label_31.setBounds(350,138,110,14);
    updateModule.add(label_31);

    TitledBorder ( UIManager.getBorder("TitledBorder.border" ),

    label_32.setBounds(350,91,95,14);
    updateModule.add(label_32);

    textField_27=new

    Color ( 0,0,0 )

    textField_27.setColumns(10);
    textField_27.setBounds(467,88,120,20);
    updateModule.add(textField_27);

    textField_28=new

    JTextField ();

    textField_28.setColumns(10);
    textField_28.setBounds(467,138,120,20);
    updateModule.add(textField_28);

    JTextField ();

    comboBox_15.setBounds(140,113,192,20);
    updateModule.add(comboBox_15);

    JTextField ();

    button_16.setBounds(467,187,127,23);
    updateModule.add(button_16);

    JTextField ();

    label_33.setBounds(35,141,95,14);
    updateModule.add(label_33);

    JTextField ();

    comboBox_16.setBounds(140,138,120,20);
    updateModule.add(comboBox_16);

    JTextField ();

    label_34.setBounds(35,165,225,14);
    updateModule.add(label_34);

}
