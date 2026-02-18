import java.util.*;

public class LexicographicallySortIgnoringCase {

    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "dog", "elephant");

        // Sort the list of strings lexicographically, ignoring case
        Collections.sort(strings, String.CASE_INSENSITIVE_ORDER);

        // Print the sorted list of strings
        System.out.println(strings);
    }
}
