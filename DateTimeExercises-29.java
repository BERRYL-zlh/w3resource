import java.time.*;
import java.util.*;
import java.time.format.DateTimeFormatter;
public class Main {
  public static void main(String[] args) {
   String string = "Jun 7, 2018";
   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy", Locale.ENGLISH);
   LocalDate date = LocalDate.parse(string, formatter);
   System.out.println(date);
 }
}