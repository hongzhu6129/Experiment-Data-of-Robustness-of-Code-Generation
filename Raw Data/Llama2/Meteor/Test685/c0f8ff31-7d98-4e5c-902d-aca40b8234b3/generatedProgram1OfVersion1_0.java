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
        int n1 = 22123;
        int count1 = test(n1);
        System.out.println("Count of 2s in " + n1 + ": " + count1); // Output: 3

        int n2 = 100;
        int count2 = test(n2);
        System.out.println("Count of 2s in " + n2 + ": " + count2); // Output: 0

        int n3 = 2222;
        int count3 = test(n3);
        System.out.println("Count of 2s in " + n3 + ": " + count3); // Output: 4
    }
}
