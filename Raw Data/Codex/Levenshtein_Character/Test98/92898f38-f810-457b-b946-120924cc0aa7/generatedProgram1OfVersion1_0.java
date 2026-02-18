public class LargestOfFirstAndLast {

    public static void main(String[] args) {
        int[] nums = {20, 30, 40}; // Example array, you can change this

        if (nums.length < 3) { 
            System.out.println("Array length must be at least 3.");
        }
        else
        {
            int largest = (nums[0] > nums[nums.length - 1]) ? nums[0] : nums[nums.length - 1];
            System.out.println("Largest of first and last element: " + largest);
        }
    }
}
