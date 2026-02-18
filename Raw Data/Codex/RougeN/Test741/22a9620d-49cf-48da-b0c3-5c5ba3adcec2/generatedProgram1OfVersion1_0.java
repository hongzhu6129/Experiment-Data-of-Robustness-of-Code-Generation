import java.util.Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int newLength1 = removeDuplicates(nums1);
        int[] uniqueNums1 = Arrays.copyOfRange(nums1, 0, newLength1);
        System.out.println("Array 1 without duplicates: " + Arrays.toString(uniqueNums1)); // Output: [1, 2]


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength2 = removeDuplicates(nums2);
        int[] uniqueNums2 = Arrays.copyOfRange(nums2, 0, newLength2);
        System.out.println("Array 2 without duplicates: " + Arrays.toString(uniqueNums2)); // Output: [0, 1, 2, 3, 4]


         int[] nums3 = {}; // Empty array
        int newLength3 = removeDuplicates(nums3); 
        int[] uniqueNums3 = Arrays.copyOfRange(nums3, 0, newLength3); // Handles empty array gracefully
        System.out.println("Array 3 without duplicates: " + Arrays.toString(uniqueNums3)); // Output: []


        int[] nums4 = {1, 2, 3, 4, 5}; // Already unique
        int newLength4 = removeDuplicates(nums4); 
        int[] uniqueNums4 = Arrays.copyOfRange(nums4, 0, newLength4);
        System.out.println("Array 4 without duplicates: " + Arrays.toString(uniqueNums4)); // Output: [1, 2, 3, 4, 5]



    }
}
