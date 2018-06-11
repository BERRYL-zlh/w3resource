import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
		System.out.println("Input a number: ");
		int n = in.nextInt();
		if (isEqualDisarium(n)) {
			System.out.println("a Disarium Number");
		}else {
			System.out.println("not a Disarium Number");
		}
 }
 static boolean isEqualDisarium(int i){
		int len = String.valueOf(i).length();
		int sum = 0;
		for (int j = 0; j < len; j++) {
			sum +=Math.pow(Integer.parseInt(String.valueOf(i).substring(j, j+1)), j+1);
		}
		return sum == i;
	}
}