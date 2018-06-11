import java.io.File;

public class file {
	
	
    public static void main(String a[])
    {
       File file = new File("/Users/BERRYL/Desktop");
       String[] fileList = file.list();
       for(String name:fileList){
           System.out.println(name);
       }
   }
}