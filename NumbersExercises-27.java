import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  		Scanner in = new Scanner(System.in);
		System.out.println("Input a number: ");
		int n = in.nextInt();
		String nStr = String.valueOf(n);
		
		boolean flag = true;
		if (!isPrimeNumber(n)) {
			flag = false;
		}else {
			String nextNStr = nStr;
			for (int i = 0; i < nStr.length(); i++) {
				nextNStr = nextNStr.substring(1)+nextNStr.substring(0, 1);
				System.out.println(nextNStr);
				if (!isPrimeNumber(Integer.parseInt(nextNStr))) {
					flag = false;
					break;
				}
			}
		}
		System.out.println();
		if (flag) {
			System.out.println(nStr+" is a Circular Prime number.");
		}else {
			System.out.println(nStr+" is not a Circular Prime number.");
		}
 }
 public static boolean isPrimeNumber(int num){  
	    if(num == 2) return true;//2特殊处理  
	    if(num < 2 || num % 2 == 0) return false;//识别小于2的数和偶数  
	    for(int i=3; i<=Math.sqrt(num); i+=2){  
	        if(num % i == 0){//识别被奇数整除  
	            return false;  
	        }  
	    }  
	    return true;  
	}  
}