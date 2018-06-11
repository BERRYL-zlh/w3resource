import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  		Scanner in = new Scanner(System.in);
		System.out.println("Input the first number: ");
		int n1 = in.nextInt();
		System.out.println("Input the second number: ");
		int n2 = in.nextInt();
		
		if (sumForN(n1)==n2&&sumForN(n2)==n1) {
			System.out.println("These numbers are amicable.");
		}else {
			System.out.println("These numbers are not amicable.");
		}
 }
 	static int sumForN(int n){
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n%i==0) {
				sum +=i;
			}
		}
		return sum;
	}
}