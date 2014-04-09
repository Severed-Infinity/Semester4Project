import com.project.database.*;
import com.project.gui.*;

public final class TimetableMain {
  public static void main(String[] args) {

    //    TimetableLogin login = new TimetableLogin();
    //    login.setVisible(true);

    DatabaseConnection testData = new DatabaseConnection("x00073017", "db03Dec91");
    MainWindow testMain = new MainWindow(testData);
    testMain.setVisible(true);

    //        JFrame testFrame = new JFrame();
    //        testFrame.setTitle( "Testing Frame for View" );
    //
    //        testFrame.setSize( 800, 900 );
    ////        testFrame.setResizable( false );
    //        testFrame.setLocationRelativeTo( null );
    //
    //        testFrame.getContentPane().setLayout( new BorderLayout() );
    //        //when testing just replace view with another
    //        testFrame.add( new CourseView(), BorderLayout.CENTER );
    //        testFrame.setVisible( true );
    //        testFrame.pack();

  }

}
