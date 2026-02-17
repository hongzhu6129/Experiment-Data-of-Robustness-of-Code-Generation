public class ConsecutiveNumbers {

    public static void main(String[] args) {
        // Test cases
        System.out.println(test(1, 2, 3)); // true
        System.out.println(test(3, 2, 1)); // true
        System.out.println(test(1, 3, 2)); // true
        System.out.println(test(1, 2, 4)); // false
        System.out.println(test(4, 2, 1)); // false
        System.out.println(test(5, 5, 5)); // false  (Consecutive means different numbers)
        System.out.println(test(-1,0,1)); // true
    }

    public static boolean test(int a, int b, int c) {
        // Sort the numbers
        int[] nums = {a, b, c};
        java.util.Arrays.sort(nums);

        // Check if the sorted numbers are consecutive
        return (nums[1] == nums[0] + 1 && nums[2] == nums[1] + 1);
    }
}
