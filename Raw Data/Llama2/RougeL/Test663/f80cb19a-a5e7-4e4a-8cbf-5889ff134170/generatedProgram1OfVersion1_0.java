import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFirstThreeLines {

    public static void main(String[] args) {
        String filePath = ""; // Replace with the actual file path

        if (args.length > 0) {
            filePath = args[0];  // Get file path from command-line arguments if provided
        } else {
            System.out.println("Please provide the file path as a command-line argument.");
            return; // Exit if no file path is given.
        }


        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            for (int i = 0; i < 3; i++) {
                String line = reader.readLine();
                if (line == null) { // Check for end of file before printing
                    break;          // Exit loop if end of file is reached
                }
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
