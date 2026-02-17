public class StringRegionMatch {

    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "World";

        // Check if str2 is a substring of str1 (anywhere)
        boolean isSubstring = str1.contains(str2);

        if (isSubstring) {
            System.out.println("String '" + str2 + "' is a substring of '" + str1 + "'");

            // Find the first occurrence of the substring
            int firstOccurrence = str1.indexOf(str2);

            System.out.println("First occurrence at index: " + firstOccurrence);


            // Demonstrating regionMatches (more flexible)
            int toffset = 0; // Offset in target string (str1)
            int ooffset = 0; // Offset in other string (str2)
            int len = str2.length();

            boolean regionMatches = str1.regionMatches(toffset + firstOccurrence, str2, ooffset, len);

            if (regionMatches) {
                System.out.println("Region matches confirmed at index: " + firstOccurrence);
            }



            // Another regionMatches Example (case-insensitive).
            String str3 = "world"; // Lowercase "world"
            boolean regionMatchesCaseInsensitive = str1.regionMatches(true, toffset + firstOccurrence, str3, ooffset, len);

            if (regionMatchesCaseInsensitive) {
                System.out.println("Region matches (case-insensitive) confirmed at index: " + firstOccurrence);
            }

        } else {
            System.out.println("String '" + str2 + "' is NOT a substring of '" + str1 + "'");
        }





    }
}



