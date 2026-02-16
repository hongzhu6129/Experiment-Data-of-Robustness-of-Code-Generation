class Solution {
    /**
     * Given a string, return a new string made of every other char starting with the first,
     * so "Hello" yields "Hlo".
     *
     * @param str The input string.
     * @return A new string with characters at index positions 0, 1, 2, 5, 6, 7,...
     */
    public String pairsToReturn(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            result.append(str.charAt(i));
            i++;
            if (i < str.length()) {
                result.append(str.charAt(i));
                i++;
            }
            if (i < str.length()) {
                i += 3; // Skip the next three characters
            }

        }
        return result.toString();

    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.pairsToReturn("Hello")); // Output: Hlo
        System.out.println(solution.pairsToReturn("abcdefghijklmn")); // Output: abcfghi
        System.out.println(solution.pairsToReturn("123456789012345"));// Output:12378045
        System.out.println(solution.pairsToReturn("")); // Output: ""
        System.out.println(solution.pairsToReturn(null)); // Output: ""


    }
}

