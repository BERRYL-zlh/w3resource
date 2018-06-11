import java.io.File;

public class Main {
  public static void main(String[] args) {
      	File file = new File("/Users/BERRYL/Desktop");
        String[] list = file.list();
        for(String f:list){
        	if (f.endsWith(".txt")) {
        		System.out.println(f);
        	}  
        }
 }
}