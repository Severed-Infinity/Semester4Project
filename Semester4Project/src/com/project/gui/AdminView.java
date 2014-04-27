package com.project.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by david on 3/11/14.
 */
class AdminView extends View {
  public AdminView() {
    setLayout(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();

    /**
     constraints

     */
    constraints.weightx = 1.0;
    constraints.weighty = 1.0;
    //        constraints.gridwidth = 1;
    //    constraints.anchor = GridBagConstraints.NORTHEAST;
    constraints.fill = GridBagConstraints.BOTH;
    //    constraints.insets = new Insets(15, 15, 0, 2);
    constraints.ipadx = 5;
    constraints.ipady = 5;

    /**
     * adds the tabbed pane to the admin view
     */
    JTabbedPane adminView = new JTabbedPane(JTabbedPane.TOP);
    add(adminView, constraints);

    /**
     * creates the tab for holding the course related options
     */
    final JPanel course = new JPanel();
    adminView.addTab("Course", course);

    createNew = new JButton("Create New Course");
    course.add(createNew);

    JButton update = new JButton("Update a Course");
    course.add(update);

    //todo create an area to hold the sql return objects

    /**
     * creates the tab for holding the module related options
     */
    final JPanel module = new JPanel();
    adminView.addTab("Module", module);

    createNew = new JButton("Create New Module");
    module.add(createNew);

    update = new JButton("Update a Module");
    module.add(update);

    /**
     * creates the tab for holding the user related options
     */
    final JPanel user = new JPanel();
    adminView.addTab("User", user);

    createNew = new JButton("Create New User");
    user.add(createNew);

    update = new JButton("Update a User");
    user.add(update);
  }

}