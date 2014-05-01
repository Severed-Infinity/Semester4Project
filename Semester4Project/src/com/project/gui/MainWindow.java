package com.project.gui;

import com.project.constants.*;
import com.project.controller.*;
import com.project.database.*;
import com.project.user.*;

import javax.swing.*;
import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

/**
 * Created by david on 3/12/14.
 */
class MainWindow extends JFrame {
  private static final long serialVersionUID = 7506769863584558072L;
  private final User user;

  /**
   * Instantiates a new Main window.
   *
   * @param databaseConnection
   *     the database connection
   */
  MainWindow(final DatabaseConnection databaseConnection, final User user) {
    super();
    this.setTitle("Timetable");
    this.setResizable(false);
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.setSize(800, 500);
    this.setLocationRelativeTo(null);
    final Container contentPane = this.getContentPane();
    contentPane.setBackground(Color.white);
    contentPane.setPreferredSize(new Dimension(800, 500));
    contentPane.setLayout(new GridBagLayout());
    final GridBagConstraints constraints = new GridBagConstraints();
    // constraints.anchor = GridBagConstraints.FIRST_LINE_START;
    constraints.ipadx = 5;
    constraints.ipady = 5;
    this.setJMenuBar(addMenu());
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
    this.add(header, constraints);

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
      public void actionPerformed(final ActionEvent actionEvente) {
        databaseConnection.endConnection();
        final TimetableLogin login = TimetableLogin.createTimetableLogin();
        login.setVisible(true);
        MainWindow.this.dispose();
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
    final GroupLayout headerLayout = new GroupLayout(header);
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
    final MainView mainView = new MainView(user, null);
    constraints.gridx = 0;
    constraints.gridy = 1;
    constraints.weightx = 1.0;
    constraints.weighty = 1.0;
    // constraints.gridwidth = 2;
    constraints.fill = GridBagConstraints.BOTH;
    this.add(mainView, constraints);
    // end of main currentView
    this.pack();
    this.user = null;
  }

  /**
   * Add menu.
   *
   * @return the j menu bar
   */
  private static JMenuBar addMenu() {

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
    final JMenuItem addCourse = new JMenuItem(StringConstants.ADD_COURSE);
    final JMenuItem addModule = new JMenuItem(StringConstants.ADD_MODULE);
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

  @Override
  public String toString() {
    return MessageFormat.format("MainWindow'{'user={0}'}'", this.user);
  }

  /**
   * Created by david on 3/12/14.
   */
  private static class MainView extends View {
    private static final long serialVersionUID = -821318304586697996L;
    private final User user;
    private View currentView;
    private View previousView;

    private MainView(final User user, final View currentView) {
      super();
      this.setLayout(new BorderLayout());
      this.currentView = currentView;
      this.user = user;
      this.add(this.changeView(user), BorderLayout.CENTER);
    }

    public final View changeView(final User user) {
      if (user instanceof Student) {
        this.previousView = this.currentView;
        this.currentView = new TimetableView(Timetable.createTimetable());
        //        return this.currentView = new TimetableView(((Student)user).getCourseCode()
        // .getTimetable());
      }
      if (user instanceof Admin) {
        this.previousView = this.currentView;
        this.currentView = new AdminView();
      }
      if (user instanceof Lecturer) {
        this.previousView = this.currentView;
        this.currentView = new TimetableView(((Lecturer)user).getTimetable());
      }
      return this.currentView;
    }

    @Override
    public String toString() {
      return MessageFormat.format("MainView'{'user={0}, currentView={1}, previousView={2}'}'",
          this.user,
          this.currentView, this.previousView);
    }
  }
}
