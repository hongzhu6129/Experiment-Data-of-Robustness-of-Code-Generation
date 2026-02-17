public class StringComparison {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = "world";

        // Method 1: Using .equals() - checks for content equality
        System.out.println("Using .equals():");
        System.out.println(str1 + " equals " + str2 + ": " + str1.equals(str2));  // True
        System.out.println(str1 + " equals " + str3 + ": " + str1.equals(str3));  // True
        System.out.println(str1 + " equals " + str4 + ": " + str1.equals(str4));  // False


        // Method 2: Using == - checks for reference equality (memory location)
        System.out.println("\nUsing ==:");
        System.out.println(str1 + " == " + str2 + ": " + (str1 == str2));       // True (because of string interning)
        System.out.println(str1 + " == " + str3 + ": " + (str1 == str3));       // False (different objects)
        System.out.println(str1 + " == " + str4 + ": " + (str1 == str4));       // False

        // Important Note:  Use .equals() to reliably check if two strings have the same content.
        // == should only be used if you specifically want to know if two string variables refer to the exact same object in memory.

        // Handling nulls safely
        String str5 = null;
        //  System.out.println(str5.equals(str1));  // This will throw a NullPointerException!
        System.out.println("\nSafe null handling:");
        System.out.println(str1 + " equals " + str5 + ": " + (str1 == null ? str5 == null : str1.equals(str5))); // False
        System.out.println(str5 + " equals " + str1 + ": " + (str5 == null ? str1 == null : str5.equals(str1))); // False
        System.out.println(str5 + " equals " + null  + ": " + (str5 == null ? null == null : str5.equals(null))); // True  (null compared with null using == )

    }
}
