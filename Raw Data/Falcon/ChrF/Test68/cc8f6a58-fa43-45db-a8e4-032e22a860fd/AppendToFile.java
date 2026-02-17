import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {

    public static void main(String[] args) {
        String filePath = "path/to/your/file.txt"; // Replace with the actual file path
        String textToAppend = "This is the text to append.\n"; // Text to append, including a newline

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(textToAppend);
            System.out.println("Text appended successfully!");
        } catch (IOException e) {
            System.err.println("An error occurred while appending to the file: " + e.getMessage());
        }
    }
}
