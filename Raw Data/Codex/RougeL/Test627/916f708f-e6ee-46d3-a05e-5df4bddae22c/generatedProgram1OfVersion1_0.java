import java.util.Arrays;
import java.util.List;

public class StringCounter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "apricot", "banana", "Avocado", "blueberry", "Apple");

        char startLetter = 'a'; // The specific letter to check

        // Count strings starting with the specified letter (case-insensitive)
        long count = strings.stream()
                .filter(s -> s.toLowerCase().startsWith(String.valueOf(startLetter).toLowerCase()))
                .count();

        System.out.println("Number of strings starting with '" + startLetter + "': " + count);



        startLetter = 'A'; // Example with uppercase

         count = strings.stream()
                .filter(s -> s.toLowerCase().startsWith(String.valueOf(startLetter).toLowerCase()))
                .count();

        System.out.println("Number of strings starting with '" + startLetter + "': " + count); // Output will be 3 (apple, apricot and Apple)


        startLetter = 'b'; // Another Example 

        count = strings.stream()
                .filter(s -> Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(startLetter) )
                .count();

        System.out.println("Number of strings starting with '" + startLetter + "': " + count); // Output will be 2 (banana and blueberry)


    }
}
