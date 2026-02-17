import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChars {

    public static void main(String[] args) {
        String inputString = "programming";
        String result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: progamin

        inputString = "hello";
        result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: helo


        inputString = "aabbccddeeff";
        result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: abcdef


        inputString = ""; // Empty string
        result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: (empty string)

         inputString = "a"; // Single character
        result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: a


    }

    private static String removeDuplicateChars(String str) {
        if (str == null || str.isEmpty()) {
            return str; // Handle null or empty input
        }

        Set<Character> seenChars = new LinkedHashSet<>(); // Preserve insertion order
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (seenChars.add(c)) { // Add returns true if the element was added (i.e., not a duplicate)
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
