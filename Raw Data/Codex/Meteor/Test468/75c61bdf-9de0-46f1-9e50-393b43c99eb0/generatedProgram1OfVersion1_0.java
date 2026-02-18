import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExplainPlainTextFile {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ExplainPlainTextFile <filename>");
            return;
        }

        String filename = args[0];

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                // Basic explanation: Print the line number and the line content.
                System.out.println("Line " + lineNumber + ": " + line);

                // Add more sophisticated explanations here based on the content of the file.
                // Example: Check for specific keywords, count words, analyze sentence structure, etc.

                // Example of a simple word count:
                String[] words = line.split("\\s+"); // Split the line into words
                System.out.println("    Word count: " + words.length);



                lineNumber++;

                 //Example: Check for specific keywords
                if (line.contains("error") || line.contains("warning")) {
                    System.out.println("    Potential issue detected on this line!");
                }

            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
