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
                    // Ensure digits are unique within the number
                    if (i != j && i != k && j != k) {
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
        System.out.println("Total count of unique three-digit numbers (using set size): " + uniqueNumbers.size()); // Verification using set size

    }
}


