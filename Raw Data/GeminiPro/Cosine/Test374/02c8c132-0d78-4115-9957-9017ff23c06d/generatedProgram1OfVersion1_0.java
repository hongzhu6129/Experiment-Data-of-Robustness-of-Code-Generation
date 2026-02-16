class Solution {
    /**
     * Swaps the last two characters of a given string.
     *
     * @param str The input string.  The string length must be two or more.
     * @return The string with the last two characters swapped, or the original string if it's less than two characters long.
     */
    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }

        char[] charArray = str.toCharArray();
        char temp = charArray[charArray.length - 1];
        charArray[charArray.length - 1] = charArray[charArray.length - 2];
        charArray[charArray.length - 2] = temp;

        return new String(charArray);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.lastTwo("coding")); // Expected: codnig
        System.out.println(solution.lastTwo("cat")); // Expected: cta
        System.out.println(solution.lastTwo("a")); // Expected: a
        System.out.println(solution.lastTwo("ab")); // Expected: ba


    }
}
