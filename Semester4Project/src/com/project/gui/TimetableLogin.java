package com.project.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TimetableLogin extends JFrame {

    private JTextField textField;
    private JPasswordField passwordField;

    public TimetableLogin () {

        setTitle("Login");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(250, 175);
        getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 243, 85);
        getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblUser = new JLabel("User");
        lblUser.setBounds(14, 11, 66, 29);
        panel.add(lblUser);

        textField = new JTextField();
        textField.setBounds(90, 11, 143, 29);
        panel.add(textField);
        textField.setColumns(10);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(14, 52, 66, 29);
        panel.add(lblPassword);

        passwordField = new JPasswordField();
        passwordField.setBounds(90, 52, 143, 29);
        panel.add(passwordField);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(0, 93, 243, 50);
        getContentPane().add(panel_1);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(10, 11, 66, 23);
        btnLogin.addActionListener(new ActionListener() {

            @Override public void actionPerformed (ActionEvent arg0) {

            }
        });
        panel_1.setLayout(null);
        panel_1.add(btnLogin);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.setBounds(90, 11, 66, 23);
        panel_1.add(btnCancel);

        // TODO Auto-generated constructor stub
    }

    public static void main (String[] args) {

        TimetableLogin login = new TimetableLogin();
        login.setVisible(true);

    }

}
