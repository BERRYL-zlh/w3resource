import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
		System.out.println("Input a number: ");
		int n = in.nextInt();
		boolean flag = true;
		String nStr = String.valueOf(n);
		for (int i = 1; i < nStr.length(); i++) {
			if (nStr.charAt(i)=='0') {
				flag = true;
				System.out.println("Duck number");
				break;
			}
			flag = false;
		}
		if (!flag) {
			System.out.println("not Duck Number.");
		}
 }
}