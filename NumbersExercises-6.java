public class Main {
  public static void main(String[] args) {
      int count = 15;
    int i = 0;
    while (count>0) {
      if (isEqualSum(i)) {
        System.out.print(i + " ");
        i++;
        count--;
      }else 
        i++;
    }
 }
 static boolean isEqualSum(int i){
    if (i<0) {
      return false;
    }
    int len = String.valueOf(i).length();
    int sum = 0;
    for (int j = 0; j < len; j++) {
      sum +=Math.pow(Integer.parseInt(String.valueOf(i).substring(j, j+1)), len);
    }
    return sum==i;
  }
}