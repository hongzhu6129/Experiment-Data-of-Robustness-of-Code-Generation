import java.util.List;
import java.util.Arrays;

public class StringCounter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "apricot", "avocado", "orange", "blueberry");
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


        // Example with an empty list
         List<String> emptyList = Arrays.asList();
        startingLetter = 'a';
        count = emptyList.stream()
                .filter(s -> s.startsWith(String.valueOf(startingLetter)))
                .count();
         System.out.println("Number of strings starting with '" + startingLetter + "' in an empty list: " + count);



        // Example with no strings starting with the letter
         List<String> noMatches = Arrays.asList("cat", "dog", "elephant");
        startingLetter = 'z';
        count = noMatches.stream()
                .filter(s -> s.startsWith(String.valueOf(startingLetter)))
                .count();
         System.out.println("Number of strings starting with '" + startingLetter + "' with no matches: " + count);
    }
}
