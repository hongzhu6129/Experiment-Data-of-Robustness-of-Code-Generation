class StringManipulation {

    /**
     * Creates a new string by taking a specified number of characters from the
     * beginning and end of a given string.
     *
     * @param str The input string.
     * @param n   The number of characters to take from the beginning and end.
     * @return A new string formed by concatenating the first 'n' and last 'n'
     *         characters of the input string.  Returns the original string if 'n'
     *         exceeds the string length.
     */
    public String nTwice(String str, int n) {
        if (n > str.length()) {
            return str;
        }
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public static void main(String[] args) {
        StringManipulation sm = new StringManipulation();
        System.out.println(sm.nTwice("Hello", 2)); // Heo
        System.out.println(sm.nTwice("Chocolate", 3)); // Choate
        System.out.println(sm.nTwice("Chocolate", 8)); // Chocolate  (n exceeds length)
        System.out.println(sm.nTwice("Ab", 3)); //Ab (n exceeds length)

    }
}
