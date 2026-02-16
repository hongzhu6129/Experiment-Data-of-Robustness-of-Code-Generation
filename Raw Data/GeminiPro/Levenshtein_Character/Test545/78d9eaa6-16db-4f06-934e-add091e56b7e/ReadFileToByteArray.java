import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileToByteArray {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Please provide the file path as a command-line argument.");
            return;
        }

        String filePath = args[0];
        File file = new File(filePath);

        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] byteArray = fis.readAllBytes(); // Java 9+ simplified reading
            System.out.println("File contents successfully read into a byte array.");

            // Example: Print the size of the byte array
            System.out.println("Byte array size: " + byteArray.length);

             // Example:  Print a few bytes (for verification)
            //for(int i = 0; i < Math.min(10, byteArray.length); i++) {
            //    System.out.print(byteArray[i] + " "); 
            //}
            //System.out.println();


        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
