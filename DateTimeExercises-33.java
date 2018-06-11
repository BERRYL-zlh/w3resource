import java.time.*;
import java.time.temporal.TemporalAdjusters;
public class Main {
  public static void main(String[] args) {
    LocalDate date = LocalDate.now();    
    System.out.println("Previous Friday: "+date.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)));
    
    System.out.println("Next Friday: "+date.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
 }
}