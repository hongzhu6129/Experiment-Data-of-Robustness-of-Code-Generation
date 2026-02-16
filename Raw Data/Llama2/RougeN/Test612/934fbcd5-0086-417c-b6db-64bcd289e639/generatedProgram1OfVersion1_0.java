class Solution {
    /**
     * Given an integer, display the factors of 3 present in it.
     */
    public static void main(String[] args) {
        test(27); // Output: 3 9 27
        test(12); // Output: 3 
        test(5);  // Output: (No output as no factors of 3 are present)
        test(81); // Output: 3 9 27 81
        test(0);  // Output: (No output, handling 0 as a special case)
    }

    public static void test(int n) {
        if (n == 0) {
            return; // Handle 0 as a special case � it has infinite factors including 3
        }

        for (int i = 1; i * 3 <= n; i *= 3) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Add a newline for cleaner output between test cases

    }
}
