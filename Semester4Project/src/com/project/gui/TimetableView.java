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

@SuppressWarnings("serial")
public class TimetableView extends JFrame {
	private JTextField txtSearch;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {
				"School of Science and Computing",
				"School of Business & Humanities", "School of Engineering",
				"All" }));
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
