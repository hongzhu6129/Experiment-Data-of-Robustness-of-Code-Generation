import java.util.Arrays;
import java.util.List;

public class StringCounter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "apricot", "avocado", "orange");
        char startingLetter = 'a';

        long count = strings.stream()
                .filter(s -> s.startsWith(String.valueOf(startingLetter)))
                .count();

        System.out.println("Number of strings starting with '" + startingLetter + "': " + count);


        // Example with different letter
        startingLetter = 'b';
        count = strings.stream()
                .filter(s -> s.startsWith(String.valueOf(startingLetter)))
                .count();
        System.out.println("Number of strings starting with '" + startingLetter + "': " + count);



        //Example with empty List
         List<String> emptyList = Arrays.asList();
         startingLetter = 'a';
        count = emptyList.stream()
                .filter(s -> s.startsWith(String.valueOf(startingLetter)))
                .count();
        System.out.println("Number of strings starting with '" + startingLetter + "' in empty list: " + count);



        // Example with null values in the List
        List<String> listWithNulls = Arrays.asList("apple", null, "apricot", null, "avocado");
        startingLetter = 'a';
        count = listWithNulls.stream()
                .filter(s -> s != null && s.startsWith(String.valueOf(startingLetter))) // Handle nulls safely
                .count();
        System.out.println("Number of strings starting with '" + startingLetter + "' (handling nulls): " + count);


    }
}
