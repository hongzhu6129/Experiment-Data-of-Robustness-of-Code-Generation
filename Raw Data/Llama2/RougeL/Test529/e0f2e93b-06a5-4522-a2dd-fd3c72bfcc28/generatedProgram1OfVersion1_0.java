import java.util.List;
import java.util.Arrays;

public class StringCounter {

    public static void main(String[] args) {
        // Example usage:
        List<String> strings = Arrays.asList("apple", "banana", "avocado", "apricot", "orange");
        char startingLetter = 'a';

        long count = countStringsStartingWith(strings, startingLetter);

        System.out.println("Number of strings starting with '" + startingLetter + "': " + count);


        startingLetter = 'b'; // Change the starting letter
        count = countStringsStartingWith(strings, startingLetter);
        System.out.println("Number of strings starting with '" + startingLetter + "': " + count);


        // Example with an empty list:
        List<String> emptyList = Arrays.asList();
        startingLetter = 'a';
        count = countStringsStartingWith(emptyList, startingLetter);
        System.out.println("Number of strings starting with '" + startingLetter + "': " + count);



         // Example with null list (handle potential NullPointerException):
        List<String> nullList = null;
        startingLetter = 'z';

         count = countStringsStartingWith(nullList, startingLetter); // This will now handle null gracefully
         System.out.println("Number of strings starting with '" + startingLetter + "': " + count);


    }

    private static long countStringsStartingWith(List<String> strings, char startingLetter) {
         if (strings == null) {
            return 0; // Or handle it differently as per your requirement
        }
        return strings.stream()
                .filter(str -> !str.isEmpty() && str.charAt(0) == startingLetter) // Handle empty strings
                .count();

    }
}
