import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubarraySumZero {

    public static List<Integer> subarraySum(int[] arr) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> sumIndexMap = new HashMap<>();

        int sum = 0;
        sumIndexMap.put(0, -1); // Handle the case where subarray starts from index 0

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sumIndexMap.containsKey(sum)) {
                result.add(sumIndexMap.get(sum) + 1);
                result.add(i);
                return result;
            }

            sumIndexMap.put(sum, i);
        }

        return result; // Return empty list if no such subarray exists
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, -6, 5, 4};
        List<Integer> result1 = subarraySum(arr1);
        System.out.println("index of the subarray of the said array where the sum of numbers is zero: " + result1);

        int[] arr2 = {1, 2, -3, 4, -4};
        List<Integer> result2 = subarraySum(arr2);
        System.out.println("index of the subarray of the said array where the sum of numbers is zero: " + result2);


        int[] arr3 = {1, 2, 3, 4, 5}; // No subarray with sum zero
        List<Integer> result3 = subarraySum(arr3);
        System.out.println("index of the subarray of the said array where the sum of numbers is zero: " + result3);


    }
}
