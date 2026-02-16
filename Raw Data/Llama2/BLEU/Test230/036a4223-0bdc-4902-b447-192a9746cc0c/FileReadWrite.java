import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

    public static void main(String[] args) {
        // File path (you can change this)
        String filePath = "my_text_file.txt";

        try {
            // Writing to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write("This is the first line.\n");
            writer.write("This is the second line.\n");
            writer.write("And this is the third line.");
            writer.close();

            System.out.println("File written successfully!");

            // Reading from the file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            System.out.println("\nFile contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
