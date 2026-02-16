import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {
        // Example list with duplicates
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3, 6, 4));

        // Remove duplicates using streams and collect into a new list
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        // Print the list without duplicates
        System.out.println("Original list: " + numbers);
        System.out.println("List without duplicates: " + distinctNumbers);


        // Example with Strings
        List<String> strings = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "apple", "grape", "banana"));

         List<String> distinctStrings = strings.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Original string list: " + strings);
        System.out.println("String list without duplicates: " + distinctStrings);


        // Modifying the original list directly (in-place removal - requires mutable list)
        // Note:  This approach modifies the original list directly. 
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3, 6, 4));

        numbers2.stream().distinct().forEachOrdered(numbers2::add);  // Append distinct elements
        numbers2.subList(numbers.size(), numbers2.size()).clear();       // Remove original elements



        System.out.println("Original list (before in-place modification): " + numbers);
        System.out.println("List after in-place removal of duplicates: " + numbers2);

    }
}
