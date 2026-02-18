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
        int n1 = 222;
        int count1 = test(n1);
        System.out.println("Number of 2s in " + n1 + ": " + count1); // Output: 3

        int n2 = 12345;
        int count2 = test(n2);
        System.out.println("Number of 2s in " + n2 + ": " + count2); // Output: 1


        int n3 = 0;
        int count3 = test(n3);
        System.out.println("Number of 2s in " + n3 + ": " + count3); // Output: 0


        int n4 = 2022;
        int count4 = test(n4);
        System.out.println("Number of 2s in " + n4 + ": " + count4); // Output: 3
    }
}
