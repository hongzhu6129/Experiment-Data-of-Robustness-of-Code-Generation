class Solution {
    /**
     * Given a string, find the index of the first unique character.
     * Assume that there is at least one unique character in the string.
     *
     * @param s The input string.
     * @return The index of the first unique character.
     */
    public static int first_Uniq_Char(String s) {
        int[] charCounts = new int[26]; // Assuming lowercase English alphabet

        // Count character frequencies
        for (char c : s.toCharArray()) {
            charCounts[c - 'a']++;
        }

        // Find the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (charCounts[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1; // Should not reach here based on the assumption
    }

    public static void main(String[] args) {
        String inputString = "wresource";
        int index = first_Uniq_Char(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("First unique character of the above: " + index);


        inputString = "leetcode";
        index = first_Uniq_Char(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("First unique character of the above: " + index);

        inputString = "aabb";
        index = first_Uniq_Char(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("First unique character of the above: " + index);


    }
}
