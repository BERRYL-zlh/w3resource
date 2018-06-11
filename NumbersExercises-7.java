public class Main {
  public static void main(String[] args) {
      int n1 = 2,n2 = 1,n3=0;
    int count = 10;
    System.out.println("First ten Lucas a numbers: "); 
    System.out.print(n1+" "+n2+" ");
    for (int i = 0; i < 8; i++) {
      n3 = n1+n2;
      n1 = n2;
      n2 = n3;
      System.out.print(n3+" ");
    }
 }
}