import java.util.ArrayList;
import java.util.Arrays;

class LongestWordsFinder {

    static ArrayList<String> longestWords(String[] dictionary) {
        ArrayList<String> longestWordsList = new ArrayList<>();
        if (dictionary == null || dictionary.length == 0) {
            return longestWordsList; 
        }

        int maxLength = 0;
        for (String word : dictionary) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWordsList.clear(); // Start a new list for the longer words
                longestWordsList.add(word);
            } else if (word.length() == maxLength) {
                longestWordsList.add(word);
            }
        }
        return longestWordsList;
    }

    public static void main(String[] args) {
        String[] dictionary1 = {"cat", "flag", "green", "country", "w3resource"};
        ArrayList<String> result1 = longestWords(dictionary1);
        System.out.println(String.join(", ", result1)); // Output: w3resource

        String[] dictionary2 = {"cat", "dog", "red", "is", "am"};
        ArrayList<String> result2 = longestWords(dictionary2);
        System.out.println(String.join(", ", result2)); // Output: cat, dog, red

        // Test with null and empty dictionary
        String[] dictionary3 = null;
        ArrayList<String> result3 = longestWords(dictionary3);
        System.out.println(result3.size() == 0 ? "Empty Result" : result3 ); // Output: Empty Result


        String[] dictionary4 = {};
        ArrayList<String> result4 = longestWords(dictionary4);
        System.out.println(result4.size() == 0 ? "Empty Result" : result4); // Output: Empty Result


    }
}
