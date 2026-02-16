import java.util.Arrays;

public class GreaterThanAverage {

    public static void main(String[] args) {
        // Example usage:
        int[] numbers = {1, 4, 2, 7, 5, 9, 3};
        findGreaterThanAverage(numbers);

        int[] numbers2 = {10, 20, 30, 40, 50};
        findGreaterThanAverage(numbers2);

         int[] numbers3 = {}; // Empty array
        findGreaterThanAverage(numbers3);

        int[] numbers4 = null; // Null array
        findGreaterThanAverage(numbers4);

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
        for (int num : arr) {
            if (num > average) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // New line for better output formatting

    }
}
