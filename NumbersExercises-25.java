public class Main {
  public static void main(String[] args) {
  		int n1 = 0,n2 = 1,n3=0;
		System.out.println("First 20 Pell numbers: "); 
		System.out.print(n2+" ");
		for (int i = 0; i <= 18; i++) {
			n3 = n1+n2*2;
			n1 = n2;
			n2 = n3;
			System.out.print(n3+" ");
		}
 }
}