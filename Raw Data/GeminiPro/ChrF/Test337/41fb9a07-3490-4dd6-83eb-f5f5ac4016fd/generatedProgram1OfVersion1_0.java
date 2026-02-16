public class CanonicalString {

    public static void main(String[] args) {
        // Example strings
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = str2.intern();


        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);


        // Get canonical representations (using intern())
        String canonicalStr1 = str1.intern();
        String canonicalStr2 = str2.intern();
        String canonicalStr3 = str3.intern();

        // Demonstrate that canonical representations are the same
        System.out.println("\nCanonical Representations:");
        System.out.println("String 1 canonical: " + canonicalStr1);
        System.out.println("String 2 canonical: " + canonicalStr2);
        System.out.println("String 3 canonical: " + canonicalStr3);


        // Demonstrating equality after obtaining canonical representations:
        System.out.println("\nComparison after intern():");
        System.out.println("str1 == str2: " + (str1 == str2));             // Likely false (different objects initially)
        System.out.println("str1 == str3: " + (str1 == str3));             // Likely true (str3 was interned initially)
        System.out.println("canonicalStr1 == canonicalStr2: " + (canonicalStr1 == canonicalStr2)); // True (same canonical representation)
        System.out.println("canonicalStr1 == canonicalStr3: " + (canonicalStr1 == canonicalStr3)); // True



        //Important note regarding String literals:
        String str4 = "Test";
        String str5 = "Test";

        System.out.println("\nString Literals:");
        System.out.println("str4 == str5: " + (str4==str5)); //True because string literals are automatically interned by the compiler


    }
}
