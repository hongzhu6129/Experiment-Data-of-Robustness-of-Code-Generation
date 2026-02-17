import java.util.Arrays;

public class RemoveDuplicatesTwice {

    static int remove_Duplicates_twice(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int index = 0; 
        for (int num : nums) {
            if (index < 2 || num > nums[index - 2]) {
                nums[index++] = num;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int len1 = remove_Duplicates_twice(nums1);
        System.out.println("Updated length: " + len1);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1))); // Print updated portion

        int[] nums2 = {0,0,1,1,1,1,2,3,3};
        int len2 = remove_Duplicates_twice(nums2);
        System.out.println("Updated length: " + len2);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));


        int[] nums3 = {};
        int len3 = remove_Duplicates_twice(nums3);
        System.out.println("Updated length: " + len3);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3))); // Empty array case

         int[] nums4 = null;
        int len4 = remove_Duplicates_twice(nums4);
        System.out.println("Updated length: " + len4); // Null array case


    }
}
