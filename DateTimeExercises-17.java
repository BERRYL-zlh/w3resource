import java.util.Calendar;

public class Main {
  public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        System.out.println("the current time: "+cal.getTime());
        cal.add(Calendar.YEAR, 1);
        System.out.println("the next 1 year time: "+cal.getTime());
        cal.add(Calendar.YEAR, -2);
        System.out.println("the pre 1 year time: "+cal.getTime());
 }
}