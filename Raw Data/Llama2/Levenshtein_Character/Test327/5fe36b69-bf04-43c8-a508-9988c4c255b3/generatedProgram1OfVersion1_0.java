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
    }

    public static String validate(String inputString, char replacementChar) {
        if (inputString == null) {
            return null; // Or handle null input as needed
        }

        StringBuilder sb = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (isVowel(c)) {
                sb.append(replacementChar);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }


    private static boolean isVowel(char c) {
        // Considering both uppercase and lowercase vowels
        return "AEIOUaeiou".indexOf(c) != -1; 
    }
}
