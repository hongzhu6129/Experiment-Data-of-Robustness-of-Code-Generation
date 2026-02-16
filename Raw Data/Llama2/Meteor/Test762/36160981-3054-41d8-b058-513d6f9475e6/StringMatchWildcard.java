public class StringMatchWildcard {

    public static boolean chkMatching(char[] str1, char[] str2, int i, int j, boolean[][] lookup) {
        if (i == str1.length && j == str2.length) {
            return true;
        }
        if (i == str1.length) {
            return false; // str1 exhausted but str2 still has characters
        }
        if (j == str2.length) {
            // str2 exhausted. str1 can only match if remaining characters are all '*'
            for (int k = i; k < str1.length; k++) {
                if (str1[k] != '*') {
                    return false;
                }
            }
            return true;
        }

        if (lookup[i][j]) {
            return lookup[i][j];
        }

        if (str1[i] == '*') {
            boolean matchZero = chkMatching(str1, str2, i + 1, j, lookup); // '*' matches zero characters
            boolean matchOne = chkMatching(str1, str2, i, j + 1, lookup);   // '*' matches one character
            boolean matchMany = chkMatching(str1, str2, i + 1, j + 1, lookup); // '*' matches multiple chars (consume both) or (consume only str2 char and keep *)

            lookup[i][j] = matchZero || matchOne || matchMany; // optimization

            return lookup[i][j];

        } else if (str1[i] == str2[j] || str1[i] == '?') {  // '?' matches any single character
            lookup[i][j] = chkMatching(str1, str2, i + 1, j + 1, lookup);
            return lookup[i][j];

        } else {
            return false; // Characters don't match
        }
    }


    public static void main(String[] args) {
        String s1 = "ab*cd";
        String s2 = "abccd";

        String s3 = "so*ea*ve?"; // Example with multiple * and ?
        String s4 = "soleavea";



        System.out.println("\"" + s1 + "\" matches \"" + s2 + "\": " + 
                           chkMatching(s1.toCharArray(), s2.toCharArray(), 0, 0, new boolean[s1.length()][s2.length()]));

        System.out.println("\"" + s3 + "\" matches \"" + s4 + "\": " + 
                           chkMatching(s3.toCharArray(), s4.toCharArray(), 0, 0, new boolean[s3.length()][s4.length()]));
                
                
        // More test cases:                
        System.out.println("\"" + "a*" + "\" matches \"" + "a" + "\": " + 
                chkMatching("a*".toCharArray(), "a".toCharArray(), 0, 0, new boolean[2][1]));
         System.out.println("\"" + "*" + "\" matches \"" + "a" + "\": " + 
                 chkMatching("*".toCharArray(), "a".toCharArray(), 0, 0, new boolean[1][1]));

    }
}
