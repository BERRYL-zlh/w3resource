import java.util.Calendar;
public class Main {
  public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Current full date and time is : " + cal.get(Calendar.YEAR) + "-"
                + cal.get(Calendar.DATE) + "-" + (cal.get(Calendar.MONTH) + 1) + " "
                + cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":"
                + cal.get(Calendar.SECOND));    
 }
}