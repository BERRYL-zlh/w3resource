import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  		Scanner in = new Scanner(System.in);
		System.out.println("Input a number: ");
		int n = in.nextInt();
		int half = n/2;
		boolean flag = true;
		
		for (int i = 1; i < half; i++) {
			if (i*(i+1)==n) {
				flag=true;
				System.out.println("Pronic Number.");
				break;
			}
			flag=false;
		}
		if (!flag) {
			System.out.println("not Pronic Number.");
		}
 }
}