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

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // This should never be reached if the problem statement holds (all other numbers appear twice)
        return -1; 
    }
}
