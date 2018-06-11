import java.util.*;
import java.text.*;
public class Main {
  public static void main(String[] args) {
  long unix_seconds = 1372339860;
  Date date = new Date(unix_seconds*1000L); 
   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
   sdf.setTimeZone(TimeZone.getTimeZone("GMT-8"));
   System.out.println(sdf.format(date));
 }
}