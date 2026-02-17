class Solution {
    /**
     * Given an array of integers, every element appears twice except for one. Find that single one.
     *
     * @param nums The input array of integers.
     * @return The single number that appears only once.
     */
    public int getSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 10, 20, 30, 40, 40, 30, 50};
        Solution solution = new Solution();
        int singleNumber = solution.getSingleNumber(nums);
        System.out.println(singleNumber + " appears only once");
    }
}
