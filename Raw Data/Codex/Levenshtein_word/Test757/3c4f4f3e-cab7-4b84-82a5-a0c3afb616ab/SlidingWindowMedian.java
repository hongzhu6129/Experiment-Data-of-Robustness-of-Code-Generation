import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SlidingWindowMedian {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        int k = 3;
        ArrayList<Integer> medians = findSlidingWindowMedians(nums, k);
        System.out.println(medians); // Output: [2, 3, 4, 5, 6, 7, 8]
    }

    public static ArrayList<Integer> findSlidingWindowMedians(int[] nums, int k) {
        ArrayList<Integer> medians = new ArrayList<>();
        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            return medians;
        }

        for (int i = 0; i <= nums.length - k; i++) {
            int[] window = Arrays.copyOfRange(nums, i, i + k);
            Arrays.sort(window); // Sort the window to find the median
            medians.add(window[k / 2]);
        }
        return medians;
    }


    // These methods are not used in the solution but are kept to match the signature requirement
    public static ArrayList<Integer> count_smaller_number(int[] nums1, int[] nums2) {
        return new ArrayList<>(); // Dummy implementation
    }

    private static int temp(int[] nums, int target) {
        return -1; // Dummy implementation
    }


}
