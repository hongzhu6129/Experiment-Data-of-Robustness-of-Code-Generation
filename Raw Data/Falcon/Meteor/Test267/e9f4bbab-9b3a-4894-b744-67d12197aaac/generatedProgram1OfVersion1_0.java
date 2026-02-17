import java.util.Arrays;

public class ReverseOddLengthWords {

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {
                "This is a test",
                "Lorem ipsum dolor sit amet",
                "12345 67890",
                "a",
                "",
                "This is a test with a single odd-length word",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit",
                "12345 67890 123456789",
                "a b c d e f",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut tincidunt nunc, eget consectetur nulla dignissim et.",
                "",
                "1"
        };

        for (String testCase : testCases) {
            System.out.println("Original string: " + testCase);
            System.out.println("Reversed odd-length words: " + reverseOddLengthWords(testCase));
            System.out.println();
        }
    }

    public static String reverseOddLengthWords(String str) {
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (String word : words) {
            if (word.length() % 2 != 0) {
                reversed.append(new StringBuilder(word).reverse()).append(" ");
            } else {
                reversed.append(word).append(" ");
            }
        }

        return reversed.toString().trim();
    }
}
