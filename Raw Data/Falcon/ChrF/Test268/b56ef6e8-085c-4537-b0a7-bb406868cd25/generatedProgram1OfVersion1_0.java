import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array of integers, removes duplicate elements in-place such that each element appears only once.
     * The relative order of the elements should be kept the same.
     *
     * @param nums The sorted array of integers.
     * @return The new length of the array after removing duplicates.
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 1; // Index for the next unique element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i]; 
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int newLength1 = removeDuplicates(nums1);
        System.out.println("New Length: " + newLength1 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, newLength1))); // Output: New Length: 2, Array: [1, 2]


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength2 = removeDuplicates(nums2);
        System.out.println("New Length: " + newLength2 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, newLength2))); // Output: New Length: 5, Array: [0, 1, 2, 3, 4]

         int[] nums3 = {};
        int newLength3 = removeDuplicates(nums3);
        System.out.println("New Length: " + newLength3 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, newLength3))); // Output: New Length: 0, Array: []

        int[] nums4 = null;
        int newLength4 = removeDuplicates(nums4);
        System.out.println("New Length: " + newLength4); // Output: New Length: 0



    }
}
