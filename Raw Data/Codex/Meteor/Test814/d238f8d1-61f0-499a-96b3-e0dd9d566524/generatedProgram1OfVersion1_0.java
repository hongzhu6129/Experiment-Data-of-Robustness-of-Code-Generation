import java.util.Arrays;

public class PenultimateWord {

    public static String findPenultimateWord(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return ""; // Handle null or empty sentences
        }

        String[] words = sentence.trim().split("\\s+"); // Split by whitespace, trimming leading/trailing spaces

        if (words.length < 2) {
            return ""; // Handle sentences with fewer than two words
        }

        return words[words.length - 2];
    }

    public static void main(String[] args) {
        // Test cases:
        String[] sentences = {
                "This is a test sentence",
                "Hello world",
                "  Leading and trailing spaces  ",
                "SingleWord",
                "",
                null,
                "  ",
                "one two three four five",
                "  multiple   spaces between  ",
                "  Hello  world  again   "
        };

        String[] expectedOutputs = {
                "test",
                "Hello",
                "and",
                "",
                "",
                "",
                "",
                "four",
                "spaces",
                "world"

        };


        for (int i = 0; i < sentences.length; i++) {
            String result = findPenultimateWord(sentences[i]);
            String expected = expectedOutputs[i];

            System.out.println("Input: \"" + sentences[i] + "\"");
            System.out.println("Output: \"" + result + "\"");
            System.out.println("Expected: \"" + expected + "\"");
            System.out.println(result.equals(expected) ? "PASSED" : "FAILED");
            System.out.println();
        }
    }
}


