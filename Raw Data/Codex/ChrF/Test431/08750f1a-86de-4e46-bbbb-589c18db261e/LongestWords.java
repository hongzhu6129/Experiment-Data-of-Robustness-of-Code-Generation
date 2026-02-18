import java.util.ArrayList;
import java.util.Arrays;

public class LongestWords {

    static ArrayList<String> longestWords(String[] dictionary) {
        ArrayList<String> longest = new ArrayList<>();
        int maxLength = 0;

        // Find the maximum length
        for (String word : dictionary) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }

        // Add words with maximum length to the result list
        for (String word : dictionary) {
            if (word.length() == maxLength) {
                longest.add(word);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        String[] dictionary1 = {"cat", "flag", "green", "country", "w3resource"};
        ArrayList<String> result1 = longestWords(dictionary1);
        System.out.println(result1); // Output: [w3resource]

        String[] dictionary2 = {"cat", "dog", "red", "is", "am"};
        ArrayList<String> result2 = longestWords(dictionary2);
        System.out.println(result2); // Output: [cat, dog, red]


        // Example with an empty dictionary
        String[] emptyDictionary = {};
        ArrayList<String> resultEmpty = longestWords(emptyDictionary);
        System.out.println(resultEmpty); // Output: []

        // Example with null input (handle gracefully)
        String[] nullDictionary = null;
        if (nullDictionary != null) { // Protect against NullPointerException
            ArrayList<String> resultNull = longestWords(nullDictionary); 
            System.out.println(resultNull); 
        } else {
            System.out.println("Input dictionary cannot be null.");
        }



    }
}
