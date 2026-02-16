import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoreFileContentInArray {

    public static void main(String[] args) {
        // Replace "your_file.txt" with the actual path to your text file.
        String filePath = "your_file.txt"; 

        try {
            List<String> lines = readLinesFromFile(filePath);

            // Convert the List to an array if needed.
            String[] linesArray = lines.toArray(new String[0]);

            // Print the array content (optional, for verification)
            System.out.println(Arrays.toString(linesArray)); 

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    private static List<String> readLinesFromFile(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }
}
