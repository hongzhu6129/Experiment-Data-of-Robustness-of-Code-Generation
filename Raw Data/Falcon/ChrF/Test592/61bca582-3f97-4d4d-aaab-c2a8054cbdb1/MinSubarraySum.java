import java.util.ArrayList;
import java.util.Arrays;

class MinSubarraySum {

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4));
        int minSum1 = min_SubArray(arr1);
        System.out.println("Min sum subarray for arr1: " + minSum1); // Output: -5


        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1));
        int minSum2 = min_SubArray(arr2);
        System.out.println("Min sum subarray for arr2: " + minSum2); // Output: 1

        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(5, 4, -1, 7, 8));
        int minSum3 = min_SubArray(arr3);
        System.out.println("Min sum subarray for arr3: " + minSum3); // Output: -1


        ArrayList<Integer> arr4 = new ArrayList<>(Arrays.asList(-5, -4, -1, -7, -8)); //all negative
        int minSum4 = min_SubArray(arr4);
        System.out.println("Min sum subarray for arr4: " + minSum4); // Output: -25 (sum of entire array)



    }

    public static int min_SubArray(ArrayList<Integer> arr) {
        if (arr == null || arr.isEmpty()) {
            return 0; // Or throw an exception, depending on how you want to handle empty input
        }

        int minSoFar = Integer.MAX_VALUE;
        int currentMin = 0;

        for (int num : arr) {
            currentMin += num;

            if (currentMin < minSoFar) {
                minSoFar = currentMin;
            }

            if (currentMin > 0) {
                currentMin = 0; // Reset if current sum becomes positive
            }
        }

        return minSoFar;
    }
}
