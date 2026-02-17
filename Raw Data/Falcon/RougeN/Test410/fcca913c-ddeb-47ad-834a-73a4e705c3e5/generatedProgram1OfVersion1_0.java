public class StringEnds {

    public String appearInBothEnds(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }

        int n = str.length();
        String longestSubstring = "";

        for (int len = n / 2; len >= 1; len--) { // Iterate through potential substring lengths
            String prefix = str.substring(0, len);
            String suffix = str.substring(n - len);

            if (prefix.equals(suffix)) {
                longestSubstring = prefix;
                break; // Found the longest, no need to check shorter lengths
            }
        }

        return longestSubstring;
    }

    public static void main(String[] args) {
        StringEnds se = new StringEnds();

        System.out.println(se.appearInBothEnds("abXYab"));     // Output: ab
        System.out.println(se.appearInBothEnds("xxabbxx"));    // Output: xx
        System.out.println(se.appearInBothEnds("xxxx"));       // Output: xx  (Note: it finds the *longest* common substring. "xxxx" would also be a valid substring at both ends, but "xx" is returned as it's considered longer when we check from the middle outwards)
        System.out.println(se.appearInBothEnds("abcdefgh"));   // Output: 
        System.out.println(se.appearInBothEnds("aba"));       // Output: a
        System.out.println(se.appearInBothEnds(""));         // Output: 
        System.out.println(se.appearInBothEnds(null));       // Output: (Handles null input)



    }
}
