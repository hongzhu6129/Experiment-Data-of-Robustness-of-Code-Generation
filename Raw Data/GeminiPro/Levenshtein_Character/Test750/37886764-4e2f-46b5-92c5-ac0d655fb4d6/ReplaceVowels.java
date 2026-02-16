public class ReplaceVowels {

    public static void main(String[] args) {
        String inputString = "Hello World";
        char replacementChar = '*';

        String result = validate(inputString, replacementChar);
        System.out.println("Original String: " + inputString);
        System.out.println("Modified String: " + result);


        inputString = "aeiouAEIOU";
        replacementChar = '#';
        result = validate(inputString, replacementChar);
        System.out.println("Original String: " + inputString);
        System.out.println("Modified String: " + result);

    }

    public static String validate(String inputString, char replacementChar) {
        if (inputString == null) {
            return null; // Or throw an exception if null input is invalid
        }

        StringBuilder modifiedString = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            // Check if the current character is a vowel (case-insensitive)
            if (isVowel(currentChar)) {
                modifiedString.append(replacementChar);
            } else {
                modifiedString.append(currentChar);
            }
        }

        return modifiedString.toString();
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Case-insensitive check
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
