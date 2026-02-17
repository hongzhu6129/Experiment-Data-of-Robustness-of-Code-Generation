import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadPlainTextFile {

    public static void main(String[] args) {
        // Specify the path to your text file
        String filePath = "path/to/your/file.txt"; // Replace with the actual path

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
