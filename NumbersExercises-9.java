import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
 int count = 10;
		int i = 0;
		while (count>0) {
			if (isEqual1(i)) {
				System.out.print(i + " ");
				i++;
				count--;
			}else 
				i++;
		}
 }
 static boolean isEqual1(long i){
		HashSet<Long> cycle = new HashSet<Long>();
		
		while (i!=1&&cycle.add(i)) {
			int len = String.valueOf(i).length();
			int sum = 0;
			for (int j = 0; j < len; j++) {
				sum +=Math.pow(Integer.parseInt(String.valueOf(i).substring(j, j+1)), 2);
			}
			i = sum;
		}
		return i==1;
	}
}