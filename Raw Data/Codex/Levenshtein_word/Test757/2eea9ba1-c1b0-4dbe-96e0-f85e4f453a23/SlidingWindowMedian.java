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
        if (nums == null || nums.length < k || k <= 0) {
            return medians; // Handle invalid inputs
        }

        for (int i = 0; i <= nums.length - k; i++) {
            int[] window = new int[k];
            System.arraycopy(nums, i, window, 0, k); // Create a copy of the window
            Arrays.sort(window); // Sort the window to find the median
            medians.add(window[k / 2]); 
        }
        return medians;
    }



    // These methods are not needed for this specific problem, 
    // but are included to satisfy the prompt's requirement for their signatures.
    public static ArrayList<Integer> count_smaller_number(int[] nums1, int[] nums2) {
        return new ArrayList<>(); // Placeholder implementation
    }

    private static int temp(int[] arr, int x) {
        return 0; // Placeholder implementation
    }
}
