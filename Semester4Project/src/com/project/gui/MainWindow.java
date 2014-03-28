package com.project.gui;

import com.project.user.*;

import javax.swing.*;
import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.*;
import java.awt.*;

/**
 * Created by david on 3/12/14.
 */
public class MainWindow extends JFrame {

    public User currentUser; //.getUser();
    protected JTextField searchField;
    protected JPanel header;
    protected MainView mainView;
    protected JMenuBar mainMenu;
    protected JMenu menuFile, menuEdit;
    protected JMenuItem search, print, exitAndLogout, exit, updateTimetable, updateUsers, updateCourse, updateModule, addUsers, addCourse, addModule;
    protected JButton home, logout;
    protected JLabel loggedUser;

    public MainWindow () {

        setTitle( "Timetable" );
        setResizable( false );
        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        setSize( 800, 500 );
        setLocationRelativeTo( null );

        getContentPane().setBackground( Color.white );
        getContentPane().setPreferredSize( new Dimension( 800, 500 ) );
        getContentPane().setLayout( new GridBagLayout() );
        GridBagConstraints constraints = new GridBagConstraints();
        //        constraints.anchor = GridBagConstraints.FIRST_LINE_START;
        constraints.ipadx = 5;
        constraints.ipady = 5;
        GroupLayout headerLayout;

        setJMenuBar( addMenu() );

        //        beginning of header
        header = new JPanel();
        header.setBackground( Color.white );
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 1.0;
        //        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add( header, constraints );

        home = new JButton( "Home" );
        //        header.add( home );

        logout = new JButton( "Logout" );
        //        header.add( logout );

        searchField = new JFormattedTextField( "Search" );
        searchField.setColumns( 40 );
        //        header.add( searchField );

        loggedUser = new JLabel( "User" );
        loggedUser.setHorizontalAlignment( SwingConstants.TRAILING );
        //        header.add( loggedUser );

        headerLayout = new GroupLayout( header );
        headerLayout.setHorizontalGroup( headerLayout.createParallelGroup( Alignment.LEADING )
                                                     .addGroup( headerLayout.createSequentialGroup()
                                                                            .addContainerGap()
                                                                            .addComponent( home )
                                                                            .addPreferredGap( ComponentPlacement.UNRELATED )
                                                                            .addComponent( logout )
                                                                            .addGap( 50 )
                                                                            .addComponent( searchField, GroupLayout.PREFERRED_SIZE, 400, Short.MAX_VALUE )
                                                                            .addGap( 20 )
                                                                            .addComponent( loggedUser, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE )
                                                                            .addGap( 40 )
                                                                            .addContainerGap() ) );

        headerLayout.setVerticalGroup( headerLayout.createParallelGroup( Alignment.LEADING )
                                                   .addGroup( headerLayout.createSequentialGroup()
                                                                          .addContainerGap()
                                                                          .addGroup( headerLayout.createParallelGroup( Alignment.BASELINE )
                                                                                                 .addComponent( searchField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE )
                                                                                                 .addComponent( logout )
                                                                                                 .addComponent( home )
                                                                                                 .addComponent( loggedUser, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE ) ) ) );

        header.setLayout( headerLayout );
        //        end of header

        //        beginning of main view
        mainView = new MainView();
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        //        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.BOTH;
        add( mainView, constraints );


        //        end of main view

        pack();
    }

    public JMenuBar addMenu () {

        mainMenu = new JMenuBar();

        menuFile = new JMenu( "File" );
        mainMenu.add( menuFile );
        menuEdit = new JMenu( "Edit" );
        mainMenu.add( menuEdit );

        search = new JMenuItem( "Search" );
        print = new JMenuItem( "Print" );
        exitAndLogout = new JMenuItem( "Exit and Logout" );
        exit = new JMenuItem( "Exit" );
        updateTimetable = new JMenuItem( "Update Timetable" );
        updateUsers = new JMenuItem( "Update User" );
        updateCourse = new JMenuItem( "Update Course" );
        updateModule = new JMenuItem( "Update Module" );
        addUsers = new JMenuItem( "Add User" );
        addCourse = new JMenuItem( "Add Course" );
        addModule = new JMenuItem( "Add Module" );

        menuFile.add( search );
        menuFile.add( print );
        menuFile.add( exitAndLogout );
        menuFile.add( exit );

        menuEdit.add( updateTimetable );
        menuEdit.add( updateUsers );
        menuEdit.add( updateCourse );
        menuEdit.add( updateModule );
        menuEdit.add( addUsers );
        menuEdit.add( addCourse );
        menuEdit.add( addModule );

        return mainMenu;
    }

    /**
     * Created by david on 3/12/14.
     */
    private class MainView extends View {

        //        private List<View> views;
        private JPanel child;

        private MainView () {
        }

        public MainView ( Container parent, String position, String title ) {
            super( parent, position, title );

            //            child = new AdminView( this, BorderLayout.CENTER, "Admin View" );
            this.setChild( setDefaultView() );

        }

        public View setDefaultView () {

            if ( currentUser instanceof Student ) {
                return new TimetableView( this, BorderLayout.CENTER, "Student Timetable", null );
            } else if ( currentUser instanceof Lecturer ) {
                return new TimetableView( this, BorderLayout.CENTER, "Lecturer Timetable", null );
            } else if ( currentUser instanceof Admin ) {
                return new AdminView( this, BorderLayout.CENTER, "Admin View" );
            }
            return null;
        }

        @SuppressWarnings ( "unused" )
        public View changeView () {

            this.getChild();
            /*
            change the child view of the main view based on the button pressed

            get the button pressed
            call the view
            set child to the new view

             */
            return null;
        }

        public JPanel getChild () {
            return child;
        }

        public void setChild ( JPanel child ) {
            this.child = child;
        }
    }

}
