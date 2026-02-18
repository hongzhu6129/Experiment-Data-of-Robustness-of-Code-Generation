import java.util.*;

public class SubarraySumZero {

    public static List<Integer> subarraySum(int[] arr) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        int sum = 0;
        List<Integer> result = new ArrayList<>();

        // Base case: If the array itself has a sum of zero
        if (Arrays.stream(arr).sum() == 0) {
            result.add(0);
            result.add(arr.length - 1);
            return result;
        }

        sumMap.put(0, -1); // Handle cases where the subarray starts at index 0

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sumMap.containsKey(sum)) {
                result.add(sumMap.get(sum) + 1);
                result.add(i);
                return result;
            }

            sumMap.put(sum, i);
        }

        return result; // Return an empty list if no such subarray exists
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, -6, 5, 4};
        List<Integer> result1 = subarraySum(arr1);
        System.out.println("index of the subarray where the sum of numbers is zero: " + result1);

        int[] arr2 = {1, 2, -3, 4, -4};  // Test case with subarray at the beginning
        List<Integer> result2 = subarraySum(arr2);
        System.out.println("index of the subarray where the sum of numbers is zero: " + result2);

           int[] arr3 = {0, 1, 2, -3};  // Test case with a single zero element
        List<Integer> result3 = subarraySum(arr3);
        System.out.println("index of the subarray where the sum of numbers is zero: " + result3);

        int[] arr4 = {1, 2, 3, 4, 5};  // Test case with no subarray summing to zero
        List<Integer> result4 = subarraySum(arr4);
        System.out.println("index of the subarray where the sum of numbers is zero: " + result4);

        int[] arr5 = {-1, -2, 3, 0, 5, -7, -2, 5}; // More complex test case
        List<Integer> result5 = subarraySum(arr5);
        System.out.println("index of the subarray where the sum of numbers is zero: " + result5);

    }
}
