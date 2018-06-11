import java.time.*;
public class Main {
  public static void main(String[] args) {
       LocalDate today = LocalDate.now(); 
     System.out.println("today: "+today);
     System.out.println("10 days before today : "+today.plusDays(-10));
     System.out.println("10 days after today : "+today.plusDays(10));
 }
}