import java.util.List;
import java.util.Arrays;

public class SumEvenOdd {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumOfEvens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        int sumOfOdds = numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();


        System.out.println("Sum of even numbers: " + sumOfEvens);
        System.out.println("Sum of odd numbers: " + sumOfOdds);

         // Example with a different list:
        List<Integer> numbers2 = Arrays.asList(11, 12, 13, 14, 15);
        int evenSum2 = numbers2.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        int oddSum2 = numbers2.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of evens (list 2): " + evenSum2);
        System.out.println("Sum of odds (list 2): " + oddSum2);

    }
}
