import java.util.Arrays;
import java.util.List;

public class StringCounter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "apricot", "banana", "Avocado", "blueberry");
        char startingLetter = 'a';

        long count = strings.stream()
                .filter(s -> !s.isEmpty() && Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(startingLetter)) //Case-insensitive
                .count();

        System.out.println("Number of strings starting with '" + startingLetter + "': " + count);


        // Example with different starting letter and empty string handling
        startingLetter = 'B';
        List<String> strings2 = Arrays.asList("Banana", "", "blueberry", "orange", "Berry");


        long count2 = strings2.stream()
                .filter(s -> !s.isEmpty() && Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(startingLetter))
                .count();

        System.out.println("Number of strings starting with '" + startingLetter + "': " + count2);
    }
}
