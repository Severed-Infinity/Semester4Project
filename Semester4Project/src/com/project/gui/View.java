package com.project.gui;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings ("serial")
public abstract class View extends JPanel {

    protected JTextField tf;
    protected JButton btn;
    protected JLabel lbl;
    protected JPanel pnl;
    protected JComboBox<Object> cbx;
    protected JList<Object> lst;
    protected JFrame parent;

    // protected JPasswordField passwordField;

    public View ( JComponent panelName, Component position, String title ) {

        parent = (JFrame) SwingUtilities.getWindowAncestor( this );
        parent.setTitle( title );
        parent.getContentPane().add( panelName, position );

        /*
        may not be the correct means to adding to the mainview
         */
        parent.add( this );

        // TODO Auto-generated constructor stub
    }

}
