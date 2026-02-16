import java.util.Arrays;

public class AboveAverage {

    public static void main(String[] args) {
        // Example usage:
        int[] numbers = {1, 5, 2, 8, 3, 9, 4, 7, 6};

        findAndPrintAboveAverage(numbers);

        numbers = new int[]{10, 20, 30, 40, 50};  // Another example
        findAndPrintAboveAverage(numbers);

         numbers = new int[]{5, 5, 5, 5, 5};     //  All same example
        findAndPrintAboveAverage(numbers);


        numbers = new int[]{};                   // Empty array example
        findAndPrintAboveAverage(numbers);
    }

    public static void findAndPrintAboveAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("The array is empty or null.");
            return;
        }


        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = sum / numbers.length;

        System.out.print("Numbers above average (" + average + "): ");

        boolean foundAboveAverage = false; // Flag to track if any numbers are above average

        for (int number : numbers) {
            if (number > average) {
                System.out.print(number + " ");
                foundAboveAverage = true;
            }
        }

        if (!foundAboveAverage) {
            System.out.print("None"); // Handle the case where no numbers are above average
        }
        
        System.out.println(); // Print a newline for better formatting.

    }
}




