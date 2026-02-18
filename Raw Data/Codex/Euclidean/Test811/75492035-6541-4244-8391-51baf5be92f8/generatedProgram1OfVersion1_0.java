import java.util.List;
import java.util.Arrays;

public class EvenNumberSum {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.stream()
                .filter(n -> n % 2 == 0) // Filter even numbers
                .mapToInt(Integer::intValue) // Convert to IntStream
                .sum();

        System.out.println("Sum of even numbers: " + sum);


        // Example with some negative numbers and zero
        List<Integer> numbers2 = Arrays.asList(-2, 0, 1, 2, 3, 4, -6, 6, 7, 8, 9, 10);

        int sum2 = numbers2.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

         System.out.println("Sum of even numbers (including negatives and zero): " + sum2);
    }
}
