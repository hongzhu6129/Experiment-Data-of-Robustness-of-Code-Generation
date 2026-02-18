import java.util.HashSet;
import java.util.Set;

public class UniqueThreeDigitNumbers {

    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4};
        Set<Integer> uniqueNumbers = new HashSet<>(); // Use a Set to ensure uniqueness

        int count = 0;

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i != j && i != k && j != k) { // Ensure all digits are different
                        int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                        uniqueNumbers.add(number);
                        count++;
                    }
                }
            }
        }

        System.out.println("Unique three-digit numbers:");
        for (int number : uniqueNumbers) {
            System.out.println(number);
        }

        System.out.println("\nTotal count of unique three-digit numbers: " + count);


        // --- Test Cases ---
        test(new int[]{1, 2, 3, 4}, 24);  // Standard case
        test(new int[]{1, 1, 1, 1}, 0);   // All digits the same (corner case)
        test(new int[]{1, 2, 3, 3}, 12);  // Two digits the same (edge case)
        test(new int[]{9, 8, 7}, 6);       // Only three distinct digits


    }


    // Helper function for testing
    public static void test(int[] digits, int expectedCount) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        int count = 0;
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {

                  if (digits.length >= 3 && i != j && i != k && j != k) {
                    int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                    uniqueNumbers.add(number);
                    count++;
                  }


                }
            }
        }

        if (count == expectedCount) {
            System.out.println("Test Passed for input " + java.util.Arrays.toString(digits));

        } else {
            System.err.println("Test Failed for input " + java.util.Arrays.toString(digits) +
                    ". Expected: " + expectedCount + ", Actual: " + count );


        }


    }


}

