import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCoatTextFile {

    public static void main(String[] args) {
        // Replace "path/to/your/coat.txt" with the actual path to your file.
        String filePath = "path/to/your/coat.txt"; 

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each line of the file
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
