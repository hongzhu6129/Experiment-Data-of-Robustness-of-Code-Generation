import java.util.HashSet;
import java.util.Set;

public class UniqueFiveDigit {

    public static void main(String[] args) {
        // Generate and display a unique five-digit number using 1, 2, 3, 4
        generateAndDisplayFiveDigit();

        // Count and display the number of three-digit numbers that can be formed using 1, 2, 3, 4 
        // (allowing repetition)
        int threeDigitCount = countThreeDigitNumbers();
        System.out.println("\nNumber of three-digit numbers: " + threeDigitCount);
    }


    public static void generateAndDisplayFiveDigit() {
        Set<Integer> digits = new HashSet<>();
        StringBuilder fiveDigitNumber = new StringBuilder();

        while (fiveDigitNumber.length() < 5) {
            int digit = (int) (Math.random() * 4) + 1; // Generates 1, 2, 3, or 4
            if (!digits.contains(digit)) {
                digits.add(digit);
                fiveDigitNumber.append(digit);
            }
        }
        System.out.println("Unique five-digit number: " + fiveDigitNumber.toString());
    }


    public static int countThreeDigitNumbers() {
        // With repetition allowed, each digit has 4 possibilities (1, 2, 3, or 4).
        // For a three-digit number, there are 4 * 4 * 4 possibilities.
        return 4 * 4 * 4;  // or Math.pow(4, 3) 
    }

}



