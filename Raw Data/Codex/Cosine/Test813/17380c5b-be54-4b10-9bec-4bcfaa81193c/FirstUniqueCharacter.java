public class FirstUniqueCharacter {

    public static void main(String[] args) {
        String str = "wresource";
        int index = first_Uniq_Char(str);
        System.out.println("Original String: " + str);
        System.out.println("First unique character of in above: " + index);


        str = "aabbccddeeffg"; // Example with a unique character later in the string
        index = first_Uniq_Char(str);
        System.out.println("Original String: " + str);
        System.out.println("First unique character of in above: " + index);

        str = "loveleetcode"; // Example with repeating unique characters 
        index = first_Uniq_Char(str);
        System.out.println("Original String: " + str);
        System.out.println("First unique character of in above: " + index);

    }

    public static int first_Uniq_Char(String s) {
        int[] charCount = new int[26]; // Assuming lowercase English alphabet

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

        return -1; // Should not reach here as per problem statement (at least one unique char)
    }
}
