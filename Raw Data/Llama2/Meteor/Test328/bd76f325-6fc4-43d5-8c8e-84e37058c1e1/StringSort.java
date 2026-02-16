import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringSort {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // Ascending order
        List<String> ascendingOrder = strings.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Ascending order: " + ascendingOrder);


        // Descending order
        List<String> descendingOrder = strings.stream()
                .sorted((s1, s2) -> s2.compareTo(s1)) // Use a Comparator for descending order
                .collect(Collectors.toList());

        System.out.println("Descending order: " + descendingOrder);


        //Alternatively for descending order using reversed comparator:
         List<String> descendingOrder2 = strings.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
         System.out.println("Descending order using reversed comparator: " + descendingOrder2);


    }
}
