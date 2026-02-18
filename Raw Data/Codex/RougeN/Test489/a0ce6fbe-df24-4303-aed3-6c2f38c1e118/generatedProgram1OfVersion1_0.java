public class LargestFirstLast {

    public static void main(String[] args) {
        int[] nums = {20, 30, 40}; // Example array

        int largest = (nums[0] > nums[nums.length - 1]) ? nums[0] : nums[nums.length - 1];

        System.out.println("Largest value between first and last element: " + largest);



        // More test cases:
         int[] nums2 = {40, 30, 20};
         largest = (nums2[0] > nums2[nums2.length - 1]) ? nums2[0] : nums2[nums2.length - 1];
        System.out.println("Largest value between first and last element: " + largest);


        int[] nums3 = {20, 30, 20}; 
        largest = (nums3[0] > nums3[nums3.length - 1]) ? nums3[0] : nums3[nums3.length - 1];
        System.out.println("Largest value between first and last element: " + largest);



    }
}
