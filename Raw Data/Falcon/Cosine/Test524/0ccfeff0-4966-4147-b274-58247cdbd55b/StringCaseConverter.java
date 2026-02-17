import java.util.List;
import java.util.Arrays;
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


        //Demonstrating with tributaries (parallel streams) for larger lists where performance benefits might be observed:
        List<String> largeListOfStrings = Arrays.asList("apple", "Banana", "ORANGE", "Grape", "kiwi", "Mango", "Pineapple",  "strawberry", "blueberry", "raspberry");//... and many more
         
        List<String> parallelUppercaseStrings = largeListOfStrings.parallelStream()
               .map(String::toUpperCase)
               .collect(Collectors.toList());

        System.out.println("Parallel Uppercase: " + parallelUppercaseStrings);
    }
}
