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

        // Method 2: Using == (checks for reference equality)
        System.out.println("str1 == str2: " + (str1 == str2)); // true (because of string interning)
        System.out.println("str1 == str3: " + (str1 == str3)); // false (str3 is a new object)


        // More robust example (handles nulls):
        String str5 = null;
        String str6 = "another string";

        // Using Objects.equals() is null-safe
        System.out.println("Objects.equals(str5, str6): " + java.util.Objects.equals(str5, str6)); // false
        System.out.println("Objects.equals(str6, str5): " + java.util.Objects.equals(str6, str5)); // false
        System.out.println("Objects.equals(str5, null): " + java.util.Objects.equals(str5, null)); // true




    }
}
