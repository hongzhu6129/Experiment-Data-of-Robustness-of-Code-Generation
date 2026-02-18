import java.util.Arrays;
import java.util.List;

public class StringCounter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "apricot", "avocado", "orange");
        char startingLetter = 'a';

        long count = strings.stream()
                .filter(s -> s.charAt(0) == startingLetter)
                .count();

        System.out.println("Number of strings starting with '" + startingLetter + "': " + count);


        // Example with different list and starting letter:
        List<String> strings2 = Arrays.asList("hello", "world", "how", "are", "you");
        char startingLetter2 = 'h';

        long count2 = strings2.stream()
                             .filter(s -> s.charAt(0) == startingLetter2)
                             .count();
        System.out.println("Number of strings starting with '" + startingLetter2 + "': " + count2);



         // Example with an empty List:
        List<String> emptyList = Arrays.asList();
        char startingLetter3 = 'z';

        long count3 = emptyList.stream().filter(s-> s.charAt(0) == startingLetter3).count();
        System.out.println("Number of strings starting with '"+ startingLetter3 + "': " + count3);
    }
}
