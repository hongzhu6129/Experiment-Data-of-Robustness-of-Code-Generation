class Solution {
    /**
     * Finds the number of bits required to flip to convert integer a to integer b.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The number of bits that need to be flipped.
     */
    public int bitSwapRequired(int a, int b) {
        int xorResult = a ^ b;
        int count = 0;
        while (xorResult != 0) {
            count += (xorResult & 1);
            xorResult >>= 1;
        }
        return count;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int a = 10;  // Example: 1010 in binary
        int b = 13;  // Example: 1101 in binary
        int flips = solution.bitSwapRequired(a, b);
        System.out.println(flips); // Output: 2 (because 2 bits are different)


        a = 7;
        b = 10;
        flips = solution.bitSwapRequired(a, b);
        System.out.println(flips); // Output: 3



    }
}
