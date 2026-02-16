public class ReplaceVowels {

    public static void main(String[] args) {
        String inputString = "Hello World";
        char replacementChar = '*';
        String modifiedString = validate(inputString, replacementChar);
        System.out.println("Original String: " + inputString);
        System.out.println("Modified String: " + modifiedString);

        inputString = "AEIOUaeiou";
        replacementChar = '#';
        modifiedString = validate(inputString, replacementChar);
        System.out.println("Original String: " + inputString);
        System.out.println("Modified String: " + modifiedString);


        inputString = "This is a test string."; // Example with no vowels
        replacementChar = '$';
        modifiedString = validate(inputString, replacementChar);
        System.out.println("Original String: " + inputString);
        System.out.println("Modified String: " + modifiedString);


    }

    public static String validate(String inputString, char replacementChar) {
        if (inputString == null) {
            return null; // Or handle null input as needed
        }

        StringBuilder sb = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            // Check if the character is a vowel (case-insensitive)
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                sb.append(replacementChar);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
