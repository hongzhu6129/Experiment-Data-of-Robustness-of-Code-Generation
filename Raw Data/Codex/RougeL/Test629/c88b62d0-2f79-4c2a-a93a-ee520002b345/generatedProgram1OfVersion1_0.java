public class LargestFirstLast {

    public static void main(String[] args) {
        int[] nums = {20, 30, 40}; // Example array

        int largest = nums[0]; // Assume the first element is largest initially

        if (nums.length >= 2 && nums[nums.length - 1] > largest) {
            largest = nums[nums.length - 1];
        }

        System.out.println("Largest element between first and last: " + largest);


        // Example with different arrays:

        int[] nums2 = {10, 5, 15};
        largest = nums2[0];
        if (nums2.length >= 2 && nums2[nums2.length - 1] > largest) {
            largest = nums2[nums2.length - 1];
        }
        System.out.println("Largest element between first and last: " + largest);



        int[] nums3 = {50}; // Single element array
        largest = nums3[0];
        System.out.println("Largest element between first and last: " + largest); // Output: 50



         int[] nums4 = {}; //Empty array. This requires special handling to prevent exceptions.
        if (nums4.length > 0) {
            largest = nums4[0];
            if (nums4.length >= 2 && nums4[nums4.length - 1] > largest) {
                largest = nums4[nums4.length - 1];
            }
            System.out.println("Largest element between first and last: " + largest);
        } else {
             System.out.println("Array is empty.");
        }



    }
}
