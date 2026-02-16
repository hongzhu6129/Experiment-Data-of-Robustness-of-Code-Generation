public class StringRegionMatch {

    public static void main(String[] args) {
        String string1 = "hello world";
        String string2 = "world peace";

        // Example 1: Matching region exists
        boolean match1 = regionMatches(string1, 6, string2, 0, 5);
        System.out.println("Match 1: " + match1); // Output: true

        // Example 2: Matching region does not exist (different case)
        boolean match2 = regionMatches(string1, 6, string2, 0, 5, false); // Case-sensitive comparison
        System.out.println("Match 2: " + match2);


        // Example 3: Matching region does not exist (different lengths)
        boolean match3 = regionMatches(string1, 6, string2, 0, 6);
        System.out.println("Match 3: " + match3); // Output: false


        // Example 4: Starting index out of bounds.
        boolean match4 = regionMatches(string1, 11, string2, 0, 5);
        System.out.println("Match 4: " + match4); //Effectively false due to exception handling



        // Example 5: Negative offset. (throws exception/returns effectively false)
        boolean match5 = regionMatches(string1, -1, string2, 0, 5);
        System.out.println("Match 5: " + match5); //Effectively false due to exception handling


        // Example 6: Offset and length beyond the length of string2.
        boolean match6 = regionMatches(string1, 0, string2, 6, 6);
        System.out.println("Match 6: " + match6); // Effectively false due to exception handling
    }


    public static boolean regionMatches(String str1, int toffset, String str2, int ooffset, int len) {
        return regionMatches(str1, true, toffset, str2, ooffset, len); // Default case-insensitive behavior
    }

    public static boolean regionMatches(String str1, boolean ignoreCase, int toffset, String str2, int ooffset, int len) {
        try {
            char ta[] = str1.toCharArray();
            char pa[] = str2.toCharArray();
            int to = toffset;
            int po = ooffset;

            // Note: toffset, ooffset, or len might be near -1>>>1.
            if ((ooffset < 0) || (toffset < 0) || (toffset > str1.length() - len) ||
                    (ooffset > str2.length() - len)) {
                return false;
            }

            while (len-- > 0) {
                char c1 = ta[to++];
                char c2 = pa[po++];
                if (c1 == c2) {
                    continue;
                }
                if (ignoreCase) {
                    // If characters don't match but case is ignored, try converting
                    // both characters to uppercase.
                    // If the results match, then the comparison scan should
                    // continue.
                    char u1 = Character.toUpperCase(c1);
                    char u2 = Character.toUpperCase(c2);
                    if (u1 == u2) {
                        continue;
                    }
                    // Unfortunately, conversion to uppercase does not work properly
                    // for the Georgian alphabet, which has more than 30 more characters
                    // upper case than lower case.  To work correctly, we would have to
                    // map all 33 Unicode uppercase characters to the corresponding
                    // Unicode lowercase characters, and vice versa.
                    if (Character.toLowerCase(u1) == Character.toLowerCase(u2)) {
                        continue;
                    }
                }
                return false;
            }
             return true;
        } catch (IndexOutOfBoundsException e) {
            return false; // Handle potential IndexOutOfBoundsExceptions
        }
    }
}
