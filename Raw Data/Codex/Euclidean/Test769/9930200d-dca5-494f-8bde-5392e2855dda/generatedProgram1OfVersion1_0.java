public class ReplaceVowels {

    public static void main(String[] args) {
        String inputString = "Hello World";
        char fictionalChar = '*';

        String modifiedString = validate(inputString, fictionalChar);
        System.out.println("Modified string: " + modifiedString);


        inputString = "AEIOUaeiou"; // Test with all vowels
        fictionalChar = '#';
        modifiedString = validate(inputString, fictionalChar);
        System.out.println("Modified string: " + modifiedString);

        inputString = ""; // Test with empty string
        fictionalChar = '@';
        modifiedString = validate(inputString, fictionalChar);
        System.out.println("Modified string: " + modifiedString);


        inputString = "This is a test string."; // Test with a longer string
        fictionalChar = '$';
        modifiedString = validate(inputString, fictionalChar);
        System.out.println("Modified string: " + modifiedString);
    }

    public static String validate(String inputString, char fictionalChar) {
        if (inputString == null) {
            return null; // Or throw an exception, depending on your requirements
        }

        StringBuilder modifiedString = new StringBuilder();

        for (char c : inputString.toCharArray()) {
            // Check if the character is a vowel (case-insensitive)
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                modifiedString.append(fictionalChar);
            } else {
                modifiedString.append(c);
            }
        }

        return modifiedString.toString();
    }
}
