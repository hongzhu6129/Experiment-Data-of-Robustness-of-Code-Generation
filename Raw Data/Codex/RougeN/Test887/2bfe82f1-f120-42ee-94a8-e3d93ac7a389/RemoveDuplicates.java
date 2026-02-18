import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "geeksforgeeks";

        // Create a set to store the unique characters in the string.
        Set<Character> uniqueChars = new LinkedHashSet<>();

        // Add each character of the string to the set.
        for (char c : str.toCharArray()) {
            uniqueChars.add(c);
        }

        // Convert the set back to a string.
        String result = "";
        for (char c : uniqueChars) {
            result += c;
        }

        // Print the result.
        System.out.println(result);
    }
}
