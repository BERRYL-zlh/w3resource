import java.util.Calendar;
public class Main {
  public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        
        int minYear = cal.getActualMinimum(Calendar.YEAR);
        int minMonth = cal.getActualMinimum(Calendar.MONTH) ;
        int minWeek = cal.getActualMinimum(Calendar.WEEK_OF_YEAR) ;
        int minDate = cal.getActualMinimum(Calendar.DATE) ;
        
        System.out.println("minYear: "+ minYear);
        System.out.println("minMonth: "+ (minMonth+1));
        System.out.println("minWeek: "+ minWeek);
        System.out.println("minDate: "+minDate);
 }
}