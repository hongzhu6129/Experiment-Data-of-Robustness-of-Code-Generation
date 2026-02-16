import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadPlainCopyFile {

    public static void main(String[] args) {
        // Replace "path/to/your/file.txt" with the actual path to your file
        String filePath = "path/to/your/file.txt"; 

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each line of the file
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
