import java.io.File;

public class Main {
  public static void main(String[] args) {
  File file = new File("/Users/BERRYL/Desktop/file.txt");
		if (file.exists()) {
			String sizeInBytes = file.length() + " bytes";
			String sizeInKiloBytes = (double) file.length() / 1024 + "  kb";
			String sizeInMegaBytes = (double) file.length() / (1024 * 1024)
					+ " mb";
			System.out.println(sizeInBytes);
			System.out.println(sizeInKiloBytes);
			System.out.println(sizeInMegaBytes);
		} else
			System.out.println("File doesn't exist");
 }
}