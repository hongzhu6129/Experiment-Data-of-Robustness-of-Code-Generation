import java.util.ArrayList;
import java.util.List;

public class SubarraySumZero {

    public static List<Integer> subarraySum(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) {
                    result.add(i);
                    result.add(j);
                    return result; // Return immediately after finding the first subarray
                }
            }
        }
        return result; // Return empty list if no such subarray is found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -6, 5, 4};
        List<Integer> indices = subarraySum(arr);
        System.out.println("Index of the subarray where the sum of numbers is zero: " + indices);

        // Another test case
        int[] arr2 = {1, 2, -3, 4, -4};
        List<Integer> indices2 = subarraySum(arr2);
        System.out.println("Index of the subarray where the sum of numbers is zero: " + indices2);


        // Test case with no such subarray
        int[] arr3 = {1, 2, 3, 4, 5};
        List<Integer> indices3 = subarraySum(arr3);
        System.out.println("Index of the subarray where the sum of numbers is zero: " + indices3);
    }
}
