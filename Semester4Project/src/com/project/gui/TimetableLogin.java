package com.project.gui;

import com.project.constants.*;
import com.project.controller.*;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import java.text.*;

/**
 * The type Timetable login.
 */
@SuppressWarnings ("serial")
public final class TimetableLogin extends JFrame {
  /**
   * The Run statement.
   */
  private final RunStatementSelect runStatementSelect = RunStatementSelect
      .createRunStatementSelect();
  /**
   * The Database connection.
   */
  private DatabaseConnection databaseConnection;
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
   * Instantiates a new Timetable login.
   */
  private TimetableLogin() {
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
      iTTLogo = ImageIO.read(new File(
          "C:\\Users\\david\\Development\\Git " +
              "Repositories\\Semester4Project\\Semester4Project\\assets\\IT-Tallaght-Logo.gif"
      ));
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
        try {
          TimetableLogin.this.login();
        } catch (final SQLException exception) {
          exception.printStackTrace();
        }
        TimetableLogin.this.query();
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

  /**
   * Query void.
   */
  private void query() {
    this.runStatementSelect.querySchool();
    this.runStatementSelect.queryDepartment();
    this.runStatementSelect.queryCourse();
    this.runStatementSelect.queryTimetables();
    this.runStatementSelect.queryClassPeriod();
    this.runStatementSelect.queryCourseModule();
    this.runStatementSelect.queryModule();
    this.runStatementSelect.queryModuleLecturer();
    this.runStatementSelect.queryRoom();
    this.runStatementSelect.queryLecturers();
    //        runStatementSelect.queryUsers(databaseConnection.getDatabaseConnection());
  }

  /**
   * Login void.
   */
  void login() throws SQLException {
 /*
  * create a database connection and try to connect
  */
    try {
      this.databaseConnection = DatabaseConnection.createDatabaseConnection(this.userName.getText(),
          String.valueOf(this.userPassword.getPassword()));

    } catch (final RuntimeException ignored) {
      //            System.out.println( e.getMessage() );
    } finally {
      /**
       * if there is a database connection then launch the main window
       * followed by closing this window
       */
      //todo rework this portion of code, returns null pointer. Change to runstatement
      final Connection connection = this.databaseConnection.getDatabaseConnection();
      final boolean isOpen = !connection.isClosed();
      if (isOpen) {
        final MainWindow mainWindow = new MainWindow(this.databaseConnection,
            this.databaseConnection.getUser());
        mainWindow.setVisible(true);
        this.dispose();
      } else {
        JOptionPane.showMessageDialog(null, "No connection detected", null,
            JOptionPane.WARNING_MESSAGE, null);
      }

    }

  }

  public static TimetableLogin createTimetableLogin() {return new TimetableLogin();}

  /**
   * Gets user name.
   *
   * @return the user name
   */
  final JTextField getUserName() {
    return this.userName;
  }

  /**
   * Sets user name.
   *
   * @param userName
   *     the user name
   */
  final void setUserName(final JTextField userName) {
    this.userName = userName;
  }

  /**
   * Gets user password.
   *
   * @return the user password
   */
  final JPasswordField getUserPassword() {
    return this.userPassword;
  }

  /**
   * Sets user password.
   *
   * @param userPassword
   *     the user password
   */
  final void setUserPassword(final JPasswordField userPassword) {
    this.userPassword = userPassword;
  }

  /**
   * Gets login.
   *
   * @return the login
   */
  final JButton getLogin() {
    return this.login;
  }

  /**
   * Sets login.
   *
   * @param login
   *     the login
   */
  final void setLogin(final JButton login) {
    this.login = login;
  }

  /**
   * Gets cancel.
   *
   * @return the cancel
   */
  final JButton getCancel() {
    return this.cancel;
  }

  /**
   * Sets cancel.
   *
   * @param cancel
   *     the cancel
   */
  final void setCancel(final JButton cancel) {
    this.cancel = cancel;
  }

  @Override
  public String toString() {
    return MessageFormat.format(
        "TimetableLogin'{'runStatementSelect={0}, databaseConnection={1}, userName={2}, " +
            "userPassword={3}, login={4}, cancel={5}'}'",
        this.runStatementSelect, this.databaseConnection, this.userName, this.userPassword,
        this.login,
        this.cancel
    );
  }
}
