import java.util.HashSet;
import java.util.Set;

public class ReplaceVowels {

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        char replacementChar = '*';

        String modifiedString = validate(inputString, replacementChar);
        System.out.println("Modified string: " + modifiedString);


        inputString = "aeiouAEIOU";
        replacementChar = '#';
        modifiedString = validate(inputString, replacementChar);
        System.out.println("Modified string: " + modifiedString);


        inputString = ""; // Empty string
        replacementChar = '$'; 
        modifiedString = validate(inputString, replacementChar);
        System.out.println("Modified string: " + modifiedString);


        inputString = "This is a test string.";
        replacementChar = ' '; // Space character
        modifiedString = validate(inputString, replacementChar);
        System.out.println("Modified string: " + modifiedString);
    }

    public static String validate(String inputString, char replacementChar) {
        if (inputString == null) {
            return null; // Or handle null input as needed
        }

        StringBuilder result = new StringBuilder();
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');


        for (char c : inputString.toCharArray()) {
            if (vowels.contains(c)) {
                result.append(replacementChar);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}



