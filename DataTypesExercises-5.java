import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the time zone offset to GMT: ");
        long timeZoneChange = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date(totalMilliseconds);
        System.out.println("Current time is " + formatter.format(date));
 
  }
}