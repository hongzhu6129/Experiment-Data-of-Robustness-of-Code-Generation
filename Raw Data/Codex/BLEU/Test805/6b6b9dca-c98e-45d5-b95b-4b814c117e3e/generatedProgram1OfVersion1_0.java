import java.util.HashMap;
import java.util.Map;

public class FeedbackCounter {

    public static Map<String, Integer> countFeedback(String feedback) {
        // Convert the feedback string to lowercase and split it into words.
        String[] words = feedback.toLowerCase().split(" ");

        // Initialize a HashMap to store word counts.
        Map<String, Integer> wordCounts = new HashMap<>();

        // Iterate over the words and add them to the HashMap.
        for (String word : words) {
            // If the word is already in the HashMap, increment its count.
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            }
            // Otherwise, add the word to the HashMap with a count of 1.
            else {
                wordCounts.put(word, 1);
            }
        }

        // Return the HashMap with word counts.
        return wordCounts;
    }

    public static void main(String[] args) {
        // Test case 1: Empty feedback string.
        String feedback1 = "";
        Map<String, Integer> counts1 = countFeedback(feedback1);
        System.out.println(counts1); // {}

        // Test case 2: Feedback string with one word.
        String feedback2 = "good";
        Map<String, Integer> counts2 = countFeedback(feedback2);
        System.out.println(counts2); // {good=1}

        // Test case 3: Feedback string with multiple words, including duplicates.
        String feedback3 = "good is good and very good";
        Map<String, Integer> counts3 = countFeedback(feedback3);
        System.out.println(counts3); // {good=3, is=1, and=1, very=1}

        // Test case 4: Feedback string with special characters.
        String feedback4 = "good! is good. and very#good?";
        Map<String, Integer> counts4 = countFeedback(feedback4);
        System.out.println(counts4); // {good=3, is=1, and=1, very=1}

        // Test case 5: Feedback string with only special characters.
        String feedback5 = "!!!!";
        Map<String, Integer> counts5 = countFeedback(feedback5);
        System.out.println(counts5); // {}
    }
}
