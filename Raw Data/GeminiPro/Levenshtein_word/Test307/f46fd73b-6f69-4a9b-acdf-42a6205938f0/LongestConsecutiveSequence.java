import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static int longest_sequence(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : nums) {
            if (!numSet.contains(num - 1)) { // Only start counting from the beginning of a sequence
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest consecutive sequence: " + longest_sequence(nums1)); // Output: 4

        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println("Longest consecutive sequence: " + longest_sequence(nums2)); // Output: 9


        int[] nums3 = {};
        System.out.println("Longest consecutive sequence: " + longest_sequence(nums3)); // Output: 0

        int[] nums4 = null;
        System.out.println("Longest consecutive sequence: " + longest_sequence(nums4)); // Output: 0


        int[] nums5 = {1, 2, 0, 1}; //Handles duplicates correctly
        System.out.println("Longest consecutive sequence: " + longest_sequence(nums5)); // Output: 3


    }
}
