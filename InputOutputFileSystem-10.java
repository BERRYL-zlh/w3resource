import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
public class Main {
  public static void main(String[] args) throws IOException{
      	String fileName = "/Users/BERRYL/Desktop/file.txt";
    	InputStream ins = null;
    	try {
			ins = new FileInputStream(fileName);
			byte file_content[] = new byte[2*1024];
            int read_count = 0;
            while((read_count = ins.read(file_content)) > 0){
                System.out.println(new String(file_content, 0, read_count-1));
            }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(ins != null) ins.close();
		}
 }
}