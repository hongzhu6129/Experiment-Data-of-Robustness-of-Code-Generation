import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {
        // Example list with duplicate elements
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3, 6, 5);

        // Remove duplicates using streams and collect into a new list
        List<Integer> distinctNumbers = numbers.stream()
                .distinct() // The distinct() method filters out duplicate elements
                .collect(Collectors.toList());

        // Print the list with duplicates removed
        System.out.println("Original list: " + numbers);
        System.out.println("List with duplicates removed: " + distinctNumbers);


        // Example with a list of Strings:
        List<String> words = Arrays.asList("hello", "world", "java", "hello", "programming", "world");

        List<String> distinctWords = words.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Original list: " + words);
        System.out.println("List with duplicates removed: " + distinctWords);

    }
}
