public class StringEnds {

    public String appearInBothEnds(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }

        int n = str.length();
        String longestSubstring = "";

        for (int len = n / 2; len >= 1; len--) { // Iterate through potential substring lengths
            String start = str.substring(0, len);
            String end = str.substring(n - len);

            if (start.equals(end)) {
                longestSubstring = start;
                break; // Found the longest, no need to check shorter lengths
            }
        }

        return longestSubstring;
    }

    public static void main(String[] args) {
        StringEnds se = new StringEnds();
        String str1 = "abXYab";
        String str2 = "xxabxxab";
        String str3 = "xxabxxabxx";  // Example where the middle "xxab" doesn't affect the result.
        String str4 = "abcxyzabc";
        String str5 = "abcdefgh";     // No matching substring

        System.out.println("Longest substring in '" + str1 + "': " + se.appearInBothEnds(str1)); // Output: ab
        System.out.println("Longest substring in '" + str2 + "': " + se.appearInBothEnds(str2)); // Output: xxab
        System.out.println("Longest substring in '" + str3 + "': " + se.appearInBothEnds(str3)); // Output: xx
        System.out.println("Longest substring in '" + str4 + "': " + se.appearInBothEnds(str4)); // Output: abc
        System.out.println("Longest substring in '" + str5 + "': " + se.appearInBothEnds(str5)); // Output: "" (empty string)


    }
}


