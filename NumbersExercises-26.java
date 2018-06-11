import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
		System.out.println("Input a number: ");
		int n = in.nextInt();
		String nStr = String.valueOf(n);
		
		List<Integer> seq = new ArrayList<Integer>();
		for (int i = 0; i < nStr.length(); i++) {
			seq.add(Integer.parseInt(nStr.substring(i, i+1)));
		}
		int sum = seq.get(seq.size()-1);
		while (sum<n) {
			for (int i = 1; i <nStr.length(); i++) {
				sum +=seq.get(seq.size()-i-1);	
			}
			seq.add(sum);
		}
		if (seq.get(seq.size()-1)==n) {
			System.out.println("Keith Number");
		}else {
			System.out.println("not Keith Number");
		}
 }
}