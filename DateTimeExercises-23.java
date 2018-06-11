import java.time.*;
import java.time.temporal.TemporalAdjusters;
public class Main {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now(); 
     LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
     Period period = today.until(lastDayOfYear);
     System.out.println("Months remaining in the year: "+period.getMonths());	
 }
}