import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LongestWordInFile {

    public static void main(String[] args) {
        LongestWordInFile lwf = new LongestWordInFile();
        String longestWords = lwf.findLongestWords();
        System.out.println("Longest word(s): " + longestWords); 
    }

    public String findLongestWords() {
        String filePath = "input.txt"; // Replace with your file path
        List<String> longestWords = new ArrayList<>();
        int maxLength = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words using whitespace as a delimiter
                String[] words = line.split("\\s+"); 

                for (String word : words) {
                    // Remove punctuation and convert to lowercase for fair comparison
                    String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

                    if (cleanedWord.length() > maxLength) {
                        longestWords.clear(); // Start a new list of longest words
                        longestWords.add(cleanedWord);
                        maxLength = cleanedWord.length();
                    } else if (cleanedWord.length() == maxLength) {
                        longestWords.add(cleanedWord); // Add to the list if equal in length
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return ""; // Return empty string in case of error
        }

        return String.join(", ", longestWords); // Return comma-separated longest words
    }
}
