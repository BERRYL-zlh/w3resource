import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws ParseException {
      Calendar cal = Calendar.getInstance();
      Scanner in = new Scanner(System.in); 
      System.out.println("input the specific date:");
      String str = in.next();
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      Date date = sdf.parse(str);
      cal.setTime(date);
        System.out.println("Day of the week : " + cal.get(Calendar.DAY_OF_WEEK)); 
 }
}