public class CanonicalString {

    public static void main(String[] args) {

        // String literals are automatically interned (canonicalized)
        String str1 = "hello";
        String str2 = "hello";

        // Using the intern() method explicitly canonicalizes a string
        String str3 = new String("hello").intern();

        // Demonstrating that interned strings refer to the same object in memory
        if (str1 == str2) {
            System.out.println("str1 and str2 are the same object (interned literals)");
        }

        if (str1 == str3) {
            System.out.println("str1 and str3 are the same object (interned using intern())");
        }


        // Example showing the difference between == and .equals()
        String str4 = new String("hello"); // Not interned

        if (str1.equals(str4)) {
            System.out.println("str1 and str4 have the same content (.equals())");
        }

        if (str1 != str4) {
            System.out.println("str1 and str4 are different objects (not interned)"); // This will print
        }


        // Getting the canonical representation using intern()
        String str5 = "world";
        String canonicalStr5 = str5.intern(); //  Redundant in this specific example as str5 is already a literal.
        System.out.println("Canonical representation of \"world\": " + canonicalStr5);

        String str6 = new String("java");
        String canonicalStr6 = str6.intern(); 
        System.out.println("Canonical representation of \"java\" (created with new): " + canonicalStr6);

    }
}
