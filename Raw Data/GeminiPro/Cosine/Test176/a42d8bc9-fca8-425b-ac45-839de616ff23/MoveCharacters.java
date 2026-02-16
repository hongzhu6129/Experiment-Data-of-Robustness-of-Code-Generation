// Java program to move character from one string to another using recursion

public class MoveCharacters {

    // Function to move character from one string to another
    public static String moveCharacters(String str1, String str2) {
        // Base case: If str1 is empty, return str2
        if (str1.isEmpty()) {
            return str2;
        }

        // Recursive case: Move the first character of str1 to str2 and call the function again
        char firstChar = str1.charAt(0);
        str2 = str2 + firstChar;
        str1 = str1.substring(1);
        return moveCharacters(str1, str2);
    }

    // Main method to test the program
    public static void main(String[] args) {
        // Test cases
        String str1 = "ABCD";
        String str2 = "";
        System.out.println(moveCharacters(str1, str2)); // Output: ABCD

        str1 = "Hello";
        str2 = "";
        System.out.println(moveCharacters(str1, str2)); // Output: Hello

        str1 = "12345";
        str2 = "";
        System.out.println(moveCharacters(str1, str2)); // Output: 12345

        str1 = "";
        str2 = "XYZ";
        System.out.println(moveCharacters(str1, str2)); // Output: XYZ

        str1 = "abc";
        str2 = "def";
        System.out.println(moveCharacters(str1, str2)); // Output: abcdef
    }
}
