import java.util.List;
import java.util.Arrays;

public class StringCounter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "apricot", "avocado", "blueberry", "orange");
        char startingLetter = 'a';

        long count = strings.stream()
                .filter(s -> s.startsWith(String.valueOf(startingLetter)))
                .count();

        System.out.println("Number of strings starting with '" + startingLetter + "': " + count);


        // Example with another letter:
        startingLetter = 'b';
         count = strings.stream()
                .filter(s -> s.startsWith(String.valueOf(startingLetter)))
                .count();

        System.out.println("Number of strings starting with '" + startingLetter + "': " + count);
    }
}
