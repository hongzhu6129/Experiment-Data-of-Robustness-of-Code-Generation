import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueThreeAndFiveDigitNumbers {

    public static void main(String[] args) {
        List<Integer> digits = Arrays.asList(1, 2, 3, 4);
        Set<Integer> threeDigitNumbers = generateUniqueThreeDigitNumbers(digits);

        System.out.println("Unique three-digit numbers:");
        for (int num : threeDigitNumbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nCount of unique three-digit numbers: " + threeDigitNumbers.size());

        long fiveDigitCount = countFiveDigitNumbers(digits);
        System.out.println("\nCount of five-digit numbers: " + fiveDigitCount);


        // --- Test Cases ---
        testGenerateUniqueThreeDigitNumbers();
        testCountFiveDigitNumbers();

    }

    public static Set<Integer> generateUniqueThreeDigitNumbers(List<Integer> digits) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int i : digits) {
            for (int j : digits) {
                for (int k : digits) {
                    if (i != j && i != k && j != k) {
                        uniqueNumbers.add(i * 100 + j * 10 + k);
                    }
                }
            }
        }
        return uniqueNumbers;
    }

    public static long countFiveDigitNumbers(List<Integer> digits) {
        // Using permutations (allowing repetition): digits.size() ^ 5
        return (long) Math.pow(digits.size(), 5); 
    }


    // Test cases
    public static void testGenerateUniqueThreeDigitNumbers() {
        List<Integer> digits1 = Arrays.asList(1, 2, 3, 4);
        Set<Integer> result1 = generateUniqueThreeDigitNumbers(digits1);
        System.out.println("\nTest Case 1 (1,2,3,4):  Expected Size: 24, Actual size: " + result1.size()); //24 permutations

        List<Integer> digits2 = Arrays.asList(1, 1, 1, 1); // Corner case: all digits same. Expect 0
        Set<Integer> result2 = generateUniqueThreeDigitNumbers(digits2);
        System.out.println("Test Case 2 (1,1,1,1): Expected Size: 0, Actual size: " + result2.size());


        List<Integer> digits3 = Arrays.asList(1, 2, 3); // Corner case: Fewer than 4 digits
        Set<Integer> result3 = generateUniqueThreeDigitNumbers(digits3);
        System.out.println("Test Case 3 (1,2,3): Expected Size: 6, Actual size: " + result3.size()); // 3! = 6


    }

    public static void testCountFiveDigitNumbers() {

        List<Integer> digits1 = Arrays.asList(1, 2, 3, 4);
        long result1 = countFiveDigitNumbers(digits1);
        System.out.println("\nTest Case 4 five digits (1,2,3,4): Expected: 1024, Actual: " + result1); //4^5

        List<Integer> digits2 = Arrays.asList(0);    // Corner case: only one distinct digit
        long result2 = countFiveDigitNumbers(digits2);
        System.out.println("Test Case 5 five digits (0)     : Expected: 1, Actual: " + result2);

        List<Integer> digits3 = new ArrayList<>(); // Corner case : empty list
        long result3 = countFiveDigitNumbers(digits3); // Should be 0
        System.out.println("Test Case 6 five digits ()      : Expected: 0, Actual: " + result3);


    }
}
