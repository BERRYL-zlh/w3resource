import java.util.Scanner;
import java.util.Random;


public class Main {
  public static void main(String[] args) {
		System.out.print("Input the number for starting range: ");
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		System.out.print("Input the number for ending range: ");
		int end = in.nextInt();
		if (end<=start) {
			System.out.println("error range");
		}else {
			Random rand = new Random();  
			System.out.println(rand.nextInt(end-start+1)+start);
		}
 }
}