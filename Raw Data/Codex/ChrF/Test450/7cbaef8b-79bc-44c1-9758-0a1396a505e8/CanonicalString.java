public class CanonicalString {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = str2.intern();

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);


        System.out.println("str1 == str2: " + (str1 == str2)); // false - Different objects
        System.out.println("str1 == str3: " + (str1 == str3)); // true - Same object (canonical representation)
        System.out.println("str2 == str3: " + (str2 == str3)); // true - Same object (after intern())


        // Another Example with more complex strings:
        String s1 = new String(new char[]{'a', 'b', 'c'});
        String s2 = "abc";
        String s3 = s1.intern();

        System.out.println("\nExample 2:");
        System.out.println("s1 == s2: " + (s1 == s2));  // false
        System.out.println("s1 == s3: " + (s1 == s3));  // false (s1 is the original object)
        System.out.println("s2 == s3: " + (s2 == s3));  // true (s3 and s2 now refer to the canonical "abc")

        // Demonstrating that intern() returns the canonical representation even if called on the literal
        String literal = "xyz";
        String internedLiteral = literal.intern();
        System.out.println("\nExample 3:");
        System.out.println("literal == internedLiteral: " + (literal == internedLiteral)); //true

        // Example demonstrating that intern() will return the existing canonical representation if one exists
        String str4 = new String("hello").intern();// str4 will refer to the same object as str1 and str3

        System.out.println("\nExample 4:");
        System.out.println("str1 == str4: " + (str1 == str4)); // true

    }
}
