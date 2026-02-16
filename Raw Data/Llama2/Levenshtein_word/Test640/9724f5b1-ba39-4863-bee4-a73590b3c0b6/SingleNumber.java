public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        int singleNumber = getSingleNumber(nums);
        System.out.println("The single number is: " + singleNumber);


        int[] nums2 = {4, 1, 2, 1, 2};
        singleNumber = getSingleNumber(nums2);
        System.out.println("The single number is: " + singleNumber);


        int[] nums3 = {1};
        singleNumber = getSingleNumber(nums3);
        System.out.println("The single number is: " + singleNumber);
    }

    public static int getSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;  // XOR operation: a number XORed with itself is 0.  Any number XORed with 0 is itself.
        }
        return result;
    }
}
