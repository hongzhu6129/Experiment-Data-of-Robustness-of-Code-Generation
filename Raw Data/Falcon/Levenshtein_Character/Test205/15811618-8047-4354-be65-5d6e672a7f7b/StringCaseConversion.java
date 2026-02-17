import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCaseConversion {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "Banana", "ORANGE", "grape");

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



        // Demonstrating conversion based on a condition (e.g., length)
        List<String> conditionalCaseStrings = strings.stream()
                .map(s -> s.length() > 5 ? s.toUpperCase() : s.toLowerCase())
                .collect(Collectors.toList());

        System.out.println("Conditional Case: " + conditionalCaseStrings);


        // More concise using ternary operator within the map
         List<String> conciseConditionalCase = strings.stream()
                 .map(s -> s.length() > 4 ? s.toLowerCase(): s.toUpperCase())
                 .collect(Collectors.toList());
        System.out.println("Concise Conditional Case (length > 4 to lowercase): " + conciseConditionalCase);



    }
}
