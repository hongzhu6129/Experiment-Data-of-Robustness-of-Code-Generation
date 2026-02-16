import java.util.Arrays;

public class AboveAverage {

    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 4, 2, 7, 3, 9, 5, 6, 8};

        // Calculate the average
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Average: " + average);
        System.out.print("Numbers greater than the average: ");

        // Find and print numbers greater than the average
        for (int number : numbers) {
            if (number > average) {
                System.out.print(number + " ");
            }
        }
        System.out.println(); // New line for cleaner output


        // Example with a different array  (you can comment out the above example and use this one instead)
        // int[] numbers2 = {10, 20, 30, 40, 15, 25, 35};
        //
        // sum = 0; // Reset sum for the new array
        // for (int number : numbers2) {
        //    sum += number;
        // }
        // average = sum / numbers2.length; // Recalculate average

        // System.out.println("Array: " + Arrays.toString(numbers2));
        // System.out.println("Average: " + average);
        // System.out.print("Numbers greater than the average: ");
        //
        // for (int number : numbers2) {
        //    if (number > average) {
        //        System.out.print(number + " ");
        //    }
        //}
        //System.out.println();



    }
}
