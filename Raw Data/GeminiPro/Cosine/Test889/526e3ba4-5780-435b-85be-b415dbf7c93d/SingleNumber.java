public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {10, 20, 10, 20, 30, 40, 40, 30, 50};
        int singleNumber = getSingleNumber(nums);
        System.out.println(singleNumber); // Output: 50
    }

    public static int getSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
