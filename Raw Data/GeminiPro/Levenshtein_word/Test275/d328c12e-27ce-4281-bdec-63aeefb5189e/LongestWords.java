import java.util.ArrayList;
import java.util.Arrays;

public class LongestWords {

    /**
     * Finds the longest words in a given array of strings (dictionary).
     *
     * @param words An array of strings representing the dictionary.
     * @return An ArrayList containing the longest words found in the dictionary.
     */
    static ArrayList<String> longestWords(String[] words) {
        if (words == null || words.length == 0) {
            return new ArrayList<>(); // Return an empty list if the input is null or empty
        }

        ArrayList<String> longest = new ArrayList<>();
        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                longest.clear(); // Discard shorter words
                longest.add(word);
                maxLength = word.length();
            } else if (word.length() == maxLength) {
                longest.add(word); // Add words of the same length
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        String[] dictionary = {"cat", "dog", "elephant", "giraffe", "lion", "tiger", "zebra", "antidisestablishmentarianism"};
        ArrayList<String> longest = longestWords(dictionary);

        System.out.println("Longest words:");
        for (String word : longest) {
            System.out.println(word);
        }



        // Test with null and empty input
        System.out.println("\nTest with null input:");
        longest = longestWords(null);
        System.out.println(longest); // Expected: []


        System.out.println("\nTest with empty input:");
        longest = longestWords(new String[0]);
        System.out.println(longest); // Expected: []


        //Test with all same length words:
        System.out.println("\nTest with all same length words:");
         longest = longestWords(new String[]{"one", "two", "six"});
        System.out.println(longest); // Expected: [one, two, six]

    }
}
