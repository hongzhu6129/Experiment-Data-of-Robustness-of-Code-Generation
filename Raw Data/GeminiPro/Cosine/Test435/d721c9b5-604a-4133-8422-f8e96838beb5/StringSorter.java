import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringSorter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // Ascending order
        List<String> ascendingSorted = strings.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Ascending order:");
        ascendingSorted.forEach(System.out::println);


        // Descending order
        List<String> descendingSorted = strings.stream()
                .sorted((s1, s2) -> s2.compareTo(s1)) // Use a comparator for descending
                .collect(Collectors.toList());


        System.out.println("\nDescending order:");
        descendingSorted.forEach(System.out::println);


         //Alternative for descending using reversed Comparator
        List<String> descendingSortedAlternative = strings.stream()
                .sorted(String::compareTo).reversed() // Reverse the natural order comparator
                .collect(Collectors.toList());


        System.out.println("\nDescending order (alternative):");
         descendingSortedAlternative.forEach(System.out::println);

    }
}
