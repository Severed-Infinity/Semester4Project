import com.project.gui.*;

final class TimetableMain {
  public static void main(String[] args) {

    try {
      TimetableLogin login = new TimetableLogin();
      login.setVisible(true);
    } catch (Exception e) {
      e.printStackTrace();
    } catch (Throwable throwable) {
      throwable.printStackTrace();
    }

  }

}
