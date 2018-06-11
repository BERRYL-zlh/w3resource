import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	    System.out.print("the number: ");
        double val = input.nextDouble();

        System.out.printf("Square: %12.2f\n", val * val);
        System.out.printf("Cube: %14.2f\n", Math.pow(val, 3));
        System.out.printf("Fourth power: %6.2f\n", Math.pow(val, 4));
  }
}