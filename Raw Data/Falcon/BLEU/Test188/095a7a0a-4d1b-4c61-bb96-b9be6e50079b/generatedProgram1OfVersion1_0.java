public class ReplaceVowels {

    public static void main(String[] args) {
        String inputString = "This is a sample string with vowels.";
        char replacementChar = '*';

        String modifiedString = validate(inputString, replacementChar);
        System.out.println("Original string: " + inputString);
        System.out.println("Modified string: " + modifiedString);


        // Example with a double converted to a String
        double doubleValue = 3.14159;
        String doubleString = String.valueOf(doubleValue);
        String modifiedDoubleString = validate(doubleString, replacementChar);
        System.out.println("Original double as string: " + doubleString);
        System.out.println("Modified double as string: " + modifiedDoubleString);

    }

    public static String validate(String input, char replacement) {
        if (input == null) {
            return null; // Or handle null input as needed
        }

        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            // Check if the character is a vowel (case-insensitive)
            if (String.valueOf(c).matches("[aeiouAEIOU]")) {
                result.append(replacement);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}

