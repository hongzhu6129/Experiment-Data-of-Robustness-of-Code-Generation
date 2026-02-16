import java.util.Arrays;

public class CanonicalProportional {

    public static void main(String[] args) {
        // Test cases
        String[] strings = {"abc", "def", "ghi", "abc", "def", "ghi", "abc", "def", "ghi", null, null, null};
        int[] proportions = {1, 2, 3, 1, 2, 3, 1, 2, 3, 0, 0, 0};

        // Get the canonical proportional string object
        String canonicalProportionalString = getCanonicalProportionalString(strings, proportions);

        // Print the canonical proportional string
        System.out.println(canonicalProportionalString);
    }

    public static String getCanonicalProportionalString(String[] strings, int[] proportions) {
        // Check if the input arrays are valid
        if (strings == null || proportions == null || strings.length != proportions.length) {
            throw new IllegalArgumentException("Invalid input arrays");
        }

        // Create a new array of strings with the canonical proportional string
        String[] canonicalProportionalStrings = new String[strings.length];

        // Iterate over the strings and proportions
        for (int i = 0; i < strings.length; i++) {
            // Check if the string or proportion is null
            if (strings[i] == null || proportions[i] < 0) {
                throw new IllegalArgumentException("Invalid string or proportion");
            }

            // Check if the proportion is zero
            if (proportions[i] == 0) {
                // Set the canonical proportional string to null
                canonicalProportionalStrings[i] = null;
            } else {
                // Calculate the canonical proportional string
                String canonicalProportionalString = strings[i];
                for (int j = 0; j < proportions[i] - 1; j++) {
                    canonicalProportionalString += strings[i];
                }

                // Set the canonical proportional string
                canonicalProportionalStrings[i] = canonicalProportionalString;
            }
        }

        // Return the canonical proportional string
        return Arrays.toString(canonicalProportionalStrings);
    }
}
