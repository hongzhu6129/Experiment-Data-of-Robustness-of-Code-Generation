import java.util.Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 1; // Index for the unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i]; 
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
        System.out.println("New length: " + len3 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3))); // Empty array

        int[] nums4 = null;
        int len4 = removeDuplicates(nums4);
        System.out.println("New length: " + len4 ); //Null array handling

        int[] nums5 = {1,2,3,4,5};
         int len5= removeDuplicates(nums5);
        System.out.println("New length: " + len5 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, len5))); // Already unique elements
    }
}
