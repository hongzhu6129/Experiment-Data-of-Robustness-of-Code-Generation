public class ReplaceVowels {

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        char replacementChar = '*';

        String modifiedString = validate(inputString, replacementChar);
        System.out.println(modifiedString); // Output: H*ll*, W*rld!


        inputString = "AEIOUaeiou";
        replacementChar = '+';
        modifiedString = validate(inputString, replacementChar);
        System.out.println(modifiedString); // Output: ++++++++++
    }

    public static String validate(String input, char replacement) {
        if (input == null) {
            return null; // Handle null input gracefully
        }

        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            // Check if the character is a vowel (case-insensitive)
            if ("AEIOUaeiou".indexOf(c) != -1) {
                sb.append(replacement);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
