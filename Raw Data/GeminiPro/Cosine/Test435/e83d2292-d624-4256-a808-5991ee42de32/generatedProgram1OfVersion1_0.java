import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringSort {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // Ascending sort
        List<String> ascendingSorted = strings.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Ascending order:");
        ascendingSorted.forEach(System.out::println);


        // Descending sort
        List<String> descendingSorted = strings.stream()
                .sorted((s1, s2) -> s2.compareTo(s1)) // Use a comparator for descending order
                .collect(Collectors.toList());

        System.out.println("\nDescending order:");
        descendingSorted.forEach(System.out::println);


         //Alternatively for descending, using reversed Comparator
        List<String> descendingSorted2 = strings.stream()
                .sorted(Comparator.reverseOrder()) 
                .collect(Collectors.toList());

        System.out.println("\nDescending order (using reversed comparator):");
        descendingSorted2.forEach(System.out::println);

    }
}
