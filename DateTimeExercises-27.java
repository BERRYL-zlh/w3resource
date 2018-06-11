import java.time.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
	Scanner in = new Scanner(System.in);
	System.out.print("input the time with xx:xx:xx: ");
	String timeStr = in.next();
	String[] times = timeStr.split(":");
	LocalTime time = LocalTime.of(Integer.valueOf(times[0]), Integer.valueOf(times[1]), Integer.valueOf(times[2]));  

	System.out.println("Current Local time: " + time);
	System.out.println("Hour: " + time.getHour());
	System.out.println("Minue: " + time.getMinute()); 
	System.out.println("Second: " +time.getSecond()); 
 }
}