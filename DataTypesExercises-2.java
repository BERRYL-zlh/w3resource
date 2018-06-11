import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
    System.out.print("Input a value for inch: ");
    double inchs = input.nextDouble();

    double  meters = 0.0254*inchs;
    System.out.println(inchs + " inch is " + meters + " meters");
 }
}