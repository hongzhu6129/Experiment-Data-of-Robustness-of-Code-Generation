import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ReadFileToByteArray {

    public static void main(String[] args) {
        try {
            // Specify the path to the file
            File file = new File("path/to/your/file.txt"); // Replace with your file path

            // Read the file contents into a byte array
            byte[] fileContent = Files.readAllBytes(file.toPath());

            // Print the byte array (optional - for verification)
            // You can process the byte array as needed
            System.out.println("File content as byte array:");
            for (byte b : fileContent) {
                System.out.print(b + " ");
            }
            System.out.println();


        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
