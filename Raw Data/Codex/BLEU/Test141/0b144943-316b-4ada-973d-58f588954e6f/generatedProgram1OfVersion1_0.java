import java.util.ArrayList;
import java.util.Arrays;

public class SlidingWindowMaximum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        int k = 3;
        ArrayList<Integer> result = maxSlidingWindow(nums, k);
        System.out.println(result); // Output: [3, 4, 5, 6, 7, 8, 8]
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

    // Unused methods as per the prompt restrictions:
    public static ArrayList<Integer> count_smaller_number(int[] nums1, int[] nums2) {
        return null; // Not used
    }

    private static int temp(int[] nums, int target) {
        return -1; // Not used
    }
}
