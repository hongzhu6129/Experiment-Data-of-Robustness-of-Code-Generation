public class StringFromCharArray {

    public static void main(String[] args) {

        // Sample character array
        char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};

        // Method 1: Using String constructor
        String str1 = new String(charArray);
        System.out.println("String created using constructor: " + str1);


        // Method 2: Using String.valueOf()
        String str2 = String.valueOf(charArray);
        System.out.println("String created using valueOf(): " + str2);



        // Example using a portion of the character array:
        String str3 = new String(charArray, 6, 5); // Start at index 6, take 5 characters ("World")
        System.out.println("String created using a portion of the array: " + str3);

    }
}
