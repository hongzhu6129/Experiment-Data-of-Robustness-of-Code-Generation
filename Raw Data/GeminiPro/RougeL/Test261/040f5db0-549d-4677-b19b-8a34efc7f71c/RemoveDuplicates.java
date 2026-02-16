import java.util.Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index to track the placement of unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) { // If the current element is different from the last unique element
                uniqueIndex++;                 // Move to the next position for unique elements
                nums[uniqueIndex] = nums[i];     // Place the unique element at the new position
            }
        }

        // At this point, uniqueIndex represents the index of the last unique element. 
        // So, the new length is uniqueIndex + 1
        return uniqueIndex + 1;
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("New Length: " + len1 + ", Updated Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1))); // Output: New Length: 2, Updated Array: [1, 2]


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("New Length: " + len2 + ", Updated Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2))); // Output: New Length: 5, Updated Array: [0, 1, 2, 3, 4]

        // Test cases with empty and null arrays
        int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("New Length: " + len3 + ", Updated Array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3))); // Output: New Length: 0, Updated Array: []


        int[] nums4 = null;
        int len4 = removeDuplicates(nums4);
        System.out.println("New Length: " + len4); // Output: New Length: 0

    }
}
