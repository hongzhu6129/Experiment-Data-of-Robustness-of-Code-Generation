public class StringComparison {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = "world";

        // Method 1: Using .equals() - checks for content equality
        System.out.println("Using .equals():");
        System.out.println(str1 + " and " + str2 + " are equal: " + str1.equals(str2)); // true
        System.out.println(str1 + " and " + str3 + " are equal: " + str1.equals(str3)); // true
        System.out.println(str1 + " and " + str4 + " are equal: " + str1.equals(str4)); // false

        // Method 2: Using == - checks for reference equality (if they point to the same object in memory)
        System.out.println("\nUsing ==:");
        System.out.println(str1 + " and " + str2 + " are equal: " + (str1 == str2)); // true (because of string interning)
        System.out.println(str1 + " and " + str3 + " are equal: " + (str1 == str3)); // false (str3 is a new object)


        //More comprehensive example with user input (within main method limitations)
        if (args.length == 2) { // Check if two arguments were provided
            String userStr1 = args[0];
            String userStr2 = args[1];
            System.out.println("\nComparing user input:");
            System.out.println(userStr1 + " and " + userStr2 + " are equal (content): " + userStr1.equals(userStr2));
            //Generally avoid == for String content comparison due to potential interning complexities.

        } else {
            System.out.println("\nPlease provide two string arguments when running the program.");

        }
    }
}
