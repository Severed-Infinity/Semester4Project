package com.project.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by david on 3/11/14.
 */
public class AdminView extends View {

    public AdminView () {

        JTabbedPane adminView = new JTabbedPane( JTabbedPane.TOP );
        CourseView courseView = new CourseView( this, null, "Course" );
        courseView.setToolTipText( "Course Options" );
        adminView.addTab( "Course", courseView );
    }

    public AdminView ( Container parent, String position, String title ) {
        super( parent, position, title );

        JTabbedPane adminView = new JTabbedPane( JTabbedPane.TOP );
        CourseView courseView = new CourseView( this, null, "Course" );
        courseView.setToolTipText( "Course Options" );
        adminView.addTab( "Course", courseView );

    }

}