import java.util.Arrays;

public class PenultimateWord {

    public static String findPenultimateWord(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return ""; // Handle null or empty input
        }

        String[] words = sentence.trim().split("\\s+"); // Split by whitespace, trimming leading/trailing spaces

        if (words.length < 2) {
            return ""; // Return empty if fewer than two words
        }

        return words[words.length - 2];
    }

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {
                "the quick brown fox jumps over the lazy dog",
                "hello world",
                " singleWord",
                " ",
                null,
                " leading and trailing spaces ",
                "double  space",
                "lots of    spaces   here",
                "  ", // Only whitespace


        };

        String[] expectedOutputs = {
                "the",
                "hello",
                "",
                "",
                "",
                "and",
                "double",
                "spaces",
                ""
        };


        for (int i = 0; i < testCases.length; i++) {
            String result = findPenultimateWord(testCases[i]);
            System.out.println("Input: \"" + testCases[i] + "\"");
            System.out.println("Expected: \"" + expectedOutputs[i] + "\"");
            System.out.println("Actual: \"" + result + "\"");
            System.out.println(result.equals(expectedOutputs[i]) ? "PASS" : "FAIL");
            System.out.println();

        }

    }
}



