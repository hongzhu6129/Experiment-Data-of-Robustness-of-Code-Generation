import java.util.Arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int k = 0; // Variable to track the length of the new array

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move elements not equal to val to the beginning
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 4, 6, 7, 6, 2};
        int val1 = 6;
        int len1 = removeElement(nums1, val1);
        System.out.println("Original combining: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, nums1.length)));
        System.out.println("The length of the new array is: " + len1);


       // Additional test case (optional) you can add more if you wish.
        int[] nums2 = {3, 2, 2, 3};
        int val2 = 3;
        int len2 = removeElement(nums2, val2);
         System.out.println("Original combining: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, nums2.length)));
        System.out.println("The length of the new array is: " + len2);


    }
}
