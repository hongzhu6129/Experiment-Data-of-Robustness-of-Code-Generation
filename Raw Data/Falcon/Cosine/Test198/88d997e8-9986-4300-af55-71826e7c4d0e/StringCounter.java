import java.util.Arrays;
import java.util.List;

public class StringCounter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "avocado", "apricot", "blueberry");
        char startingLetter = 'a';

        long count = strings.stream()
                .filter(s -> s.startsWith(String.valueOf(startingLetter)))
                .count();

        System.out.println("Number of strings starting with '" + startingLetter + "': " + count);


        // Example with a different starting letter
        startingLetter = 'b';
        count = strings.stream()
                .filter(s -> s.startsWith(String.valueOf(startingLetter)))
                .count();

         System.out.println("Number of strings starting with '" + startingLetter + "': " + count);



    }
}
