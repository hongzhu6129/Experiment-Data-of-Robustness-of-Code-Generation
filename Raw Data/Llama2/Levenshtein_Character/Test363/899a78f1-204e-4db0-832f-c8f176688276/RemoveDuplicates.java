import java.util.Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // Initialize with 1 because the first element is always unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i]; // Place the unique element at the correct index
                uniqueCount++; 
            }
        }

        return uniqueCount;
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Length without duplicates: " + len1 ); // Output: 2
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1))); //Output: [1, 2]


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Length without duplicates: " + len2); // Output: 5
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2))); // Output: [0, 1, 2, 3, 4]

        int[] nums3 = {}; // Empty array
        int len3 = removeDuplicates(nums3);
        System.out.println("Length without duplicates: " + len3); // Output: 0
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3))); // Output: []


         int[] nums4 = {1,2,3,4,5}; // Already unique elements
        int len4 = removeDuplicates(nums4);
        System.out.println("Length without duplicates: " + len4); // Output: 5
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOfRange(nums4, 0, len4))); // Output: [1, 2, 3, 4, 5]


    }
}
