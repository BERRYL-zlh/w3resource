import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

	    System.out.print("Input six non-negative digits:");
        String digits = input.next();
        
        for (int i = 0; i < digits.length(); i++) {
        	System.out.print(digits.charAt(i)+" ");	
		}
  }
}