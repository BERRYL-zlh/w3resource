import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {
  public static void main(String[] args) throws FileNotFoundException {
      	String longest_word = "";
        String current;
        String fileName = "/Users/BERRYL/Desktop/file.txt";
        Scanner sc = new Scanner(new File(fileName));

        while (sc.hasNext()) {
           current = sc.next();
            if (current.length() > longest_word.length()) {
              longest_word = current;
            }
        }
          System.out.println(longest_word);
 }
}