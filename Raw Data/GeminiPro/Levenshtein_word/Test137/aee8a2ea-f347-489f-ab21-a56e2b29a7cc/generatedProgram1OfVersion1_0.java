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


         int[] emptyArray = {}; //Illustrate empty array case
        int singleEmpty = getSingleNumber(emptyArray);
        System.out.println("Single number in empty array : " + singleEmpty); // Output: 0



    }

    public static int getSingleNumber(int[] nums) {
        // Educational approach using a HashMap
        if (nums == null || nums.length == 0) { // Handle null or empty input
            return 0; // Or throw an exception, depending on the desired behavior
        }


        Map<Integer, Integer> countMap = new HashMap<>();

        // 1. Count occurrences of each number
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            /*
             * getOrDefault is used to retrieve the current count of the number 'num' from the map.
             * If the number is not present in the map (first encounter), it defaults to 0.
             * We then increment this count by 1 and put it back into the map.
             */
        }

        // 2. Find the number with a count of 1
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // Should not reach here if the problem statement guarantees a single number appearing once.
        return 0; // Or throw an exception
    }


}
