import java.util.Calendar;
public class Main {
  public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(cal.getTime());
 }
}