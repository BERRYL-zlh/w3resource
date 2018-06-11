import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
		System.out.println("Input a number: ");
		int n = in.nextInt();
		if (isEqualHarshad(n)) {
			System.out.println(n+" is a Harshad Number.");
		}else {
			System.out.println(n+" is not a Harshad Number.");
		}
 }
 static boolean isEqualHarshad(int i){
		int len = String.valueOf(i).length();
		int sum = 0;
		for (int j = 0; j < len; j++) {
			sum +=Integer.parseInt(String.valueOf(i).substring(j, j+1));
		}
		if (i%sum==0) {
			return true;
		}
		return false;
	}
}