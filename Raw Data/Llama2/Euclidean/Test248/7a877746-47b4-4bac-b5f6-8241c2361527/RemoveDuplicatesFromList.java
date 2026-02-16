import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {
        // Example list with duplicate elements
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3, 6, 1, 2);

        // Remove duplicates using streams and collect to a new list
        List<Integer> distinctNumbers = numbers.stream()
                .distinct() // The distinct() method keeps only unique elements
                .collect(Collectors.toList());

        // Print the list with duplicates removed
        System.out.println("Original list: " + numbers);
        System.out.println("List without duplicates: " + distinctNumbers);


        // Example with Strings
        List<String> strings = Arrays.asList("apple", "banana", "orange", "apple", "grape", "banana");
        List<String> distinctStrings = strings.stream().distinct().collect(Collectors.toList());
        System.out.println("Original string list: " + strings);
        System.out.println("String list without duplicates: " + distinctStrings);

    }
}
