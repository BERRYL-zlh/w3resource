public class Main {
  public static void main(String[] args) {
  	int countDef = 0;
		int countPer = 0;
		int countAbu = 0;
		for (int i = 1; i <=10000; i++) {
			int sum = sum(i);
			if (sum < i)
				countDef++;
            else if (sum == i)
            	countPer++;
            else
            	countAbu++;
		}
		
		System.out.println("Number Counting [(integers) between 1 to 10,000]:");
		System.out.println("counting deficient number have "+ countDef);
		System.out.println("counting perfect number have "+ countPer);
		System.out.println("counting abundant number have "+ countAbu);
 }
 
 	public static int sum(long i) {
		int sum = 0;
		for (int j = 1; j <= (i+1)/2; j++) {
			if (i%j==0&& j != i) {
				sum +=j;
			}
		}
		return sum;
	}
}