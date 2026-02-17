import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

    public static void main(String[] args) {
        StringBuilder fileContent = new StringBuilder();  // Use StringBuilder for efficient string concatenation

        try (BufferedReader reader = new BufferedReader(new FileReader("path/to/your/file.txt"))) { // Replace with your file path
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append(System.lineSeparator()); // Append each line and a newline
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            // Handle the exception appropriately (e.g., exit, log, etc.)
        }

        String fileContentAsString = fileContent.toString(); // Get the final string

        // Now you can use fileContentAsString, which contains the entire file content
        System.out.println(fileContentAsString); 
    }
}



