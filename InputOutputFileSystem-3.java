import java.io.File;

public class Main {
  public static void main(String[] args) {
  File file = new File("/Users/BERRYL/Desktop/file.txt");
        if (file.exists()) 
          {
           System.out.println("The directory or file exists.\n");
          } 
        else
         {
           System.out.println("The directory or file does not exist.\n");
         }
 }
}