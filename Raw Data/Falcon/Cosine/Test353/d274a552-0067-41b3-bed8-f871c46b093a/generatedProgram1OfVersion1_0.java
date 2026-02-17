import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileReadWrite {

    public static void main(String[] args) {
        // File path (you can change this)
        String filePath = "example.txt";

        // --- Writing to a file ---
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("This is the first line.\n");
            writer.write("This is the second line.\n");
            writer.write("And this is the third line."); 
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }


        // --- Reading from a file ---
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("\nReading from the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading from the file: " + e.getMessage());
        }



        // Demonstrating appending to a file:
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) { // true enables append mode
            writer.newLine(); // Add a new line before appending.
            writer.write("This line is appended.");
            System.out.println("\nSuccessfully appended to the file.");

         } catch (IOException e) {
             System.err.println("An error occurred while appending to the file: " + e.getMessage());
         }



         // Read the file again to see the appended content:
         try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
             String line;
             System.out.println("\nReading the updated file:");
             while ((line = reader.readLine()) != null) {
                 System.out.println(line);
             }
         } catch (IOException e) {
             System.err.println("An error occurred while reading from the file: " + e.getMessage());
         } 
    }
}



