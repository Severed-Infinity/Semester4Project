package com.project.gui;

import com.project.database.*;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings ("serial")
class TimetableView extends View {
  TimetableView(final Timetable timetable) {
    super();

    final JPanel timetableView = new JPanel();
    //        mainView.add( timetableView, "name_109576600023605" );
    timetableView.setLayout(new GridLayout(5, 1, 5, 0));

    final JPanel monday = new JPanel();
    timetableView.add(monday);
    monday.setLayout(new GridLayout(0, 8, 5, 0));

    final JPanel tuesday = new JPanel();
    timetableView.add(tuesday);
    tuesday.setLayout(new GridLayout(0, 8, 5, 0));

    final JPanel wednesday = new JPanel();
    timetableView.add(wednesday);
    wednesday.setLayout(new GridLayout(0, 8, 5, 0));

    final JPanel thursday = new JPanel();
    timetableView.add(thursday);
    thursday.setLayout(new GridLayout(0, 8, 0, 0));

    final JPanel friday = new JPanel();
    timetableView.add(friday);
    friday.setLayout(new GridLayout(0, 8, 5, 0));
  }

}
