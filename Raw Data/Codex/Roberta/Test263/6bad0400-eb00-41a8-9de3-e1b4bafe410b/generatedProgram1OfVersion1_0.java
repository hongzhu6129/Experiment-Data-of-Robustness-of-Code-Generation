import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {

    public static void main(String[] args) {

        // Specify the path to the file you want to append to.
        String filePath = "my_file.txt";  // Replace with your file path

        // The text you want to append to the file.
        String textToAppend = "This is the text to append.\n"; //  \n adds a newline

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            // FileWriter(filePath, true) -  "true" enables append mode

            // Write the text to the file.
            writer.write(textToAppend);

            System.out.println("Text appended successfully to " + filePath);

        } catch (IOException e) {
            System.err.println("An error occurred while appending to the file: " + e.getMessage());

            // More robust error handling (e.g., logging, retrying, etc.) could be added here
            // based on the specific needs of your application.
            e.printStackTrace(); // Print the stack trace for debugging
        }
    }
}


