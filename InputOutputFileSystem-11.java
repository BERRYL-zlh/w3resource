import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Main {
  public static void main(String[] args)  throws IOException {
      	String fileName = "/Users/BERRYL/Desktop/file.txt";
    	BufferedReader br = null;
        String strLine = "";
		br = new BufferedReader( new FileReader(fileName));
		while( (strLine = br.readLine()) != null){
            System.out.println(strLine);
        }
        br.close();
 }
}