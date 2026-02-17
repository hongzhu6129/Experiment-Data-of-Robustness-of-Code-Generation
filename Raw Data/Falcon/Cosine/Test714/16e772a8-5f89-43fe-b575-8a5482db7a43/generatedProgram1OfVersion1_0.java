public class StringSearch {

    public static void main(String[] args) {
        String haystack = "hello world";
        String needle = "world";

        int index = strStr(haystack, needle);

        if (index != -1) {
            System.out.println("Found '" + needle + "' at index: " + index); // Output: Found 'world' at index: 6
        } else {
            System.out.println("'" + needle + "' not found in '" + haystack + "'");
        }


        haystack = "aaaaa";
        needle = "bba";
        index = strStr(haystack, needle);
        if (index != -1) {
            System.out.println("Found '" + needle + "' at index: " + index);
        } else {
            System.out.println("'" + needle + "' not found in '" + haystack + "'"); // Output: 'bba' not found in 'aaaaa'
        }



        haystack = "";
        needle = "";
        index = strStr(haystack, needle); // Demonstrating empty string case
        if (index != -1) {
            System.out.println("Found '" + needle + "' at index: " + index); // Output: Found '' at index: 0
        } else {
            System.out.println("'" + needle + "' not found in '" + haystack + "'");
        }
    }


    /**
     * Finds the first occurrence of a substring (needle) within a string (haystack).
     *
     * @param haystack The string to search within.
     * @param needle   The substring to search for.
     * @return The index of the first occurrence of the needle in the haystack, or -1 if not found.
     */
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {  // Handle empty needle case (occurs at index 0)
            return 0; 
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {  // Optimized loop condition
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;  // Needle not found
    }
}
