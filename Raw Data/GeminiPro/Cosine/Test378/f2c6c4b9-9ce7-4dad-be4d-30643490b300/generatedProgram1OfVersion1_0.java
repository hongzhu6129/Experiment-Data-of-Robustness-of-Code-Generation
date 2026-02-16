class StringNTwice {

    /**
     * Creates a new string by taking the specified number of characters from
     * the beginning and end of a given string.
     *
     * @param str The input string.
     * @param n   The number of characters to take from the beginning and end.
     * @return A new string formed by concatenating the first and last n
     * characters of the input string. Returns the original string if n is 
     * greater than or equal to the length of the string. Returns an empty string
     * if n is less than 0.
     */
    public String nTwice(String str, int n) {
        if (n < 0) {
            return "";
        }
        int len = str.length();
        if (n >= len) {
            return str;
        }

        return str.substring(0, n) + str.substring(len - n);
    }

    public static void main(String[] args) {
        StringNTwice obj = new StringNTwice();
        String str1 = "Hello";
        int n1 = 2;
        System.out.println(obj.nTwice(str1, n1)); // Output: Heo

        String str2 = "Chocolate";
        int n2 = 3;
        System.out.println(obj.nTwice(str2, n2)); // Output: Choate

        String str3 = "Chocolate";
        int n3 = 10; // n is larger than string length
        System.out.println(obj.nTwice(str3, n3));  // Output: Chocolate

        String str4 = "Java";
        int n4 = -1;
        System.out.println(obj.nTwice(str4, n4)); // Output: "" (Empty string)
    }
}
