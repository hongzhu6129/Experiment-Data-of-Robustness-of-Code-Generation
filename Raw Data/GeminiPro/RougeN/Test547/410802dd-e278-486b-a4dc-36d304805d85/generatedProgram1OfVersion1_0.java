import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

    public static void main(String[] args) {

        // 1. Specify the file path.
        String filePath = "path/to/your/textfile.txt"; // Replace with your file's path

        // 2. Use try-with-resources to handle file opening and closing automatically.
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            // 3. Read the file line by line.
            String line;
            while ((line = reader.readLine()) != null) {
                // 4. Process each line (e.g., print it, store it in a list, etc.).
                System.out.println(line); 
            }

        } catch (IOException e) {
            // 5. Handle potential exceptions (e.g., file not found).
            System.err.println("Error reading the file: " + e.getMessage());
        }

        // ---  Alternative way using java.nio.file (Java 7 and later)  ---
        // This method is generally preferred for its simpler exception handling
        // and better performance for large files.
        /*
        Path path = Paths.get("path/to/your/textfile.txt");
        try {
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8); // Specify character encoding if needed
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        */

    }
}



