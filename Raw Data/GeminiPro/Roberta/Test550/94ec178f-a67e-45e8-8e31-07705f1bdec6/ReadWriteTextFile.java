import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextFile {

    public static void main(String[] args) {
        String fileName = "example.txt"; // File name

        // Writing to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("This is the first line.\n");
            writer.write("This is the second line.\n");
            writer.write("And this is the third line."); 
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }


        // Reading from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\nFile contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }


    }
}
