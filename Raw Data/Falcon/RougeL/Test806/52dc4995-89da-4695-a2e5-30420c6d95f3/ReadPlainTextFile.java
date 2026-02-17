import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadPlainTextFile {

    public static void main(String[] args) {
        String filePath = ""; // Replace with the actual path to your text file

        if (args.length > 0) { // Use command-line argument for file path if provided.
            filePath = args[0];
        }

        if (filePath.isEmpty()) {
            System.err.println("Please provide the file path as a command-line argument or specify it directly in the code.");
            return;  // Exit if no filepath.
        }



        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
