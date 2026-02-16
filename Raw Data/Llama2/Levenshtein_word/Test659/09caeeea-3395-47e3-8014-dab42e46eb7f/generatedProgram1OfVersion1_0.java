import java.util.Arrays;
import java.util.List;

public class StringCounter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "avocado", "apricot", "orange");
        char startingLetter = 'a';

        long count = strings.stream()
                .filter(s -> s.startsWith(String.valueOf(startingLetter)))
                .count();

        System.out.println("Number of strings starting with '" + startingLetter + "': " + count);


        // Example with different starting letter and list
        List<String> strings2 = Arrays.asList("hello", "world", "how", "are", "you");
        char startingLetter2 = 'h';

        long count2 = strings2.stream()
                .filter(s -> s.startsWith(String.valueOf(startingLetter2)))
                .count();


        System.out.println("Number of strings starting with '" + startingLetter2 + "': " + count2);


    }
}
