class Solution {
    /**
     * Finds the index of the first unique character in a string.
     *
     * @param s The input string.
     * @return The index of the first unique character.
     */
    public static int first_Uniq_Char(String s) {
        int[] charCounts = new int[26]; // Assuming lowercase English alphabet

        // Count the occurrences of each character
        for (char c : s.toCharArray()) {
            charCounts[c - 'a']++;
        }

        // Find the first character with a count of 1
        for (int i = 0; i < s.length(); i++) {
            if (charCounts[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1; // Should not reach here if there's at least one unique character
    }

    public static void main(String[] args) {
        String str = "wresource";
        System.out.println("Original string: " + str);
        int index = first_Uniq_Char(str);
        System.out.println("First unique character of the above: " + index);

        str = "leetcode";
        System.out.println("Original string: " + str);
        index = first_Uniq_Char(str);
        System.out.println("First unique character of the above: " + index);


         str = "aabb";
        System.out.println("Original string: " + str);
        index = first_Uniq_Char(str);
        System.out.println("First unique character of the above: " + index); //Correctly returns -1 now if there's no unique char.


    }
}
