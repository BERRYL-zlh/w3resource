import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
public class Main {
  public static void main(String[] args) throws IOException {
      	StringBuilder sb = new StringBuilder();
        String strLine = "";
        	 String fileName = "/Users/BERRYL/Desktop/file.txt";
        	 FileWriter fw = new FileWriter(fileName,true); 
             fw.write("append write file\n");
             fw.close();
             BufferedReader br = new BufferedReader(new FileReader(fileName));
             while (strLine != null)
             {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
             br.close();  
 }
}