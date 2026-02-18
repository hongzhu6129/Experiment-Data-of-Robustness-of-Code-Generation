import java.util.regex.*;

public class SubstringBeforePeriod {

    public static void main(String[] args) {
        // Test cases
        String[] testStrings = {"This is a test string.", "This. is another test string.", "This is.not a test string.", ".This is not a test string.", "This is not a test string."};

        // Regex pattern
        String pattern = ".*\\..*";

        // Iterate over test cases
        for (String testString : testStrings) {
            // Check if the substring appears before a period
            boolean match = Pattern.matches(pattern, testString);

            // Print the result
            System.out.println("String: " + testString);
            System.out.println("Substring appears before a period: " + match);
            System.out.println();
        }
    }
}
