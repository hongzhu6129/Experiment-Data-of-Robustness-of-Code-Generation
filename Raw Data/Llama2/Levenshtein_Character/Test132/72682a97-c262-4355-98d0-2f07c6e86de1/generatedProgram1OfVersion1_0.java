import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : nums) {
            uniqueNumbers.add(num);
        }
        return uniqueNumbers.size();
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
        int originalLength = originalArray.length;
        int newLength = removeDuplicates(originalArray);

        System.out.println("original array: " + Arrays.toString(originalArray));
        System.out.println("the length of the original array is: " + originalLength);
        System.out.println("after removing duplicates, the new length of the array is: " + newLength);


    }
}
