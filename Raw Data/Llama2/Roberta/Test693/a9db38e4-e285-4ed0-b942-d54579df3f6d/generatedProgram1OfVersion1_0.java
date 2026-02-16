import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSort {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("banana", "apple", "orange", "grape", "kiwi");

        // Ascending order
        List<String> ascendingOrder = strings.stream()
                .sorted() // Uses natural ordering (alphabetical for strings)
                .collect(Collectors.toList());

        System.out.println("Ascending order: " + ascendingOrder);


        // Descending order
        List<String> descendingOrder = strings.stream()
                .sorted(Comparator.reverseOrder()) // Use Comparator.reverseOrder() for descending
                .collect(Collectors.toList());


        System.out.println("Descending order: " + descendingOrder);



        // Demonstrating with a more complex sorting (case-insensitive)
        List<String> stringsMixedCase = Arrays.asList("Banana", "apple", "Orange", "grape", "Kiwi");

        List<String> caseInsensitiveAscending = stringsMixedCase.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());

        System.out.println("Case-insensitive ascending: " + caseInsensitiveAscending);


        List<String> caseInsensitiveDescending = stringsMixedCase.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER.reversed()) // Reverse the case-insensitive comparator
                .collect(Collectors.toList());

        System.out.println("Case-insensitive descending: " + caseInsensitiveDescending);
    }
}
