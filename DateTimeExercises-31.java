import java.time.*;
import java.util.*;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

	LocalTime pTime = LocalTime.of(1, 30, 59, 11001);
	LocalTime dateTime2 = LocalTime.now();
	int diffInNano = java.time.Duration.between(pTime, dateTime2).getNano();
	long diffInSeconds = java.time.Duration.between(pTime, dateTime2).getSeconds();
	long diffInMilli = java.time.Duration.between(pTime, dateTime2).toMillis();
	long diffInMinutes = java.time.Duration.between(pTime, dateTime2).toMinutes();
	long diffInHours = java.time.Duration.between(pTime, dateTime2).toHours();
	System.out.printf("\nDifference is %d Hours, %d Minutes, %d Milli, %d Seconds and %d Nano\n\n", 
	           diffInHours, diffInMinutes, diffInMilli, diffInSeconds, diffInNano );

 }
}