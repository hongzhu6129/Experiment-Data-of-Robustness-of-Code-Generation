class Solution {
    /**
     * Counts the number of occurrences of the digit 2 in a non-negative integer.
     *
     * @param n The non-negative integer.
     * @return The number of occurrences of the digit 2 in n.
     */
    public static int test(int n) {
        int count = 0;
        String numStr = String.valueOf(n);
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '2') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(test(222)); // Output: 3
        System.out.println(test(123452)); // Output: 1
        System.out.println(test(0)); // Output: 0
        System.out.println(test(2022)); // Output: 3
        System.out.println(test(121212)); // Output: 3


    }
}
