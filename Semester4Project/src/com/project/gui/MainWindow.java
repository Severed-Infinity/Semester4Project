package com.project.gui;

import com.project.user.*;

import javax.swing.*;
import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.*;
import java.awt.*;
import java.util.List;

/**
 * Created by david on 3/12/14.
 */
public class MainWindow extends JFrame {

    protected JTextField txtSearch;
    private java.util.List<View> views;

    public MainWindow () {

        this.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        this.setTitle( "Timetable" );
        this.setLocationRelativeTo( null );
        this.setSize( 800, 500 );
        this.setResizable( false );
        this.setViews( views );

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

        MainView mainView = new MainView( this, BorderLayout.CENTER, "Main View", getViews() );
        this.add( mainView, BorderLayout.CENTER );
        mainView.setLayout( new CardLayout( 0, 0 ) );
    }

    public List<View> getViews () {
        return views;
    }

    public void setViews ( List<View> views ) {
        this.views = this.views;
    }

    public void addView ( View view ) {
        this.getViews().add( view );
    }

    /**
     * Created by david on 3/12/14.
     */
    public static class MainView extends View {

        private List<View> views;
        private JPanel child;

        public MainView ( Container parent, String position, String title, List<View> views ) {
            super( parent, position, title );

            this.setViews( views );
//            this.setUserView( getUser() );
            this.add( child );
            child = new JPanel(  );

        }

        public void setUserView ( User user ) {
            if ( user instanceof Admin ) {
//                child = adminView;
            } else if ( user instanceof Lecturer ) {
            } else if ( user instanceof Student ) {

            }

        }

        public List<View> getViews () {
            return views;
        }

        public void setViews ( List<View> views ) {
            this.views = views;
        }
    }
}
