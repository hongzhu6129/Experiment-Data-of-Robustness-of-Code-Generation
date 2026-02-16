class Solution {
    /**
     * Discards all vowels from a given string and returns the updated string.
     *
     * @param str The input string.
     * @return The string with vowels removed.
     */
    public static String validate(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!isVowel(c)) {
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
        String testString1 = "Hello World";
        String result1 = validate(testString1);
        System.out.println(result1); // Output: Hll Wrld


        String testString2 = "AEIOUaeiou";
        String result2 = validate(testString2);
        System.out.println(result2); // Output: 

        String testString3 = "This is a test string.";
        String result3 = validate(testString3);
        System.out.println(result3); // Output: Ths s  tst strng.
    }
}
