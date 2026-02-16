import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {
        // Example list with duplicate elements
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3, 6, 4, 7, 5);

        // Use a stream to remove duplicates and collect the unique elements into a new list
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct() // The distinct() method removes duplicate elements
                .collect(Collectors.toList());

        // Print the list with duplicates removed
        System.out.println("Original list: " + numbers);
        System.out.println("List without duplicates: " + uniqueNumbers);


        // Example with Strings:
        List<String> words = Arrays.asList("hello", "world", "hello", "java", "stream", "world");

        List<String> uniqueWords = words.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("\nOriginal list of strings: " + words);
        System.out.println("List of strings without duplicates: " + uniqueWords);
    }
}
