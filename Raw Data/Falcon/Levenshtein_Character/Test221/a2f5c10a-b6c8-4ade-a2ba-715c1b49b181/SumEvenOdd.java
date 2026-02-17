import java.util.Arrays;
import java.util.List;

public class SumEvenOdd {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        int sumOdd = numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);


        // Example with a different list (including negatives and zero):
        List<Integer> numbers2 = Arrays.asList(-2, -1, 0, 1, 2, 3, 4, 5);

         sumEven = numbers2.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

         sumOdd = numbers2.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of even numbers (list 2): " + sumEven);
        System.out.println("Sum of odd numbers (list 2): " + sumOdd);

    }
}
