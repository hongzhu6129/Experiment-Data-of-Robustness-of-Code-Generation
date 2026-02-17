class Solution {
    /**
     * Given a sorted array of distinct integers and a target value, return the index if the target is found. 
     * If not, return the index where it would be if it were inserted in order.
     *
     * @param nums   The sorted array of integers.
     * @param target The target value to search for.
     * @return The index of the target value or the index where it would be inserted.
     */
    public int searchInsert(int[] nums, int target) {
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



    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        int result1 = solution.searchInsert(nums1, target1);
        System.out.println("Result 1: " + result1); // Output: 2

        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        int result2 = solution.searchInsert(nums2, target2);
        System.out.println("Result 2: " + result2); // Output: 1


        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        int result3 = solution.searchInsert(nums3, target3);
        System.out.println("Result 3: " + result3); // Output: 4

        int[] nums4 = {1, 3, 5, 6};
        int target4 = 0;
        int result4 = solution.searchInsert(nums4, target4);
        System.out.println("Result 4: " + result4); // Output: 0


        int[] emptyArray = {};
        int emptyTarget = 1;
        int emptyResult = solution.searchInsert(emptyArray, emptyTarget);
        System.out.println("Result Empty: " + emptyResult); // Output: 0


    }
}
