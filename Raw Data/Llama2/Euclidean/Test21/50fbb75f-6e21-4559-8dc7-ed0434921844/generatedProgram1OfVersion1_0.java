import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class MedianSlidingWindow {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        int k = 3;
        ArrayList<Integer> result = medianSlidingWindow(nums, k);
        System.out.println(result); // Output: [2, 3, 4, 5, 6, 7, 8]
    }

    public static ArrayList<Integer> medianSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            return result;
        }

        for (int i = 0; i <= nums.length - k; i++) {
            int[] window = Arrays.copyOfRange(nums, i, i + k);
            Arrays.sort(window); 
            result.add(window[k / 2]);
        }

        return result;
    }


    // These methods are not used in the solution but are required by the prompt.
    public static ArrayList<Integer> count_smaller_number(int[] nums1, int[] nums2) {
        return new ArrayList<>(); // Placeholder implementation
    }

    private static int temp(int[] nums, int target) {
        return 0; // Placeholder implementation
    }
}
