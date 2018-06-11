import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  		System.out.println("Input an integer number: ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

        while (num > 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else if(num % 3 == 0) {
                num = num / 3;
            } else if (num % 5 == 0) {
                num = num / 5;
            } else{
            	num=0;
            }
            	
        }
        if(num <= 0)  System.out.println("It is not an ugly number.");
        if(num == 1) System.out.println("It is an ugly number.");
 }
}