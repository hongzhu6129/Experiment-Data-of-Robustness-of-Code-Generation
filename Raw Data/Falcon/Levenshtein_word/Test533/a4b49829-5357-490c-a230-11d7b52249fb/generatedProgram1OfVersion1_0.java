class Solution {
    /**
     * Reverses a given string iteratively.
     *
     * @param str The string to be reversed.
     */
    void reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        String reversedString = new String(charArray);
        System.out.println(reversedString);
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.reverseString("hello"); // Output: olleh
        solution.reverseString("world"); // Output: dlrow
        solution.reverseString("a");     // Output: a
        solution.reverseString("");      // Output: 
    }
}
