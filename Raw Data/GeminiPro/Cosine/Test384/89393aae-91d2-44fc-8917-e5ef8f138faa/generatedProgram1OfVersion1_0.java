class Solution {
    /**
     * Reads a string and prevents the first two characters if one or both are 
     * equal to a specified character, otherwise leaves them unchanged.
     *
     * @param str The input string.
     * @return The modified string.
     */
    public String exceptTwoO(String str) {
        if (str == null || str.length() < 2) {
            return str;
        }

        char specifiedChar = 'o'; // Or any other character you want to check against
        StringBuilder result = new StringBuilder();

        if (str.charAt(0) != specifiedChar && str.charAt(1) != specifiedChar) {
            result.append(str.charAt(0));
            result.append(str.charAt(1));
        }

        if (str.length() > 2) {
            result.append(str.substring(2));
        }

        return result.toString();

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.exceptTwoO("oracle"));  // Output: racle
        System.out.println(solution.exceptTwoO("google")); // Output: ogle
        System.out.println(solution.exceptTwoO("apple"));  // Output: apple
        System.out.println(solution.exceptTwoO("o"));      // Output: o
        System.out.println(solution.exceptTwoO(""));       // Output: 
        System.out.println(solution.exceptTwoO(null));     // Output: null
        System.out.println(solution.exceptTwoO("oo"));     // Output:


    }
}
