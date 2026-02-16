import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadPlainTextFile {

    public static void main(String[] args) {
        // 1. Specify the file path.
        String filePath = "path/to/your/textfile.txt"; // Replace with the actual path

        // 2. Use try-with-resources to handle file opening and closing automatically.
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            // 3. Read the file line by line.
            String line;
            while ((line = reader.readLine()) != null) {
                // 4. Process each line (e.g., print it).
                System.out.println(line); 

                //  Further processing can be done here, like:
                //  - Splitting the line into words.
                //  - Storing the lines in a data structure (List, array).
                //  - Searching for specific patterns.
                //  - ...
            }

        } catch (IOException e) {
            // 5. Handle potential exceptions (e.g., file not found).
            System.err.println("An error occurred while reading the file: " + e.getMessage());
            // You might want to log the exception or take other appropriate actions.
        }

        System.out.println("File reading complete.");
    }
}


