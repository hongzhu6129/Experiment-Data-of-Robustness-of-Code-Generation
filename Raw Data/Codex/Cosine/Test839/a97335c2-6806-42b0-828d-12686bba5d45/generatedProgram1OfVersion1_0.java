import java.util.List;
import java.util.Arrays;

public class SumEvenOddComparison {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        long sumOfComparisons = numbers.stream()
                .mapToLong(num -> {
                    if (num % 2 == 0) { // Even
                        return numbers.stream()
                                .filter(other -> other % 2 != 0) // Count comparisons with odds
                                .count();
                    } else { // Odd
                        return numbers.stream()
                                .filter(other -> other % 2 == 0) // Count comparisons with evens
                                .count();
                    }
                })
                .sum();


        System.out.println("Sum of even-odd comparisons: " + sumOfComparisons);


        // More efficient approach (calculates the counts once):
        long evenCount = numbers.stream().filter(n -> n % 2 == 0).count();
        long oddCount = numbers.stream().filter(n -> n % 2 != 0).count();

        long sumOfComparisonsEfficient = evenCount * oddCount;


         System.out.println("Sum of even-odd comparisons (efficient): " + sumOfComparisonsEfficient);
    }
}
