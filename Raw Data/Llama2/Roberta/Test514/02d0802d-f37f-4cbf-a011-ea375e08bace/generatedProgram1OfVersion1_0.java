import java.util.Arrays;
import java.util.List;

public class StringCounter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "apricot", "banana", "Avocado", "orange", "Apple");

        char startingLetter = 'a'; // Specify the starting letter (case-sensitive)

        long count = strings.stream()
                .filter(s -> s.length() > 0 && s.charAt(0) == startingLetter) // Check if the string starts with the specific letter (case-sensitive)
                .count();


        System.out.println("Number of strings starting with '" + startingLetter + "': " + count);


        startingLetter = 'A'; // Specify the starting letter (case-sensitive)

        count = strings.stream()
                .filter(s -> s.length() > 0 && Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(startingLetter)) // Check if the string starts with the specific letter (case-insensitive)
                .count();

        System.out.println("Number of strings starting with '" + startingLetter + "' (case-insensitive): " + count);


    }
}
