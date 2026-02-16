class Solution {
    /**
     * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
     * You must write an algorithm with O(log n) runtime complexity.
     *
     * Example 1:
     * Input: nums = [1,3,5,6], target = 5
     * Output: 2
     *
     * Example 2:
     * Input: nums = [1,3,5,6], target = 2
     * Output: 1
     *
     * Example 3:
     * Input: nums = [1,3,5,6], target = 7
     * Output: 4
     *
     * Constraints:
     * 1 <= nums.length <= 104
     * -104 <= nums[i] <= 104
     * nums contains distinct values sorted in ascending order.
     * -104 <= target <= 104
     */
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        int result1 = searchInsert(nums1, target1);
        System.out.println("Result 1: " + result1); // Expected: 2

        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        int result2 = searchInsert(nums2, target2);
        System.out.println("Result 2: " + result2); // Expected: 1

        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        int result3 = searchInsert(nums3, target3);
        System.out.println("Result 3: " + result3); // Expected: 4


        int[] nums4 = {1,3,5,6};
        int target4 = 0;
        int result4 = searchInsert(nums4, target4);
        System.out.println("Result 4: " + result4); // Expected: 0
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevent potential overflow

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
