import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class UniqueThreeDigit {

    public static void main(String[] args) {
        Set<Integer> uniqueNumbers = generateUniqueThreeDigitNumbers(1, 2, 3, 4);

        System.out.println("Unique three-digit numbers:");
        for (int num : uniqueNumbers) {
            System.out.println(num);
        }

        System.out.println("\nCount of unique three-digit numbers: " + uniqueNumbers.size());
    }

    public static Set<Integer> generateUniqueThreeDigitNumbers(int... digits) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        generatePermutations(digits, 0, uniqueNumbers);
        return uniqueNumbers;
    }



    private static void generatePermutations(int[] digits, int index, Set<Integer> uniqueNumbers) {
        if (index == digits.length) {
            int number = digits[0] * 100 + digits[1] * 10 + digits[2];  // Construct the 3-digit number
            if (number >= 100 && number <= 999) { // Check if it is a valid 3-digit number
                uniqueNumbers.add(number);
            }
            return;
        }


        for (int i = index; i < digits.length; i++) {
            swap(digits, index, i);
            generatePermutations(digits, index + 1, uniqueNumbers);
            swap(digits, index, i); // Backtrack: restore the original order
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


