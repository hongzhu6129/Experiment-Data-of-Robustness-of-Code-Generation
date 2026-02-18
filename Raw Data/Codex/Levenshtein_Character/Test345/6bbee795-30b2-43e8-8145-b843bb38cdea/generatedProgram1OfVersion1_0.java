import java.util.Arrays;

public class FewerGreaterThanAverage {

    public static void main(String[] args) {
        // Example usage:
        int[] arr1 = {1, 2, 3, 4, 5};
        findFewerGreaterThanAverage(arr1); // Output: 2

        int[] arr2 = {5, 4, 3, 2, 1};
        findFewerGreaterThanAverage(arr2); // Output: 2

        int[] arr3 = {2, 2, 2, 2, 2};
        findFewerGreaterThanAverage(arr3); // Output: 0

        int[] arr4 = {1, 10, 2, 9, 3};
        findFewerGreaterThanAverage(arr4); // Output: 2


         int[] arr5 = {}; // Empty array
        findFewerGreaterThanAverage(arr5);  // Output: 0
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
