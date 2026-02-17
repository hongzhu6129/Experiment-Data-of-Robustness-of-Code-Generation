public class ReplaceVowels {

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        char replacementChar = '*';

        String modifiedString = validate(inputString, replacementChar);
        System.out.println("Modified string: " + modifiedString);


        inputString = "This is another test.";
        replacementChar = '#';
        modifiedString = validate(inputString, replacementChar);
        System.out.println("Modified string: " + modifiedString); 
    }

    public static String validate(String inputString, char replacementChar) {
        if (inputString == null) {
            return null; // Or handle null input as needed
        }

        StringBuilder sb = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            // Check if the character is a vowel (case-insensitive)
            if (isVowel(c)) {
                sb.append(replacementChar);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private static boolean isVowel(char c) {
        char lowerC = Character.toLowerCase(c);
        return lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u';
    }
}
