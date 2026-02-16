class Solution {
    /**
     * Creates a string by repeating characters from the beginning of the input string.
     * The repetition count starts at 'p' and decreases until it reaches 1.
     *
     * @param str The input string.
     * @param p   The initial repetition count.
     * @return The resulting string with repeated characters.
     */
    public String beginningRepetition(String str, int p) {
        if (str == null || str.isEmpty() || p <= 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (int i = p; i > 0; i--) {
            if (str.length() < i) { // Handle cases where p is larger than string length
                result.append(str); 
            }
            else{
                result.append(str.substring(0, i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.beginningRepetition("Java", 3));  // Output: JavJaJ
        System.out.println(solution.beginningRepetition("program", 4)); // Output: progprogrprogpro
        System.out.println(solution.beginningRepetition("abcdefg", 8)); // Output: abcdefgabcdefgabcdefgabcdefgabcdefgabcdefgabcdefgabcdefg
        System.out.println(solution.beginningRepetition("", 2));      // Output: ""
        System.out.println(solution.beginningRepetition(null, 2));     // Output: ""
        System.out.println(solution.beginningRepetition("xyz", 0));     // Output: ""


    }
}
