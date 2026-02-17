import java.util.List;
import java.util.Arrays;

public class StringCounter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Avocado", "Orange", "Grape", "Apricot");

        // Example 1: Count strings starting with 'A'
        long countA = strings.stream()
                .filter(s -> s.startsWith("A"))
                .count();
        System.out.println("Number of strings starting with 'A': " + countA);


        // Example 2: Count strings starting with a vowel (a, e, i, o, u)
        long countVowels = strings.stream()
                .filter(s -> s.matches("^[aeiouAEIOU].*")) // Using regex for vowel check
                .count();

        System.out.println("Number of strings starting with a vowel: " + countVowels);


        // Example 3: Count strings starting with letters in a specific set (e.g., A, B, or C)
        long countABC = strings.stream()
                .filter(s -> s.startsWith("A") || s.startsWith("B") || s.startsWith("C"))
                .count();  // Or use regex: .filter(s -> s.matches("^[ABC].*"))

        System.out.println("Number of strings starting with A, B, or C: " + countABC);


        // Example 4:  Make it case-insensitive (starts with 'a' or 'A')
        long countCaseInsensitiveA = strings.stream()
                .filter(s -> s.toLowerCase().startsWith("a")) // Convert to lowercase for comparison
                .count();
        System.out.println("Number of strings starting with 'a' (case-insensitive): " + countCaseInsensitiveA);



    }
}
