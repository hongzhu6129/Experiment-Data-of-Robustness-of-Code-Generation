import java.util.Arrays;

public class FewerGreaterThanAverage {

    public static void main(String[] args) {
        // Example usage:
        int[] arr1 = {1, 5, 2, 1, 4, 5, 3, 2};
        findFewerGreaterThanAverage(arr1); // Output: 4

        int[] arr2 = {1, 2, 3, 4, 5};
        findFewerGreaterThanAverage(arr2); // Output: 2

        int[] arr3 = {5, 4, 3, 2, 1};
        findFewerGreaterThanAverage(arr3); // Output: 2
        
        int[] arr4 = {}; // Empty array
        findFewerGreaterThanAverage(arr4); // Output: 0

        int[] arr5 = {3, 3, 3, 3, 3}; // All elements equal to average
        findFewerGreaterThanAverage(arr5); // Output: 0


    }

    public static void findFewerGreaterThanAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println(0);
            return;
        }

        double sum = 0;
        for (int num : arr) {
            sum += num;
        }

        double average = sum / arr.length;

        int count = 0;
        for (int num : arr) {
            if (num > average) {
                count++;
            }
        }

        System.out.println(count);
    }
}
