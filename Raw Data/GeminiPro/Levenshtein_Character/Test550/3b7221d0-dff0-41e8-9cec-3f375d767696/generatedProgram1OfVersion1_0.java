import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextFile {

    public static void main(String[] args) {
        String fileName = "my_text_file.txt"; 

        // Write to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("This is the first line.\n");
            writer.write("This is the second line.\n");
            writer.write("And this is the third.");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }

        // Read from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\nFile contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
