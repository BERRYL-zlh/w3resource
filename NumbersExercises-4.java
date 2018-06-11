
public class Main {
  public static void main(String[] args) {
		for (int i = 1; i < 1000; i++) {
			String numStr =String.valueOf(i*i);
			if (numStr.length()<2) {
				if (i==i*i) {
					System.out.println(i+"    "+numStr+"    "+0+" + "+ i);
				}
			}
			for (int j = 1; j < numStr.length(); j++) {
				int n1 = Integer.valueOf(numStr.substring(0, j));
				int n2 = Integer.valueOf(numStr.substring(j, numStr.length()));
				if (n1+n2==i&&n1!=0&&n2!=0) {
					System.out.println(i+"    "+numStr+"    "+n1+" + "+n2);
				}
			}
		}
 }
}