import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.LineNumberReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
public class Main {
  public static void main(String[] args) throws IOException {
     String strLine = "";
     String fileName = "/Users/BERRYL/Desktop/file.txt";
     LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
     while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= 3){
        System.out.println(strLine);
    }
    reader.close();
 }
}