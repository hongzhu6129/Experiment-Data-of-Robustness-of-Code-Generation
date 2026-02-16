public class StringComparison {

    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = "world";


        // Method 1: Using .equals() - recommended for content comparison
        System.out.println("Using .equals():");
        System.out.println(str1 + " equals " + str2 + ": " + str1.equals(str2)); // true
        System.out.println(str1 + " equals " + str3 + ": " + str1.equals(str3)); // true
        System.out.println(str1 + " equals " + str4 + ": " + str1.equals(str4)); // false



        // Method 2: Using == (compares references, not always content)
        System.out.println("\nUsing ==:");
        System.out.println(str1 + " == " + str2 + ": " + (str1 == str2));       // true (because of string interning)
        System.out.println(str1 + " == " + str3 + ": " + (str1 == str3));       // false (str3 is a new object)




        //Illustrating a potential issue with == when not using literals or interned strings.
        String str5 = new String("test");
        String str6 = new String("test"); 
        System.out.println(str5 + " == " + str6 + ": " + (str5 == str6));  //false: Different objects, even if content is same.


        // Using equalsIgnoreCase() for case-insensitive comparison
        String str7 = "Hello";
        System.out.println("\nUsing equalsIgnoreCase():");
        System.out.println(str1 + " equalsIgnoreCase " + str7 + ": " + str1.equalsIgnoreCase(str7)); // true

    }
}
