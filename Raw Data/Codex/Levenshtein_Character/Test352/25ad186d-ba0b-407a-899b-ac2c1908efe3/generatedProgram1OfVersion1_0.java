public class Successor {

    public static void main(String[] args) {
        // Create a string.
        String str = "networks";

        // Find the successor of the last character in the string.
        char successor = (char) ((str.charAt(str.length() - 1) + 1));

        // Print the successor.
        System.out.println("The successor of the last character in the string is: " + successor);
    }
}
