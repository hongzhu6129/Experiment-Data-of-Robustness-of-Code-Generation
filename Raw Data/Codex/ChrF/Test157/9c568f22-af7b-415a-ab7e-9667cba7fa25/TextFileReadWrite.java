import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileReadWrite {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("mytextfile.txt"))) {
            System.out.println("Enter text to write to the file (or type 'quit' to finish):");
            String line;
            while (!(line = scanner.nextLine()).equalsIgnoreCase("quit")) {
                writer.write(line);
                writer.newLine(); // Add a new line after each input line
            }
            System.out.println("Text written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }


        // Read from file
        try (BufferedReader reader = new BufferedReader(new FileReader("mytextfile.txt"))) {
            System.out.println("\nReading from file:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }

        scanner.close(); // Close the scanner
    }
}
