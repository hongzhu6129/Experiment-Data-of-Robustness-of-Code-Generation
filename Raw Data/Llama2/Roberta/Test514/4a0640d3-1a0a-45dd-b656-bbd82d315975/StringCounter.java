import java.util.List;
import java.util.Arrays;

public class StringCounter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "apricot", "banana", "avocado", "blueberry");
        char specificLetter = 'a';

        long count = strings.stream()
                .filter(s -> s.length() > 0 && s.charAt(0) == specificLetter)
                .count();

        System.out.println("Number of strings starting with '" + specificLetter + "': " + count);


        // Example with an empty list:
        List<String> emptyList = Arrays.asList();
        long emptyCount = emptyList.stream()
                .filter(s -> s.length() > 0 && s.charAt(0) == 'a')
                .count();
        System.out.println("Number of strings starting with 'a' in empty list: " + emptyCount);


        // Example with null values in the list:
        List<String> listWithNulls = Arrays.asList("apple", null, "apricot", "banana", null);
        long countWithNulls = listWithNulls.stream()
                .filter(s -> s != null && s.length() > 0 && s.charAt(0) == 'a')
                .count();
        System.out.println("Number of strings starting with 'a' in list with nulls: " + countWithNulls);



        // Example with empty strings in the list:
         List<String> listWithEmptyStrings = Arrays.asList("apple", "", "apricot", "banana", "");
         long countWithEmptyStrings = listWithEmptyStrings.stream()
                .filter(s -> s != null && s.length() > 0 && s.charAt(0) == 'a')
                .count();
         System.out.println("Number of strings starting with 'a' in list with empty strings: " + countWithEmptyStrings);


    }
}
