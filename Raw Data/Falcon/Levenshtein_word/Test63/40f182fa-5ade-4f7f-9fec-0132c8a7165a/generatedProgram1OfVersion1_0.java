import java.util.Arrays;
import java.util.List;

public class StringCounter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "apricot", "avocado", "orange");
        char startingLetter = 'a';

        long count = strings.stream()
                .filter(s -> s.startsWith(String.valueOf(startingLetter)))
                .count();

        System.out.println("Number of strings starting with '" + startingLetter + "': " + count);


        // Example with different letter:
        startingLetter = 'b';
        count = strings.stream()
                .filter(s -> s.startsWith(String.valueOf(startingLetter)))
                .count();

        System.out.println("Number of strings starting with '" + startingLetter + "': " + count);
    }
}
