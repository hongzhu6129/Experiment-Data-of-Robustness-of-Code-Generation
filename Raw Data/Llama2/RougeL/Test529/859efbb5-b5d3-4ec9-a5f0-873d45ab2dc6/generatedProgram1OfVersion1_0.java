import java.util.Arrays;
import java.util.List;

public class StringCounter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "apricot", "banana", "Avocado", "blueberry", "orange");
        char startingLetter = 'a'; // Case-sensitive

        long count = strings.stream()
                .filter(s -> s.length() > 0 && s.charAt(0) == startingLetter) // Check for empty strings and match starting letter
                .count();

        System.out.println("Number of strings starting with '" + startingLetter + "': " + count);


        // Case-insensitive counting
        startingLetter = 'A';
        long caseInsensitiveCount = strings.stream()
                .filter(s -> s.length() > 0 && Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(startingLetter)) //convert to lowercase for comparison
                .count();

        System.out.println("Number of strings starting with '" + startingLetter + "' (case-insensitive): " + caseInsensitiveCount);


    }
}
