import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {
        // Sample list with duplicates
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3, 6, 7, 5));

        // Remove duplicates using streams and collect to a new list
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        // Print the list without duplicates
        System.out.println("Original list: " + numbers);
        System.out.println("List without duplicates: " + distinctNumbers);


        // Example with Strings:
        List<String> words = new ArrayList<>(Arrays.asList("hello", "world", "hello", "java", "world", "streams"));

        List<String> uniqueWords = words.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("\nOriginal list of strings: " + words);
        System.out.println("List of strings without duplicates: " + uniqueWords);
    }
}
