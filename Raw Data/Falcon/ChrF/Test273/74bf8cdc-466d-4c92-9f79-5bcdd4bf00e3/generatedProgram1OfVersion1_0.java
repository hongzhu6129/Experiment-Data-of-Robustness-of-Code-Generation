public class FirstUniqueChar {

    public static void main(String[] args) {
        String str = "wresource";
        int index = first_Uniq_Char(str);
        System.out.println("Original string: " + str);
        System.out.println("First unique character of the above: " + index);

        // Additional test cases (optional):
        System.out.println(first_Uniq_Char("loveleetcode")); // Expected: 2
        System.out.println(first_Uniq_Char("aabb")); // Expected: -1 (If you want to handle cases with no unique chars)
        System.out.println(first_Uniq_Char("dddccdbba")); // Expected: 8

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

        return -1; // Return -1 if no unique character is found (Optional, depends on the requirements)
    }
}
