import java.time.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
	LocalDate date = LocalDate.now();
	Month month = date.getMonth();
	System.out.println("\nInteger value of the current month: " + month.getValue());
	System.out.println("Length of the current month: " + month.minLength());
	System.out.println("Maximum length of the current month: " + month.maxLength()); 
	System.out.println("First month of the Quarter: " + month.firstMonthOfQuarter()+"\n"); 


	Scanner in = new Scanner(System.in);
	System.out.print("input the given month: ");
	int monthInt = in.nextInt();
	Month monthGiven = Month.of(monthInt);
	System.out.println("\nInteger value of the given month: " + monthGiven.getValue());
	System.out.println("Length of the given month: " + monthGiven.minLength());
	System.out.println("Maximum length of the given month: " + monthGiven.maxLength()); 
	System.out.println("First month of the Quarter: " + monthGiven.firstMonthOfQuarter()+"\n"); 

	
  }
}