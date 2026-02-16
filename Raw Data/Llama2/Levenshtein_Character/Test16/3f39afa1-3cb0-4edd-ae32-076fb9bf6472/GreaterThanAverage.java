import java.util.Arrays;

public class GreaterThanAverage {

    public static void main(String[] args) {
        // Example usage:
        int[] numbers = {1, 5, 2, 8, 3, 9, 4, 7, 6};
        findGreaterThanAverage(numbers);

        int[] numbers2 = {10, 20, 30, 40, 50};
        findGreaterThanAverage(numbers2);

        int[] emptyArray = {};
        findGreaterThanAverage(emptyArray);


        int[] singleElementArray = {5};
        findGreaterThanAverage(singleElementArray);

    }

    public static void findGreaterThanAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        double sum = 0;
        for (int num : arr) {
            sum += num;
        }

        double average = sum / arr.length;

        System.out.print("Numbers greater than the average (" + average + "): ");

        boolean foundGreater = false; // Flag to track if any numbers are greater
        for (int num : arr) {
            if (num > average) {
                System.out.print(num + " ");
                foundGreater = true;
            }
        }

        if (!foundGreater) {
             System.out.print("None"); // Handle cases where no number is greater
        }

        System.out.println(); // Newline for better output formatting

    }
}
