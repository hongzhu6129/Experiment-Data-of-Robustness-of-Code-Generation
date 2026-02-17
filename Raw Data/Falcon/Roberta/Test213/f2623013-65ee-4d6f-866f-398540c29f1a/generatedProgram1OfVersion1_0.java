import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileToArray {

    public static void main(String[] args) {
        // 1. Declare the file path
        String filePath = "path/to/your/file.txt"; // Replace with your file's path

        // 2. Try-with-resources for automatic resource management (closes the file automatically)
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            // 3. Efficient way to read all lines into a List<String>
            List<String> lines = reader.lines().toList(); // Java 11+  for conciseness

            // ---Alternative (if you're using an older Java version):---
            // List<String> lines = new ArrayList<>();
            // String line;
            // while ((line = reader.readLine()) != null) {
            //     lines.add(line);
            // }

            // 4. Convert List<String> to a String array (if needed)
            String[] linesArray = lines.toArray(new String[0]);


            // 5. Print or process the array
            System.out.println("File content stored in an array:");

            for (String line : linesArray) { // Enhanced for loop (easier to read)
                System.out.println(line);
            }


             // --- Alternative printing using Arrays.toString() ---
            // System.out.println(Arrays.toString(linesArray));


        } catch (IOException e) {  // Handle potential exceptions (e.g., file not found)
            System.err.println("Error reading file: " + e.getMessage());
        }


        // Example of using a relative path:
        // If your "my_file.txt" is in the same directory as your Java source code:
        try (BufferedReader reader = new BufferedReader(new FileReader("my_file.txt"))) {
            List<String> lines = reader.lines().toList();
            // ... (process the lines)
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }


    }
}
