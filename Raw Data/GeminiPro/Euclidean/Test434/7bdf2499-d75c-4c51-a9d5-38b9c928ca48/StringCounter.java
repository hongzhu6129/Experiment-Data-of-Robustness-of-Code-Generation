import java.util.List;
import java.util.Arrays;

public class StringCounter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello World", "Hello Java", "Goodbye World", "Hello Python", "Java is cool");
        String startsWith = "Hello";

        long count = strings.stream()
                .filter(s -> s.startsWith(startsWith))
                .count();

        System.out.println("Number of strings starting with '" + startsWith + "': " + count);


        // Example with an empty list:
        List<String> emptyList = Arrays.asList();
        startsWith = "Anything";

         count = emptyList.stream()
                .filter(s -> s.startsWith(startsWith))
                .count();

        System.out.println("Number of strings starting with '" + startsWith + "' in empty list: " + count);


        // Example with null values in the list:  (Handles nulls safely)
        List<String> listWithNulls = Arrays.asList("Hello there", null, "Hello again", "Not hello", null);
        startsWith = "Hello";

        count = listWithNulls.stream()
                .filter(s -> s != null && s.startsWith(startsWith)) // Important null check
                .count();

        System.out.println("Number of strings starting with '" + startsWith + "' in list with nulls: " + count);



        // Example with an empty "startsWith" string: (Matches all strings, except nulls if we check for them)
        List<String> moreStrings = Arrays.asList("One", "Two", "Three", "");
        startsWith = "";

        count = moreStrings.stream()
                .filter(s -> s != null && s.startsWith(startsWith)) //  Null check optional but good practice.
                .count();

        System.out.println("Number of strings starting with '' (empty string): " + count);
    }
}
