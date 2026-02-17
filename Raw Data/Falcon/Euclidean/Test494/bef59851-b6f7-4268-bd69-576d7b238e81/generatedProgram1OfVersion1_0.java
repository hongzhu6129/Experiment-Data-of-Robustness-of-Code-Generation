import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3, 6, 5);

        List<Integer> distinctNumbers = numbers.stream()
                .distinct() // The distinct() method removes duplicate elements
                .collect(Collectors.toList());

        System.out.println("Original list: " + numbers);
        System.out.println("List without duplicates: " + distinctNumbers);


        // Example with Strings:
        List<String> strings = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");

        List<String> distinctStrings = strings.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Original string list: " + strings);
        System.out.println("String list without duplicates: " + distinctStrings);
    }
}
