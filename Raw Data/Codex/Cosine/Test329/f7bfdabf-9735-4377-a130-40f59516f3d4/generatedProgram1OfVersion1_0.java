import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileToArray {

    public static void main(String[] args) {
        // Replace "your_file.txt" with the actual path to your text file.
        String filePath = "your_file.txt"; 

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            List<String> lines = new ArrayList<>();  // Use a List to store lines dynamically
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            // Convert the List to an array if you absolutely need an array
            String[] linesArray = lines.toArray(new String[0]);

            // Print the array (or process it as needed)
            System.out.println(Arrays.toString(linesArray)); 

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
