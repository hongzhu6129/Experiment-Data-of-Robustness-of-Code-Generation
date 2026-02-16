import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {
        // Example list with duplicates
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3, 6, 4);

        // Remove duplicates using streams and collect into a new list
        List<Integer> distinctNumbers = numbers.stream()
                .distinct() // The distinct() method filters out duplicate elements
                .collect(Collectors.toList());

        // Print the list without duplicates
        System.out.println("Original list: " + numbers);
        System.out.println("List without duplicates: " + distinctNumbers);


        // Example with Strings:
        List<String> words = Arrays.asList("hello", "world", "hello", "java", "world", "coding");

        List<String> uniqueWords = words.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("\nOriginal list of strings: " + words);
        System.out.println("List of strings without duplicates: " + uniqueWords);
    }
}
