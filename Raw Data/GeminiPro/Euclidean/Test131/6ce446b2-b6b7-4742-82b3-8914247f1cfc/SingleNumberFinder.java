import java.util.HashMap;
import java.util.Map;

public class SingleNumberFinder {

    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        System.out.println(getSingleNumber(nums1)); // Output: 1

        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println(getSingleNumber(nums2)); // Output: 4

        int[] nums3 = {1};
        System.out.println(getSingleNumber(nums3)); // Output: 1
    }

    public static int getSingleNumber(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (countMap.get(num) == 1) {
                return num;
            }
        }

        return -1; // Should never reach here if the problem statement is followed (all numbers occur twice except one)
    }
}
