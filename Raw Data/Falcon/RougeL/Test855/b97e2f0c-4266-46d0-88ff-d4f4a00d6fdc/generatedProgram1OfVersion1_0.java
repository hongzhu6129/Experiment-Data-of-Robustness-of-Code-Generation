import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SlidingWindowMedian {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 8};
        int k = 3;
        ArrayList<Integer> medians = slidingWindowMedian(nums, k);
        System.out.println(medians); // Output: [2, 3, 4, 5, 6, 7, 8]
    }

    public static ArrayList<Integer> slidingWindowMedian(int[] nums, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (nums == null || nums.length < k || k <= 0) {
            return result;
        }

        for (int i = 0; i <= nums.length - k; i++) {
            int[] window = new int[k];
            System.arraycopy(nums, i, window, 0, k);
            Arrays.sort(window); // Sort the window to find the median easily
            result.add(window[k / 2]);
        }

        return result;
    }


    // Unused methods as per the prompt requirement
    public static ArrayList<Integer> count_smaller_number(int[] queries, int[] nums) {
        return null; 
    }

    private static int temp(int[] arr, int target) {
        return -1;
    }
}
