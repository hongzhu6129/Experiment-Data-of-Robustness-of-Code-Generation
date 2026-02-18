import java.util.ArrayList;
import java.util.Arrays;

public class MinSubarraySum {

    public static void main(String[] args) {
        // Example usage:
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4));
        int minSum1 = min_SubArray(arr1);
        System.out.println("Min sum subarray for arr1: " + minSum1); // Output: -5


        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1));
        int minSum2 = min_SubArray(arr2);
        System.out.println("Min sum subarray for arr2: " + minSum2); // Output: 1


        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(5, 4, -1, 7, 8));
        int minSum3 = min_SubArray(arr3);
        System.out.println("Min sum subarray for arr3: " + minSum3); // Output: -1
    }

    public static int min_SubArray(ArrayList<Integer> arr) {
        if (arr == null || arr.isEmpty()) {
            return 0; // Or throw an exception, depending on how you want to handle empty input
        }

        int minSoFar = arr.get(0);
        int currentMin = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            currentMin = Math.min(arr.get(i), currentMin + arr.get(i));
            minSoFar = Math.min(minSoFar, currentMin);
        }

        return minSoFar;
    }
}
