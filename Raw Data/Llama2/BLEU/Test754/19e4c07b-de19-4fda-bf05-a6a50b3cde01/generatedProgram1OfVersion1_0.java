class Solution {

    /**
     * Reverses a string using recursion.
     *
     * @param str The string to reverse.
     */
    void reverseString(String str) {
        if ((str == null) || (str.length() <= 1)) {
            System.out.print(str); 
        } else {
            System.out.print(str.charAt(str.length() - 1));
            reverseString(str.substring(0, str.length() - 1));
        }
    }



    public static void main(String[] args) {
        Solution obj = new Solution();

        String str1 = "example";
        System.out.print("Reversed string of \"" + str1 + "\" is: \"");
        obj.reverseString(str1);
        System.out.println("\"");


        String str2 = "hello";
        System.out.print("Reversed string of \"" + str2 + "\" is: \"");
        obj.reverseString(str2);
        System.out.println("\"");

        String str3 = "OpenAI"; // Test with capital letters
        System.out.print("Reversed string of \"" + str3 + "\" is: \"");
        obj.reverseString(str3);
        System.out.println("\"");


         String str4 = ""; // Test with an empty string
        System.out.print("Reversed string of \"" + str4 + "\" is: \"");
        obj.reverseString(str4);
        System.out.println("\"");

         String str5 = null; // Test with a null string
        System.out.print("Reversed string of \"" + str5 + "\" is: \"");
        obj.reverseString(str5);
        System.out.println("\"");



    }
}
