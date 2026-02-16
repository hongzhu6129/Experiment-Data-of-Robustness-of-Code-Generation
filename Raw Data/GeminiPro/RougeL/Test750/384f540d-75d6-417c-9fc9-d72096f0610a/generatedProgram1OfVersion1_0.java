public class ReplaceVowels {

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        char replacementChar = '*';

        String modifiedString = validate(inputString, replacementChar);
        System.out.println("Modified string: " + modifiedString);


        inputString = "AEIOUaeiou";
        replacementChar = '#';
        modifiedString = validate(inputString, replacementChar);
        System.out.println("Modified string: " + modifiedString);

    }

    public static String validate(String inputString, char replacementChar) {
        if (inputString == null) {
            return null; // Or handle null input as needed
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
        // Using a switch statement for efficiency (could also use a Set)
        switch (Character.toLowerCase(c)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}



