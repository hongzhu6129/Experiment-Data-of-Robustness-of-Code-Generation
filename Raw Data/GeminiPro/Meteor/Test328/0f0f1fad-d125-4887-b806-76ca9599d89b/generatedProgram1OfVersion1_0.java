public class StringFromArray {

    public static void main(String[] args) {

        // Method 1: Using String constructor directly
        char[] charArray1 = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
        String str1 = new String(charArray1);
        System.out.println("String created using constructor: " + str1);


        // Method 2: Using valueOf() method
        char[] charArray2 = {'J', 'a', 'v', 'a'};
        String str2 = String.valueOf(charArray2);
        System.out.println("String created using valueOf(): " + str2);


        //Creating a String from a sub-array
        char[] charArray3 = {'S', 'u', 'b', 's', 't', 'r', 'i', 'n', 'g', ' ', 'E', 'x', 'a', 'm', 'p', 'l', 'e'};
        String str3 = new String(charArray3, 0, 8); // From index 0, take 8 characters.
        System.out.println("String created from subarray: " + str3);
    }
}
