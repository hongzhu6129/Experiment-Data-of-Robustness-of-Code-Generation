public class ReplaceVowels {

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        char replacementChar = '*';

        String modifiedString = validate(inputString, replacementChar);
        System.out.println("Original string: " + inputString);
        System.out.println("Modified string: " + modifiedString);


        inputString = "AEIOUaeiou";
        replacementChar = '#';
        modifiedString = validate(inputString, replacementChar);
        System.out.println("Original string: " + inputString);
        System.out.println("Modified string: " + modifiedString); 
    }

    public static String validate(String inputString, char replacementChar) {
        if (inputString == null) {
            return null; // Handle null input appropriately
        }

        StringBuilder result = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            // Check if the character is a vowel (case-insensitive)
            if (isVowel(c)) {
                result.append(replacementChar);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c); // Case-insensitive check
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
