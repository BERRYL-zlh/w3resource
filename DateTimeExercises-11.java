import java.util.Calendar;

public class Main {
  public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("the number of days of a month: "+cal.getActualMaximum(Calendar.DAY_OF_MONTH));
 }
}