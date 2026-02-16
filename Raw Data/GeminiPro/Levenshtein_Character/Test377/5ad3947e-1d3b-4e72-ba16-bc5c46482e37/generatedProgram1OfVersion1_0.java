class Solution {
    /**
     * Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
     *
     * @param a First string
     * @param b Second string
     * @return Concatenated string with adjusted lengths
     */
    public String minCat(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();

        if (lenA == lenB) {
            return a + b;
        } else if (lenA > lenB) {
            return a.substring(lenA - lenB) + b;
        } else {
            return a + b.substring(lenB - lenA);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        String[] strings = new String[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }


        String result = "";
        for (int i = 0; i < strings.length; i++) {
            if (i == 0) {
                result = strings[i];
            } else {
                result = sol.minCat(result, strings[i]);

            }

        }
          System.out.println(result);

        scanner.close();
    }
}
