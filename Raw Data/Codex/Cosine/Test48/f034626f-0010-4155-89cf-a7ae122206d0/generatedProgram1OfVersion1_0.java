public class WildcardMatching {

    public static boolean chkMatching(char[] str1, char[] str2, int i, int j, boolean[][] lookup) {
        // Base Cases
        if (i == str1.length && j == str2.length) {
            return true;
        }

        if (i == str1.length && str2[j] == '*') {
            return chkMatching(str1, str2, i, j + 1, lookup);
        }

        if (i == str1.length || j == str2.length) {
            return false;
        }

        // Check if the result is already cached
        if (lookup[i][j]) {
            return lookup[i][j];
        }


        if (str1[i] == str2[j] || str2[j] == '?') {
            lookup[i][j] = chkMatching(str1, str2, i + 1, j + 1, lookup);

        } else if (str2[j] == '*') {

            lookup[i][j] = chkMatching(str1, str2, i + 1, j, lookup) || chkMatching(str1, str2, i, j + 1, lookup);


        } else {
            lookup[i][j] = false;
        }



        return lookup[i][j];

    }


    public static void main(String[] args) {
        String str1 = "baaabab";
        String pattern = "*****ba*****ab";
        // String pattern = "ba*****ab";
        //String pattern = "ba*ab";
        // String pattern = "a*ab";
        // String pattern = "a*****ab";
        //String pattern = "*a*****ab";
        // String pattern = "ba*ab****";
        //String pattern = "****";
        // String pattern = "*";
        // String pattern = "aa?ab";
        // String pattern = "b*b";
        // String pattern = "a*a";
        // String pattern = "baaabab";
        //String pattern = "?baaabab";
        // String pattern = "*baaaba*";

        boolean[][] lookup = new boolean[str1.length()][pattern.length()];

        if (chkMatching(str1.toCharArray(), pattern.toCharArray(), 0, 0, lookup)) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");

        }
    }
}
