public class CanonicalString {

    public static void main(String[] args) {

        // Example 1: Strings created using string literals
        String str1 = "hello";
        String str2 = "hello";

        // Since string literals are interned, they refer to the same object in the string pool
        System.out.println("str1 == str2: " + (str1 == str2)); // Output: true
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // Output: true
        System.out.println("str1 intern() == str2 intern(): " + (str1.intern() == str2.intern())); //Output: true (Redundant, already interned)



        // Example 2: Strings created using the new keyword
        String str3 = new String("world");
        String str4 = new String("world");

        // These are distinct objects, even though their content is the same.
        System.out.println("str3 == str4: " + (str3 == str4)); // Output: false
        System.out.println("str3.equals(str4): " + str3.equals(str4)); // Output: true

        // .intern() gets the canonical representation (from the string pool)
        System.out.println("str3.intern() == str4.intern(): " + (str3.intern() == str4.intern())); // Output: true

        // Example 3: Getting the canonical form explicitly
        String str5 = new String("example").intern();
        String str6 = "example";

        System.out.println("str5 == str6: " + (str5 == str6)); // Output: true  (str5 is now the canonical representation)



        //Important note on String concatenation and intern():

        String s7 = "Java";
        String s8 = "Programming";
        String s9 = s7 + s8;  // The + operator creates a new string object!
        String s10 = "JavaProgramming";

        System.out.println(s9 == s10); //false 
        String s11 = s9.intern();
        System.out.println(s10 == s11);  //true (s11 is now canonical)


    }
}
