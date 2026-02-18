class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 4, 5, 6};
        int target1 = 5;
        int result1 = searchInsert(nums1, target1);
        System.out.println(result1); // Output: 3

        int[] nums2 = {1, 2, 4, 5, 6};
        int target2 = 0;
        int result2 = searchInsert(nums2, target2);
        System.out.println(result2); // Output: 0

        int[] nums3 = {1, 2, 4, 5, 6};
        int target3 = 7;
        int result3 = searchInsert(nums3, target3);
        System.out.println(result3); // Output: 5


        int[] nums4 = {1,3,5,6};
        int target4 = 2;
        int result4 = searchInsert(nums4, target4);
        System.out.println(result4); // Output: 1

          int[] nums5 = {1,3,5,6};
        int target5 = 7;
        int result5 = searchInsert(nums5, target5);
        System.out.println(result5); // Output: 4

    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoid potential overflow

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left; 
    }
}
