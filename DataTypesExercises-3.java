import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
    System.out.print("Input an integer between 0 and 1000: ");
    String nStr = input.next();
    int sum = 0;
    for (int i = 0; i < nStr.length(); i++) {
		sum += Integer.valueOf(String.valueOf(nStr.charAt(i)));
	}
    System.out.println("The sum of all digits in "+nStr+" is "+sum);}
}