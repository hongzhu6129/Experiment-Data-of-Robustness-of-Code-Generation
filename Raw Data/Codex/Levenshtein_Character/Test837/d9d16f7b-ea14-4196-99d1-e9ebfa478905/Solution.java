class Solution {
    /**
     * Converts a given string to lowercase.
     *
     * @param s The input string.
     * @return The lowercase version of the input string.
     */
    public static String function(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
                charArray[i] = (char) (charArray[i] + 32);
            }
        }
        return new String(charArray);
    }


    public static void main(String[] args) {
        String inputString = "HeLlO WoRlD";
        String lowercaseString = function(inputString);
        System.out.println(lowercaseString); // Output: hello world

        inputString = "AbCdEfGhIjKlMnOpQrStUvWxYz";
        lowercaseString = function(inputString);
        System.out.println(lowercaseString);  // Output: abcdefghijklmnopqrstuvwxyz

        inputString = "12345!@#$%^"; // Test with non-alphabetic characters.
        lowercaseString = function(inputString); 
        System.out.println(lowercaseString); // Output: 12345!@#$%^


    }
}
