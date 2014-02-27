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

@SuppressWarnings ("serial") public class TimetableView extends JFrame {

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
        getContentPane().setLayout(new BorderLayout(0, 0));

        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(5, 1, 5, 0));

        JPanel panel_2 = new JPanel();
        panel.add(panel_2);
        panel_2.setLayout(new GridLayout(0, 8, 5, 0));

        JPanel panel_3 = new JPanel();
        panel.add(panel_3);
        panel_3.setLayout(new GridLayout(0, 8, 5, 0));

        JPanel panel_4 = new JPanel();
        panel.add(panel_4);
        panel_4.setLayout(new GridLayout(0, 8, 5, 0));

        JPanel panel_5 = new JPanel();
        panel.add(panel_5);
        panel_5.setLayout(new GridLayout(0, 8, 0, 0));

        JPanel panel_1 = new JPanel();
        panel.add(panel_1);
        panel_1.setLayout(new GridLayout(0, 8, 5, 0));

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
