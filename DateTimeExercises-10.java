import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Main {
  public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
	
		cal.set(Calendar.DAY_OF_MONTH, 1);	
		DateFormat df = new SimpleDateFormat("EEE");
		
		System.out.println("firstDay: "+df.format(cal.getTime()));
		cal.add(Calendar.DATE, cal.getActualMaximum(Calendar.DAY_OF_MONTH)-1);
		System.out.println("lastDay: "+df.format(cal.getTime()));
		}
}