import java.util.Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index of the last unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i]; // Move the unique element forward
            }
        }

        return uniqueIndex + 1; // New length of the array with unique elements
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Updated Length: " + len1); // Output: 2
        System.out.println("Updated Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1))); // Output: [1, 2]


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Updated Length: " + len2); // Output: 5
        System.out.println("Updated Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2))); // Output: [0, 1, 2, 3, 4]
        

        int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("Updated Length: " + len3); // Output: 0
        System.out.println("Updated Array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3))); // Output: []

         int[] nums4 = null;
        int len4 = removeDuplicates(nums4);
        System.out.println("Updated Length: " + len4); // Output: 0
       // No array to print in this case (null input)
    }
}
