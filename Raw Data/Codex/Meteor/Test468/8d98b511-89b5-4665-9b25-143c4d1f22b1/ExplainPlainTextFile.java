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
            int totalLines = 0;
            int totalWords = 0;
            int totalCharacters = 0;


            while ((line = reader.readLine()) != null) {
                totalLines++;
                int wordsInLine = line.split("\\s+").length;  // Split by whitespace
                totalWords += wordsInLine;
                totalCharacters += line.length(); // Count characters in the line

                //  Optionally print or process each line:
                // System.out.println("Line " + lineNumber + ": " + line);
                lineNumber++;
            }


            System.out.println("File Analysis of: " + filename);
            System.out.println("Total lines: " + totalLines);
            System.out.println("Total words: " + totalWords);
            System.out.println("Total characters (including whitespace): " + totalCharacters);

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}




