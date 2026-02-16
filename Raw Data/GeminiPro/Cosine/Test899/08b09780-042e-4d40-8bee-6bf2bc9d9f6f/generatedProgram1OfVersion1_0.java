class Solution {
    /**
     * Finds the index of the first unique character in a given string.
     * Assumes that there is at least one unique character in the string.
     *
     * @param s The input string.
     * @return The index of the first unique character.
     */
    public static int first_Uniq_Char(String s) {
        int[] charCounts = new int[26]; // Assuming only lowercase English alphabet characters

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

        return -1; // Should not reach here as per the problem statement
    }

    public static void main(String[] args) {
        String str = "wresource";
        int index = first_Uniq_Char(str);
        System.out.println("Original String: " + str);
        System.out.println("First unique character of the above: " + index);


        str = "aabbccddeeffgg"; // Test with no unique characters (though the problem states there will be at least one)
        index = first_Uniq_Char(str);
        System.out.println("Original String: " + str);
        System.out.println("First unique character of the above: " + index); // This will return -1 because we reach the end without finding a unique character. Demonstrates what happens if the assumption doesn't hold.


         str = "loveleetcode";
        index = first_Uniq_Char(str);
        System.out.println("Original String: " + str);
        System.out.println("First unique character of the above: " + index);


        str = "leetcode";
        index = first_Uniq_Char(str);
        System.out.println("Original String: " + str);
        System.out.println("First unique character of the above: " + index);

    }
}
