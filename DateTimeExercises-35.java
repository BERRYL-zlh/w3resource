import java.util.*;
import java.text.*;
public class Main {
  public static void main(String[] args) {
  try {    
      String originalString = "2018-06-07 09:00:02";
      Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(originalString);
      String dateStr = new SimpleDateFormat("yyyy-MM-dd").format(date);
       System.out.println("the date is:"+dateStr);
      String timeStr = new SimpleDateFormat("HH:mm:ss").format(date);
       System.out.println("the time is:"+timeStr);
      } 
    catch (ParseException e) {
    //Handle exception here
     e.printStackTrace();
     }
 }
}