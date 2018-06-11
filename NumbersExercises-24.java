import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  		Scanner in = new Scanner(System.in);
		System.out.println("Input a number: ");
		int n = in.nextInt();
		String nStr = String.valueOf(n);
		String nStrRev = new StringBuilder(nStr).reverse().toString();
		if (nStr.equals(nStrRev)) {
			System.out.println("It is a Palindrome number. ");
		}else {
			System.out.println("It is not a Palindrome number. ");
		}
 }
}