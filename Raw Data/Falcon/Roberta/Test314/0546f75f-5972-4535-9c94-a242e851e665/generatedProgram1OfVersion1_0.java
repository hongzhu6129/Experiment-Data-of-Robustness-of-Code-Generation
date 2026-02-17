class Solution {
    /**
     * Checks if a string starts with "good" and contains at least one "1".
     *
     * @param str The input string.
     * @return True if the string starts with "good" and contains at least one "1", false otherwise.
     */
    public boolean hasGood(String str) {
        if (str == null || str.length() < 4) {
            return false;
        }

        if (!str.startsWith("good")) {
            return false;
        }

        return str.contains("1");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] testCases = {
                "good1",
                "good2",
                "good123",
                "bad1",
                "good",
                "1good",
                "good1good",
                null,
                ""
        };

        for (String testCase : testCases) {
            boolean result = solution.hasGood(testCase);
            System.out.println("Input: \"" + testCase + "\", Output: " + result);
        }
    }
}
