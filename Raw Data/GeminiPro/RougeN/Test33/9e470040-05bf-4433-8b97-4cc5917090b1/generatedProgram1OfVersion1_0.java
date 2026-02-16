import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeDigitNumbers {

    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4};
        List<Integer> threeDigitNumbers = generateThreeDigitNumbers(digits);

        System.out.println("Three-digit numbers formed using 1, 2, 3, 4 (no repetition):");
        for (int num : threeDigitNumbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nCount of three-digit numbers: " + threeDigitNumbers.size());
    }


    public static List<Integer> generateThreeDigitNumbers(int[] digits) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(digits); // Ensure digits are sorted for consistent output


        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i != j && i != k && j != k) {  // No repetition allowed
                        int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                        result.add(num);
                    }
                }
            }
        }

        return result;
    }
}



