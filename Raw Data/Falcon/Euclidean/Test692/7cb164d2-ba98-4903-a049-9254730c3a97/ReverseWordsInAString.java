import java.util.Arrays;

public class ReverseWordsInAString {

    public static void main(String[] args) {
        // Test cases
        String[] inputs = {
                "Hello World",
                "This is a test",
                "Lorem ipsum dolor sit amet",
                "One two three",
                "   Reverse this string   ",
                "",
                null
        };

        for (String input : inputs) {
            System.out.println("Original: " + input);
            System.out.println("Reversed: " + reverseWords(input));
            System.out.println();
        }
    }

    public static String reverseWords(String input) {
        // Check for null or empty input
        if (input == null || input.isEmpty()) {
            return "";
        }

        // Split the input string into words
        String[] words = input.split(" ");

        // Reverse each word in the array
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }

        // Join the reversed words back into a string
        return String.join(" ", words);
    }
}
