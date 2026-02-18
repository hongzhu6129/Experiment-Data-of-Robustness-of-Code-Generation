public class ReplaceVowels {

    public static void main(String[] args) {
        String inputString = "This is a test string with some vowels.";
        char replacementChar = '*';

        String result = validate(inputString, replacementChar);
        System.out.println("Original string: " + inputString);
        System.out.println("Modified string: " + result);


        // Test with a double converted to String
        double doubleValue = 123.456789;
        String doubleString = String.valueOf(doubleValue); 
        String doubleResult = validate(doubleString, replacementChar);
        System.out.println("Original double as string: " + doubleString);
        System.out.println("Modified double string: " + doubleResult);
    }

    public static String validate(String input, char replacement) {
        if (input == null) {
            return null; // Or handle null input as needed
        }

        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            // Check if the character is a vowel (case-insensitive)
            if (isVowel(c)) {
                sb.append(replacement);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }


    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c); // Case-insensitive check
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
