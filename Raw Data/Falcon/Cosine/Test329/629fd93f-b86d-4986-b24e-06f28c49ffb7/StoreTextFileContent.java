import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StoreTextFileContent {

    public static void main(String[] args) {
        // Specify the path to your text file
        String filePath = "path/to/your/file.txt"; // Replace with your file path

        // Use a List<String> to store the lines. ArrayList is a good implementation.
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        // Now 'lines' contains each line of the file as a separate String.

        // You can access the lines using various methods provided by the List interface:

        // Print the lines to the console:
        System.out.println("Lines from the file:");
        for (String l : lines) {
            System.out.println(l);
        }

        // Access a specific line (e.g., the 3rd line - remember that indexing starts at 0):
        if (lines.size() >= 3) {
            System.out.println("\nThird line: " + lines.get(2));
        }


        //  Do further processing with the 'lines' list as needed.  For example:

        // Count the number of lines:
        System.out.println("\nNumber of lines: " + lines.size());


        // Search for a specific word or pattern in the lines:
        String searchTerm = "example"; // Replace with your search term
        for(String l : lines) {
            if(l.contains(searchTerm)) {
                System.out.println("\nLine containing '" + searchTerm + "': " + l);
            }
        }


    }
}
