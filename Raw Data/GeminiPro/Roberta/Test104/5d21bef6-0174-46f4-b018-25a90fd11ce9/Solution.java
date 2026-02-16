class Solution {
    /**
     * Rotates a string by a given offset (from left to right).
     *
     * @param str   The input string.
     * @param offset The rotation offset.
     * @return The rotated string.
     */
    public String rotateString(String str, int offset) {
        if (str == null || str.length() == 0) {
            return str;
        }

        offset = offset % str.length();
        char[] charArray = str.toCharArray();
        reverse(charArray, 0, charArray.length - offset - 1);
        reverse(charArray, charArray.length - offset, charArray.length - 1);
        reverse(charArray, 0, charArray.length - 1);

        return new String(charArray);

    }


    public void reverse(char[] str, int start, int end) {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }



    public static void main(String[] args) {
        Solution solution = new Solution();

        String str1 = "abcdefg";
        int offset1 = 3;
        String rotated1 = solution.rotateString(str1, offset1);
        System.out.println(rotated1); // Output: efgabcd

        String str2 = "abcdefg";
        int offset2 = 0;
        String rotated2 = solution.rotateString(str2, offset2);
        System.out.println(rotated2); // Output: abcdefg

        String str3 = "abcdefg";
        int offset3 = 7;
        String rotated3 = solution.rotateString(str3, offset3);
        System.out.println(rotated3); // Output: abcdefg


        String str4 = "";
        int offset4 = 3;
        String rotated4 = solution.rotateString(str4, offset4);
        System.out.println(rotated4); // Output: ""

        String str5 = null;
        int offset5 = 3;
        String rotated5 = solution.rotateString(str5, offset5);
        System.out.println(rotated5); // Output: null



    }
}
