class Solution {
    /**
     * Counts the number of digits equal to 2 in a non-negative integer.
     *
     * @param n The non-negative integer.
     * @return The count of digits equal to 2.
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
        System.out.println(test(12342)); // Output: 1
        System.out.println(test(0)); // Output: 0
        System.out.println(test(2022)); // Output: 2

    }
}
