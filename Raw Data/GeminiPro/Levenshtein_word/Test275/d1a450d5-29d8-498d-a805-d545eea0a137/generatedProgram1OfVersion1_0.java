import java.util.ArrayList;
import java.util.Arrays;

public class LongestWords {

    static ArrayList<String> longestWords(String[] words) {
        ArrayList<String> longest = new ArrayList<>();
        int maxLength = 0;

        // Find the maximum length
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }

        // Add words with maximum length to the list
        for (String word : words) {
            if (word.length() == maxLength) {
                longest.add(word);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        String[] words1 = {"cat", "flag", "green", "country", "w3resource"};
        ArrayList<String> result1 = longestWords(words1);
        System.out.println(String.join(", ", result1)); // Output: w3resource

        String[] words2 = {"cat", "dog", "red", "is", "am"};
        ArrayList<String> result2 = longestWords(words2);
        System.out.println(String.join(", ", result2)); // Output: cat, dog, red


         String[] words3 = {}; // Empty array
        ArrayList<String> result3 = longestWords(words3);
        System.out.println(String.join(", ", result3)); // Output: (empty string)



        String[] words4 = null; // Null array -  Handle potential NullPointerException
        if (words4 != null) {  // Safeguard against null input. 
             ArrayList<String> result4 = longestWords(words4);
            System.out.println(String.join(", ", result4));
        } else {
             System.out.println("Input array is null"); // Or choose another way to indicate invalid input
        }

    }
}
