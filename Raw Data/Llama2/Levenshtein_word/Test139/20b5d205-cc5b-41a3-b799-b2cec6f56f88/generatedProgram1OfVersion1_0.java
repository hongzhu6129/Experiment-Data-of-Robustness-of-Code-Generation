import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoreFileInArray {

    public static void main(String[] args) {
        // Replace "your_file.txt" with the actual path to your text file
        String filePath = "your_file.txt";

        try {
            // Method 1: Using BufferedReader and ArrayList (dynamic sizing)
            List<String> linesList = new ArrayList<>();
            BufferedReader reader1 = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader1.readLine()) != null) {
                linesList.add(line);
            }
            reader1.close();

            // Convert ArrayList to array (if needed)
            String[] linesArray1 = linesList.toArray(new String[0]);
            System.out.println("Method 1 (ArrayList then Array): " + Arrays.toString(linesArray1));


            // Method 2: Reading all lines at once using Files.readAllLines (Java 7+)
            // More concise, but may be less memory-efficient for very large files
            // Requires Java 7 or later

            List<String> linesList2 = java.nio.file.Files.readAllLines(java.nio.file.Paths.get(filePath));
            String[] linesArray2 = linesList2.toArray(new String[0]); 
             System.out.println("Method 2 (Files.readAllLines): " + Arrays.toString(linesArray2));


        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

    }
}
