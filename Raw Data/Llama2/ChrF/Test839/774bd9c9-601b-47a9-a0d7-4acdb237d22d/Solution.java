class Solution {
    /**
     * Adds a string to itself a specified number of times, separated by a substring.
     *
     * @param str       The string to repeat.
     * @param separator The substring to use as a separator.
     * @param count     The number of times to repeat the string.
     * @return The concatenated string. Returns an empty string if count is less than or equal to 0.
     * If count is 1, returns the original string without any separators.
     */
    public String addBySeparator(String str, String separator, int count) {
        if (count <= 0) {
            return "";
        }
        if (count == 1) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(str);
            if (i < count - 1) {
                result.append(separator);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String str1 = "Word";
        String separator1 = "-";
        int count1 = 3;
        String result1 = solution.addBySeparator(str1, separator1, count1);
        System.out.println(result1); // Output: Word-Word-Word

        String str2 = "Programming";
        String separator2 = "===";
        int count2 = 2;
        String result2 = solution.addBySeparator(str2, separator2, count2);
        System.out.println(result2); // Output: Programming===Programming


        String str3 = "Test";
        String separator3 = "+++";
        int count3 = 0; // Testing zero count
        String result3 = solution.addBySeparator(str3, separator3, count3);
        System.out.println(result3); // Output: "" (empty string)

        String str4 = "Single";
        String separator4 = "***";
        int count4 = 1; // Testing count of 1
        String result4 = solution.addBySeparator(str4, separator4, count4);
        System.out.println(result4); // Output: Single

    }
}
