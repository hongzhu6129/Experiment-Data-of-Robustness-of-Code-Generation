public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int k = 0; // Variable to track the length of the new array

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move elements that are not equal to val to the beginning of the array
                k++; // Increment k to reflect the new array length
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 7, 6, 2};
        int val = 6;

        System.out.print("Original array: [");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");


        int newLength = removeElement(nums, val);

        System.out.println("The length of the new array is: " + newLength);

        System.out.print("Modified array: ["); // Print the modified array up to the new length
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i]);
            if (i < newLength - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
