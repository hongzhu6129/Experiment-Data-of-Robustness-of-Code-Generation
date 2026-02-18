import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> uniqueNums = new HashSet<>();
        for (int num : nums) {
            uniqueNums.add(num);
        }
        return uniqueNums.size();
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
        System.out.println("original array: " + Arrays.toString(nums));
        System.out.println("the length of the original array is: " + nums.length);
        int newLength = removeDuplicates(nums);
        System.out.println("after removing duplicates, the new length of the array is: " + newLength);

    }
}
