import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {
        // Example usage:
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3, 6));

        List<Integer> distinctNumbers = numbers.stream()
                .distinct() // Removes duplicate elements
                .collect(Collectors.toList()); // Collects the distinct elements into a new list

        System.out.println("Original list: " + numbers);
        System.out.println("List with duplicates removed: " + distinctNumbers);


        // Example with Strings:
        List<String> strings = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape"));
        List<String> distinctStrings = strings.stream().distinct().collect(Collectors.toList());
        System.out.println("Original string list: " + strings);
        System.out.println("String list with duplicates removed: " + distinctStrings);

    }
}
