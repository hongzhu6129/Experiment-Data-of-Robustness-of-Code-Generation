public class ReplaceVowels {

    public static void main(String[] args) {
        String inputString = "Hello World";
        char replacementChar = '*';

        String modifiedString = validate(inputString, replacementChar);
        System.out.println(modifiedString); // Output: H*ll* W*rld


        inputString = "aeiouAEIOU";
        replacementChar = '#';
        modifiedString = validate(inputString, replacementChar);
        System.out.println(modifiedString); // Output: #########

        inputString = ""; // Empty string
        replacementChar = '$';
        modifiedString = validate(inputString, replacementChar);
        System.out.println(modifiedString); // Output: "" (empty string)

        inputString = "This is a test.";
        replacementChar = '-';
        modifiedString = validate(inputString, replacementChar);
        System.out.println(modifiedString); // Output: Th-s -s - t-st.

    }

    public static String validate(String inputString, char replacementChar) {
        if (inputString == null) {
            return null; // Or handle null input as needed, e.g., return "";
        }

        StringBuilder result = new StringBuilder(); 
        for (char c : inputString.toCharArray()) {
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
