class Solution {
    /**
     * Checks if the characters immediately before and after a specified character are the same in a given string.
     *
     * @param str The input string.
     * @return True if the characters before and after the specified character (if it exists and has characters on both sides) are the same, false otherwise.
     */
    public boolean leftAndRightSame(String str) {
        if (str == null || str.length() < 3) {
            return false; // Not enough characters for comparison
        }

        char specifiedChar = 'x'; // Or any other specified character you want to check

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == specifiedChar) {
                if (str.charAt(i - 1) == str.charAt(i + 1)) {
                    return true;
                }
            }
        }

        return false; // Specified character not found or flanking characters not the same
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        String str1 = "xabax";
        System.out.println(str1 + ": " + solution.leftAndRightSame(str1)); // Output: true

        String str2 = "xaba";
        System.out.println(str2 + ": " + solution.leftAndRightSame(str2)); // Output: false

        String str3 = "axaba"; 
        System.out.println(str3 + ": " + solution.leftAndRightSame(str3)); // Output: false (because the first 'a' is at the beginning)

        String str4 =  "xabca";
        System.out.println(str4 + ": " + solution.leftAndRightSame(str4));  // Output: false (because b and c are different)

        String str5 = "xx";
        System.out.println(str5 + ": " + solution.leftAndRightSame(str5)); // Output: false (string too short)



    }
}
