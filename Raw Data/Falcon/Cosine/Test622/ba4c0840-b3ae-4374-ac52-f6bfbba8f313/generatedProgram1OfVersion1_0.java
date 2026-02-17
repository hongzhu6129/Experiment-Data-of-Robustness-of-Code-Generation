import java.util.Arrays;

public class AboveAverage {

    public static void main(String[] args) {
        // Example array of numbers
        int[] numbers = {1, 5, 2, 8, 3, 9, 4, 7, 6, 10};

        // Calculate the average
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;

        // Print the original array and the average
        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("Average: " + average);

        // Find and print numbers greater than the average
        System.out.print("Numbers greater than the average: ");
        for (int number : numbers) {
            if (number > average) {
                System.out.print(number + " ");
            }
        }
        System.out.println(); // New line for cleaner output


        // Example with a different array (you can change this to test with other values)
        int[] numbers2 = {20, 10, 30, 5, 15};
        sum = 0; // Reset sum
        for (int number : numbers2) {
            sum += number;
        }
        average = sum / numbers2.length; // Recalculate average

        System.out.println("\nAnother example:");
        System.out.println("Original array: " + Arrays.toString(numbers2));
        System.out.println("Average: " + average);
        System.out.print("Numbers greater than the average: ");
        for (int number : numbers2) {
            if (number > average) {
                System.out.print(number + " ");
            }
        }
        System.out.println();


        // Example with an empty array
         int[] numbers3 = {};
        sum = 0; // Reset sum
        if (numbers3.length > 0) { // Prevent division by zero
             for (int number : numbers3) {
                 sum += number;
             }
             average = sum / numbers3.length; // Recalculate average

             System.out.println("\nExample with an empty array:");
             System.out.println("Original array: " + Arrays.toString(numbers3));
             System.out.println("Average: " + average); // Average will be NaN (Not a Number) or potentially 0 depending on how Java handles this edge case
             System.out.print("Numbers greater than the average: ");
             for (int number : numbers3) {
                  if (number > average) {
                      System.out.print(number + " ");
                  }
             }
             System.out.println(); 
        } else {
             System.out.println("\nExample with an empty array:");
             System.out.println("The array is empty, so there is no average or numbers to compare.");
        }

    }
}
