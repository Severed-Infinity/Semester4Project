package com.project.gui;

import com.project.controller.*;
import com.project.database.*;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;

/**
 * The type Timetable login.
 */
@SuppressWarnings ("serial")
public class TimetableLogin extends JFrame {
  /**
   * The I tT logo.
   */
  private Image iTTLogo;
  /**
   * The Database connection.
   */
  private DatabaseConnection databaseConnection = null;
  /**
   * The User name.
   */
  private JTextField userName;
  /**
   * The User password.
   */
  private JPasswordField userPassword;
  /**
   * The Login.
   */
  private JButton login, /**
   * The Cancel.
   */
  cancel;
  /**
   * The Run statement.
   */
  private RunStatement runStatement = new RunStatement();
  private User user;

  /**
   * Instantiates a new Timetable login.
   */
  public TimetableLogin() {

    setTitle("Login");
    setResizable(false);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setSize(250, 330);
    setLocationRelativeTo(null);
    getContentPane().setBackground(Color.white);

    getContentPane().setLayout(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();
    constraints.anchor = GridBagConstraints.FIRST_LINE_START;
    constraints.ipadx = 5;
    constraints.ipady = 5;

    try {
      iTTLogo = ImageIO.read(new File(
          "C:\\Users\\david\\Development\\Git " +
              "Repositories\\Semester4Project\\Semester4Project\\assets\\IT-Tallaght-Logo.gif"
      ));
    } catch (IOException e) {
      e.printStackTrace();
    }

    final JLabel logo = new JLabel(new ImageIcon(iTTLogo));
    constraints.gridx = 0;
    constraints.gridy = 0;
    constraints.gridwidth = 2;
    constraints.fill = GridBagConstraints.BOTH;
    add(logo, constraints);

    constraints.insets = new Insets(0, 10, 0, 10);

    final JLabel loginLabel = new JLabel("User Name");
    constraints.gridx = 0;
    constraints.gridy = 1;
    constraints.gridwidth = 2;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    add(loginLabel, constraints);

    final JLabel passwordLabel = new JLabel("Password");
    constraints.gridx = 0;
    constraints.gridy = 3;
    constraints.gridwidth = 2;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    add(passwordLabel, constraints);

    setUserName(new JFormattedTextField());
    constraints.gridx = 0;
    constraints.gridy = 2;
    constraints.gridwidth = 2;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    add(getUserName(), constraints);

    setUserPassword(new JPasswordField());
    constraints.gridx = 0;
    constraints.gridy = 5;
    constraints.gridwidth = 2;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    // constraints.insets = new Insets( 5, 5, 5, 5 );
    add(getUserPassword(), constraints);

        /*
         * creating the login action for the timetable system created by David
         * Swift
         */
    setLogin(new JButton("Login"));
    getLogin().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {

        login();
        query();
      }
    });
    constraints.gridx = 0;
    constraints.gridy = 6;
    constraints.gridwidth = 1;
    constraints.weightx = 1.0;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.insets = new Insets(10, 10, 10, 5);
    add(getLogin(), constraints);

    setCancel(new JButton("Cancel"));
    getCancel().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {

        System.exit(0);
      }
    });
    constraints.gridx = 1;
    constraints.gridy = 6;
    constraints.gridwidth = 1;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.insets = new Insets(10, 0, 10, 10);
    add(getCancel(), constraints);

    pack();
  }

  /**
   * Query void.
   */
  private void query() {
    runStatement.querySchool(databaseConnection.getDatabaseConnection());
    runStatement.queryDepartment(databaseConnection.getDatabaseConnection());
    runStatement.queryCourse(databaseConnection.getDatabaseConnection());
    runStatement.queryUsers(databaseConnection.getDatabaseConnection());
  }

  /**
   * Gets user name.
   *
   * @return the user name
   */
  JTextField getUserName() {

    return userName;
  }

  /**
   * Sets user name.
   *
   * @param userName
   *     the user name
   */
  void setUserName(JTextField userName) {

    this.userName = userName;
  }

  /**
   * Gets user password.
   *
   * @return the user password
   */
  JPasswordField getUserPassword() {

    return userPassword;
  }

  /**
   * Sets user password.
   *
   * @param userPassword
   *     the user password
   */
  void setUserPassword(JPasswordField userPassword) {

    this.userPassword = userPassword;
  }

  /**
   * Gets login.
   *
   * @return the login
   */
  JButton getLogin() {

    return login;
  }

  /**
   * Sets login.
   *
   * @param login
   *     the login
   */
  void setLogin(JButton login) {

    this.login = login;
  }

  /**
   * Login void.
   */
  void login() {
 /*
  * create a database connection and try to connect
  */

    try {

      databaseConnection = new DatabaseConnection(getUserName().getText(),
          String.valueOf(getUserPassword().getPassword()));

    } catch (Exception e) {
      //            System.out.println( e.getMessage() );

    } finally {
      /**
       * if there is a database connection then launch the main window
       * followed by closing this window
       */
      try {
        boolean connection = !databaseConnection.getDatabaseConnection().isClosed();
        if (connection) {
          MainWindow mainWindow = new MainWindow(databaseConnection, user);
          mainWindow.setVisible(true);
          dispose();
        }
      } catch (SQLException e1) {
        System.out.println(e1.getMessage());
        System.out.printf("No database Connection Detected");

      }

    }

  }

  /**
   * Gets cancel.
   *
   * @return the cancel
   */
  JButton getCancel() {

    return cancel;
  }

  /**
   * Sets cancel.
   *
   * @param cancel
   *     the cancel
   */
  void setCancel(JButton cancel) {

    this.cancel = cancel;
  }
}
