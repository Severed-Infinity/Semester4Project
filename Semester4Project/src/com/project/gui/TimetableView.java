package com.project.gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.JTabbedPane;

@SuppressWarnings("serial")
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

	public TimetableView() throws HeadlessException {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Timetable");
		setLocationRelativeTo(null);
		setSize(800, 500);
		setResizable(false);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmSearch = new JMenuItem("Search");
		mnFile.add(mntmSearch);

		JMenuItem mntmPrint = new JMenuItem("Print");
		mnFile.add(mntmPrint);

		JMenuItem mntmExitAndLogout = new JMenuItem("Exit and Logout");
		mnFile.add(mntmExitAndLogout);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);

		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);

		JMenuItem mntmUpdateTimetable = new JMenuItem("Update timetable");
		mnEdit.add(mntmUpdateTimetable);

		JMenuItem mntmUpdateUsers = new JMenuItem("Update Users");
		mnEdit.add(mntmUpdateUsers);

		JMenuItem mntmUpdateClass = new JMenuItem("Update Class");
		mnEdit.add(mntmUpdateClass);

		JMenuItem mntmUpdateModule = new JMenuItem("Update Module");
		mnEdit.add(mntmUpdateModule);

		JMenuItem mntmAddUser = new JMenuItem("Add User");
		mnEdit.add(mntmAddUser);

		JMenuItem mntmAddClass = new JMenuItem("Add Class");
		mnEdit.add(mntmAddClass);

		JMenuItem mntmAddModule = new JMenuItem("Add Module");
		mnEdit.add(mntmAddModule);
		getContentPane().setLayout(new BorderLayout(10, 5));

		JPanel header = new JPanel();
		getContentPane().add(header, BorderLayout.NORTH);

		JButton btnHome = new JButton("Home");

		JButton btnLogout = new JButton("Logout");

		txtSearch = new JTextField();
		txtSearch.setText("Search");
		txtSearch.setColumns(40);

		JLabel lblUser = new JLabel("User");
		lblUser.setHorizontalAlignment(SwingConstants.TRAILING);
		GroupLayout gl_header = new GroupLayout(header);
		gl_header.setHorizontalGroup(gl_header.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_header
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(btnHome)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnLogout)
						.addGap(78)
						.addComponent(txtSearch, GroupLayout.PREFERRED_SIZE,
								313, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(lblUser, GroupLayout.DEFAULT_SIZE, 231,
								Short.MAX_VALUE).addContainerGap()));
		gl_header
				.setVerticalGroup(gl_header
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_header
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gl_header
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																txtSearch,
																GroupLayout.PREFERRED_SIZE,
																23,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(btnLogout)
														.addComponent(btnHome)
														.addComponent(
																lblUser,
																GroupLayout.PREFERRED_SIZE,
																23,
																GroupLayout.PREFERRED_SIZE))));
		header.setLayout(gl_header);

		JPanel mainView = new JPanel();
		getContentPane().add(mainView, BorderLayout.CENTER);
		mainView.setLayout(new CardLayout(0, 0));
		
		JTabbedPane adminView = new JTabbedPane(JTabbedPane.TOP);
		mainView.add(adminView, "name_173771604594465");

		JPanel timetableView = new JPanel();
		mainView.add(timetableView, "name_109576600023605");
		timetableView.setLayout(new GridLayout(5, 1, 5, 0));

		JPanel monday = new JPanel();
		timetableView.add(monday);
		monday.setLayout(new GridLayout(0, 8, 5, 0));

		JPanel tuseday = new JPanel();
		timetableView.add(tuseday);
		tuseday.setLayout(new GridLayout(0, 8, 5, 0));

		JPanel wednesday = new JPanel();
		timetableView.add(wednesday);
		wednesday.setLayout(new GridLayout(0, 8, 5, 0));

		JPanel thursday = new JPanel();
		timetableView.add(thursday);
		thursday.setLayout(new GridLayout(0, 8, 0, 0));

		JPanel friday = new JPanel();
		timetableView.add(friday);
		friday.setLayout(new GridLayout(0, 8, 5, 0));
		
		JPanel addNewCourse = new JPanel();
		addNewCourse.setLayout(null);
		addNewCourse.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Add New Course", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		mainView.add(addNewCourse, "name_171164909579259");
		
		JLabel lblTypeOfCourse = new JLabel("Type of Course");
		lblTypeOfCourse.setBounds(35, 33, 95, 14);
		addNewCourse.add(lblTypeOfCourse);
		
		JComboBox<String> comboBox_3 = new JComboBox<String>();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Full time", "Part time"}));
		comboBox_3.setBounds(140, 30, 120, 20);
		addNewCourse.add(comboBox_3);
		
		JLabel label_1 = new JLabel("Name");
		label_1.setBounds(35, 66, 95, 14);
		addNewCourse.add(label_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(140, 63, 120, 20);
		addNewCourse.add(textField_5);
		
		JLabel lblCourseCode_1 = new JLabel("Course Code");
		lblCourseCode_1.setBounds(350, 66, 95, 14);
		addNewCourse.add(lblCourseCode_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(467, 63, 120, 20);
		addNewCourse.add(textField_6);
		
		JLabel label_3 = new JLabel("ID");
		label_3.setBounds(35, 91, 95, 14);
		addNewCourse.add(label_3);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(140, 88, 120, 20);
		addNewCourse.add(textField_7);
		
		JLabel label_4 = new JLabel("Department");
		label_4.setBounds(35, 116, 95, 14);
		addNewCourse.add(label_4);
		
		JLabel lblCourseLength = new JLabel("Course Length");
		lblCourseLength.setBounds(35, 144, 95, 14);
		addNewCourse.add(lblCourseLength);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(140, 141, 120, 20);
		addNewCourse.add(textField_8);
		
		JLabel lblSelectModule = new JLabel("Select Module");
		lblSelectModule.setBounds(35, 191, 95, 14);
		addNewCourse.add(lblSelectModule);
		
		JComboBox<String> comboBox_6 = new JComboBox<String>();
		comboBox_6.setBounds(140, 188, 192, 20);
		addNewCourse.add(comboBox_6);
		
		JButton button = new JButton("Add Module");
		button.setBounds(350, 188, 95, 23);
		addNewCourse.add(button);
		
		JButton button_1 = new JButton("Confirm");
		button_1.setBounds(467, 360, 89, 23);
		addNewCourse.add(button_1);
		
		JButton button_2 = new JButton("Cancel");
		button_2.setBounds(665, 360, 89, 23);
		addNewCourse.add(button_2);
		
		JButton button_3 = new JButton("Clear");
		button_3.setBounds(566, 360, 89, 23);
		addNewCourse.add(button_3);
		
		JLabel label_9 = new JLabel("Modules: ");
		label_9.setBounds(35, 216, 95, 14);
		addNewCourse.add(label_9);
		
		JList<String> list_1 = new JList<String>();
		list_1.setBounds(140, 214, 192, 125);
		addNewCourse.add(list_1);
		
		JLabel lblNumberOfSemesters_1 = new JLabel("Number of Semesters");
		lblNumberOfSemesters_1.setBounds(350, 144, 110, 14);
		addNewCourse.add(lblNumberOfSemesters_1);
		
		JLabel label_11 = new JLabel("Password");
		label_11.setBounds(350, 91, 95, 14);
		addNewCourse.add(label_11);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(467, 88, 120, 20);
		addNewCourse.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setBounds(467, 141, 120, 20);
		addNewCourse.add(textField_10);
		textField_10.setColumns(10);
		
		JComboBox<String> comboBox_4 = new JComboBox<String>();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"School of Science and Computing", "School of Business & Humanities", "School of Engineering"}));
		comboBox_4.setBounds(140, 113, 192, 20);
		addNewCourse.add(comboBox_4);
		
		JButton btnCreateNewModule = new JButton("Create New Module");
		btnCreateNewModule.setBounds(467, 188, 127, 23);
		addNewCourse.add(btnCreateNewModule);
		
		JPanel addNewModule = new JPanel();
		addNewModule.setLayout(null);
		addNewModule.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Add New Module", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		mainView.add(addNewModule, "name_172488623301030");
		
		JLabel label = new JLabel("Type of Course");
		label.setBounds(35, 33, 95, 14);
		addNewModule.add(label);
		
		JComboBox<String> comboBox_5 = new JComboBox<String>();
		comboBox_5.setBounds(140, 30, 120, 20);
		addNewModule.add(comboBox_5);
		
		JLabel label_2 = new JLabel("Name");
		label_2.setBounds(35, 66, 95, 14);
		addNewModule.add(label_2);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(140, 63, 120, 20);
		addNewModule.add(textField_11);
		
		JLabel lblModuleCode = new JLabel("Module Code");
		lblModuleCode.setBounds(350, 66, 95, 14);
		addNewModule.add(lblModuleCode);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(467, 63, 120, 20);
		addNewModule.add(textField_12);
		
		JLabel label_6 = new JLabel("ID");
		label_6.setBounds(35, 91, 95, 14);
		addNewModule.add(label_6);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(140, 88, 120, 20);
		addNewModule.add(textField_13);
		
		JLabel label_7 = new JLabel("Department");
		label_7.setBounds(35, 116, 95, 14);
		addNewModule.add(label_7);
		
		JLabel lblHoursAWeek = new JLabel("Hours a Week");
		lblHoursAWeek.setBounds(350, 165, 95, 14);
		addNewModule.add(lblHoursAWeek);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(467, 162, 120, 20);
		addNewModule.add(textField_14);
		
		JLabel lblSelectLecturer = new JLabel("Select Lecturer");
		lblSelectLecturer.setBounds(35, 191, 95, 14);
		addNewModule.add(lblSelectLecturer);
		
		JComboBox<String> comboBox_7 = new JComboBox<String>();
		comboBox_7.setBounds(140, 188, 192, 20);
		addNewModule.add(comboBox_7);
		
		JButton btnAddLecturer = new JButton("Add Lecturer");
		btnAddLecturer.setBounds(350, 187, 95, 23);
		addNewModule.add(btnAddLecturer);
		
		JButton button_5 = new JButton("Confirm");
		button_5.setBounds(467, 360, 89, 23);
		addNewModule.add(button_5);
		
		JButton button_6 = new JButton("Cancel");
		button_6.setBounds(665, 360, 89, 23);
		addNewModule.add(button_6);
		
		JButton button_7 = new JButton("Clear");
		button_7.setBounds(566, 360, 89, 23);
		addNewModule.add(button_7);
		
		JLabel lblLecturers = new JLabel("Lecturers: ");
		lblLecturers.setBounds(35, 216, 95, 14);
		addNewModule.add(lblLecturers);
		
		JList<String> list_2 = new JList<String>();
		list_2.setBounds(140, 214, 192, 125);
		addNewModule.add(list_2);
		
		JLabel label_13 = new JLabel("Number of Semesters");
		label_13.setBounds(350, 138, 110, 14);
		addNewModule.add(label_13);
		
		JLabel label_14 = new JLabel("Password");
		label_14.setBounds(350, 91, 95, 14);
		addNewModule.add(label_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(467, 88, 120, 20);
		addNewModule.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(467, 138, 120, 20);
		addNewModule.add(textField_16);
		
		JComboBox<String> comboBox_8 = new JComboBox<String>();
		comboBox_8.setBounds(140, 113, 192, 20);
		addNewModule.add(comboBox_8);
		
		JButton btnCreateNewCourse = new JButton("Create New Course");
		btnCreateNewCourse.setBounds(467, 187, 127, 23);
		addNewModule.add(btnCreateNewCourse);
		
		JLabel label_5 = new JLabel("Course");
		label_5.setBounds(35, 141, 95, 14);
		addNewModule.add(label_5);
		
		JComboBox<String> comboBox_9 = new JComboBox<String>();
		comboBox_9.setBounds(140, 138, 120, 20);
		addNewModule.add(comboBox_9);
		
		JLabel label_15 = new JLabel("Course Code: ");
		label_15.setBounds(35, 165, 225, 14);
		addNewModule.add(label_15);

		JPanel addUserView = new JPanel();
		addUserView
				.setBorder(new TitledBorder(UIManager
						.getBorder("TitledBorder.border"), "Add New User",
						TitledBorder.CENTER, TitledBorder.TOP, null, new Color(
								0, 0, 0)));
		mainView.add(addUserView, "name_111674253025430");
		addUserView.setLayout(null);

		JLabel lblTypeOfUser = new JLabel("Type of User");
		lblTypeOfUser.setBounds(35, 33, 95, 14);
		addUserView.add(lblTypeOfUser);

		JComboBox<String> userSelect = new JComboBox<String>();
		userSelect.setModel(new DefaultComboBoxModel<String>(new String[] { "Admin",
				"Lecturer", "Student" }));
		userSelect.setBounds(140, 30, 120, 20);
		addUserView.add(userSelect);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(35, 66, 95, 14);
		addUserView.add(lblName);

		textField = new JTextField();
		textField.setBounds(140, 63, 120, 20);
		addUserView.add(textField);
		textField.setColumns(10);

		JLabel lblTitle = new JLabel("Title");
		lblTitle.setBounds(350, 66, 95, 14);
		addUserView.add(lblTitle);

		textField_1 = new JTextField();
		textField_1.setBounds(467, 63, 120, 20);
		addUserView.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblId = new JLabel("ID");
		lblId.setBounds(35, 91, 95, 14);
		addUserView.add(lblId);

		textField_2 = new JTextField();
		textField_2.setBounds(140, 88, 120, 20);
		addUserView.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(35, 116, 95, 14);
		addUserView.add(lblDepartment);

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"School of Science and Computing", "School of Business & Humanities", "School of Engineering", "All"}));
		comboBox.setBounds(140, 113, 192, 20);
		addUserView.add(comboBox);

		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(35, 141, 95, 14);
		addUserView.add(lblCourse);

		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(140, 138, 120, 20);
		addUserView.add(comboBox_1);

		JLabel lblCourseCode = new JLabel("Course Code: ");
		lblCourseCode.setBounds(35, 166, 225, 14);
		addUserView.add(lblCourseCode);

		JLabel lblYears = new JLabel("Years");
		lblYears.setBounds(350, 141, 62, 14);
		addUserView.add(lblYears);

		textField_3 = new JTextField();
		textField_3.setBounds(467, 138, 120, 20);
		addUserView.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblTeaches = new JLabel("Teaches");
		lblTeaches.setBounds(35, 191, 95, 14);
		addUserView.add(lblTeaches);

		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setBounds(140, 188, 192, 20);
		addUserView.add(comboBox_2);

		JButton btnAddModule = new JButton("Add Module");
		btnAddModule.setBounds(350, 187, 95, 23);
		addUserView.add(btnAddModule);

		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(467, 360, 89, 23);
		addUserView.add(btnConfirm);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancel.setBounds(665, 360, 89, 23);
		addUserView.add(btnCancel);

		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(566, 360, 89, 23);
		addUserView.add(btnClear);

		JLabel lblModules = new JLabel("Modules: ");
		lblModules.setBounds(35, 216, 95, 14);
		addUserView.add(lblModules);

		JList<String> list = new JList<String>();
		list.setBounds(140, 214, 192, 125);
		addUserView.add(list);

		JLabel lblNumberOfSemesters = new JLabel("Number of Semesters: ");
		lblNumberOfSemesters.setBounds(350, 166, 237, 14);
		addUserView.add(lblNumberOfSemesters);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(350, 91, 95, 14);
		addUserView.add(lblPassword);

		textField_4 = new JTextField();
		textField_4.setBounds(467, 88, 120, 20);
		addUserView.add(textField_4);
		textField_4.setColumns(10);

		// TODO Auto-generated constructor stub
	}

	public TimetableView(GraphicsConfiguration arg0) {

		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public TimetableView(String arg0) throws HeadlessException {

		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public TimetableView(String arg0, GraphicsConfiguration arg1) {

		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		TimetableView timetable = new TimetableView();
		timetable.setVisible(true);

	}
}
