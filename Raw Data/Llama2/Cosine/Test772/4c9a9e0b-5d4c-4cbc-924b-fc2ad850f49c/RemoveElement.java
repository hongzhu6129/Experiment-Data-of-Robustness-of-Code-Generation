import java.util.Arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int k = 0; // Variable to keep track of the new array's length

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move non-val elements to the front
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 4, 6, 7, 6, 2};
        int val1 = 6;
        int len1 = removeElement(nums1, val1);
        System.out.println("Original array: " + Arrays.toString(Arrays.copyOf(nums1, nums1.length))); // Print original array
        System.out.println("The length of the new array is: " + len1);
        System.out.println("New array (up to the new length): " + Arrays.toString(Arrays.copyOf(nums1, len1))); // Print the updated array



        // Additional test case (optional)
        int[] nums2 = {3, 2, 2, 3};
        int val2 = 3;
        int len2 = removeElement(nums2, val2);
         System.out.println("Original array: " + Arrays.toString(Arrays.copyOf(nums2, nums2.length))); // Print original array
        System.out.println("The length of the new array is: " + len2);
        System.out.println("New array (up to the new length): " + Arrays.toString(Arrays.copyOf(nums2, len2)));


         int[] nums3 = {0,1,2,2,3,0,4,2};
        int val3 = 2;
        int len3 = removeElement(nums3, val3);
         System.out.println("Original array: " + Arrays.toString(Arrays.copyOf(nums3, nums3.length))); // Print original array
        System.out.println("The length of the new array is: " + len3);
        System.out.println("New array (up to the new length): " + Arrays.toString(Arrays.copyOf(nums3, len3)));
    }
}
