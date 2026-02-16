import java.util.Arrays;
import java.util.Collections;
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
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Descending order: " + descendingOrder);

    }
}
