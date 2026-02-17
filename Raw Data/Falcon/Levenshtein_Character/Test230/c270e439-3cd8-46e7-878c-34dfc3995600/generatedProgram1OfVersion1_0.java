import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

    public static void main(String[] args) {
        String filePath = ""; // Replace with your file path

        if (args.length > 0) { // Allow passing the file path as a command-line argument
            filePath = args[0]; 
        } else {
            System.out.println("Please provide the file path as a command-line argument.");
            return; // Exit if no file path is provided
        }


        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
