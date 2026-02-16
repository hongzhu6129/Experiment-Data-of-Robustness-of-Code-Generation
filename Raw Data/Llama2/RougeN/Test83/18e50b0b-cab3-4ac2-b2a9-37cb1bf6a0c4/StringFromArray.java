public class StringFromArray {

    public static void main(String[] args) {
        // Create a character array
        char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};

        // Create a String object from the character array
        String strFromArray = new String(charArray);

        // Print the string
        System.out.println(strFromArray);


        // Example 2: Creating a String from a portion of a char array
        char[] anotherCharArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};

        // Create a string from index 2 (inclusive) to 5 (exclusive)
        String subStringFromArray = new String(anotherCharArray, 2, 3); // 3 characters from index 2

        System.out.println(subStringFromArray); // Output: CDE
    }
}
