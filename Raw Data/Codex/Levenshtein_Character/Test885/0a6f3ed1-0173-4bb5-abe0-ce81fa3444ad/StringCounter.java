import java.util.List;
import java.util.Arrays;

public class StringCounter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "apricot", "banana", "Avocado", "orange", "Apple");

        char startingLetter = 'a'; // Case-sensitive

        long count = strings.stream()
                .filter(s -> s.length() > 0 && s.charAt(0) == startingLetter)
                .count();

        System.out.println("Number of strings starting with '" + startingLetter + "': " + count);


        startingLetter = 'A'; // Case-insensitive count � Example
        count = strings.stream()
                .filter(s -> s.length() > 0 && Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(startingLetter))
                .count();

        System.out.println("Number of strings starting with '" + startingLetter + "' (case-insensitive): " + count);

    }
}
