package com.project.gui;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

/**
 * Created by david on 3/12/14.
 */
public class UserView {

    JPanel addUserView = new JPanel();
    addUserView.setBorder(new
    JLabel lblTypeOfUser = new JLabel( "Type of User" );
    "Add New User",TitledBorder.CENTER,TitledBorder.TOP,null,new
    JComboBox<String> userSelect = new JComboBox<String>();
    ));
    mainView.add(addUserView,"name_111674253025430");
    addUserView.setLayout(null);
    JLabel lblName = new JLabel( "Name" );
    lblTypeOfUser.setBounds(35,33,95,14);
    addUserView.add(lblTypeOfUser);
    JLabel lblTitle = new JLabel( "Title" );
    userSelect.setModel(new DefaultComboBoxModel<String>(new
    String[] JLabel
    lblId=new

    JLabel ( "ID" );

    ));
    userSelect.setBounds(140,30,120,20);
    addUserView.add(userSelect);
    JLabel lblDepartment = new JLabel( "Department" );
    lblName.setBounds(35,66,95,14);
    addUserView.add(lblName);

    textField=new
    JComboBox<String> comboBox = new JComboBox<String>();
    textField.setBounds(140,63,120,20);
    addUserView.add(textField);
    textField.setColumns(10);
    JLabel lblCourse = new JLabel( "Course" );
    lblTitle.setBounds(350,66,95,14);
    addUserView.add(lblTitle);

    textField_1=new
    JComboBox<String> comboBox_1 = new JComboBox<String>();
    textField_1.setBounds(467,63,120,20);
    addUserView.add(textField_1);
    textField_1.setColumns(10);
    JLabel lblCourseCode = new JLabel( "Course Code: " );
    lblId.setBounds(35,91,95,14);
    addUserView.add(lblId);

    textField_2=new
    JLabel lblYears = new JLabel( "Years" );
    textField_2.setBounds(140,88,120,20);
    addUserView.add(textField_2);
    textField_2.setColumns(10);
    JLabel lblTeaches = new JLabel( "Teaches" );
    lblDepartment.setBounds(35,116,95,14);
    addUserView.add(lblDepartment);
    JComboBox<String> comboBox_2 = new JComboBox<String>();
    comboBox.setModel(new DefaultComboBoxModel<String>(new
    String[] JButton
    btnAddModule=new

    JButton ( "Add Module" );

    ));
    comboBox.setBounds(140,113,192,20);
    addUserView.add(comboBox);
    JButton btnConfirm = new JButton( "Confirm" );
    lblCourse.setBounds(35,141,95,14);
    addUserView.add(lblCourse);
    JButton btnCancel = new JButton( "Cancel" );
    comboBox_1.setBounds(140,138,120,20);
    addUserView.add(comboBox_1);
    JButton btnClear = new JButton( "Clear" );
    lblCourseCode.setBounds(35,166,225,14);
    addUserView.add(lblCourseCode);
    JLabel lblModules = new JLabel( "Modules: " );
    lblYears.setBounds(350,141,62,14);
    addUserView.add(lblYears);

    textField_3=new
    JList<String> list = new JList<String>();
    textField_3.setBounds(467,138,120,20);
    addUserView.add(textField_3);
    textField_3.setColumns(10);
    JLabel lblNumberOfSemesters = new JLabel( "Number of Semesters: " );
    lblTeaches.setBounds(35,191,95,14);
    addUserView.add(lblTeaches);
    JLabel lblPassword = new JLabel( "Password" );
    comboBox_2.setBounds(140,188,192,20);
    addUserView.add(comboBox_2);

    {
        "Admin", "Lecturer", "Student"
    }

    btnAddModule.setBounds(350,187,95,23);
    addUserView.add(btnAddModule);

    {
        "School of Science and Computing", "School of Business & Humanities", "School of Engineering", "All"
    }

    btnConfirm.setBounds(467,360,89,23);
    addUserView.add(btnConfirm);

    TitledBorder ( UIManager.getBorder("TitledBorder.border" ),

    btnCancel.addActionListener(new

    Color ( 0,0,0 )

    );
    btnCancel.setBounds(665,360,89,23);
    addUserView.add(btnCancel);

    JTextField ();

    btnClear.setBounds(566,360,89,23);
    addUserView.add(btnClear);

    JTextField ();

    lblModules.setBounds(35,216,95,14);
    addUserView.add(lblModules);

    JTextField ();

    list.setBounds(140,214,192,125);
    addUserView.add(list);

    JTextField ();

    lblNumberOfSemesters.setBounds(350,166,237,14);
    addUserView.add(lblNumberOfSemesters);

    ActionListener () {

        @Override public void actionPerformed ( ActionEvent arg0){

        }
    }

    lblPassword.setBounds(350,91,95,14);
    addUserView.add(lblPassword);

    textField_4=new

    JTextField ();

    textField_4.setBounds(467,88,120,20);
    addUserView.add(textField_4);
    textField_4.setColumns(10);
}
