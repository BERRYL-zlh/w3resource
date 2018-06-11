import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
		System.out.println("Input a number: ");
		int n = in.nextInt();
		String nSqu = String.valueOf(n*n);
		if (nSqu.endsWith(String.valueOf(n))) {
			System.out.println("Automorphic Number.");
		}else {
			System.err.println("not Automorphic Number.");
		}
 }
}