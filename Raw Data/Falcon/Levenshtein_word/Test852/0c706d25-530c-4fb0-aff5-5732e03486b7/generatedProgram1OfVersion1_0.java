class Solution {
    public static void main(String[] args) {
        String str = "wresource";
        int index = first_Uniq_Char(str);
        System.out.println("Original String: " + str);
        System.out.println("First unique character of the above: " + index);

        str = "aabbccddeeffgg"; // Example with no unique characters, to demonstrate the assumption doesn't hold.
        index = first_Uniq_Char(str);
        System.out.println("Original String: " + str);
        System.out.println("First unique character of the above: " + index);


        str = "loveleetcode"; // Example from LeetCode
        index = first_Uniq_Char(str);
        System.out.println("Original String: " + str);
        System.out.println("First unique character of the above: " + index);



    }

    public static int first_Uniq_Char(String s) {
        int[] charCount = new int[26]; // Assuming only lowercase English alphabet characters

        // Count the occurrences of each character
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Find the first character with a count of 1
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        // This line should technically not be reached, as the problem statement
        // assumes at least one unique character exists. However, including
        // this return statement to handle possible edge cases or if the assumption 
        // changes.  Returning -1 indicates no unique character found.
         return -1; 
    }
}
