import java.util.Calendar;

public class Main {
  public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        System.out.println("the current time: "+cal.getTime());
        cal.add(Calendar.HOUR_OF_DAY, 1);
        System.out.println("the added time: "+cal.getTime());
 }
}