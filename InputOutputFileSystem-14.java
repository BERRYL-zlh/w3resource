import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
  public static void main(String[] args)  throws IOException {
          StringBuilder sb = new StringBuilder();
        String fileName = "/Users/BERRYL/Desktop/file.txt";
        String strLine = "";
        List<String> list = new ArrayList<String>();
             BufferedReader br = new BufferedReader(new FileReader(fileName));
              while (strLine != null)
               {
                strLine = br.readLine();
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                if (strLine==null)
                   break;
                list.add(strLine);
            }
         System.out.println(Arrays.toString(list.toArray()));
         br.close();
 }
}