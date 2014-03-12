package com.project.gui;

import javax.swing.*;
import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings ("serial")
public class TimetableView extends JFrame {

    private JTextField txtSearch;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField_10;
    private JTextField textField_11;
    private JTextField textField_12;
    private JTextField textField_13;
    private JTextField textField_14;
    private JTextField textField_15;
    private JTextField textField_16;
    private JTextField textField_17;
    private JTextField textField_18;
    private JTextField textField_19;
    private JTextField textField_20;
    private JTextField textField_21;
    private JTextField textField_22;
    private JTextField textField_23;
    private JTextField textField_24;
    private JTextField textField_25;
    private JTextField textField_26;
    private JTextField textField_27;
    private JTextField textField_28;
    private JTextField textField_29;
    private JTextField textField_30;
    private JTextField textField_31;
    private JTextField textField_32;
    private JTextField textField_33;

    public TimetableView () throws HeadlessException {

        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setTitle( "Timetable" );
        setLocationRelativeTo( null );
        setSize( 800, 500 );
        setResizable( false );

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar( menuBar );

        JMenu mnFile = new JMenu( "File" );
        menuBar.add( mnFile );

        JMenuItem mntmSearch = new JMenuItem( "Search" );
        mnFile.add( mntmSearch );

        JMenuItem mntmPrint = new JMenuItem( "Print" );
        mnFile.add( mntmPrint );

        JMenuItem mntmExitAndLogout = new JMenuItem( "Exit and Logout" );
        mnFile.add( mntmExitAndLogout );

        JMenuItem mntmExit = new JMenuItem( "Exit" );
        mnFile.add( mntmExit );

        JMenu mnEdit = new JMenu( "Edit" );
        menuBar.add( mnEdit );

        JMenuItem mntmUpdateTimetable = new JMenuItem( "Update timetable" );
        mnEdit.add( mntmUpdateTimetable );

        JMenuItem mntmUpdateUsers = new JMenuItem( "Update Users" );
        mnEdit.add( mntmUpdateUsers );

        JMenuItem mntmUpdateClass = new JMenuItem( "Update Class" );
        mnEdit.add( mntmUpdateClass );

        JMenuItem mntmUpdateModule = new JMenuItem( "Update Module" );
        mnEdit.add( mntmUpdateModule );

        JMenuItem mntmAddUser = new JMenuItem( "Add User" );
        mnEdit.add( mntmAddUser );

        JMenuItem mntmAddClass = new JMenuItem( "Add Class" );
        mnEdit.add( mntmAddClass );

        JMenuItem mntmAddModule = new JMenuItem( "Add Module" );
        mnEdit.add( mntmAddModule );
        getContentPane().setLayout( new BorderLayout( 10, 5 ) );

        JPanel header = new JPanel();
        getContentPane().add( header, BorderLayout.NORTH );

        JButton btnHome = new JButton( "Home" );

        JButton btnLogout = new JButton( "Logout" );

        txtSearch = new JTextField();
        txtSearch.setText( "Search" );
        txtSearch.setColumns( 40 );

        JLabel lblUser = new JLabel( "User" );
        lblUser.setHorizontalAlignment( SwingConstants.TRAILING );
        GroupLayout gl_header = new GroupLayout( header );
        gl_header.setHorizontalGroup( gl_header.createParallelGroup( Alignment.LEADING ).addGroup( gl_header.createSequentialGroup().addContainerGap().addComponent( btnHome ).addPreferredGap( ComponentPlacement.UNRELATED ).addComponent( btnLogout ).addGap( 78 ).addComponent( txtSearch, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE ).addGap( 18 ).addComponent( lblUser, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE ).addContainerGap() ) );
        gl_header.setVerticalGroup( gl_header.createParallelGroup( Alignment.LEADING ).addGroup( gl_header.createSequentialGroup().addContainerGap().addGroup( gl_header.createParallelGroup( Alignment.BASELINE ).addComponent( txtSearch, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE ).addComponent( btnLogout ).addComponent( btnHome ).addComponent( lblUser, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE ) ) ) );
        header.setLayout( gl_header );

        JPanel mainView = new JPanel();
        getContentPane().add( mainView, BorderLayout.CENTER );
        mainView.setLayout( new CardLayout( 0, 0 ) );

        JPanel timetableView = new JPanel();
        mainView.add( timetableView, "name_109576600023605" );
        timetableView.setLayout( new GridLayout( 5, 1, 5, 0 ) );

        JPanel monday = new JPanel();
        timetableView.add( monday );
        monday.setLayout( new GridLayout( 0, 8, 5, 0 ) );

        JPanel tuseday = new JPanel();
        timetableView.add( tuseday );
        tuseday.setLayout( new GridLayout( 0, 8, 5, 0 ) );

        JPanel wednesday = new JPanel();
        timetableView.add( wednesday );
        wednesday.setLayout( new GridLayout( 0, 8, 5, 0 ) );

        JPanel thursday = new JPanel();
        timetableView.add( thursday );
        thursday.setLayout( new GridLayout( 0, 8, 0, 0 ) );

        JPanel friday = new JPanel();
        timetableView.add( friday );
        friday.setLayout( new GridLayout( 0, 8, 5, 0 ) );

        JPanel addNewCourse = new JPanel();
        addNewCourse.setLayout( null );
        addNewCourse.setBorder( new TitledBorder( UIManager.getBorder( "TitledBorder.border" ), "Add New Course", TitledBorder.CENTER, TitledBorder.TOP, null, new Color( 0, 0, 0 ) ) );
        mainView.add( addNewCourse, "name_171164909579259" );

        JLabel lblTypeOfCourse = new JLabel( "Type of Course" );
        lblTypeOfCourse.setBounds( 35, 33, 95, 14 );
        addNewCourse.add( lblTypeOfCourse );

        JComboBox<String> comboBox_3 = new JComboBox<String>();
        comboBox_3.setModel( new DefaultComboBoxModel<String>( new String[]{ "Full time", "Part time" } ) );
        comboBox_3.setBounds( 140, 30, 120, 20 );
        addNewCourse.add( comboBox_3 );

        JLabel label_1 = new JLabel( "Name" );
        label_1.setBounds( 35, 66, 95, 14 );
        addNewCourse.add( label_1 );

        textField_5 = new JTextField();
        textField_5.setColumns( 10 );
        textField_5.setBounds( 140, 63, 120, 20 );
        addNewCourse.add( textField_5 );

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
        addNewCourse.add( textField_10 );
        textField_10.setColumns( 10 );

        JComboBox<String> comboBox_4 = new JComboBox<String>();
        comboBox_4.setModel( new DefaultComboBoxModel<String>( new String[]{ "School of Science and Computing", "School of Business & Humanities", "School of Engineering" } ) );
        comboBox_4.setBounds( 140, 113, 192, 20 );
        addNewCourse.add( comboBox_4 );

        JButton btnCreateNewModule = new JButton( "Create New Module" );
        btnCreateNewModule.setBounds( 467, 188, 127, 23 );
        addNewCourse.add( btnCreateNewModule );

        JPanel addNewModule = new JPanel();
        mainView.add( addNewModule, "name_814821531771" );
        addNewModule.setLayout( null );
        addNewModule.setBorder( new TitledBorder( UIManager.getBorder( "TitledBorder.border" ), "Add New Module", TitledBorder.CENTER, TitledBorder.TOP, null, new Color( 0, 0, 0 ) ) );

        JLabel label = new JLabel( "Type of Course" );
        label.setBounds( 35, 33, 95, 14 );
        addNewModule.add( label );

        JComboBox<String> comboBox_5 = new JComboBox<String>();
        comboBox_5.setBounds( 140, 30, 120, 20 );
        addNewModule.add( comboBox_5 );

        JLabel label_2 = new JLabel( "Name" );
        label_2.setBounds( 35, 66, 95, 14 );
        addNewModule.add( label_2 );

        textField_11 = new JTextField();
        textField_11.setColumns( 10 );
        textField_11.setBounds( 140, 63, 120, 20 );
        addNewModule.add( textField_11 );

        JLabel lblModuleCode = new JLabel( "Module Code" );
        lblModuleCode.setBounds( 350, 66, 95, 14 );
        addNewModule.add( lblModuleCode );

        textField_12 = new JTextField();
        textField_12.setColumns( 10 );
        textField_12.setBounds( 467, 63, 120, 20 );
        addNewModule.add( textField_12 );

        JLabel label_6 = new JLabel( "ID" );
        label_6.setBounds( 35, 91, 95, 14 );
        addNewModule.add( label_6 );

        textField_13 = new JTextField();
        textField_13.setColumns( 10 );
        textField_13.setBounds( 140, 88, 120, 20 );
        addNewModule.add( textField_13 );

        JLabel label_7 = new JLabel( "Department" );
        label_7.setBounds( 35, 116, 95, 14 );
        addNewModule.add( label_7 );

        JLabel lblHoursAWeek = new JLabel( "Hours a Week" );
        lblHoursAWeek.setBounds( 350, 165, 95, 14 );
        addNewModule.add( lblHoursAWeek );

        textField_14 = new JTextField();
        textField_14.setColumns( 10 );
        textField_14.setBounds( 467, 162, 120, 20 );
        addNewModule.add( textField_14 );

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

        JPanel addUserView = new JPanel();
        addUserView.setBorder( new TitledBorder( UIManager.getBorder( "TitledBorder.border" ), "Add New User", TitledBorder.CENTER, TitledBorder.TOP, null, new Color( 0, 0, 0 ) ) );
        mainView.add( addUserView, "name_111674253025430" );
        addUserView.setLayout( null );

        JLabel lblTypeOfUser = new JLabel( "Type of User" );
        lblTypeOfUser.setBounds( 35, 33, 95, 14 );
        addUserView.add( lblTypeOfUser );

        JComboBox<String> userSelect = new JComboBox<String>();
        userSelect.setModel( new DefaultComboBoxModel<String>( new String[]{ "Admin", "Lecturer", "Student" } ) );
        userSelect.setBounds( 140, 30, 120, 20 );
        addUserView.add( userSelect );

        JLabel lblName = new JLabel( "Name" );
        lblName.setBounds( 35, 66, 95, 14 );
        addUserView.add( lblName );

        textField = new JTextField();
        textField.setBounds( 140, 63, 120, 20 );
        addUserView.add( textField );
        textField.setColumns( 10 );

        JLabel lblTitle = new JLabel( "Title" );
        lblTitle.setBounds( 350, 66, 95, 14 );
        addUserView.add( lblTitle );

        textField_1 = new JTextField();
        textField_1.setBounds( 467, 63, 120, 20 );
        addUserView.add( textField_1 );
        textField_1.setColumns( 10 );

        JLabel lblId = new JLabel( "ID" );
        lblId.setBounds( 35, 91, 95, 14 );
        addUserView.add( lblId );

        textField_2 = new JTextField();
        textField_2.setBounds( 140, 88, 120, 20 );
        addUserView.add( textField_2 );
        textField_2.setColumns( 10 );

        JLabel lblDepartment = new JLabel( "Department" );
        lblDepartment.setBounds( 35, 116, 95, 14 );
        addUserView.add( lblDepartment );

        JComboBox<String> comboBox = new JComboBox<String>();
        comboBox.setModel( new DefaultComboBoxModel<String>( new String[]{ "School of Science and Computing", "School of Business & Humanities", "School of Engineering", "All" } ) );
        comboBox.setBounds( 140, 113, 192, 20 );
        addUserView.add( comboBox );

        JLabel lblCourse = new JLabel( "Course" );
        lblCourse.setBounds( 35, 141, 95, 14 );
        addUserView.add( lblCourse );

        JComboBox<String> comboBox_1 = new JComboBox<String>();
        comboBox_1.setBounds( 140, 138, 120, 20 );
        addUserView.add( comboBox_1 );

        JLabel lblCourseCode = new JLabel( "Course Code: " );
        lblCourseCode.setBounds( 35, 166, 225, 14 );
        addUserView.add( lblCourseCode );

        JLabel lblYears = new JLabel( "Years" );
        lblYears.setBounds( 350, 141, 62, 14 );
        addUserView.add( lblYears );

        textField_3 = new JTextField();
        textField_3.setBounds( 467, 138, 120, 20 );
        addUserView.add( textField_3 );
        textField_3.setColumns( 10 );

        JLabel lblTeaches = new JLabel( "Teaches" );
        lblTeaches.setBounds( 35, 191, 95, 14 );
        addUserView.add( lblTeaches );

        JComboBox<String> comboBox_2 = new JComboBox<String>();
        comboBox_2.setBounds( 140, 188, 192, 20 );
        addUserView.add( comboBox_2 );

        JButton btnAddModule = new JButton( "Add Module" );
        btnAddModule.setBounds( 350, 187, 95, 23 );
        addUserView.add( btnAddModule );

        JButton btnConfirm = new JButton( "Confirm" );
        btnConfirm.setBounds( 467, 360, 89, 23 );
        addUserView.add( btnConfirm );

        JButton btnCancel = new JButton( "Cancel" );
        btnCancel.addActionListener( new ActionListener() {

            @Override
            public void actionPerformed ( ActionEvent arg0 ) {

            }
        } );
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

        textField_4 = new JTextField();
        textField_4.setBounds( 467, 88, 120, 20 );
        addUserView.add( textField_4 );
        textField_4.setColumns( 10 );

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

        JPanel updateModule = new JPanel();
        updateModule.setLayout( null );
        updateModule.setBorder( new TitledBorder( UIManager.getBorder( "TitledBorder.border" ),

                "Add New Module", TitledBorder.CENTER, TitledBorder.TOP, null, new Color( 0, 0, 0 ) ) );
        mainView.add( updateModule, "name_183096271792642" );

        JLabel label_23 = new JLabel( "Type of Course" );
        label_23.setBounds( 35, 33, 95, 14 );
        updateModule.add( label_23 );

        JComboBox<String> comboBox_13 = new JComboBox<String>();
        comboBox_13.setBounds( 140, 30, 120, 20 );
        updateModule.add( comboBox_13 );

        JLabel label_24 = new JLabel( "Name" );
        label_24.setBounds( 35, 66, 95, 14 );
        updateModule.add( label_24 );

        textField_23 = new JTextField();
        textField_23.setColumns( 10 );
        textField_23.setBounds( 140, 63, 120, 20 );
        updateModule.add( textField_23 );

        JLabel label_25 = new JLabel( "Module Code" );
        label_25.setBounds( 350, 66, 95, 14 );
        updateModule.add( label_25 );

        textField_24 = new JTextField();
        textField_24.setColumns( 10 );
        textField_24.setBounds( 467, 63, 120, 20 );
        updateModule.add( textField_24 );

        JLabel label_26 = new JLabel( "ID" );
        label_26.setBounds( 35, 91, 95, 14 );
        updateModule.add( label_26 );

        textField_25 = new JTextField();
        textField_25.setColumns( 10 );
        textField_25.setBounds( 140, 88, 120, 20 );
        updateModule.add( textField_25 );

        JLabel label_27 = new JLabel( "Department" );
        label_27.setBounds( 35, 116, 95, 14 );
        updateModule.add( label_27 );

        JLabel label_28 = new JLabel( "Hours a Week" );
        label_28.setBounds( 350, 165, 95, 14 );
        updateModule.add( label_28 );

        textField_26 = new JTextField();
        textField_26.setColumns( 10 );
        textField_26.setBounds( 467, 162, 120, 20 );
        updateModule.add( textField_26 );

        JLabel label_29 = new JLabel( "Select Lecturer" );
        label_29.setBounds( 35, 191, 95, 14 );
        updateModule.add( label_29 );

        JComboBox<String> comboBox_14 = new JComboBox<String>();
        comboBox_14.setBounds( 140, 188, 192, 20 );
        updateModule.add( comboBox_14 );

        JButton button_12 = new JButton( "Add Lecturer" );
        button_12.setBounds( 350, 187, 95, 23 );
        updateModule.add( button_12 );

        JButton button_13 = new JButton( "Confirm" );
        button_13.setBounds( 467, 360, 89, 23 );
        updateModule.add( button_13 );

        JButton button_14 = new JButton( "Cancel" );
        button_14.setBounds( 665, 360, 89, 23 );
        updateModule.add( button_14 );

        JButton button_15 = new JButton( "Clear" );
        button_15.setBounds( 566, 360, 89, 23 );
        updateModule.add( button_15 );

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

        textField_27 = new JTextField();
        textField_27.setColumns( 10 );
        textField_27.setBounds( 467, 88, 120, 20 );
        updateModule.add( textField_27 );

        textField_28 = new JTextField();
        textField_28.setColumns( 10 );
        textField_28.setBounds( 467, 138, 120, 20 );
        updateModule.add( textField_28 );

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

        // TODO Auto-generated constructor stub
    }

    public TimetableView ( GraphicsConfiguration arg0 ) {

        super( arg0 );
        // TODO Auto-generated constructor stub
    }

    public TimetableView ( String arg0 ) throws HeadlessException {

        super( arg0 );
        // TODO Auto-generated constructor stub
    }

    public TimetableView ( String arg0, GraphicsConfiguration arg1 ) {

        super( arg0, arg1 );
        // TODO Auto-generated constructor stub
    }

    public static void main ( String[] args ) {

        TimetableView timetable = new TimetableView();
        timetable.setVisible( true );

    }
}
