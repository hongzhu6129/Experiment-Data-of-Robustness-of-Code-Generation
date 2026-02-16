public class StringtoCharArray {

    public static void main(String[] args) {
        // Create a string
        String str = "Hello World";

        // Convert the string to a character array
        char[] chars = str.toCharArray();

        // Print the character array
        for (char c : chars) {
            System.out.println(c);
        }
    }
}
