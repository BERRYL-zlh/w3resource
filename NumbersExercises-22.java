import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Input a number: ");
    int n = in.nextInt();
    int nWith2 = n+1;
    int count = 0;
    while (nWith2>1) {
      if (nWith2%2==0) {
        nWith2 /=2;
        count++;
      }else{
        nWith2=0;
            }
      
    }
    if (isPrimeNumber(count)) {
      System.out.println(n+" is a Mersenne number.");
    }else {
      System.out.println(n+" is not a Mersenne number.");
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