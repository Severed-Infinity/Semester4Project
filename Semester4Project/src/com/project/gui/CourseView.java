package com.project.gui;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

/**
 * Created by david on 3/12/14.
 */
public class CourseView extends View {

    private final JTextField txtCourseCode;
    private final JTextField textField_6;
    private final JTextField textField_7;
    private final JTextField textField_8;
    private final JTextField textField_9;
    private final JTextField textField_10;

    public CourseView ( Container parent, String position, String title ) {
        super( parent, position, title, null );

        JPanel addNewCourse = new JPanel();
        addNewCourse.setLayout( null );
        addNewCourse.setBorder( new

                TitledBorder( UIManager.getBorder( "TitledBorder.border" ),

                "Add New Course", TitledBorder.CENTER, TitledBorder.TOP, null, new

                Color( 0, 0, 0 )
        ) );
        //        mainView.add( addNewCourse, "name_171164909579259" );

        JLabel lblTypeOfCourse = new JLabel( "Type of Course" );
        lblTypeOfCourse.setBounds( 35, 33, 95, 14 );
        addNewCourse.add( lblTypeOfCourse );

        JComboBox<String> comboBox_3 = new JComboBox<String>();
        comboBox_3.setModel( new DefaultComboBoxModel<String>( new String[]

                { "Full time", "Part time" }
        ) );
        comboBox_3.setBounds( 140, 30, 120, 20 );
        addNewCourse.add( comboBox_3 );

        JLabel label_1 = new JLabel( "Name" );
        label_1.setBounds( 35, 66, 95, 14 );
        addNewCourse.add( label_1 );

        txtCourseCode = new JTextField();
        txtCourseCode.setColumns( 10 );
        txtCourseCode.setBounds( 140, 63, 120, 20 );
        addNewCourse.add( txtCourseCode );

        JLabel lblCourseCode_1 = new JLabel( "Course Code" );
        lblCourseCode_1.setBounds( 350, 66, 95, 14 );
        addNewCourse.add( lblCourseCode_1 );

        textField_6 = new JTextField();
        textField_6.setColumns( 10 );
        textField_6.setBounds( 467, 63, 120, 20 );
        addNewCourse.add( textField_6 );

        JLabel label_3 = new JLabel( "ID" );
        label_3.setBounds( 35, 91, 95, 14 );
        addNewCourse.add( label_3 );

        textField_7 = new JTextField();
        textField_7.setColumns( 10 );
        textField_7.setBounds( 140, 88, 120, 20 );
        addNewCourse.add( textField_7 );

        JLabel label_4 = new JLabel( "Department" );
        label_4.setBounds( 35, 116, 95, 14 );
        addNewCourse.add( label_4 );

        JLabel lblCourseLength = new JLabel( "Course Length" );
        lblCourseLength.setBounds( 35, 144, 95, 14 );
        addNewCourse.add( lblCourseLength );

        textField_8 = new JTextField();
        textField_8.setColumns( 10 );
        textField_8.setBounds( 140, 141, 120, 20 );
        addNewCourse.add( textField_8 );

        JLabel lblSelectModule = new JLabel( "Select Module" );
        lblSelectModule.setBounds( 35, 191, 95, 14 );
        addNewCourse.add( lblSelectModule );

        JComboBox<String> comboBox_6 = new JComboBox<String>();
        comboBox_6.setBounds( 140, 188, 192, 20 );
        addNewCourse.add( comboBox_6 );

        JButton button = new JButton( "Add Module" );
        button.setBounds( 350, 188, 95, 23 );
        addNewCourse.add( button );

        JButton button_1 = new JButton( "Confirm" );
        button_1.setBounds( 467, 360, 89, 23 );
        addNewCourse.add( button_1 );

        JButton button_2 = new JButton( "Cancel" );
        button_2.setBounds( 665, 360, 89, 23 );
        addNewCourse.add( button_2 );

        JButton button_3 = new JButton( "Clear" );
        button_3.setBounds( 566, 360, 89, 23 );
        addNewCourse.add( button_3 );

        JLabel label_9 = new JLabel( "Modules: " );
        label_9.setBounds( 35, 216, 95, 14 );
        addNewCourse.add( label_9 );

        JList<String> list_1 = new JList<String>();
        list_1.setBounds( 140, 214, 192, 125 );
        addNewCourse.add( list_1 );

        JLabel lblNumberOfSemesters_1 = new JLabel( "Number of Semesters" );
        lblNumberOfSemesters_1.setBounds( 350, 144, 110, 14 );
        addNewCourse.add( lblNumberOfSemesters_1 );

        JLabel label_11 = new JLabel( "Password" );
        label_11.setBounds( 350, 91, 95, 14 );
        addNewCourse.add( label_11 );

        textField_9 = new JTextField();
        textField_9.setColumns( 10 );
        textField_9.setBounds( 467, 88, 120, 20 );
        addNewCourse.add( textField_9 );

        textField_10 = new JTextField();
        textField_10.setBounds( 467, 141, 120, 20 );
        textField_10.setColumns( 10 );
        addNewCourse.add( textField_10 );

        JComboBox<String> comboBox_4 = new JComboBox<String>();
        comboBox_4.setModel( new DefaultComboBoxModel<String>( new String[]

                { "School of Science and Computing", "School of Business & Humanities", "School of Engineering" }
        ) );
        comboBox_4.setBounds( 140, 113, 192, 20 );
        addNewCourse.add( comboBox_4 );

        JButton btnCreateNewModule = new JButton( "Create New Module" );
        btnCreateNewModule.setBounds( 467, 188, 127, 23 );
        addNewCourse.add( btnCreateNewModule );
    }

}
