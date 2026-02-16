public class StringComparison {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = "world";

        // Method 1: Using .equals() (recommended for content comparison)
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
        System.out.println("str1.equals(str4): " + str1.equals(str4)); // false


        // Method 2: Using == (compares memory addresses/references)
        System.out.println("str1 == str2: " + (str1 == str2)); // true (because of string interning)
        System.out.println("str1 == str3: " + (str1 == str3)); // false (different objects)
        System.out.println("str1 == str4: " + (str1 == str4)); // false

        // Demonstrating how to handle nulls safely with .equals()
        String str5 = null;
        System.out.println("str1.equals(str5): " + str1.equals(str5));    // false (safe)
        //System.out.println("str5.equals(str1): " + str5.equals(str1)); // NullPointerException (unsafe)

        if (str5 != null && str5.equals(str1)) { 
            System.out.println("str5 equals str1 (safe check)"); 
        } else {
            System.out.println("str5 does not equal str1 or str5 is null (safe check)");
        }

        // Another concise way for null-safe comparison using Objects.equals() (Java 7+)
        System.out.println("Objects.equals(str1, str5): " + java.util.Objects.equals(str1, str5)); // false (safe)
        System.out.println("Objects.equals(str5, str1): " + java.util.Objects.equals(str5, str1)); // false (safe)

    }
}
