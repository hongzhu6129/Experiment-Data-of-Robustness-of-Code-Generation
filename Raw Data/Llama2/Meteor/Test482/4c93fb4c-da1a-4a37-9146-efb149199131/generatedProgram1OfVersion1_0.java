public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        int result1 = searchInsert(nums1, target1);
        System.out.println("Example 1: Target " + target1 + " found at index (or insert position): " + result1); // Output: 2

        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        int result2 = searchInsert(nums2, target2);
        System.out.println("Example 2: Target " + target2 + " found at index (or insert position): " + result2); // Output: 1

        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        int result3 = searchInsert(nums3, target3);
        System.out.println("Example 3: Target " + target3 + " found at index (or insert position): " + result3); // Output: 4

        int[] nums4 = {1, 3, 5, 6};
        int target4 = 0;
        int result4 = searchInsert(nums4, target4);
        System.out.println("Example 4: Target " + target4 + " found at index (or insert position): " + result4); // Output: 0


        int[] emptyArray = {};
        int target5 = 1;
        int result5 = searchInsert(emptyArray, target5);
        System.out.println("Example 5 (Empty Array): Target " + target5 + " found at index (or insert position): " + result5); // Output: 0


    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoid potential overflow

            if (nums[mid] == target) {
                return mid; // Target found at index mid
            } else if (nums[mid] < target) {
                left = mid + 1; // Target is in the right half
            } else {
                right = mid - 1; // Target is in the left half
            }
        }

        // Target not found, return the insertion point (left)
        return left;
    }
}
