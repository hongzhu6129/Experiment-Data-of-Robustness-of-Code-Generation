public class StringContains {

    public static void main(String[] args) {
        String haystack1 = "This is a test string.";
        String needle1 = "test";
        boolean result1 = is_present(haystack1, needle1);
        System.out.println(result1); // Output: true

        String haystack2 = "Hello, world!";
        String needle2 = "Java";
        boolean result2 = is_present(haystack2, needle2);
        System.out.println(result2); // Output: false

        String haystack3 = "This is a test string.";
        String needle3 = ""; // Empty string
        boolean result3 = is_present(haystack3, needle3);
        System.out.println(result3); // Output: true


        String haystack4 =  null;
        String needle4 = "test";
        boolean result4 = is_present(haystack4, needle4);
        System.out.println(result4); // Output: false


        String haystack5 = "test";
        String needle5 = null;
        boolean result5 = is_present(haystack5, needle5);
        System.out.println(result5); // Output: false


        
    }

    public static boolean is_present(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return false;  // Handle null inputs
        }
        return haystack.contains(needle);
    }
}
