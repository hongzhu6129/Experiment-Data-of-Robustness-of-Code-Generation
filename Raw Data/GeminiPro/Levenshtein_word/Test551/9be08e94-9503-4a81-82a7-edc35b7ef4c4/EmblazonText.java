import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EmblazonText {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the path to the existing file: ");
        String filePath = scanner.nextLine();

        System.out.print("Enter the text to emblazon: ");
        String emblazonText = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(filePath + ".emblazoned"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(emblazonText + line); // Prepend the emblazon text
                writer.newLine(); // Preserve original line breaks
            }

            System.out.println("Text emblazoned successfully to " + filePath + ".emblazoned");

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
          scanner.close(); // Close the scanner in the finally block
        }
    }
}
