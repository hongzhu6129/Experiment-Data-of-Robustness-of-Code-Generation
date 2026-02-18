class Solution {
    /**
     * Checks if a given string contains the string "pop", where the middle 'o'
     * can be any character.
     *
     * @param str The input string.
     * @return True if the string contains "pop" (with a possible different middle character), false otherwise.
     */
    public boolean popInTheString(String str) {
        if (str == null || str.length() < 3) {
            return false;
        }

        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.charAt(i) == 'p' && str.charAt(i + 2) == 'p') {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.popInTheString("pop")); // True
        System.out.println(solution.popInTheString("xpop")); // True
        System.out.println(solution.popInTheString("pxpp")); // True
        System.out.println(solution.popInTheString("pOp")); // True
        System.out.println(solution.popInTheString("opo")); //False
        System.out.println(solution.popInTheString("ppp")); // True
        System.out.println(solution.popInTheString("abc")); // False
        System.out.println(solution.popInTheString("pp")); // False
        System.out.println(solution.popInTheString("")); // False
        System.out.println(solution.popInTheString(null)); // False


    }
}
