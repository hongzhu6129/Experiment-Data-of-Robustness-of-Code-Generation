class Solution {
    /**
     * Checks if the characters immediately before and after a specified character are the same in a given string.
     *
     * @param str The input string.
     * @return True if the characters before and after the specified character are the same, false otherwise.
     */
    public boolean leftAndRightSame(String str) {
        if (str == null || str.length() < 3) {
            return false; // String too short to have characters on both sides
        }

        char specifiedChar = 'x'; // You can change this to any desired character

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == specifiedChar) {
                if (str.charAt(i - 1) == str.charAt(i + 1)) {
                    return true;
                }
            }
        }

        return false; // Specified character not found or surrounding characters not the same
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        String str1 = "xabx";
        System.out.println(str1 + ": " + solution.leftAndRightSame(str1)); // Output: true

        String str2 = "xyzy";
        System.out.println(str2 + ": " + solution.leftAndRightSame(str2)); // Output: false

        String str3 = "x";
        System.out.println(str3 + ": " + solution.leftAndRightSame(str3)); // Output: false

        String str4 =  "xx";
        System.out.println(str4 + ": " + solution.leftAndRightSame(str4)); // Output: false

        String str5 = "xbxb";
         System.out.println(str5 + ": " + solution.leftAndRightSame(str5)); // Output: true


        String str6 = "xyx";  // Test with specified char at the beginning and end
        System.out.println(str6 + ": " + solution.leftAndRightSame(str6)); // Output: false because we iterate from index 1.



    }
}
