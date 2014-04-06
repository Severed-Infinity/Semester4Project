package com.project.gui;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings ("serial")
public abstract class View extends JPanel {

    //todo move duplicate code to the view class from subclasses
    protected JTextField tf;
    protected JButton add, cancel, clear, update;
    protected JLabel lbl;
    protected JPanel pnl;
    protected JComboBox<Object> cbx;
    protected JList<Object> lst;
    protected JFrame parent;
    //    protected ArrayList<View> views = new ArrayList<>();

    public View () {

        setBackground( Color.white );
    }

    public View ( Container parent, String position, String title ) {

        setBackground( Color.white );
        /*
        may not be the correct approach to this
        may pass in a parent parameter
        instead get the root pane for the title
        and just add parent as a jpanel
        */
        //
        //        parent = this.getParent();
        //        parent.add( this, position );

        //        if ( parent instanceof JFrame ) {
        //            JFrame jFrame = (JFrame) parent;
        //            jFrame = (JFrame) SwingUtilities.getWindowAncestor( this );
        //            ( (JFrame) parent ).setTitle( title );
        //            ( (JFrame) parent ).getContentPane().add( this, position );
        //        } else {
        //            parent = this.getParent();
        //            parent.add( this, position );
        //        }

        //        views.add( this );
    }

    //    public ArrayList<View> getViews () {
    //        return views;
    //    }

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
