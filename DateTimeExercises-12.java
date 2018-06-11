import java.util.Calendar;
import java.text.DateFormatSymbols;

public class Main {
  public static void main(String[] args) {
    DateFormatSymbols symbols = new DateFormatSymbols(); 
    String[] dayNames = symbols.getWeekdays();
    for (String s : dayNames) { 
    System.out.println(s);
    }
 }
}