package com.project.gui;

import com.project.constants.*;
import com.project.database.*;
import com.project.gui.MainWindow.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by david on 3/11/14.
 */
class AdminView extends View {
  private static final long serialVersionUID = 5635241602578233675L;

  AdminView(User user) {
    super();
    this.setLayout(new GridBagLayout());
    final GridBagConstraints constraints = new GridBagConstraints();
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
    final JTabbedPane adminView = new JTabbedPane(SwingConstants.TOP);
    this.add(adminView, constraints);
    /**
     * creates the tab for holding the course related options
     */
    final JPanel course = new JPanel();
    adminView.addTab(StringConstants.COURSE, course);
    this.createNew = new JButton(StringConstants.CREATE_NEW_COURSE);
    course.add(this.createNew);
    JButton update = new JButton(StringConstants.UPDATE_A_COURSE);
    course.add(update);
    //todo create an area to hold the sql return objects
    /**
     * creates the tab for holding the module related options
     */
    final JPanel module = new JPanel();
    adminView.addTab(StringConstants.MODULE, module);
    this.createNew = new JButton(StringConstants.CREATE_NEW_MODULE);
    module.add(this.createNew);
    update = new JButton(StringConstants.UPDATE_A_MODULE);
    module.add(update);
    /**
     * creates the tab for holding the user related options
     */
    final JPanel userPanel = new JPanel();
    adminView.addTab(StringConstants.USER, userPanel);
    this.createNew = new JButton(StringConstants.CREATE_NEW_USER);
    createNew.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {
        AdminView.this.setCreateNewPanel(new JFrame());
        final JFrame newPanel = AdminView.this.getCreateNewPanel();
        newPanel.add(new UserView());
      }
    });
    userPanel.add(this.createNew);
    update = new JButton(StringConstants.UPDATE_A_USER);
    update.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(final ActionEvent e) {
        new MainView(user, new UpdateUserView());
      }
    });
    userPanel.add(update);
  }

}