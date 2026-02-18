class Solution {
    /**
     * Calculates the number of bits that need to be flipped to convert integer a to integer b.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The number of bits that need to be flipped.
     */
    public int bitSwapRequired(int a, int b) {
        int xorResult = a ^ b;
        int count = 0;
        while (xorResult != 0) {
            count += xorResult & 1;
            xorResult >>= 1;
        }
        return count;
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        int a = 10; // Example value
        int b = 7;  // Example value
        int result = solution.bitSwapRequired(a, b);
        System.out.println(result); // Output: 2 (in this example)

    }
}
