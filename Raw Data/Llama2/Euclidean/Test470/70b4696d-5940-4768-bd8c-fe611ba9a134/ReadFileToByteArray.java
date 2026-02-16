import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFileToByteArray {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java ReadFileToByteArray <filename>");
            System.exit(1);
        }

        String filename = args[0];

        try {
            byte[] byteArray = Files.readAllBytes(Paths.get(filename));

            System.out.println("File contents read into byte array successfully.");

            // Example: Print the size of the byte array.  You can process it further as needed.
            System.out.println("Byte array size: " + byteArray.length);
            
             // Example: print a few bytes (for debugging - be careful with large files)
            //for (int i = 0; i < Math.min(byteArray.length, 10); i++) {
            //    System.out.print(byteArray[i] + " ");
            //}
            //System.out.println();

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.exit(1); // Indicate an error.
        }
    }
}
