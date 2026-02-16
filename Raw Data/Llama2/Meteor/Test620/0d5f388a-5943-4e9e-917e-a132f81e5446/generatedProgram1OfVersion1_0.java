class Solution {
    /**
     * Checks if any character in the given string appears twice consecutively.
     *
     * @param str The input string.
     * @return True if any character appears twice consecutively, false otherwise.
     */
    boolean appearTwice(String str) {
        if (str == null || str.length() < 2) {
            return false;
        }

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String str1 = "Java";
        System.out.println(str1 + ": " + solution.appearTwice(str1)); // Output: Java: false

        String str2 = "programming";
        System.out.println(str2 + ": " + solution.appearTwice(str2)); // Output: programming: true

        String str3 = "abba";
        System.out.println(str3 + ": " + solution.appearTwice(str3));  // Output: abba: true

        String str4 = null;
        System.out.println(str4 + ": " + solution.appearTwice(str4)); // Output: null: false


        String str5 = "a";
        System.out.println(str5 + ": " + solution.appearTwice(str5)); // Output: a: false

        String str6 = "";
        System.out.println(str6 + ": " + solution.appearTwice(str6)); // Output: : false

        String str7 = "  ";
        System.out.println(str7 + ": " + solution.appearTwice(str7)); // Output:   : true
    }
}
