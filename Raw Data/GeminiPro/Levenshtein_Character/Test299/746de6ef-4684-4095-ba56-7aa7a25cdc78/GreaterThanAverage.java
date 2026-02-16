import java.util.Arrays;

public class GreaterThanAverage {

    public static void main(String[] args) {
        // Example array of numbers (you can change this)
        int[] numbers = {1, 5, 2, 8, 3, 9, 4, 7, 6, 10}; 

        if (numbers.length == 0) {
            System.out.println("The array is empty.");
            return; // Exit early if the array has no elements
        }

        // Calculate the sum of the numbers
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Calculate the average
        double average = sum / numbers.length;

        // Print the original array (for clarity)
        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("Average: " + average);

        // Find and print numbers greater than the average
        System.out.print("Numbers greater than the average: ");
        for (int number : numbers) {
            if (number > average) {
                System.out.print(number + " ");
            }
        }
        System.out.println(); // Add a newline for better formatting
    }
}
