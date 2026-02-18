class StringReverser {

    void reverseString(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println(reversedStr);
    }

    public static void main(String[] args) {
        StringReverser reverser = new StringReverser();

        // Example usage:
        reverser.reverseString("hello"); // Output: olleh
        reverser.reverseString("world"); // Output: dlrow
        reverser.reverseString("Java");  // Output: avaJ
    }
}
