package com.project.gui;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

/**
 * Created by david on 3/12/14.
 */
public class UpdateModuleView extends View {

    private final JTextField textField_23;
    private final JTextField textField_24;
    private final JTextField textField_26;
    private final JTextField textField_27;
    private final JTextField textField_28;
    private final JTextField textField_25;

    public UpdateModuleView ( Container parent, String position, String title ) {
        super( parent, position, title );

        JPanel updateModule = new JPanel();
        updateModule.setLayout( null );
        updateModule.setBorder( new TitledBorder( UIManager.getBorder( "TitledBorder.border" ), "Add New Module", TitledBorder.CENTER, TitledBorder.TOP, null, new Color( 0, 0, 0 ) ) );

        //        mainView.add( updateModule, "name_183096271792642" );

        JLabel label_23 = new JLabel( "Type of Course" );
        label_23.setBounds( 35, 33, 95, 14 );
        updateModule.add( label_23 );

        JComboBox<String> comboBox_13 = new JComboBox<String>();
        comboBox_13.setBounds( 140, 30, 120, 20 );
        updateModule.add( comboBox_13 );

        JLabel label_24 = new JLabel( "Name" );
        label_24.setBounds( 35, 66, 95, 14 );
        updateModule.add( label_24 );

        JLabel label_25 = new JLabel( "Module Code" );
        label_25.setBounds( 350, 66, 95, 14 );
        updateModule.add( label_25 );

        JLabel label_26 = new JLabel( "ID" );
        label_26.setBounds( 35, 91, 95, 14 );
        updateModule.add( label_26 );

        JLabel label_27 = new JLabel( "Department" );
        label_27.setBounds( 35, 116, 95, 14 );
        updateModule.add( label_27 );

        textField_23 = new JTextField();
        textField_23.setColumns( 10 );
        textField_23.setBounds( 140, 63, 120, 20 );
        updateModule.add( textField_23 );

        JLabel label_28 = new JLabel( "Hours a Week" );
        label_28.setBounds( 350, 165, 95, 14 );
        updateModule.add( label_28 );

        JLabel label_29 = new JLabel( "Select Lecturer" );
        label_29.setBounds( 35, 191, 95, 14 );
        updateModule.add( label_29 );

        textField_24 = new JTextField();
        textField_24.setColumns( 10 );
        textField_24.setBounds( 467, 63, 120, 20 );
        updateModule.add( textField_24 );

        JComboBox<String> comboBox_14 = new JComboBox<String>();
        comboBox_14.setBounds( 140, 188, 192, 20 );
        updateModule.add( comboBox_14 );

        JButton button_12 = new JButton( "Add Lecturer" );
        button_12.setBounds( 350, 187, 95, 23 );
        updateModule.add( button_12 );

        textField_25 = new JTextField();
        textField_25.setColumns( 10 );
        textField_25.setBounds( 140, 88, 120, 20 );
        updateModule.add( textField_25 );

        JButton button_13 = new JButton( "Confirm" );
        button_13.setBounds( 467, 360, 89, 23 );
        updateModule.add( button_13 );

        JButton button_14 = new JButton( "Cancel" );
        button_14.setBounds( 665, 360, 89, 23 );
        updateModule.add( button_14 );

        JButton button_15 = new JButton( "Clear" );
        button_15.setBounds( 566, 360, 89, 23 );
        updateModule.add( button_15 );

        textField_26 = new JTextField();
        textField_26.setColumns( 10 );
        textField_26.setBounds( 467, 162, 120, 20 );
        updateModule.add( textField_26 );

        JLabel label_30 = new JLabel( "Lecturers: " );
        label_30.setBounds( 35, 216, 95, 14 );
        updateModule.add( label_30 );

        JList<String> list_4 = new JList<String>();
        list_4.setBounds( 140, 214, 192, 125 );
        updateModule.add( list_4 );

        JLabel label_31 = new JLabel( "Number of Semesters" );
        label_31.setBounds( 350, 138, 110, 14 );
        updateModule.add( label_31 );

        JLabel label_32 = new JLabel( "Password" );
        label_32.setBounds( 350, 91, 95, 14 );
        updateModule.add( label_32 );

        JComboBox<String> comboBox_15 = new JComboBox<String>();
        comboBox_15.setBounds( 140, 113, 192, 20 );
        updateModule.add( comboBox_15 );

        JButton button_16 = new JButton( "Create New Course" );
        button_16.setBounds( 467, 187, 127, 23 );
        updateModule.add( button_16 );

        JLabel label_33 = new JLabel( "Course" );
        label_33.setBounds( 35, 141, 95, 14 );
        updateModule.add( label_33 );

        JComboBox<String> comboBox_16 = new JComboBox<String>();
        comboBox_16.setBounds( 140, 138, 120, 20 );
        updateModule.add( comboBox_16 );

        JLabel label_34 = new JLabel( "Course Code: " );
        label_34.setBounds( 35, 165, 225, 14 );
        updateModule.add( label_34 );

        textField_27 = new JTextField();
        textField_27.setColumns( 10 );
        textField_27.setBounds( 467, 88, 120, 20 );
        updateModule.add( textField_27 );

        textField_28 = new JTextField();
        textField_28.setColumns( 10 );
        textField_28.setBounds( 467, 138, 120, 20 );
        updateModule.add( textField_28 );

    }

}
