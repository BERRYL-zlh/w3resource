import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
public class Main {
  public static void main(String[] args) throws IOException {
  		String fileName = "/Users/BERRYL/Desktop/file.txt";
		String strLine = "";
		String str_data = "";
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		while (strLine != null) {
			str_data += strLine;
			strLine = br.readLine();
		}
		System.out.println(str_data);
		br.close();
 }
}