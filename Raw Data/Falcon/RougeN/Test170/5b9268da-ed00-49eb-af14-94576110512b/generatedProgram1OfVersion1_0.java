import java.util.ArrayList;
import java.util.Arrays;

public class SlidingWindowMaximum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        int k = 3;
        ArrayList<Integer> result = maxSlidingWindow(nums, k);
        System.out.println(result); // Output: [3, 4, 5, 6, 7, 8, 8]

        int[] nums2 = {1, 3, -1, -3, 5, 3, 6, 7};
        int k2 = 3;
        ArrayList<Integer> result2 = maxSlidingWindow(nums2, k2);
        System.out.println(result2); // Output: [3, 3, 5, 5, 6, 7]


    }


    public static ArrayList<Integer> maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i <= nums.length - k; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, nums[j]);
            }
            result.add(max);
        }
        return result;
    }


    // These methods are not needed for this specific problem but are kept
    // in the code to match the requested method signatures.
    // They can be used for other related problems if needed.
    public static ArrayList<Integer> count_smaller_number(int[] nums1, int[] nums2) {
        // Placeholder implementation -  not used in the sliding window problem
        return new ArrayList<>();
    }

    private static int temp(int[] nums, int target) {
        // Placeholder implementation - not used in the sliding window problem
        return 0;
    }


}
