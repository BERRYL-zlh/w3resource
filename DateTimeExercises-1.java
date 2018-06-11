import java.util.Calendar;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    		Scanner input = new Scanner(System.in);
		System.out.println("input date:");
		int year = input.nextInt();
		int month = input.nextInt();
		int date = input.nextInt();

	     Calendar cal = Calendar.getInstance();
	     cal.clear();
	     cal.set(Calendar.YEAR, year);
	     cal.set(Calendar.MONTH, month-1);
	     cal.set(Calendar.DATE, date);

	     System.out.println(cal.getTime());
	     System.out.println();
 }
}