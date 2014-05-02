package com.project.gui;

import com.project.constants.*;
import com.project.controller.*;
import com.project.database.*;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;

/**
 * Project Semester4Project
 *
 * This class is part of a project
 * that is aimed at improving ITT's
 * timetable system
 *
 * Created by david on 5/2/2014.
 */
public class Login extends JFrame {
  private static final long serialVersionUID = 6017909101614564843L;
  private final JFormattedTextField userName;
  private final JPasswordField userPassword;
  private final JButton login;
  private final JButton cancel;

  private Login() {
    super();
    this.setTitle(StringConstants.LOGIN);
    this.setResizable(false);
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.setSize(250, 330);
    this.setLocationRelativeTo(null);
    final Container contentPane = this.getContentPane();
    contentPane.setBackground(Color.white);
    contentPane.setLayout(new GridBagLayout());
    final GridBagConstraints constraints = new GridBagConstraints();
    constraints.anchor = GridBagConstraints.FIRST_LINE_START;
    constraints.ipadx = 5;
    constraints.ipady = 5;

    /*
    The I tT logo.
   */
    Image iTTLogo = null;
    try {
      iTTLogo = ImageIO.read(this.getClass().getResource("/resources/IT-Tallaght-Logo.gif"));
    } catch (final IOException exception) {
      exception.printStackTrace();
    }
    final JLabel logo = new JLabel(new ImageIcon(iTTLogo));
    constraints.gridx = 0;
    constraints.gridy = 0;
    constraints.gridwidth = 2;
    constraints.fill = GridBagConstraints.BOTH;
    this.add(logo, constraints);
    constraints.insets = new Insets(0, 10, 0, 10);
    final JLabel loginLabel = new JLabel(StringConstants.USER_NAME);
    constraints.gridx = 0;
    constraints.gridy = 1;
    constraints.gridwidth = 2;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    this.add(loginLabel, constraints);
    final JLabel passwordLabel = new JLabel(StringConstants.PASSWORD);
    constraints.gridx = 0;
    constraints.gridy = 3;
    constraints.gridwidth = 2;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    this.add(passwordLabel, constraints);
    this.userName = new JFormattedTextField();
    constraints.gridx = 0;
    constraints.gridy = 2;
    constraints.gridwidth = 2;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    this.add(this.userName, constraints);
    this.userPassword = new JPasswordField();
    constraints.gridx = 0;
    constraints.gridy = 5;
    constraints.gridwidth = 2;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    // constraints.insets = new Insets( 5, 5, 5, 5 );
    this.add(this.userPassword, constraints);

        /*
         * creating the login action for the timetable system created by David
         * Swift

         */
    this.login = new JButton(StringConstants.LOGIN);
    this.login.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent actionEvent) {
        Login.this.makeConnection(Login.this.userName.getText(),
            String.valueOf(Login.this.userPassword.getPassword()));
      }
    });
    constraints.gridx = 0;
    constraints.gridy = 6;
    constraints.gridwidth = 1;
    constraints.weightx = 1.0;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.insets = new Insets(10, 10, 10, 5);
    this.add(this.login, constraints);
    this.cancel = new JButton(StringConstants.CANCEL);
    this.cancel.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent actionEvent) {
        System.exit(0);
      }
    });
    constraints.gridx = 1;
    constraints.gridy = 6;
    constraints.gridwidth = 1;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.insets = new Insets(10, 0, 10, 10);
    this.add(this.cancel, constraints);
    this.pack();

  }

  private Connection makeConnection(final String userLogin, final String passwordLogin) {
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
    } catch (final ClassNotFoundException execption) {
      execption.printStackTrace();
    }
    Connection connection = null;
    try {
      connection = DriverManager.getConnection(
          "jdbc:oracle:thin:@localhost:1521:XE", userLogin,
          passwordLogin);
    } catch (final SQLException exception) {
      exception.printStackTrace();
    }
    try {
      if (connection != null && connection.isClosed()) {
        System.out.println("There is no Connection.");
      } else {
        System.out.println("We have a Connection!");
        this.checkUser(userLogin, passwordLogin, connection);
      }
    } catch (final SQLException e) {
      e.printStackTrace();
    }
    return connection;
  }

  private void checkUser(
      final String userLogin,
      final String passwordLogin,
      final Connection connection
  ) throws SQLException {
    RunStatementSelect.createRunStatementSelect().queryUsers(connection);
    for (final User user : User.USERS) {
      if (!userLogin.equals(user.getCode()) || !passwordLogin.equals(user.getPassword())) {
        connection.close();
      } else {
        final MainWindow mainWindow = MainWindow.createMainWindow(user);
        mainWindow.setVisible(true);
        this.dispose();
        System.out.println(user.toString());
      }
    }
  }

  public static Login createLogin() {return new Login();}

  @Override
  public String toString() {
    return String.format("Login{userName=%s, userPassword=%s, login=%s, cancel=%s}", this.userName,
        this.userPassword, this.login, this.cancel);
  }
}
