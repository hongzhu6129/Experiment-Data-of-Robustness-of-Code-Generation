import java.util.Scanner;

public class MinorSuggestion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input character sequence
        System.out.println("Enter a character sequence:");
        String sequence = scanner.nextLine();

        // Check if the sequence is valid
        if (!isValidSequence(sequence)) {
            System.out.println("Invalid sequence!");
            return;
        }

        // Get the minor of the sequence
        char minor = getMinor(sequence);

        // Suggest another same minor to the applicable character sequence
        char suggestedMinor = suggestMinor(minor);

        // Print the suggested minor
        System.out.println("Suggested minor: " + suggestedMinor);
    }

    /**
     * Checks if the given character sequence is valid.
     *
     * @param sequence The character sequence to check
     * @return True if the sequence is valid, false otherwise
     */
    private static boolean isValidSequence(String sequence) {
        // Check if the sequence is null or empty
        if (sequence == null || sequence.isEmpty()) {
            return false;
        }

        // Check if the sequence contains only lowercase English letters
        for (char c : sequence.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Gets the minor of the given character sequence.
     *
     * @param sequence The character sequence to get the minor of
     * @return The minor of the sequence
     */
    private static char getMinor(String sequence) {
        // Get the first character of the sequence
        char minor = sequence.charAt(0);

        // Iterate over the remaining characters in the sequence
        for (int i = 1; i < sequence.length(); i++) {
            char c = sequence.charAt(i);

            // If the current character is smaller than the minor, update the minor
            if (c < minor) {
                minor = c;
            }
        }

        return minor;
    }

    /**
     * Suggests another same minor to the given minor.
     *
     * @param minor The minor to suggest another same minor to
     * @return Another same minor to the given minor
     */
    private static char suggestMinor(char minor) {
        // Get the ASCII value of the minor
        int asciiValue = (int) minor;

        // Increment the ASCII value by 1
        asciiValue++;

        // If the ASCII value is greater than 'z', wrap around to 'a'
        if (asciiValue > 'z') {
            asciiValue = 'a';
        }

        // Return the suggested minor
        return (char) asciiValue;
    }

    /**
     * Generates test cases including corner cases to test the program.
     *
     * @return A list of test cases
     */
    public static List<TestCase> generateTestCases() {
        List<TestCase> testCases = new ArrayList<>();

        // Test case 1: Valid sequence
        testCases.add(new TestCase("abc", 'b'));

        // Test case 2: Invalid sequence (null)
        testCases.add(new TestCase(null, null));

        // Test case 3: Invalid sequence (empty)
        testCases.add(new TestCase("", null));

        // Test case 4: Invalid sequence (contains non-lowercase English letters)
        testCases.add(new TestCase("a1b", null));

        // Test case 5: Sequence with multiple same minors
        testCases.add(new TestCase("aaa", 'a'));

        // Test case 6: Sequence with only one character
        testCases.add(new TestCase("a", 'a'));

        return testCases;
    }

    public static class TestCase {
        private String sequence;
        private Character expectedMinor;

        public TestCase(String sequence, Character expectedMinor) {
            this.sequence = sequence;
            this.expectedMinor = expectedMinor;
        }

        public String getSequence() {
            return sequence;
        }

        public Character getExpectedMinor() {
            return expectedMinor;
        }
    }
}
