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
            return null;
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
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }



    public static void main(String[] args) {
        String str = "Hello World";
        char ch = '*';
        String result = validate(str, ch);
        System.out.println(result); // Output: H*ll* W*rld


        str = "AEIOUaeiou";
        ch = '#';
        result = validate(str, ch);
        System.out.println(result); // Output: #########

        str = null;
        ch = '!';
        result = validate(str, ch);
        System.out.println(result); // Output: null

        str = "";
        ch = '@';
        result = validate(str, ch);
        System.out.println(result); // Output: 


        str = "Rhythm";
        ch = '$';
        result = validate(str, ch);
        System.out.println(result);  // Output: Rhythm (no vowels)


    }
}
