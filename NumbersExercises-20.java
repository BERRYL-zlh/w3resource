public class Main {
  public static void main(String[] args) {
  		double f1 = 3;
		double f2 ;
		int count = 10;
		System.out.println(f1);
		while (count>0) {
			f2 = (f1-1)*(f1-1)+1;
			f1 = f2;
			System.out.println(f2);
			count--;
		}
 }
}