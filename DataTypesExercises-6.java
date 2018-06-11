import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input weight in pounds: ");
        double weight = input.nextInt()*0.4535;
        System.out.print("Input height in inches: ");
        double height = input.nextInt()*0.0254;
        
        double BMI = weight/(height*height);
        System.out.println("Body Mass Index is " + BMI);
  }
}