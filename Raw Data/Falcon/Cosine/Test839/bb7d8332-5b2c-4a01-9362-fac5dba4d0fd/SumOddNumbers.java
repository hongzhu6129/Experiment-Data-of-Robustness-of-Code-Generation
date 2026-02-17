import java.util.List;
import java.util.Arrays;

public class SumOddNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Calculate the sum of odd numbers using streams
        int sumOdd = numbers.stream()
                .filter(n -> n % 2 != 0) // Filter for odd numbers
                .mapToInt(Integer::intValue) // Convert to IntStream
                .sum();


        System.out.println("Sum of odd numbers: " + sumOdd);


        // Example with more numbers, including multiples of 5:
        List<Integer> moreNumbers = Arrays.asList(1, 5, 2, 15, 3, 25, 4, 5, 6, 7, 35, 8, 45, 9, 10);

        int sumOddMore = moreNumbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of odd numbers (more numbers): " + sumOddMore);



    }
}
