import java.time.*;
import java.util.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("input your birthday with xxxx-xx-xx :");
    String preDate = in.next();
    String[] preDates = preDate.split("-");
    LocalDate pdate = LocalDate.of(Integer.valueOf(preDates[0]), Integer.valueOf(preDates[1]), Integer.valueOf(preDates[2])); 
    LocalDate now = LocalDate.now();
    
    Period diff = Period.between(pdate, now);
    
    System.out.printf("\nI am  %d years, %d months and %d days old.", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
    
  }
}