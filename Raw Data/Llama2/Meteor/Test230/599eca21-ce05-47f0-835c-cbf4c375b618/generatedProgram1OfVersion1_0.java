import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {

    public static void main(String[] args) {
        String filePath = "path/to/your/file.txt"; // Replace with your file path
        String textToAppend = "This is the text to append.";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.newLine(); // Add a newline before appending (optional, but often desirable)
            writer.write(textToAppend);
            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while appending text: " + e.getMessage());
        }
    }
}
