import java.util.Scanner;
import java.math.BigInteger;
public class Main {
  public static void main(String[] args) {
  Scanner in = new Scanner( System.in ); 
        System.out.print("Input a number: "); 
        String strnum = in.nextLine().trim();
        BigInteger n = new BigInteger(strnum);
        int sum = 0;
        for (int i = 0; i < strnum.length(); i++) {
			sum += Integer.parseInt(strnum.substring(i, i+1));
		}
        boolean flag = true;
        for(int i = 1 ; i < strnum.length()+1; i++) {
        	BigInteger mul = n.multiply(BigInteger.valueOf(i));
        	String mulStr = String.valueOf(mul);
        	int mulSum = 0;
        	if (mulStr.length()!=strnum.length()) {
        		System.out.println("Not a cyclic number.");
        		flag=false;
				break;
			}
        	 for (int j = 0; j < strnum.length(); j++) {
        		 mulSum += Integer.parseInt(mulStr.substring(j, j+1));
     		}
            if (mulSum!=sum ) {
            	flag=false;
            	System.out.println("Not a cyclic number.");
            	break;
			}
            flag = true;
        }
        if(flag) {
            System.out.println("It is a cyclic number.");
        }
        else {
            System.out.println("Not a cyclic number.");
        }        
 }
}