class StringReverser {

    void reverseString(String str) {
        String reversedString = new StringBuilder(str).reverse().toString();
        System.out.println(reversedString);
    }

    public static void main(String[] args) {
        StringReverser reverser = new StringReverser();
        reverser.reverseString("hello"); // Output: olleh
        reverser.reverseString("world"); // Output: dlrow
        reverser.reverseString("example"); // Output: elpmaxe

    }
}
