import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException{
      	BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input message : ");
        String message = R.readLine();
        System.out.println("message: " + message);
 }
}