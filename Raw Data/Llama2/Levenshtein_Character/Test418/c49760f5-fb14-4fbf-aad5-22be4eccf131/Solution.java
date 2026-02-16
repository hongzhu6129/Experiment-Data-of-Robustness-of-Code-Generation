import java.util.Arrays;

class Solution {

    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // Start with 1 as the first element is unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i]; // Overwrite duplicates with unique elements
                uniqueCount++;
            }
        }

        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
        int length1 = removeDuplicates(nums1);
        System.out.println("Original array: " + Arrays.toString(nums1)); 
        System.out.println("The length of the original array is: " + nums1.length);
        System.out.println("After removing duplicates, the new length of the array is: " + length1);

        // Example 2 (Empty array)
         int[] nums2 = {};
        int length2 = removeDuplicates(nums2);
        System.out.println("\nOriginal array: " + Arrays.toString(nums2));
        System.out.println("The length of the original array is: " + nums2.length);
        System.out.println("After removing duplicates, the new length of the array is: " + length2);


        //Example 3 (Null Array)
        int[] nums3 = null;
        int length3 = removeDuplicates(nums3);
        System.out.println("\nOriginal array: null");
        System.out.println("After removing duplicates, the new length of the array is: " + length3);
    }
}
