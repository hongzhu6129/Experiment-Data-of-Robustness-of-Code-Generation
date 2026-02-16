import java.util.List;
import java.util.Arrays;

public class SumEvenOddComparison {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Calculate the sum of comparisons (even > odd) using streams
        long sumOfComparisons = numbers.stream()
                .flatMapToInt(n -> numbers.stream()
                        .filter(m -> n % 2 == 0 && m % 2 != 0) // Filter for even n and odd m
                        .mapToInt(m -> Integer.compare(n, m))) // Compare n and m
                .sum();


        System.out.println("Sum of even > odd comparisons: " + sumOfComparisons);


         // More concise and arguably clearer approach using filter and count:
        long sumComparisonsConcise = numbers.stream()
                .filter(n -> n % 2 == 0) // Filter for even numbers
                .mapToLong(n -> numbers.stream()
                        .filter(m -> m % 2 != 0)  // Filter for odd numbers
                        .filter(m -> n > m) // Keep only where even > odd
                        .count()) // Count the number of odd numbers smaller than the even number
                .sum(); // Sum the counts

        System.out.println("Sum of even > odd comparisons (concise): " + sumComparisonsConcise);
    }
}
