import java.util.Arrays;
import java.util.List;

public class StringCounter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "apricot", "banana", "Avocado", "orange", "Apple");

        char specificLetter = 'a'; // Case-sensitive

        long count = strings.stream()
                .filter(s -> s.length() > 0 && s.charAt(0) == specificLetter)
                .count();

        System.out.println("Number of strings starting with '" + specificLetter + "': " + count);


        specificLetter = 'A'; // Case-insensitive counting (using toLowerCase)
        count = strings.stream()
                .filter(s -> s.length() > 0 && Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(specificLetter))
                .count();
         System.out.println("Number of strings starting with '" + specificLetter + "' (case-insensitive): " + count);


    }
}
