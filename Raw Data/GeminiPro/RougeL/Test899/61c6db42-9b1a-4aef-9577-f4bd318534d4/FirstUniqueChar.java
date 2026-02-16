public class FirstUniqueChar {

    public static void main(String[] args) {
        String str = "wresource";
        int index = first_Uniq_Char(str);
        System.out.println("Original String: " + str);
        System.out.println("First unique character of the above: " + index);


        // Additional test cases (optional)
        System.out.println("Original String: loveleetcode");
        System.out.println("First unique character of the above: " + first_Uniq_Char("loveleetcode")); // 2

        System.out.println("Original String: abcda");
        System.out.println("First unique character of the above: " + first_Uniq_Char("abcda")); // 0

        System.out.println("Original String: aabbccddeeffg");
        System.out.println("First unique character of the above: " + first_Uniq_Char("aabbccddeeffg")); // 12

    }

    public static int first_Uniq_Char(String s) {
        int[] charCount = new int[26]; // Assuming only lowercase English letters

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

        return -1; // This should never be reached based on the problem description
    }
}
