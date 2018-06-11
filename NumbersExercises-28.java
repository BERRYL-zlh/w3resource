public class Main {
  public static void main(String[] args) {
  		int n = 2;
		System.out.println("First Twenty Hamming numbers: "); 
		System.out.print(0+" "+1+" ");
		for (int i = 0; i <= 18;) {
			int num = n;
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
		        if(num == 1) {
		        	System.out.print(n+" ");
		        	i++;
		        }
		        n++;
		}
 }
}