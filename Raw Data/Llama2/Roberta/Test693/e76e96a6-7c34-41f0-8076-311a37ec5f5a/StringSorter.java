import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSorter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // Ascending order
        List<String> ascendingOrder = strings.stream()
                .sorted() // Uses natural order (alphabetical for strings)
                .collect(Collectors.toList());

        System.out.println("Ascending order: " + ascendingOrder);


        // Descending order
        List<String> descendingOrder = strings.stream()
                .sorted(Comparator.reverseOrder()) 
                .collect(Collectors.toList());

        System.out.println("Descending order: " + descendingOrder);


         //More examples with different Comparator options:
         List<String> ascendingOrderCaseInsensitive = strings.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());

         System.out.println("Ascending order (case-insensitive): " + ascendingOrderCaseInsensitive);


        List<String> descendingOrderCaseInsensitive = strings.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER.reversed()) //Note how reversed() is chained.
                .collect(Collectors.toList());


        System.out.println("Descending order (case-insensitive): " + descendingOrderCaseInsensitive);



        // Example with custom comparator (e.g., by length):
        List<String> ascendingOrderByLength = strings.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        System.out.println("Ascending order by length: " + ascendingOrderByLength);



    }
}
