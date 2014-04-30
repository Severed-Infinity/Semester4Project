package com.project.gui;

import com.project.controller.*;
import com.project.database.*;
import com.project.user.*;

import javax.swing.*;
import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by david on 3/12/14.
 */
class MainWindow extends JFrame {
  private User user;

  /**
   * Instantiates a new Main window.
   *
   * @param databaseConnection
   *     the database connection
   */
  public MainWindow(final DatabaseConnection databaseConnection, final User user) {

    setTitle("Timetable");
    setResizable(false);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setSize(800, 500);
    setLocationRelativeTo(null);

    getContentPane().setBackground(Color.white);
    getContentPane().setPreferredSize(new Dimension(800, 500));
    getContentPane().setLayout(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();
    // constraints.anchor = GridBagConstraints.FIRST_LINE_START;
    constraints.ipadx = 5;
    constraints.ipady = 5;
    GroupLayout headerLayout;

    setJMenuBar(addMenu());

    // beginning of header
        /*
         * The Header.
         */
    final JPanel header = new JPanel();
    header.setBackground(Color.white);
    constraints.gridx = 0;
    constraints.gridy = 0;
    constraints.weightx = 1.0;
    // constraints.gridwidth = 2;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    add(header, constraints);

        /*
         * The Home.
         */
    final JButton home = new JButton("Home");
    // header.add( home );

        /*
         * The Logout.
         */
    final JButton logout = new JButton("Logout");
    logout.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {

        databaseConnection.endConnection();
        new TimetableLogin().setVisible(true);
        dispose();
      }
    });
    // header.add( logout );

        /*
         * The Search field.
         */
    final JTextField searchField = new JFormattedTextField("Search");
    searchField.setColumns(40);
    // header.add( searchField );

        /*
         * The Logged user.
         */
    final JLabel loggedUser = new JLabel("User");
    loggedUser.setHorizontalAlignment(SwingConstants.TRAILING);
    // header.add( loggedUser );

    headerLayout = new GroupLayout(header);
    headerLayout.setHorizontalGroup(headerLayout.createParallelGroup(Alignment.LEADING)
        .addGroup(
            headerLayout
                .createSequentialGroup()
                .addContainerGap()
                .addComponent(home)
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addComponent(logout)
                .addGap(50)
                .addComponent(searchField, GroupLayout.PREFERRED_SIZE, 400,
                    Short.MAX_VALUE)
                .addGap(20)
                .addComponent(loggedUser, GroupLayout.DEFAULT_SIZE, 200,
                    Short.MAX_VALUE).addGap(40).addContainerGap()
        ));

    headerLayout.setVerticalGroup(headerLayout.createParallelGroup(Alignment.LEADING).addGroup(
        headerLayout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
                headerLayout
                    .createParallelGroup(Alignment.BASELINE)
                    .addComponent(searchField, GroupLayout.PREFERRED_SIZE, 30,
                        GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout)
                    .addComponent(home)
                    .addComponent(loggedUser, GroupLayout.PREFERRED_SIZE, 30,
                        GroupLayout.PREFERRED_SIZE)
            )
    ));

    header.setLayout(headerLayout);
    // end of header

    // beginning of main currentView
    /**
     * The Main currentView.
     */

    final View view = null;
    final MainView mainView = new MainView(user, view);
    constraints.gridx = 0;
    constraints.gridy = 1;
    constraints.weightx = 1.0;
    constraints.weighty = 1.0;
    // constraints.gridwidth = 2;
    constraints.fill = GridBagConstraints.BOTH;
    add(mainView, constraints);
    // end of main currentView

    pack();
  }

  /**
   * Add menu.
   *
   * @return the j menu bar
   */
  JMenuBar addMenu() {

        /*
         * The Main menu.
         */
    final JMenuBar mainMenu = new JMenuBar();

        /*
         * The Menu file.
         */
    final JMenu menuFile = new JMenu("File");
    mainMenu.add(menuFile);
    final JMenu menuEdit = new JMenu("Edit");
    mainMenu.add(menuEdit);

        /*
         * The Search.
         */
    final JMenuItem search = new JMenuItem("Search");
    final JMenuItem print = new JMenuItem("Print");
    final JMenuItem exitAndLogout = new JMenuItem("Exit and Logout");
    final JMenuItem exit = new JMenuItem("Exit");
    final JMenuItem updateTimetable = new JMenuItem("Update Timetable");
    final JMenuItem updateUsers = new JMenuItem("Update User");
    final JMenuItem updateCourse = new JMenuItem("Update Course");
    final JMenuItem updateModule = new JMenuItem("Update Module");
    final JMenuItem addUsers = new JMenuItem("Add User");
    final JMenuItem addCourse = new JMenuItem("Add Course");
    final JMenuItem addModule = new JMenuItem("Add Module");

    menuFile.add(search);
    menuFile.add(print);
    menuFile.add(exitAndLogout);
    menuFile.add(exit);

    menuEdit.add(updateTimetable);
    menuEdit.add(updateUsers);
    menuEdit.add(updateCourse);
    menuEdit.add(updateModule);
    menuEdit.add(addUsers);
    menuEdit.add(addCourse);
    menuEdit.add(addModule);

    return mainMenu;
  }

  /**
   * Created by david on 3/12/14.
   */
  private class MainView extends View {
    private final User user;
    private View currentView;
    private View previousView;

    private MainView(User user, View currentView) {

      setLayout(new BorderLayout());
      this.currentView = currentView;
      this.user = user;
      this.add(changeView(user), BorderLayout.CENTER);
    }

    public View changeView(final User user) {
      if (user instanceof Student) {
        this.previousView = currentView;
        return this.currentView = new TimetableView(new Timetable());
        //        return this.currentView = new TimetableView(((Student)user).getCourseCode()
        // .getTimetable());
      } else if (user instanceof Admin) {
        this.previousView = currentView;
        return this.currentView = new AdminView();
      } else if (user instanceof Lecturer) {
        this.previousView = currentView;
        return this.currentView = new TimetableView(((Lecturer)user).getTimetable());
      }
      return new TimetableView(new Timetable());
    }
  }

}
