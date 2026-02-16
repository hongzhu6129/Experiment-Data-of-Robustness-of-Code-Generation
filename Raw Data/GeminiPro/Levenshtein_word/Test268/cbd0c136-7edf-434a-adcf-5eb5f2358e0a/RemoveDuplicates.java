import java.util.Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index to track unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i]; 
            }
        }

        return uniqueIndex + 1; // Length of the updated array (containing unique elements)
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 3, 4, 4, 5, 5, 5};
        int len1 = removeDuplicates(arr1);
        System.out.println("Updated length: " + len1); // Output: 5
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(arr1, 0, len1))); // Output: [1, 2, 3, 4, 5]


        int[] arr2 = {1, 2, 3, 4, 5};
        int len2 = removeDuplicates(arr2);
        System.out.println("Updated length: " + len2); // Output: 5
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(arr2, 0, len2))); // Output: [1, 2, 3, 4, 5]

        int[] arr3 = {};
        int len3 = removeDuplicates(arr3);
        System.out.println("Updated length: " + len3); // Output: 0

        int[] arr4 = null;
        int len4 = removeDuplicates(arr4);
        System.out.println("Updated length: " + len4); // Output: 0


    }
}
