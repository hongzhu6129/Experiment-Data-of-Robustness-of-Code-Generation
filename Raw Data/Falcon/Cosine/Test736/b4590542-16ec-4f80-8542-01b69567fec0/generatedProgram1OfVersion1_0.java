public class StringFromCharArray {

    public static void main(String[] args) {

        // Method 1: Using String constructor directly
        char[] charArray1 = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
        String str1 = new String(charArray1);
        System.out.println("String created using constructor (Method 1): " + str1);


        // Method 2: Using String.valueOf()
        char[] charArray2 = {'J', 'a', 'v', 'a'};
        String str2 = String.valueOf(charArray2);
        System.out.println("String created using String.valueOf() (Method 2): " + str2);



        // Method 3:  Creating a string from a subarray of characters
        char[] charArray3 = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'l', 'o', 'n', 'g', 'e', 'r', ' ', 's', 't', 'r', 'i', 'n', 'g'};
        // Create a string from characters at index 5 (inclusive) to 10 (exclusive) - "is a "
        String str3 = new String(charArray3, 5, 5);
        System.out.println("String created from a subarray (Method 3): " + str3);

        // Important note about character arrays and String immutability:
        // Modifying the char array AFTER creating the string does NOT change the String
        charArray1[0] = 'Y'; // Change 'H' to 'Y'
        System.out.println("String str1 after modifying the char array: " + str1);  // str1 remains "Hello World!"
        // Strings are immutable.  A new String object would need to be created.


    }
}
