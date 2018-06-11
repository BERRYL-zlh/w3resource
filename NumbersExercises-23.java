public class Main {
  public static void main(String[] args) {
  		for (int i = 1; i < 1000; i++) {
			int len = String.valueOf(i).length();
			int sum = 0;
			for (int j = 0; j < len; j++) {
				sum +=Math.pow(Integer.parseInt(String.valueOf(i).substring(j, j+1)), len);
			}
			if (sum==i) {
				System.out.println(i);
			}
		}
 }
}