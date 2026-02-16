public class CanonicalString {

    public static void main(String[] args) {

        // Example strings
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = "hello".intern();
        String str4 = new String("hello").intern();


        // Get the canonical representation using String.intern()
        String canonicalStr1 = str1.intern();
        String canonicalStr2 = str2.intern();
        String canonicalStr3 = str3.intern();
        String canonicalStr4 = str4.intern();


        // Demonstrate that the canonical representations are the same
        System.out.println("str1 == str2: " + (str1 == str2)); // Likely false
        System.out.println("str1 == str3: " + (str1 == str3)); // True (because str3 uses intern())
        System.out.println("str1 == str4: " + (str1 == str4)); // True (because str4 uses intern())


        System.out.println("canonicalStr1 == canonicalStr2: " + (canonicalStr1 == canonicalStr2)); // True
        System.out.println("canonicalStr1 == canonicalStr3: " + (canonicalStr1 == canonicalStr3)); // True
        System.out.println("canonicalStr1 == canonicalStr4: " + (canonicalStr1 == canonicalStr4)); // True


        // Another example demonstrating  the "==" operator compares references
        String a = new String("abc").intern();
        String b = "abc";

        System.out.println(a == b); // True: 'a' and 'b' now refer to the same interned string.

    }
}
