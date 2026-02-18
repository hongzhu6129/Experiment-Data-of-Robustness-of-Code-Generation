import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringSorter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // Ascending sort
        List<String> ascendingSorted = strings.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Ascending order: " + ascendingSorted);


        // Descending sort
        List<String> descendingSorted = strings.stream()
                .sorted((s1, s2) -> s2.compareTo(s1)) // Use a Comparator for descending
                .collect(Collectors.toList());


        System.out.println("Descending order: " + descendingSorted);


        // More concise descending sort using Comparator.reverseOrder()
        List<String> descendingSorted2 = strings.stream()
                .sorted(String::compareToIgnoreCase).reversed() // Case-insensitive descending sort
                .collect(Collectors.toList());

         System.out.println("Descending order (case-insensitive): " + descendingSorted2);
    }
}
