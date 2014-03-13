package com.project.gui;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

/**
 * Created by david on 3/12/14.
 */
public class UserView extends View {

    private final JButton btnAddModule;
    private final JTextField textField;
    private final JTextField textField_1;
    private final JTextField textField_2;
    private final JTextField textField_3;
    private final JTextField textField_4;

    public UserView ( Container parent, String position, String title ) {
        super( parent, position, title, null );

        JPanel addUserView = new JPanel();

        addUserView.setBorder( new TitledBorder( UIManager.getBorder( "TitledBorder.border" ), "Add New User", TitledBorder.CENTER, TitledBorder.TOP, null, new Color( 0, 0, 0 ) ) );
        //        mainView.add( addUserView, "name_111674253025430" );

        JLabel lblTypeOfUser = new JLabel( "Type of User" );
        lblTypeOfUser.setBounds( 35, 33, 95, 14 );
        addUserView.add( lblTypeOfUser );

        JComboBox<String> userSelect = new JComboBox<String>();
        userSelect.setModel( new DefaultComboBoxModel<String>( new String[]{ "School of Science and Computing", "School of Business & Humanities", "School of Engineering", "All" } ) );
        userSelect.setBounds( 140, 30, 120, 20 );
        addUserView.add( userSelect );

        btnAddModule = new JButton( "Add Module" );
        btnAddModule.setBounds( 350, 187, 95, 23 );
        addUserView.add( btnAddModule );

        JLabel lblName = new JLabel( "Name" );
        lblName.setBounds( 35, 66, 95, 14 );
        addUserView.add( lblName );

        JLabel lblTitle = new JLabel( "Title" );
        lblTitle.setBounds( 350, 66, 95, 14 );
        addUserView.add( lblTitle );

        JLabel lblDepartment = new JLabel( "Department" );
        lblDepartment.setBounds( 35, 116, 95, 14 );
        addUserView.add( lblDepartment );

        JLabel lblId = new JLabel( "ID" );
        lblId.setBounds( 35, 91, 95, 14 );
        addUserView.add( lblId );

        JComboBox<String> comboBox = new JComboBox<String>();
        comboBox.setModel( new DefaultComboBoxModel<String>( new String[]{ "Admin", "Lecturer", "Student" } ) );
        comboBox.setBounds( 140, 113, 192, 20 );
        addUserView.add( comboBox );

        JLabel lblCourse = new JLabel( "Course" );
        lblCourse.setBounds( 35, 141, 95, 14 );
        addUserView.add( lblCourse );

        textField = new JTextField();
        textField.setBounds( 140, 63, 120, 20 );
        addUserView.add( textField );
        textField.setColumns( 10 );

        JComboBox<String> comboBox_1 = new JComboBox<String>();
        comboBox_1.setBounds( 140, 138, 120, 20 );
        addUserView.add( comboBox_1 );

        JLabel lblCourseCode = new JLabel( "Course Code: " );
        lblCourseCode.setBounds( 35, 166, 225, 14 );
        addUserView.add( lblCourseCode );

        textField_1 = new JTextField();
        textField_1.setBounds( 467, 63, 120, 20 );
        addUserView.add( textField_1 );
        textField_1.setColumns( 10 );

        JLabel lblYears = new JLabel( "Years" );
        lblYears.setBounds( 350, 141, 62, 14 );
        addUserView.add( lblYears );

        JLabel lblTeaches = new JLabel( "Teaches" );
        lblTeaches.setBounds( 35, 191, 95, 14 );
        addUserView.add( lblTeaches );

        textField_2 = new JTextField();
        textField_2.setBounds( 140, 88, 120, 20 );
        addUserView.add( textField_2 );
        textField_2.setColumns( 10 );

        JComboBox<String> comboBox_2 = new JComboBox<String>();
        comboBox_2.setBounds( 140, 188, 192, 20 );
        addUserView.add( comboBox_2 );

        JButton btnConfirm = new JButton( "Confirm" );
        btnConfirm.setBounds( 467, 360, 89, 23 );
        addUserView.add( btnConfirm );

        JButton btnCancel = new JButton( "Cancel" );
        btnCancel.setBounds( 665, 360, 89, 23 );
        addUserView.add( btnCancel );

        JButton btnClear = new JButton( "Clear" );
        btnClear.setBounds( 566, 360, 89, 23 );
        addUserView.add( btnClear );

        JLabel lblModules = new JLabel( "Modules: " );
        lblModules.setBounds( 35, 216, 95, 14 );
        addUserView.add( lblModules );

        JList<String> list = new JList<String>();
        list.setBounds( 140, 214, 192, 125 );
        addUserView.add( list );

        JLabel lblNumberOfSemesters = new JLabel( "Number of Semesters: " );
        lblNumberOfSemesters.setBounds( 350, 166, 237, 14 );
        addUserView.add( lblNumberOfSemesters );

        JLabel lblPassword = new JLabel( "Password" );
        lblPassword.setBounds( 350, 91, 95, 14 );
        addUserView.add( lblPassword );

        textField_3 = new JTextField();
        textField_3.setBounds( 467, 138, 120, 20 );
        addUserView.add( textField_3 );
        textField_3.setColumns( 10 );

        textField_4 = new JTextField();
        textField_4.setBounds( 467, 88, 120, 20 );
        addUserView.add( textField_4 );
        textField_4.setColumns( 10 );
    }

}
