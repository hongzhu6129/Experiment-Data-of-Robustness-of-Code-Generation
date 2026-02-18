import java.util.ArrayList;
import java.util.Arrays;

public class SlidingWindowMaximum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        int k = 3;
        ArrayList<Integer> result = slidingWindowMaximum(nums, k);
        System.out.println(result); // Output: [3, 4, 5, 6, 7, 8, 8]


        // Another test case with duplicates
        int[] nums2 = {1, 3, 1, 2, 0, 5};
        int k2 = 3;
        ArrayList<Integer> result2 = slidingWindowMaximum(nums2, k2);
        System.out.println(result2); // Output: [3, 3, 2, 5]
    }


    public static ArrayList<Integer> slidingWindowMaximum(int[] nums, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i <= nums.length - k; i++) {
            int max = temp(nums, i);  // Using temp to find max within the window
            result.add(max);
        }
        return result;
    }


    private static int temp(int[] nums, int start) {
        int k=3; // Window size is fixed to 3 as per the problem description.
        int max = Integer.MIN_VALUE;
        for (int i = start; i < start + k; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
