import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChars {

    public static void main(String[] args) {
        String inputString = "programming";
        String result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: progamin

        inputString = "abcabcbb";
        result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: abc


        inputString = "bbb";
        result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: b

        inputString = "";
        result = removeDuplicateChars(inputString);
        System.out.println(result); // Output: 


    }

    private static String removeDuplicateChars(String str) {
        if (str == null || str.isEmpty()) {
            return str; // Handle null or empty input
        }

        Set<Character> seenChars = new LinkedHashSet<>(); // Use LinkedHashSet to preserve order
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (seenChars.add(c)) { // add() returns true if the element was *not* already present
                result.append(c);
            }
        }

        return result.toString();
    }
}
