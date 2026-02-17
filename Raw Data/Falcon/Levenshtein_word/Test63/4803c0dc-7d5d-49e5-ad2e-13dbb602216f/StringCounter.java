import java.util.List;
import java.util.Arrays;

public class StringCounter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "apricot", "avocado", "orange");
        char startingLetter = 'a';

        long count = strings.stream()
                .filter(s -> s.startsWith(String.valueOf(startingLetter)))
                .count();

        System.out.println("Number of strings starting with '" + startingLetter + "': " + count);


        // Example with different list and starting letter
        List<String> strings2 = Arrays.asList("Hello", "World", "how", "are", "you");
        char startingLetter2 = 'h';

        long count2 = strings2.stream()
                .filter(s -> s.startsWith(String.valueOf(startingLetter2)))
                .count();

        System.out.println("Number of strings starting with '" + startingLetter2 + "': " + count2);



         // Example with an empty list
        List<String> emptyList = Arrays.asList();
        char startingLetter3 = 'b'; // any letter

        long count3 = emptyList.stream()
                             .filter(s -> s.startsWith(String.valueOf(startingLetter3)))
                             .count();
        System.out.println("Number of strings starting with '" + startingLetter3 + "' (empty list): " + count3);



        // Example with no strings starting with the specified letter:
        List<String> noMatches = Arrays.asList("cat", "dog", "fish");
        char startingLetter4 = 'z';

        long count4 = noMatches.stream()
                .filter(s -> s.startsWith(String.valueOf(startingLetter4)))
                .count();

        System.out.println("Number of strings starting with '" + startingLetter4 + "' (no matches): " + count4);
    }
}
