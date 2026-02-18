import java.util.HashSet;
import java.util.Set;

public class VowelReplacer {

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        char replacementChar = '*';

        String result = validate(inputString, replacementChar);
        System.out.println(result); // Output: H*ll*, W*rld!


        inputString = "AEIOUaeiou";
        replacementChar = '+';
        result = validate(inputString, replacementChar);
        System.out.println(result); // Output: ++++++++++
    }

    public static String validate(String inputString, char replacementChar) {
        if (inputString == null) {
            return null; // Handle null input
        }

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

        StringBuilder sb = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (vowels.contains(c)) {
                sb.append(replacementChar);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
