import java.math.BigInteger;

public class Main {
  public static void main(String[] args) {
  		System.out.println("List 10 Catalan numbers:");
		for (int i = 1; i <= 10; i++) {
			BigInteger n = BigInteger.ONE;
			for (int j = 2*i; j > i+1; j--) {
				n =n.multiply(BigInteger.valueOf(j));
			}
			for (int j = 1; j < i+1; j++) {
				n =n.divide(BigInteger.valueOf(j));
			}
			System.out.println(n);
		}
 }
}