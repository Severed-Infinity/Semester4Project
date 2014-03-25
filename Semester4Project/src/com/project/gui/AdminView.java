package com.project.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by david on 3/11/14.
 */
public class AdminView extends View {

    public AdminView ( Container parent, String position, String title ) {
        super( parent, position, title );

        JTabbedPane adminView = new JTabbedPane( JTabbedPane.TOP );
        parent.add( adminView );

        JPanel Course = new JPanel();
        Course.setToolTipText( "Course" );
        adminView.addTab( "Course", null, Course, null );

        GridBagLayout gbl_Course = new GridBagLayout();
        gbl_Course.columnWidths = new int[]{ 0, 0, 0, 0 };
        gbl_Course.rowHeights = new int[]{ 0, 0, 0, 0 };
        gbl_Course.columnWeights = new double[]{ 0.0, 1.0, 0.0, Double.MIN_VALUE };
        gbl_Course.rowWeights = new double[]{ 0.0, 0.0, 1.0, Double.MIN_VALUE };
        Course.setLayout( gbl_Course );

        JPanel panel_1 = new JPanel();
        GridBagConstraints gbc_panel_1 = new GridBagConstraints();
        gbc_panel_1.insets = new Insets( 0, 0, 5, 5 );
        gbc_panel_1.fill = GridBagConstraints.BOTH;
        gbc_panel_1.gridx = 1;
        gbc_panel_1.gridy = 1;
        Course.add( panel_1, gbc_panel_1 );
        panel_1.setLayout( new FlowLayout( FlowLayout.LEFT, 5, 5 ) );

        JButton btnNewButton = new JButton( "Add New Course" );
        panel_1.add( btnNewButton );

        JButton btnNewButton_1 = new JButton( "Update Course" );
        panel_1.add( btnNewButton_1 );

        JPanel panel = new JPanel();
        GridBagConstraints gbc_panel = new GridBagConstraints();
        gbc_panel.insets = new Insets( 0, 0, 0, 5 );
        gbc_panel.fill = GridBagConstraints.BOTH;
        gbc_panel.gridx = 1;
        gbc_panel.gridy = 2;
        Course.add( panel, gbc_panel );

        JPanel Module = new JPanel();
        adminView.addTab( "Module", null, Module, null );
        GridBagLayout gbl_Module = new GridBagLayout();
        gbl_Module.columnWidths = new int[]{ 0, 0, 0 };
        gbl_Module.rowHeights = new int[]{ 0, 0, 0, 0 };
        gbl_Module.columnWeights = new double[]{ 0.0, 1.0, Double.MIN_VALUE };
        gbl_Module.rowWeights = new double[]{ 0.0, 0.0, 1.0, Double.MIN_VALUE };
        Module.setLayout( gbl_Module );

        JPanel panel_2 = new JPanel();
        GridBagConstraints gbc_panel_2 = new GridBagConstraints();
        gbc_panel_2.insets = new Insets( 0, 0, 5, 0 );
        gbc_panel_2.fill = GridBagConstraints.BOTH;
        gbc_panel_2.gridx = 1;
        gbc_panel_2.gridy = 1;
        Module.add( panel_2, gbc_panel_2 );
        panel_2.setLayout( new FlowLayout( FlowLayout.LEFT, 5, 5 ) );

        JButton btnAddNewModule = new JButton( "Add New Module" );
        panel_2.add( btnAddNewModule );

        JButton btnUpdateModule = new JButton( "Update Module" );
        panel_2.add( btnUpdateModule );

        JPanel panel_3 = new JPanel();
        GridBagConstraints gbc_panel_3 = new GridBagConstraints();
        gbc_panel_3.fill = GridBagConstraints.BOTH;
        gbc_panel_3.gridx = 1;
        gbc_panel_3.gridy = 2;
        Module.add( panel_3, gbc_panel_3 );

        JPanel User = new JPanel();
        adminView.addTab( "User", null, User, null );
        GridBagLayout gbl_User = new GridBagLayout();
        gbl_User.columnWidths = new int[]{ 0, 0, 0 };
        gbl_User.rowHeights = new int[]{ 0, 0, 0, 0 };
        gbl_User.columnWeights = new double[]{ 0.0, 1.0, Double.MIN_VALUE };
        gbl_User.rowWeights = new double[]{ 0.0, 0.0, 1.0, Double.MIN_VALUE };
        User.setLayout( gbl_User );

        JPanel panel_4 = new JPanel();
        GridBagConstraints gbc_panel_4 = new GridBagConstraints();
        gbc_panel_4.insets = new Insets( 0, 0, 5, 0 );
        gbc_panel_4.fill = GridBagConstraints.BOTH;
        gbc_panel_4.gridx = 1;
        gbc_panel_4.gridy = 1;
        User.add( panel_4, gbc_panel_4 );
        panel_4.setLayout( new FlowLayout( FlowLayout.LEFT, 5, 5 ) );

        JButton btnAddNewUser = new JButton( "Add New User" );
        panel_4.add( btnAddNewUser );

        JButton btnUpdateUser = new JButton( "Update User" );
        panel_4.add( btnUpdateUser );

        JPanel panel_5 = new JPanel();
        GridBagConstraints gbc_panel_5 = new GridBagConstraints();
        gbc_panel_5.fill = GridBagConstraints.BOTH;
        gbc_panel_5.gridx = 1;
        gbc_panel_5.gridy = 2;
        User.add( panel_5, gbc_panel_5 );
    }

}