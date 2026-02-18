import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StoreTextFileContent {

    public static void main(String[] args) {
        // Replace "your_file.txt" with the actual path to your text file
        String filePath = "your_file.txt"; 

        List<String> lines = readLinesFromFile(filePath);

        if (lines != null) {
            // Now you have the lines in the 'lines' List
            System.out.println("File content stored successfully:");
            for (String line : lines) {
                System.out.println(line);
            }
        }
    }


    private static List<String> readLinesFromFile(String filePath) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return null; // Indicate an error
        }
        return lines;
    }
}
