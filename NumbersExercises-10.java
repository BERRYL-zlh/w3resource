import java.util.HashSet;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
		System.out.println("Input a number: ");
		int n = in.nextInt();
		if (isEqual1(n)) {
			System.out.println("happy Number");
		}else {
			System.out.println("Unhappy Number");
		}
 }
 static boolean isEqual1(long i){
		HashSet<Long> cycle = new HashSet<Long>();
		
		while (i!=1&&cycle.add(i)) {
			int len = String.valueOf(i).length();
			int sum = 0;
			for (int j = 0; j < len; j++) {
				sum +=Math.pow(Integer.parseInt(String.valueOf(i).substring(j, j+1)), 2);
			}
			i = sum;
		}
		return i==1;
	}
}