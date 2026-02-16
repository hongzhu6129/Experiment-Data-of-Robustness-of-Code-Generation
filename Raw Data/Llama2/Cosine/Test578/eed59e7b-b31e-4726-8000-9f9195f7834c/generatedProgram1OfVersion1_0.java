public class GetCharacterAtIndex {

    public static void main(String[] args) {

        // Example strings
        String str1 = "Hello, world!";
        String str2 = "Java Programming";
        String str3 = "1234567890";


        // Example indices
        int index1 = 7;
        int index2 = 0;
        int index3 = 10; // Demonstrates handling an index that is out of bounds
        int negativeIndex = -2; // Demonstrates handling a negative index

        // Get character using charAt()
        char char1 = safeCharAt(str1, index1);
        char char2 = safeCharAt(str2, index2);
        char char3 = safeCharAt(str3, index3);
        char char4 = safeCharAt(str1, negativeIndex);// Example with a negative index (will likely be a space or some default)

        System.out.println("Character at index " + index1 + " in \"" + str1 + "\": " + char1);
        System.out.println("Character at index " + index2 + " in \"" + str2 + "\": " + char2);
        System.out.println("Character at index " + index3 + " in \"" + str3 + "\": " + char3); 
        System.out.println("Character at index " + negativeIndex + " in \"" + str1 + "\": " + char4);


        // Explanation for potential errors:
        if(index3 >= str3.length()) {
            System.out.println("Index " + index3 + " is out of bounds for string \"" + str3 + "\"");

        }



    }

    public static char safeCharAt(String s, int index) {
        // Handles invalid indices gracefully by returning a space character
        if (index < 0 || index >= s.length()) {
            return ' '; // Return a space for out-of-bounds indices or negative indices
        }
        return s.charAt(index);
    }
}
