import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringCounter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "avocado", "apricot", "orange", "blueberry");
        char startsWith = 'a';

        long count = strings.stream()
                .filter(s -> s.startsWith(String.valueOf(startsWith)))
                .count();

        System.out.println("Number of strings starting with '" + startsWith + "': " + count);


        // Example with different letter
        startsWith = 'b';
        count = strings.stream()
                .filter(s -> s.startsWith(String.valueOf(startsWith)))
                .count();

        System.out.println("Number of strings starting with '" + startsWith + "': " + count);


         // Example with an empty list:
        List<String> emptyList = Arrays.asList();
        startsWith = 'a';
        count = emptyList.stream()
                .filter(s -> s.startsWith(String.valueOf(startsWith)))
                .count();

        System.out.println("Number of strings starting with '" + startsWith + "' in an empty list: " + count);


        // Example with null list (handle potential NullPointerException)
        List<String> nullList = null;
        startsWith = 'a';

        // Use Optional to safely handle null list
        long nullCount = java.util.Optional.ofNullable(nullList) // Wrap the potentially null list in an Optional
                .map(list -> list.stream() // If the list exists, create a stream
                        .filter(s -> s != null && s.startsWith(String.valueOf(startsWith))) // Filter, handling potential null strings within the list
                        .count())
                .orElse(0L); // If the list is null, return 0



        System.out.println("Number of strings starting with '" + startsWith + "' in a null list: " + nullCount);
    }
}
