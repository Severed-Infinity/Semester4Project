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

    public View ( JPanel panelName, Component position, String title ) {
        
        parent = (JFrame) SwingUtilities.getWindowAncestor( this );
        parent.setTitle( title );
        parent.getContentPane().add( panelName, position );

        // TODO Auto-generated constructor stub
    }

}
