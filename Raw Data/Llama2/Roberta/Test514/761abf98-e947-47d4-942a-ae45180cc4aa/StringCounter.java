import java.util.List;
import java.util.Arrays;

public class StringCounter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello World", "Hello Java", "Goodbye World", "Hello Python", "Java is cool");
        String prefix = "Hello";

        long count = strings.stream()
                .filter(s -> s.startsWith(prefix))
                .count();

        System.out.println("Number of strings starting with '" + prefix + "': " + count);


        // Example with a different prefix and list for demonstration
         List<String> strings2 = Arrays.asList("apple pie", "apple sauce", "banana bread", "apple juice");
         String prefix2 = "apple";

         long count2 = strings2.stream()
                 .filter(s -> s.startsWith(prefix2))
                 .count();
         System.out.println("Number of strings starting with '" + prefix2 + "': " + count2);

    }
}
