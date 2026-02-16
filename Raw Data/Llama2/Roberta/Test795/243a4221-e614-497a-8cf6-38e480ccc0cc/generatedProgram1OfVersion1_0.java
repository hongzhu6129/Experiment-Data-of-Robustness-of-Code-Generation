import java.util.Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // Start with 1 because the first element is always unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }
        
        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int newLength1 = removeDuplicates(nums1);
        System.out.println("Updated length: " + newLength1); // Output: 2
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, newLength1))); // Output: [1, 2]


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength2 = removeDuplicates(nums2);
        System.out.println("Updated length: " + newLength2); // Output: 5
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, newLength2))); // Output: [0, 1, 2, 3, 4]


         int[] nums3 = {};  // Empty array
        int newLength3 = removeDuplicates(nums3);
        System.out.println("Updated length: " + newLength3); // Output: 0

        int[] nums4 = null; // Null array
        int newLength4 = removeDuplicates(nums4);
        System.out.println("Updated length: " + newLength4); // Output: 0


        int[] nums5 = {1}; // Single element
        int newLength5 = removeDuplicates(nums5);
        System.out.println("Updated length: " + newLength5); // Output: 1
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, newLength5))); // Output: [1]


    }
}
