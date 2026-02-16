import java.util.HashSet;
import java.util.Set;

public class UniqueThreeDigitNumbers {

    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4};
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i != j && i != k && j != k) {
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
    }
}
