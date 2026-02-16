public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 4, 7};
        int[] arr2 = {2, 2, 2, 2, 2};
        int[] arr3 = {1, 3, 5, 7, 9};
        int[] arr4 = {9, 8, 7, 6, 5};
        int[] arr5 = {};
        int[] arr6 = {5};

        System.out.println("Longest subsequence length for arr1: " + longest_seq(arr1)); // Expected: 3
        System.out.println("Longest subsequence length for arr2: " + longest_seq(arr2)); // Expected: 1
        System.out.println("Longest subsequence length for arr3: " + longest_seq(arr3)); // Expected: 5
        System.out.println("Longest subsequence length for arr4: " + longest_seq(arr4)); // Expected: 1
        System.out.println("Longest subsequence length for arr5: " + longest_seq(arr5)); // Expected: 0
        System.out.println("Longest subsequence length for arr6: " + longest_seq(arr6)); // Expected: 1



    }

    public static int longest_seq(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
            }
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
}
