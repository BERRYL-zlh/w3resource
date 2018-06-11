import java.time.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
	Scanner in = new Scanner(System.in);
	System.out.print("input the given year: ");
	int yearInt = in.nextInt();
	Year yearGiven = Year.of(yearInt);
	System.out.println("\nGiven Year: " + yearGiven);  
	System.out.println("Is given year leap year? " + yearGiven.isLeap()); 
	System.out.println("Length of the given year: " + yearGiven.length()+" days"); 

	Year yearCur = Year.now();
	System.out.println("\nCurrent Year: " + yearCur);  
	System.out.println("Is current year leap year? " + yearCur.isLeap());  
	System.out.println("Length of the current year: " + yearCur.length()+" days"); 
 }
}