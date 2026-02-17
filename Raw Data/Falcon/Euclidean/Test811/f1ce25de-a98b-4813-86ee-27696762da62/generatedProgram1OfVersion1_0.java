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


        // Example with a different list (including negatives and zero)
         List<Integer> numbers2 = Arrays.asList(-2, 0, 1, -3, 4, 5, -6, 7, 8, -9, 10);


        int sumEven2 = numbers2.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        int sumOdd2 = numbers2.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();


        System.out.println("Sum of even numbers (List 2): " + sumEven2);
        System.out.println("Sum of odd numbers (List 2): " + sumOdd2);


    }
}
