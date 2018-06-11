import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  		Scanner in = new Scanner(System.in);
		System.out.println("Input a number: ");
		int n = in.nextInt();
		int num = (int) Math.pow(n, 1.0/3.0);
		if (n==Math.pow(num, 3)) {
			System.out.print("Number is a cube.");
		}else {
			System.out.print("Number is not a cube.");
		}
 }
}