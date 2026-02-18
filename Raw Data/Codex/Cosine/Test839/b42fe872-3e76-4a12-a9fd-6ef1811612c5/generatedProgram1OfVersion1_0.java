import java.util.Arrays;
import java.util.List;

public class SumEvenOddStreams {

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


        // Example with a different list:
        List<Integer> numbers2 = Arrays.asList(11, 12, 13, 14, 15, 16);

        int sumEven2 = numbers2.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)  // or .reduce(0, Integer::sum)
                .sum();

         int sumOdd2 = numbers2.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue) // or .reduce(0, Integer::sum)
                .sum();

        System.out.println("Sum of even numbers (list 2): " + sumEven2);
        System.out.println("Sum of odd numbers (list 2): " + sumOdd2);


    }
}
