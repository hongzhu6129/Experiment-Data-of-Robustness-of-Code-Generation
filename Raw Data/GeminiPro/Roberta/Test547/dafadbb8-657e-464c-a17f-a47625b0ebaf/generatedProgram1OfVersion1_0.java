import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadPlainTextApplication {

    public static void main(String[] args) {
        // Replace "path/to/your/text/file.txt" with the actual path to your text file.
        String filePath = "path/to/your/text/file.txt"; 

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
