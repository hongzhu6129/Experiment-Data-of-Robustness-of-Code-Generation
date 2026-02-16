import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCaseConverter {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "banana", "Orange", "GRAPE");

        // Convert to uppercase
        List<String> uppercaseStrings = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Uppercase: " + uppercaseStrings);


        // Convert to lowercase
        List<String> lowercaseStrings = strings.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println("Lowercase: " + lowercaseStrings);


         // More concise output:
        System.out.println("Uppercase: " + strings.stream().map(String::toUpperCase).collect(Collectors.toList()));
        System.out.println("Lowercase: " + strings.stream().map(String::toLowerCase).collect(Collectors.toList()));

    }
}
