import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split by whitespace

                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z]", ""); // Remove non-alphabetic characters

                    if (word.length() > maxLength) {
                        longestWords.clear();
                        longestWords.add(word);
                        maxLength = word.length();
                    } else if (word.length() == maxLength && !word.isEmpty()) {  //Handle empty words and multiple longest words
                        longestWords.add(word);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return ""; // Return empty string in case of error.
        }

        return String.join(", ", longestWords);


    }
}
