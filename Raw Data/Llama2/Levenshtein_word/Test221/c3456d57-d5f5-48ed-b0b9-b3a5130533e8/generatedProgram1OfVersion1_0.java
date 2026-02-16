public class FirstUniqueChar {

    public static void main(String[] args) {
        String str1 = "leetcode";
        int index1 = first_Uniq_Char(str1);
        System.out.println("Index of first unique character in '" + str1 + "': " + index1); // Output: 0

        String str2 = "loveleetcode";
        int index2 = first_Uniq_Char(str2);
        System.out.println("Index of first unique character in '" + str2 + "': " + index2); // Output: 2

        String str3 = "aabb";
        int index3 = first_Uniq_Char(str3);
        System.out.println("Index of first unique character in '" + str3 + "': " + index3); // Output: -1 (If no unique character exists, though the problem states there's always one)


        String str4 = "z"; // Test with single character
        int index4 = first_Uniq_Char(str4);
        System.out.println("Index of first unique character in '" + str4 + "': " + index4); // Output: 0
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

        return -1; //  Should not reach here if there's always a unique character (as per problem statement)
    }
}
