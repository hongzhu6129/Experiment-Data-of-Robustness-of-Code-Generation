public class StringComparison {

    public static void main(String[] args) {
        // Sample strings and StringBuffer
        String str1 = "Hello World";
        String str2 = "Hello World";
        String str3 = "hello world"; // Different case
        String str4 = "Hello"; // Substring
        StringBuffer sb1 = new StringBuffer("Hello World");
        StringBuffer sb2 = new StringBuffer("hello world"); // Different case


        // 1. Comparing String with String using .equals()
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // True - Case-sensitive
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // False - Case-sensitive
        System.out.println("str1.equalsIgnoreCase(str3): " + str1.equalsIgnoreCase(str3)); // True - Case-insensitive


        // 2. Comparing String with StringBuffer using .equals() (Important!)
        System.out.println("str1.equals(sb1): " + str1.equals(sb1)); // False - String and StringBuffer are different types.
        System.out.println("str1.equals(sb1.toString()): " + str1.equals(sb1.toString())); // True - Convert StringBuffer to String before comparison using .toString()


        // 3. Comparing String with StringBuffer using .contentEquals()
        System.out.println("sb1.contentEquals(str1): " + sb1.contentEquals(str1)); // True - contentEquals() compares the content, regardless of the object type.
        System.out.println("sb2.contentEquals(str1): " + sb2.contentEquals(str1)); // False - Case-sensitive
        System.out.println("sb1.contentEquals(str4): " + sb1.contentEquals(str4)); // False - str4 is a substring.


         // 4. Comparing StringBuffers
        System.out.println("sb1.equals(sb2): " + sb1.equals(sb2));       // False - Content and case are different.
        StringBuffer sb3 = new StringBuffer("Hello World");  // Create a new StringBuffer with the same content as sb1
        System.out.println("sb1.equals(sb3): " + sb1.equals(sb3));       // False - StringBuffer equals() compares references, not content (similar to == for objects).


        // BEST PRACTICE for comparing String with StringBuffer content:
        // Convert the StringBuffer to a String using toString() and then use equals() or equalsIgnoreCase() for reliable content comparison.
    }
}
