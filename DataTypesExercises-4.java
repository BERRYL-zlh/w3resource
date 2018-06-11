import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
    System.out.print("Input the number of minutes: ");
    int minutes = input.nextInt();
    int days = minutes/60/24;
    int years = days/365;
    days = days-years*365;
    System.out.println(minutes+" minutes is approximately "+years+" years and "+days+" days");

  }
}