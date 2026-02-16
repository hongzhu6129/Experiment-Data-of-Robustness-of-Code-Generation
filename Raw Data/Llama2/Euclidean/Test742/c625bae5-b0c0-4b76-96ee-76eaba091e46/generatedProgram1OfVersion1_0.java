class Solution {
    /**
     * Replaces all vowels in a string with a specified character.
     *
     * @param str The input string.
     * @param ch  The character to replace vowels with.
     * @return The modified string with vowels replaced.
     */
    public static String validate(String str, char ch) {
        if (str == null) {
            return null; // Handle null input
        }

        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (isVowel(c)) {
                sb.append(ch);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c); // Case-insensitive check
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }


    public static void main(String[] args) {
        String str1 = "Hello World";
        char ch1 = '*';
        String result1 = validate(str1, ch1);
        System.out.println(result1); // Output: H*ll* W*rld


        String str2 = "AEIOUaeiou";
        char ch2 = '#';
        String result2 = validate(str2, ch2);
        System.out.println(result2);  // Output: #########

        String str3 = null; // Test null input
        char ch3 = '$';
        String result3 = validate(str3, ch3);
        System.out.println(result3); // Output: null


        String str4 = ""; // Test empty input
        char ch4 = '@';
        String result4 = validate(str4, ch4);
        System.out.println(result4); // Output ""

        String str5 = "rhythm";  // Test a word with no vowels
        char ch5 = '!';
        String result5 = validate(str5, ch5);
        System.out.println(result5); // Output: rhythm

    }
}
