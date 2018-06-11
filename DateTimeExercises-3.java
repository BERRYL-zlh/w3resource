import java.util.Calendar;
public class Main {
  public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        
        int maxYear = cal.getActualMaximum(Calendar.YEAR);
        int maxMonth = cal.getActualMaximum(Calendar.MONTH) ;
        int maxWeek = cal.getActualMaximum(Calendar.WEEK_OF_YEAR) ;
        int maxDate = cal.getActualMaximum(Calendar.DATE) ;
        
        System.out.println("maxYear: "+ maxYear);
        System.out.println("maxMonth: "+ (maxMonth+1));
        System.out.println("maxWeek: "+ maxWeek);
        System.out.println("maxDate: "+maxDate);
 }
}