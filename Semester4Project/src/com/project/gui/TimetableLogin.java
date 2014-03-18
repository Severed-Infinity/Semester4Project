package com.project.gui;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

@SuppressWarnings ("serial")
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

        setUserName( new JFormattedTextField( "Enter User Name" ) );
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        add( getUserName(), constraints );

        setUserPassword( new JPasswordField( "Enter Password" ) );
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        //        constraints.insets = new Insets( 5, 5, 5, 5 );
        add( getUserPassword(), constraints );

        setLogin( new JButton( "Login" ) );
//        TODO login action listener
        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridwidth = 1;
        constraints.weightx = 1.0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets( 10, 10, 0, 5 );
        add( getLogin(), constraints );

        setCancel( new JButton( "Cancel" ) );
//        TODO cancel action listener
        constraints.gridx = 1;
        constraints.gridy = 6;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets( 10, 0, 0, 10 );
        add( getCancel(), constraints );
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

}
