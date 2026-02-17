import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSort {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // Ascending sort
        List<String> ascendingSorted = strings.stream()
                .sorted() // Uses natural ordering (alphabetical for Strings)
                .collect(Collectors.toList());

        System.out.println("Ascending order: " + ascendingSorted);


        // Descending sort
        List<String> descendingSorted = strings.stream()
                .sorted(Comparator.reverseOrder()) // Reverses the natural ordering
                .collect(Collectors.toList());

        System.out.println("Descending order: " + descendingSorted);



        // Demonstrating sorting with a custom Comparator (e.g., by length) - Optional

         List<String> lengthSorted = strings.stream()
                 .sorted(Comparator.comparingInt(String::length))
                 .collect(Collectors.toList());
         System.out.println("Sorted by length: " + lengthSorted);

    }
}
