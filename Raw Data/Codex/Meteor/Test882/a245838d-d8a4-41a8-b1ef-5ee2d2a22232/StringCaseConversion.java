import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCaseConversion {

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


         //More concise output using forEach:
        System.out.print("Uppercase (forEach): ");
        strings.stream().map(String::toUpperCase).forEach(s -> System.out.print(s + " "));
        System.out.println();

        System.out.print("Lowercase (forEach): ");
        strings.stream().map(String::toLowerCase).forEach(s -> System.out.print(s + " "));
        System.out.println();

    }
}
