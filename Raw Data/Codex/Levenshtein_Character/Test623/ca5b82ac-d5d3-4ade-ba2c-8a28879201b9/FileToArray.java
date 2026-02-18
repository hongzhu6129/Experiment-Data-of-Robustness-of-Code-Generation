import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileToArray {

    public static void main(String[] args) {
        String filePath = "path/to/your/textfile.txt"; // Replace with the actual path to your file
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            // Handle the exception appropriately, e.g., exit the program or display an error message.
            return; // Exit main if there's an error
        }

        // Convert the List to an array if needed:
        String[] linesArray = lines.toArray(new String[0]);


        // Print or process the array content
        System.out.println("File content stored in array:");
        for (String storedLine : linesArray) {
            System.out.println(storedLine);
        }

    }
}
