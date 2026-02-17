import java.util.Arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int k = 0; // Number of elements not equal to val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 4, 6, 7, 6, 2};
        int val1 = 6;
        int len1 = removeElement(nums1, val1);
        System.out.println("original array: " + Arrays.toString(nums1)); // Output will include trailing elements, but length is correct
        System.out.println("the length of the new array is: " + len1);
         int[] newArray1 = Arrays.copyOfRange(nums1, 0, len1); // Create a new array with the correct size
         System.out.println("New array: " + Arrays.toString(newArray1));



        int[] nums2 = {3, 2, 2, 3};
        int val2 = 3;
        int len2 = removeElement(nums2, val2);
         System.out.println("original array: " + Arrays.toString(nums2)); // Output will include trailing elements, but length is correct
        System.out.println("the length of the new array is: " + len2);
        int[] newArray2 = Arrays.copyOfRange(nums2, 0, len2); // Create a new array with the correct size
         System.out.println("New array: " + Arrays.toString(newArray2));


        int[] nums3 = {0,1,2,2,3,0,4,2};
        int val3 = 2;
        int len3 = removeElement(nums3, val3);
         System.out.println("original array: " + Arrays.toString(nums3)); // Output will include trailing elements, but length is correct
        System.out.println("the length of the new array is: " + len3);
         int[] newArray3 = Arrays.copyOfRange(nums3, 0, len3); // Create a new array with the correct size
         System.out.println("New array: " + Arrays.toString(newArray3));


    }
}
