import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

	    System.out.print("Input 1st integer: ");
        int val1 = input.nextInt();
        System.out.print("Input 2nd integer: ");
        int val2 = input.nextInt();

        System.out.printf("Sum of two integers: %d\n",val1+val2);
        System.out.printf("Difference of two integers: %d\n",Math.abs(val1-val2));
        System.out.printf("Product of two integers: %d\n",val1*val2);
        System.out.printf("Average of two integers: %.2f\n",(double)(val1+val2)/2);
        System.out.printf("Distance of two integers: %d\n",Math.abs(val1-val2));
        System.out.printf("Max integer: %d\n",Math.max(val1,val2));
        System.out.printf("Min integer: %d\n",Math.min(val1,val2));
  }
}