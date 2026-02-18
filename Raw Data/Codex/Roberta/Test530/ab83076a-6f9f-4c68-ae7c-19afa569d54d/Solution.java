class Solution {
    /**
     * Checks if a given string contains another string.
     *
     * @param str1 The string to search within.
     * @param str2 The string to search for.
     * @return True if str2 is a substring of str1, false otherwise.
     */
    public static boolean is_present(String str1, String str2) {
        return str1.contains(str2);
    }

    public static void main(String[] args) {
        String str1 = "This is a test string";
        String str2 = "test";
        String str3 = "example";

        System.out.println(is_present(str1, str2)); // Output: true
        System.out.println(is_present(str1, str3)); // Output: false


        System.out.println(is_present("hello world", "world")); //true
        System.out.println(is_present("hello world", "World")); //false (case-sensitive)
        System.out.println(is_present("hello", "hello"));    //true
        System.out.println(is_present("hello", ""));         //true (empty string is always a substring)
        System.out.println(is_present("", "hello"));         //false
    }
}
