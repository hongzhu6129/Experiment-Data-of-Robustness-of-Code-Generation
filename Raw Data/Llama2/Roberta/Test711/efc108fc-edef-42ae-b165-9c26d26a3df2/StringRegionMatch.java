public class StringRegionMatch {

    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = "world hello";

        // Example 1: Check if "world" exists in both strings
        boolean match1 = regionMatches(str1, str2, "world");
        System.out.println("\"world\" match: " + match1); // Output: true

        // Example 2: Check if "hello w" exists in both strings
        boolean match2 = regionMatches(str1, str2, "hello w");
        System.out.println("\"hello w\" match: " + match2); // Output: true


        // Example 3: Check if "world!" exists in both strings (case-sensitive)
        boolean match3 = regionMatches(str1, str2, "world!");
        System.out.println("\"world!\" match (case-sensitive): " + match3); // Output: false


        // Example 4: Check if "World" exists in both strings (case-insensitive)
        boolean match4 = regionMatchesIgnoreCase(str1, str2, "World");
        System.out.println("\"World\" match (case-insensitive): " + match4); // Output: true



        // Example 5: Demonstrating offset and length parameters 
        String str3 = "abcdefgh";
        String str4 = "bcdef";

        boolean match5 = regionMatches(str3, 1, str4, 0, str4.length());
        System.out.println("Match with offsets and length : " + match5); // Output: true


    }

    public static boolean regionMatches(String str1, String str2, String region) {
        if (str1 == null || str2 == null || region == null) {
            return false;
        }
         return str1.contains(region) && str2.contains(region);
    }

     public static boolean regionMatchesIgnoreCase(String str1, String str2, String region) {
        if (str1 == null || str2 == null || region == null) {
            return false;
        }
         return str1.toLowerCase().contains(region.toLowerCase()) && str2.toLowerCase().contains(region.toLowerCase());
    }


    public static boolean regionMatches(String str1, int offset1, String str2, int offset2, int length) {
         if (str1 == null || str2 == null) {
            return false;
        }
        // Handle potential IndexOutOfBoundsExceptions
        if (offset1 < 0 || offset1 + length > str1.length() || offset2 < 0 || offset2 + length > str2.length()) {
            return false;
        }

        return str1.regionMatches(false, offset1, str2, offset2, length); // Case-sensitive comparison
    }


}
