package com.project.gui;

import com.project.database.*;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;

@SuppressWarnings ( "serial" )
public class TimetableLogin extends JFrame {

    public JLabel loginLabel, passwordLabel, logo;
    public Image iTTLogo;
    private JTextField userName;
    private JPasswordField userPassword;
    private JButton login, cancel;

    public TimetableLogin () {

        setTitle( "Login" );
        setResizable( false );
        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        setSize( 250, 320 );
        setLocationRelativeTo( null );
        setBackground( Color.white );

        getContentPane().setLayout( new GridBagLayout() );
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.FIRST_LINE_START;
        constraints.ipadx = 5;
        constraints.ipady = 5;

        try {
            iTTLogo = ImageIO.read( new File( "C:\\Users\\david\\Development\\Git " + "Repositories\\Semester4Project\\Semester4Project\\assets\\IT-Tallaght-Logo.gif" ) );
        } catch ( IOException e ) {
            e.printStackTrace();
        }

        logo = new JLabel( new ImageIcon( iTTLogo ) );
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.BOTH;
        add( logo, constraints );

        constraints.insets = new Insets( 0, 10, 0, 10 );

        loginLabel = new JLabel( "User Name" );
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add( loginLabel, constraints );

        passwordLabel = new JLabel( "Password" );
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add( passwordLabel, constraints );

        setUserName( new JFormattedTextField() );
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add( getUserName(), constraints );

        setUserPassword( new JPasswordField() );
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        //        constraints.insets = new Insets( 5, 5, 5, 5 );
        add( getUserPassword(), constraints );

        /*
        creating the login action for the timetable system
        created by David Swift
         */
        setLogin( new JButton( "Login" ) );
        getLogin().addActionListener( new ActionListener() {
            @Override
            public void actionPerformed ( ActionEvent e ) {
                login();
            }
        } );
        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridwidth = 1;
        constraints.weightx = 1.0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets( 10, 10, 0, 5 );
        add( getLogin(), constraints );

        setCancel( new JButton( "Cancel" ) );
        getCancel().addActionListener( new ActionListener() {
            @Override
            public void actionPerformed ( ActionEvent e ) {
                System.exit( 0 );
            }
        } );
        constraints.gridx = 1;
        constraints.gridy = 6;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets( 10, 0, 0, 10 );
        add( getCancel(), constraints );

        pack();
    }

    public JButton getCancel () {
        return cancel;
    }

    public void setCancel ( JButton cancel ) {
        this.cancel = cancel;
    }

    public JButton getLogin () {
        return login;
    }

    public void setLogin ( JButton login ) {
        this.login = login;
    }

    public JTextField getUserName () {
        return userName;
    }

    public void setUserName ( JTextField userName ) {
        this.userName = userName;
    }

    public JPasswordField getUserPassword () {
        return userPassword;
    }

    public void setUserPassword ( JPasswordField userPassword ) {
        this.userPassword = userPassword;
    }

    public void login () {

        System.out.println( "You Clicked Login." );
                /*
                create a database connection
                and try to connect
                 */

        try {

            DatabaseConnection databaseConnection = new DatabaseConnection();
            try {
//                databaseConnection.createDatabaseConnection( "SYSTEM", "timetable" );
                databaseConnection.createDatabaseConnection( getUserName().getText(), String.valueOf( getUserPassword().getPassword() ) );
                //            databaseConnection.checkPassword( getUserName().getText(), String.valueOf( getUserPassword().getPassword() ) );
            } catch ( SQLException e ) {
                //            e.printStackTrace();
//                JOptionPane.showMessageDialog( null, "User ID or Password is incorrect", null, JOptionPane.WARNING_MESSAGE, null );
//                System.out.println( e.getMessage() );

            }

                /*
                if there is a database connection then
                create a temp user (for testing purposes)
                and launch the main window
                then close this window
                 */
            try {
                if ( !databaseConnection.getDatabaseConnection().isClosed() ) {
//                    Admin tempUser = new Admin( "John", "John" );
                    MainWindow mainWindow = new MainWindow();
                    mainWindow.setVisible( true );
                    dispose();
                }

            } catch ( SQLException e1 ) {
                System.out.println( e1.getMessage() );

            }
        } catch ( Exception e ) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog( null, "User ID or Password is incorrect", null, JOptionPane.WARNING_MESSAGE, null );
        }

    }
}
