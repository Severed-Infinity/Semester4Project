package com.project.gui;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings ( "serial" )
public abstract class View extends JPanel {

    public static String Name;
    protected JTextField tf;
    protected JButton add, cancel, clear, update;
    protected JLabel lbl;
    protected JPanel pnl;
    protected JComboBox<Object> cbx;
    protected JList<Object> lst;
    protected JFrame parent;

    public View ( Container parent, String position, String title ) {

        /*
        may not be the correct approach to this
        may pass in a parent parameter
        */
        JComponent panelName = new JPanel();
        this.setName( panelName.getName() );

        if ( parent instanceof JFrame ) {
            parent = SwingUtilities.getWindowAncestor( this );
            ( (JFrame) parent ).setTitle( title );
            ( (JFrame) parent ).getContentPane().add( panelName, position );
        } else {
            parent = this.getParent();
            parent.add( panelName, position );
        }

    }

/*
public String getName () {
return name;
}

public void setName ( String name ) {
this.name = name;
}
*/

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
