class Solution {
    /**
     * Checks if the second string contains the first one.
     *
     * @param str1 The first string.
     * @param str2 The second string.
     * @return True if str2 contains str1, false otherwise.
     */
    public static boolean is_str_contains(String str1, String str2) {
        return str2.contains(str1);
    }

    public static void main(String[] args) {
        String str1 = "once in a blue moon";
        String str2 = "see eye to eye";

        if (is_str_contains(str1, str2)) {
            System.out.println("if the second string contains the first one? true");
        } else {
            System.out.println("if the second string contains the first one? false");
        }
    }
}
