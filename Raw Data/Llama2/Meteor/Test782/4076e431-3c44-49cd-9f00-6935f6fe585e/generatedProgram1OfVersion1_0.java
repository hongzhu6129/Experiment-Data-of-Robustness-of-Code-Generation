import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

    public static void main(String[] args) {

        // 1. Specify the file path.
        String filePath = "path/to/your/file.txt"; // Replace with the actual path

        // 2. Use try-with-resources to automatically close the resources.
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            // 3. Read the file line by line.
            String line;
            while ((line = reader.readLine()) != null) {
                // 4. Process each line.  Here, we simply print it.
                System.out.println(line); 
            }

        } catch (IOException e) {
            // 5. Handle potential exceptions (e.g., file not found).
            System.err.println("Error reading file: " + e.getMessage());
        }


        // Example demonstrating how to use a different file path provided as a command-line argument:
        if (args.length > 0) {  // Check if a command-line argument is provided
            filePath = args[0];  // Use the first argument as the file path

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
            }
        } else {
            System.out.println("No file path provided as a command-line argument.");
        }



    }
}
