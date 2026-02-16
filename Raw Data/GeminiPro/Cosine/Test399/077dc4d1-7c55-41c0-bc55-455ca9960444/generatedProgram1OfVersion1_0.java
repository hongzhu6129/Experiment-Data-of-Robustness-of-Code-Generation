class Solution {
    /**
     * Creates a new string with each character from the input string repeated twice.
     *
     * @param str The input string.
     * @return A new string with each character repeated twice.
     */
    public String repeatAllTwice(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            result.append(c).append(c);
        }
        return result.toString();
    }

    /**
     * Main method for testing.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        String input1 = "hello";
        String expected1 = "hheelllloo";
        String output1 = solution.repeatAllTwice(input1);
        System.out.println("Input: " + input1 + ", Output: " + output1 + ", Expected: " + expected1);

        String input2 = "abc";
        String expected2 = "aabbcc";
        String output2 = solution.repeatAllTwice(input2);
        System.out.println("Input: " + input2 + ", Output: " + output2 + ", Expected: " + expected2);


        String input3 = "";
        String expected3 = "";
        String output3 = solution.repeatAllTwice(input3);
        System.out.println("Input: " + input3 + ", Output: " + output3 + ", Expected: " + expected3);

        
    }
}
