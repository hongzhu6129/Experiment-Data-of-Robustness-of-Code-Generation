import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCaseConverter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "Banana", "ORANGE", "Grape");

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


        //Demonstrate conditional conversion (e.g., make even-indexed strings uppercase, odd lowercase)
        List<String> conditionalCaseStrings = strings.stream()
                .map((s) -> strings.indexOf(s) % 2 == 0 ? s.toUpperCase() : s.toLowerCase())
                .collect(Collectors.toList());
        System.out.println("Conditional Case: " + conditionalCaseStrings);
    }
}
