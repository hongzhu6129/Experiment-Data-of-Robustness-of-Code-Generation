import java.util.Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index to track the placement of unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i]; 
            }
        }

        return uniqueIndex + 1; // Return the length of the updated array
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int length1 = removeDuplicates(nums1);
        System.out.println("Updated length: " + length1 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, length1))); // Output: 2, [1, 2]


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int length2 = removeDuplicates(nums2);
        System.out.println("Updated length: " + length2 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, length2))); // Output: 5, [0, 1, 2, 3, 4]

        int[] nums3 = {}; // Empty array
        int length3 = removeDuplicates(nums3);
        System.out.println("Updated length: " + length3); // Output: 0

        int[] nums4 = null; // Null array
        int length4 = removeDuplicates(nums4);
        System.out.println("Updated length: " + length4); // Output: 0
         
        int[] nums5 = {1, 2, 3, 4, 5}; // Array with no duplicates
        int length5 = removeDuplicates(nums5);
        System.out.println("Updated length: " + length5 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, length5))); // Output: 5, [1, 2, 3, 4, 5]


    }
}
