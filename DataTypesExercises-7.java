import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input distance in meters: ");
        double meters = input.nextInt();
        System.out.print("Input hour: ");
        double hour = input.nextInt();
		System.out.print("Input minutes: ");
        double minutes = input.nextInt();
        System.out.print("Input seconds: ");
        double seconds = input.nextInt();
          
        double allSeconds = hour*60*60+minutes*60+seconds;
        System.out.println("Your speed in meters/second is "+ meters/allSeconds);
        double km = meters/1000;
        double allHour = hour+minutes/60+seconds/(60*60);
        System.out.println("Your speed in km/h is "+ km/allHour);
        double miles = meters/1609;
        System.out.println("Your speed in miles/h is "+ miles/allHour);
  }
}