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


        // Example with an empty array (should ideally handle such cases �  added error handling)
        int[] nums4 = {};
        int single4 = getSingleNumber(nums4); 
        System.out.println("Single number in nums4: " + single4); // Output: 0 (or an appropriate indicator)

    }

    public static int getSingleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {  // Handle empty or null arrays
            return 0; // Or throw an exception, depending on desired behavior
        }

        Map<Integer, Integer> countMap = new HashMap<>();

        // 1. Count occurrences:
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }


        // 2. Find the number with count 1:
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // Should not reach here if the problem statement guarantees a single number appears once
        return -1; // Indicate an error or unexpected condition
    }
}




