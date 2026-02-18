import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringSort {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // Ascending order
        List<String> ascendingSorted = strings.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Ascending order: " + ascendingSorted);


        // Descending order
        List<String> descendingSorted = strings.stream()
                .sorted((s1, s2) -> s2.compareTo(s1)) // Use a Comparator for descending
                .collect(Collectors.toList());

        System.out.println("Descending order: " + descendingSorted);


        //Alternatively, for descending order (Java 8+):
        List<String> descendingSortedAlternative = strings.stream()
                .sorted(String::compareToIgnoreCase).reversed() // Reverse the naturally sorted stream
                .collect(Collectors.toList());
        System.out.println("Descending order (alternative): " + descendingSortedAlternative);



    }
}
