import java.util.ArrayList;
import java.util.List;

public class MinSubarraySum {

    public static void main(String[] args) {
        // Example usage:
        List<Integer> arr1 = new ArrayList<>(List.of(-2, 1, -3, 4, -1, 2, 1, -5, 4));
        int minSum1 = min_SubArray(arr1);
        System.out.println("Min sum subarray for arr1: " + minSum1); // Output: -5


        List<Integer> arr2 = new ArrayList<>(List.of(1, 2, 3, -4, 5));
        int minSum2 = min_SubArray(arr2);
        System.out.println("Min sum subarray for arr2: " + minSum2); // Output: -4

        List<Integer> arr3 = new ArrayList<>(List.of(1));
        int minSum3 = min_SubArray(arr3);
        System.out.println("Min sum subarray for arr3: " + minSum3); // Output: 1


        List<Integer> arr4 = new ArrayList<>(List.of(-1,-2,-3));
        int minSum4 = min_SubArray(arr4);
        System.out.println("Min sum subarray for arr4: " + minSum4); // Output: -6



    }

    public static int min_SubArray(List<Integer> arr) {
        if (arr == null || arr.isEmpty()) {
            return 0; // Or throw an exception, depending on desired behavior for empty input
        }


        int minSoFar = arr.get(0); // Initialize with the first element
        int currentMin = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            currentMin = Math.min(arr.get(i), currentMin + arr.get(i)); //Kadane's Algorithm logic
            minSoFar = Math.min(minSoFar, currentMin);
        }

        return minSoFar;
    }
}
