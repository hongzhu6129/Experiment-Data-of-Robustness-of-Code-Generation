public class StringComparison {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = "world";

        // Method 1: Using .equals() method (recommended for content comparison)
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
        System.out.println("str1.equals(str4): " + str1.equals(str4)); // false

        // Method 2: Using == operator (compares references, not always content)
        System.out.println("str1 == str2: " + (str1 == str2)); // true (because of string pool optimization)
        System.out.println("str1 == str3: " + (str1 == str3)); // false (str3 is a new object)

        // Method 3: Using .compareTo() method (lexicographical comparison)
        // Returns 0 if strings are equal, negative if str1 < str2, positive if str1 > str2
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // 0
        System.out.println("str1.compareTo(str4): " + str1.compareTo(str4)); // negative

        // Example demonstrating case-insensitive comparison
        String str5 = "Hello";
        System.out.println("str1.equalsIgnoreCase(str5): " + str1.equalsIgnoreCase(str5)); // true


        //Important Note:
        System.out.println("\nImportant Note on == vs .equals():");
        String s1 = new String("example");
        String s2 = new String("example");

        System.out.println("s1 == s2: " + (s1 == s2));         //false (different objects in memory)
        System.out.println("s1.equals(s2): " + s1.equals(s2)); //true  (content is the same)



    }
}
