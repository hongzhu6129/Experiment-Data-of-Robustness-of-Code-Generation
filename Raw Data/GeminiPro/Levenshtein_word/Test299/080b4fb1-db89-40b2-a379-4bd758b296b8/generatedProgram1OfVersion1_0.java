import java.util.Arrays;

public class AboveAverage {

    public static void main(String[] args) {
        // Example usage:
        int[] numbers1 = {1, 2, 3, 4, 5};
        findNumbersAboveAverage(numbers1);

        int[] numbers2 = {5, 10, 15, 20};
        findNumbersAboveAverage(numbers2);

         int[] numbers3 = {}; // Empty array
        findNumbersAboveAverage(numbers3);

        int[] numbers4 = {5, 5, 5, 5};  // All same
        findNumbersAboveAverage(numbers4);

    }


    public static void findNumbersAboveAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("No numbers provided.");
            return;
        }


        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = sum / numbers.length;

        System.out.print("Numbers above average " + average + ": ");

        boolean foundAboveAverage = false; // Flag to handle cases where no numbers are above average

        for (int number : numbers) {
            if (number > average) {
                System.out.print(number + " ");
                foundAboveAverage = true;
            }
        }

        if (!foundAboveAverage) {
            System.out.print("None");
        }
        System.out.println(); // New line for cleaner output

    }
}
