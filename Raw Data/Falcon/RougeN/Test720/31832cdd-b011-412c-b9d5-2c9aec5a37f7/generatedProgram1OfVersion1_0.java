import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoreTextInArray {

    public static void main(String[] args) {
        // Replace "your_text_file.txt" with the actual path to your text file
        String filePath = "your_text_file.txt"; 

        try {
            List<String> lines = readLinesFromFile(filePath);

            // Convert List<String> to String[] if needed
            String[] linesArray = lines.toArray(new String[0]); 

            // Print the array contents (optional)
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
