import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EmblazonText {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java EmblazonText <filename>");
            return;
        }

        String filename = args[0];

        try (Scanner scanner = new Scanner(System.in);
             BufferedReader reader = new BufferedReader(new FileReader(filename));
             BufferedWriter writer = new BufferedWriter(new FileWriter(filename + ".emblazoned"))) {

            System.out.print("Enter text to emblazon: ");
            String emblazonText = scanner.nextLine();

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(emblazonText + line); // Prepend the emblazon text
                writer.newLine();
            }
            System.out.println("File emblazoned successfully.  Output written to: " + filename + ".emblazoned");


        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }


    }
}
