class Solution {
    /**
     * Removes vowels (a, e, i, o, u) from a given string.
     *
     * @param inputString The input string.
     * @return The updated string with vowels removed.
     */
    public static String validate(String inputString) {
        if (inputString == null) {
            return null; 
        }

        StringBuilder result = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (!"aeiouAEIOU".contains(String.valueOf(c))) {
                result.append(c);
            }
        }
        return result.toString();
    }



    public static void main(String[] args) {
        String testString1 = "hello";
        String result1 = validate(testString1);
        System.out.println(result1); // Output: hll

        String testString2 = "AEIOU";
        String result2 = validate(testString2);
        System.out.println(result2); // Output: (empty string)


        String testString3 = null;
        String result3 = validate(testString3);
        System.out.println(result3); // Output: null (or handle null as needed)


        String testString4 = "ThIs Is A tEsT StRiNg";
        String result4 = validate(testString4);
        System.out.println(result4); // Output: Ths s  tSt Strng
    }
}
