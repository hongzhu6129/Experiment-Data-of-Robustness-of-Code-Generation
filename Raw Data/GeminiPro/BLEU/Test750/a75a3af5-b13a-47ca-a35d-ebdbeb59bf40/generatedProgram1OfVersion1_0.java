public class ReplaceVowels {

    public static void main(String[] args) {
        String inputString = "Hello World";
        char replacementChar = '*';

        String modifiedString = validate(inputString, replacementChar);
        System.out.println("Modified string: " + modifiedString);


        inputString = "AEIOUaeiou";
        replacementChar = '#';
        modifiedString = validate(inputString, replacementChar);
        System.out.println("Modified string: " + modifiedString);

        inputString = ""; // Empty string
        replacementChar = '!';
        modifiedString = validate(inputString, replacementChar);
        System.out.println("Modified string: " + modifiedString);
         
        inputString = "This is a test."; // String with no vowels.
        replacementChar = '@';
        modifiedString = validate(inputString, replacementChar);
        System.out.println("Modified string: " + modifiedString);
    }

    public static String validate(String inputString, char replacementChar) {
        if (inputString == null) {
            return null; // Or handle null as needed
        }

        StringBuilder sb = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            // Check if the character is a vowel (case-insensitive)
            if ("AEIOUaeiou".indexOf(c) != -1) {
                sb.append(replacementChar);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
