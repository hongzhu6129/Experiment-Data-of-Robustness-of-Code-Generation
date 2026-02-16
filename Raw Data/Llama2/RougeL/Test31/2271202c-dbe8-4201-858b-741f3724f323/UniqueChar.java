public class UniqueChar {

    public static void main(String[] args) {
        String str = "wresource";
        int index = first_Uniq_Char(str);
        System.out.println("Original String: " + str);
        System.out.println("First unique character of the above: " + index);


        str = "aabbccddeeffgg"; // Test case with no unique character (should return -1 based on updated requirements)
        index = first_Uniq_Char(str);
        System.out.println("Original String: " + str);
        System.out.println("First unique character of the above: " + index);


        str = "loveleetcode";  // Example from LeetCode
        index = first_Uniq_Char(str);
        System.out.println("Original String: " + str);
        System.out.println("First unique character of the above: " + index);
    }

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

        return -1; // Return -1 if no unique character is found (handles cases like "aabbcc")
    }
}
