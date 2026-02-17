import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LongestWordFinder {

    public static void main(String[] args) {
        LongestWordFinder finder = new LongestWordFinder();
        String longestWords = finder.findLongestWords();
        System.out.println("Longest word(s): " + longestWords);
    }

    public String findLongestWords() {
        String filePath = "input.txt"; // Replace with your file path
        List<String> longestWords = new ArrayList<>();
        int maxLength = 0;

        try {
            // Read all lines from the file
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            // Iterate through each line
            for (String line : lines) {
                // Split the line into words
                String[] words = line.split("\\s+"); // Split by whitespace

                // Iterate through each word
                for (String word : words) {
                    // Remove punctuation and convert to lowercase for fair comparison
                    String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

                    if (cleanedWord.length() > maxLength) {
                        // Found a new longest word
                        maxLength = cleanedWord.length();
                        longestWords.clear(); // Discard previous longest words
                        longestWords.add(cleanedWord);
                    } else if (cleanedWord.length() == maxLength) {
                        // Found another word with the same length
                        longestWords.add(cleanedWord);
                    }
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return ""; // Return empty string in case of error
        }


        return String.join(", ", longestWords);

    }
}
