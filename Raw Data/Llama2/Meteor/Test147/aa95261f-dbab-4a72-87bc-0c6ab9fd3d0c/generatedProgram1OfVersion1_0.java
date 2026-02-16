import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {
        // Example list with duplicates
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3, 6, 4));

        // Remove duplicates using distinct() and collect to a new list
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Original list: " + numbers);
        System.out.println("List with duplicates removed: " + uniqueNumbers);



        // Example with a list of strings
        List<String> strings = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape"));

        List<String> uniqueStrings = strings.stream().distinct().collect(Collectors.toList());

        System.out.println("Original string list: " + strings);
        System.out.println("String list with duplicates removed: " + uniqueStrings);
    }
}
