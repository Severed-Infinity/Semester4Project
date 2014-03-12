package com.project.gui;

import javax.swing.*;
import java.awt.*;
import java.util.List;

@SuppressWarnings ( "serial" )
public abstract class View extends JPanel {

    protected JTextField tf;
    protected JButton add, cancel, clear, update;
    protected JLabel lbl;
    protected JPanel pnl;
    protected JComboBox<Object> cbx;
    protected JList<Object> lst;
    protected JFrame parent;
    protected static List<Component> components;

    // protected JPasswordField passwordField;

   /*public View () {
        JFrame test = new JFrame();
        test.setDefaultCloseOperation( EXIT_ON_CLOSE );
        test.setTitle( "Timetable" );
        test.setLocationRelativeTo( null );
        test.setSize( 800, 500 );
        test.setResizable( false );
        test.setVisible( true );
    }*/

    public View ( Container parent, JComponent panelName, Component position, String title ) {

        /*
        may not be the correct approach to this
        may pass in a parent parameter
        */

        if ( parent instanceof JFrame ) {
            parent = SwingUtilities.getWindowAncestor( this );
            ( (JFrame) parent ).setTitle( title );
            ( (JFrame) parent ).getContentPane().add( panelName, position );
        } else {
            parent = this.getParent();
            parent.add( panelName, position );
        }

    }

    public static void addComponent ( Component component ) {
        components.add( component );
    }

    public JButton getAdd () {
        return add;
    }

    public void setAdd ( JButton add ) {
        this.add = add;
    }

    public JButton getCancel () {
        return cancel;
    }

    public void setCancel ( JButton cancel ) {
        this.cancel = cancel;
    }

    public JButton getClear () {
        return clear;
    }

    public void setClear ( JButton clear ) {
        this.clear = clear;
    }

    public JButton getUpdate () {
        return update;
    }

    public void setUpdate ( JButton update ) {
        this.update = update;
    }
}
