import java.util.HashMap;
import java.util.Map;

public class SingleNumberFinder {

    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        int single1 = getSingleNumber(nums1);
        System.out.println("Single number in nums1: " + single1); // Output: 1

        int[] nums2 = {4, 1, 2, 1, 2};
        int single2 = getSingleNumber(nums2);
        System.out.println("Single number in nums2: " + single2); // Output: 4

        int[] nums3 = {1};
        int single3 = getSingleNumber(nums3);
        System.out.println("Single number in nums3: " + single3); // Output: 1
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

        return -1; // Should not reach here if the problem constraints are met (one number appears once, others twice)
    }
}
