package com.project.gui;

import java.awt.BorderLayout;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

@SuppressWarnings ("serial") public class TimetableView extends JFrame {
	private JTextField txtSearch;

    public TimetableView () throws HeadlessException {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Timetable");
        // setLocationRelativeTo(null);
        setSize(680, 400);
        setResizable(false);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mnFile = new JMenu("File");
        menuBar.add(mnFile);

        JMenuItem mntmSearch = new JMenuItem("Search");
        mnFile.add(mntmSearch);

        JMenuItem mntmPrint = new JMenuItem("Print");
        mnFile.add(mntmPrint);

        JMenuItem mntmExit = new JMenuItem("Exit");
        mnFile.add(mntmExit);

        JMenu mnEdit = new JMenu("Edit");
        menuBar.add(mnEdit);

        JMenuItem mntmUpdateTimetable = new JMenuItem("Update timetable");
        mnEdit.add(mntmUpdateTimetable);
        
        JMenuItem mntmUpdateUsers = new JMenuItem("Update Users");
        mnEdit.add(mntmUpdateUsers);
        getContentPane().setLayout(new BorderLayout(0, 0));
        
        JPanel header = new JPanel();
        getContentPane().add(header, BorderLayout.NORTH);
        header.setLayout(new BorderLayout(0, 0));
        
        JButton btnHome = new JButton("Home");
        header.add(btnHome, BorderLayout.WEST);
        
        txtSearch = new JTextField();
        txtSearch.setText("Search");
        header.add(txtSearch, BorderLayout.CENTER);
        txtSearch.setColumns(40);
        
        JLabel lblUser = new JLabel("User");
        header.add(lblUser, BorderLayout.EAST);

        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(5, 1, 5, 0));

        JPanel monday = new JPanel();
        panel.add(monday);
        monday.setLayout(new GridLayout(0, 8, 5, 0));

        JPanel tuseday = new JPanel();
        panel.add(tuseday);
        tuseday.setLayout(new GridLayout(0, 8, 5, 0));

        JPanel wednesday = new JPanel();
        panel.add(wednesday);
        wednesday.setLayout(new GridLayout(0, 8, 5, 0));

        JPanel thursday = new JPanel();
        panel.add(thursday);
        thursday.setLayout(new GridLayout(0, 8, 0, 0));

        JPanel friday = new JPanel();
        panel.add(friday);
        friday.setLayout(new GridLayout(0, 8, 5, 0));

        // TODO Auto-generated constructor stub
    }

    public TimetableView (GraphicsConfiguration arg0) {

        super(arg0);
        // TODO Auto-generated constructor stub
    }

    public TimetableView (String arg0) throws HeadlessException {

        super(arg0);
        // TODO Auto-generated constructor stub
    }

    public TimetableView (String arg0, GraphicsConfiguration arg1) {

        super(arg0, arg1);
        // TODO Auto-generated constructor stub
    }

    public static void main (String[] args) {

        TimetableView timetable = new TimetableView();
        timetable.setVisible(true);

    }
}
