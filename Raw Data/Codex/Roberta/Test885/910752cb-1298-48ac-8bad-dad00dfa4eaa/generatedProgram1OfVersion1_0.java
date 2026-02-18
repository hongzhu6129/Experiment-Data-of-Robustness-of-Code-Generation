public class ReplaceVowels {

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        char replacementChar = '*';

        String modifiedString = validate(inputString, replacementChar);

        System.out.println("Original string: " + inputString);
        System.out.println("Modified string: " + modifiedString);


        inputString = "aeiouAEIOU";
        replacementChar = '#';
        modifiedString = validate(inputString, replacementChar);
        System.out.println("Original string: " + inputString);
        System.out.println("Modified string: " + modifiedString);

        inputString = "This is a test string."; // No vowels replaced if replacement char is a vowel
        replacementChar = 'a';
        modifiedString = validate(inputString, replacementChar);
        System.out.println("Original string: " + inputString);
        System.out.println("Modified string: " + modifiedString);


    }

    public static String validate(String inputString, char replacementChar) {
        if (inputString == null) {
            return null; // Handle null input gracefully
        }

        StringBuilder result = new StringBuilder();
        // Convert replacement char to lowercase for comparison
        char lowerReplacement = Character.toLowerCase(replacementChar);

        for (char c : inputString.toCharArray()) {
             // Convert the current character to lowercase for case-insensitive checking.
            char lowerC = Character.toLowerCase(c);
            if (lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u') {
                // Skip replacement if the replacement character itself is a vowel
                if(lowerReplacement != 'a' && lowerReplacement != 'e' && lowerReplacement != 'i' && lowerReplacement != 'o' && lowerReplacement != 'u') {
                    result.append(replacementChar);
                } else {
                    result.append(c); // keep original char since replacement is a vowel
                }
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
