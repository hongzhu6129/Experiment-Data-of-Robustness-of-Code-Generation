public class StringFromCharArray {

    public static void main(String[] args) {

        // Method 1: Using String constructor directly
        char[] charArray1 = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
        String str1 = new String(charArray1);
        System.out.println("String created using constructor (Method 1): " + str1);


        // Method 2: Using String.valueOf()
        char[] charArray2 = {'J', 'a', 'v', 'a'};
        String str2 = String.valueOf(charArray2);
        System.out.println("String created using String.valueOf() (Method 2): " + str2);


        // Method 3:  Creating a substring from a char array (Specify start and end indices)
        char[] charArray3 = {'S', 'u', 'b', 's', 't', 'r', 'i', 'n', 'g', ' ', 'E', 'x', 'a', 'm', 'p', 'l', 'e'};
        String str3 = new String(charArray3, 0, 8); // Start at index 0, take 8 characters
        System.out.println("Substring from char array (Method 3): " + str3);


        // Important Note about immutability:
        // Strings in Java are immutable.  Modifying the original char array
        // will NOT affect the String object created from it.

        charArray1[0] = 'Y'; // Change the first character of charArray1
        System.out.println("String str1 after modifying charArray1: " + str1); // str1 remains unchanged



        // Copying char array elements into an existing String (using getChars)
        char[] charArray4 = {'C', 'o', 'p', 'y'};
        char[] destinationArray = new char[10]; // Must be large enough

        // Copy charArray4 into destinationArray, starting at destination index 2, copying 4 chars.
        str1.getChars(0,4, destinationArray, 2); 
        System.out.println("Destination array after copying: " + String.valueOf(destinationArray));



    }
}
