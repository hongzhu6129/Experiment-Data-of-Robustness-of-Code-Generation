import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
     *
     * @param nums The sorted array.
     * @return The new length of the array after removing duplicates.
     */
    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1; // Initialize k to 1 (first element is unique)

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("New length: " + len1 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)));

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("New length: " + len2 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));


        int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("New length: " + len3 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3))); //empty


        int[] nums4 = {1};
        int len4 = removeDuplicates(nums4);
        System.out.println("New length: " + len4 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums4, 0, len4))); //1

    }
}


