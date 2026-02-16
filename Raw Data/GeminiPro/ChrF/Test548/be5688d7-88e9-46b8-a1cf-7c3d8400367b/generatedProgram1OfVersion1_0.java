import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

    public static void main(String[] args) {
        String filePath = ""; // Replace with the actual file path

        if (args.length > 0) {
            filePath = args[0]; // Get file path from command-line arguments
        } else {
            System.err.println("Please provide the file path as a command-line argument.");
            return; // Exit if no file path is provided
        }
        

        StringBuilder fileContent = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append(System.lineSeparator()); // Append each line to the StringBuilder
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return; // Exit if an error occurs
        }

        String fileData = fileContent.toString(); // Store the entire file content in a String variable
        System.out.println(fileData); // Print the file content (optional)


    }
}
