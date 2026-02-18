class Solution {
    /**
     * Checks if the first instance of any character in a given string is immediately followed by the same character.
     *
     * @param str The input string.
     * @return True if the first instance of any character is immediately followed by the same character, false otherwise.
     */
    boolean appearTwice(String str) {
        if (str == null || str.length() < 2) {
            return false;
        }

        for (int i = 0; i < str.length() - 1; i++) {
            char currentChar = str.charAt(i);
            if (str.indexOf(currentChar) == i && str.charAt(i + 1) == currentChar) {  //Check if it's the first occurrence and the next char is the same
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        String str1 = "abbc";
        System.out.println(str1 + ": " + solution.appearTwice(str1)); // Output: true

        String str2 = "abca";
        System.out.println(str2 + ": " + solution.appearTwice(str2)); // Output: false

        String str3 = "aaac";
        System.out.println(str3 + ": " + solution.appearTwice(str3)); // Output: true


        String str4 = "abc";
        System.out.println(str4 + ": " + solution.appearTwice(str4)); // Output: false

        String str5 = "a";
        System.out.println(str5 + ": " + solution.appearTwice(str5)); // Output: false

        String str6 = null;
        System.out.println(str6 + ": " + solution.appearTwice(str6)); // Output: false

        String str7 = "";
        System.out.println(str7 + ": " + solution.appearTwice(str7)); // Output: false

         String str8 = "aacbb";
        System.out.println(str8 + ": " + solution.appearTwice(str8)); // Output: true

        String str9 = "aabbc";  //Important test case: 'b' is followed by 'b', but we should only check the FIRST instance of 'a'.
        System.out.println(str9 + ": " + solution.appearTwice(str9)); // Output: true


    }
}
