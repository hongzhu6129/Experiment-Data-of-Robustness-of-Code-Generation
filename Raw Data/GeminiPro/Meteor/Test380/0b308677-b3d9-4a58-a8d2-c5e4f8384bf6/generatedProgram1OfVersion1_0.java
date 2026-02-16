class Solution {
    /**
     * Checks if the first two characters of a string appear at the end.
     *
     * @param str The string to check.
     * @return True if the first two characters are at the end, false otherwise.
     */
    public boolean firstInLast(String str) {
        if (str == null || str.length() < 2) {
            return false; // Not enough characters for comparison
        }

        String firstTwo = str.substring(0, 2);
        String lastTwo = str.substring(str.length() - 2);

        return firstTwo.equals(lastTwo);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("Edited - HelloHe: " + solution.firstInLast("HelloHe")); // Output: true
        System.out.println("Edited - HiHi: " + solution.firstInLast("HiHi"));      // Output: true
        System.out.println("Edited - He: " + solution.firstInLast("He"));        // Output: false  (too short)
        System.out.println("Edited - Hello: " + solution.firstInLast("Hello"));    // Output: false
        System.out.println("Edited - '': " + solution.firstInLast(""));         // Output: false (too short) 
        System.out.println("Edited - null: " + solution.firstInLast(null));       // Output: false (null check)



    }
}
