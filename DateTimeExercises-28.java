import java.util.Scanner;
import java.time.*;

public class Main {
  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Before houres and minutes: ");
	String time = in.next();
	String[] times = time.split(":");
	LocalDateTime dateTime = LocalDateTime.now().
	minusHours(Integer.valueOf(times[0])).minusMinutes(Integer.valueOf(times[1]));
	System.out.println("Current Date and Time:  " + LocalDateTime.now());  
	System.out.println("Before "+times[0]+" houres and "+times[1]+" minutes: " + dateTime+"\n"); 
 }
}