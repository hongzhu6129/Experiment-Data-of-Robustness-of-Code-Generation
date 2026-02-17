public class StringRegionMatch {

    public static void main(String[] args) {
        String str1 = "abcdefgh";
        String str2 = "bcdefghij";

        // Example 1: Matching region
        int startIndex1 = 1;
        int startIndex2 = 0;
        int regionLength = 5;

        boolean match1 = str1.regionMatches(startIndex1, str2, startIndex2, regionLength);
        System.out.println("Match 1: " + match1); // Output: true (bcdef matches bcdef)

        // Example 2: Non-matching region
        startIndex1 = 0;
        startIndex2 = 0;
        regionLength = 8;

        boolean match2 = str1.regionMatches(startIndex1, str2, startIndex2, regionLength);
        System.out.println("Match 2: " + match2); // Output: false (abcdefgh does not match bcdefghij)


        // Example 3: Case-insensitive matching
        String str3 = "AbCdEfGh";
        String str4 = "aBcDeFgHiJ";

        startIndex1 = 0;
        startIndex2 = 0;
        regionLength = 5;


        boolean match3 = str3.regionMatches(true, startIndex1, str4, startIndex2, regionLength); // true for case-insensitive
        System.out.println("Match 3 (Case-insensitive): " + match3); // Output: true

        // Example 4: Different region lengths
        startIndex1 = 2;
        startIndex2 = 1;
        regionLength = 3;

        boolean match4 = str1.regionMatches(startIndex1, str2, startIndex2, regionLength);
        System.out.println("Match 4: " + match4); // Output: true (cde matches cde)



        // Example 5: Out of bounds
         try {
            startIndex1 = 7;
            startIndex2 = 0;
            regionLength = 3; // Region extends beyond str1's length

            boolean match5 = str1.regionMatches(startIndex1, str2, startIndex2, regionLength);
            System.out.println("Match 5: " + match5); // This won't print due to the exception.
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Match 5: StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
