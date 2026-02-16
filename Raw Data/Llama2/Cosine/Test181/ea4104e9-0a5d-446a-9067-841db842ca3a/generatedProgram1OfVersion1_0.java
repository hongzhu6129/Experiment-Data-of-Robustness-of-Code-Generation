import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStrings {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // Ascending order
        List<String> ascendingOrder = strings.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Ascending Order:");
        ascendingOrder.forEach(System.out::println);


        // Descending order
        List<String> descendingOrder = strings.stream()
                .sorted((s1, s2) -> s2.compareTo(s1)) // Use a Comparator for descending
                .collect(Collectors.toList());

        System.out.println("\nDescending Order:");
        descendingOrder.forEach(System.out::println);


         //Alternatively for descending order using Comparator.reverseOrder():
         List<String> descendingOrder2 = strings.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("\nDescending Order (using Comparator.reverseOrder()):");
        descendingOrder2.forEach(System.out::println); 
    }
}
