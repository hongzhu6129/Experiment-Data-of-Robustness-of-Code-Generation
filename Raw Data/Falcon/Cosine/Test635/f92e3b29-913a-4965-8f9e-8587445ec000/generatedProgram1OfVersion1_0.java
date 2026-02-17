import java.util.HashSet;
import java.util.Set;

public class UniqueThreeDigitNumbers {

    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4};
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i != j && i != k && j != k) { // Ensure digits are unique
                        int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                        uniqueNumbers.add(number);
                    }
                }
            }
        }

        System.out.println("Unique three-digit numbers:");
        for (int number : uniqueNumbers) {
            System.out.println(number);
        }

        System.out.println("\nCount of unique three-digit numbers: " + uniqueNumbers.size());


        // --- Test Cases ---
        test(new int[]{1, 2, 3, 4}, 24); // Standard case
        test(new int[]{1, 1, 1, 1}, 0);  // All digits the same - Corner case
        test(new int[]{1, 2, 3}, 6);   // Fewer than 4 digits - Corner case
        test(new int[]{1, 2, 2, 3}, 12); // Duplicate digit - Corner case


    }

    // Helper function for testing:
    public static void test(int[] digits, int expectedCount) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i != j && i != k && j != k) {
                        uniqueNumbers.add(digits[i] * 100 + digits[j] * 10 + digits[k]);
                    }
                }
            }
        }
        if(uniqueNumbers.size() == expectedCount) {
            System.out.println("Test passed for " + java.util.Arrays.toString(digits));
        } else {
            System.err.println("Test FAILED for " + java.util.Arrays.toString(digits) + ". Expected: " + expectedCount + ", Got: " + uniqueNumbers.size());
        }
    }

}



