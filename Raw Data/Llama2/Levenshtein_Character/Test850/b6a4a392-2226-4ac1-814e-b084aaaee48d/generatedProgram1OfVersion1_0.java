public class GetCharacterAtIndex {

    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = 7;

        if (index >= 0 && index < str.length()) {
            char character = str.charAt(index);
            System.out.println("Character at index " + index + ": " + character);
        } else {
            System.out.println("Invalid index.");
        }


        // More examples
        String str2 = "Java";
        int index2 = 0;
        if (index2 >= 0 && index2 < str2.length()) {
            char character2 = str2.charAt(index2);
            System.out.println("Character at index " + index2 + ": " + character2);
        } else {
            System.out.println("Invalid index.");
        }

        int index3 = 3;
        if (index3 >= 0 && index3 < str2.length()) {
            char character3 = str2.charAt(index3);
            System.out.println("Character at index " + index3 + ": " + character3);

        } else {
            System.out.println("Invalid index.");
        }

        int index4 = -1; // Example with an invalid index (negative)
        if (index4 >= 0 && index4 < str2.length()) {
            char character4 = str2.charAt(index4);
            System.out.println("Character at index " + index4 + ": " + character4);

        } else {
            System.out.println("Invalid index.");  // This will be printed
        }


        int index5 = 4; // Example with an invalid index (too large)
        if (index5 >= 0 && index5 < str2.length()) {
            char character5 = str2.charAt(index5);
            System.out.println("Character at index " + index5 + ": " + character5);

        } else {
            System.out.println("Invalid index.");  // This will be printed
        }
    }
}
