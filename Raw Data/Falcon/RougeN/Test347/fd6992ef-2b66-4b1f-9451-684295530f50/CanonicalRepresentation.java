public class CanonicalRepresentation {

    public static void main(String[] args) {
        // Example strings
        String str1 = "Hello";
        String str2 = new String("Hello"); // Created using the new keyword
        String str3 = str1.intern();       // Forces str1 to use the canonical representation

        // Print the canonical representation (memory address in essence) using System.identityHashCode
        System.out.println("Canonical Representation of str1 (hashcode): " + System.identityHashCode(str1));
        System.out.println("Canonical Representation of str2 (hashcode): " + System.identityHashCode(str2));
        System.out.println("Canonical Representation of str3 (hashcode): " + System.identityHashCode(str3));

        // Comparing canonical representations
        if (str1 == str2) { // Compares references (canonical representations)
            System.out.println("str1 and str2 have the same canonical representation.");
        } else {
            System.out.println("str1 and str2 have different canonical representations.");
        }

        if (str1 == str3) {
            System.out.println("str1 and str3 have the same canonical representation.");
        } else {
            System.out.println("str1 and str3 have different canonical representations.");
        }

        // Further illustration (using intern)
        String str4 = new String("World").intern();
        String str5 = "World";

        if (str4 == str5) {  // Will be true after interning str4
            System.out.println("str4 and str5 have the same canonical representation after interning.");
        } else {
            System.out.println("str4 and str5 have different canonical representations.");
        }


        // More realistic example: demonstrating the effect of intern() for performance
        String[] strings = new String[10000]; 
        for (int i = 0; i < strings.length; i++) {
            strings[i] = new String("Some repeated string").intern(); //  Use intern() here
        }

        // Demonstrates that only one canonical representation is created even though we used new String() repeatedly
         System.out.println("Number of unique canonical representations (estimated): " + countUniqueCanonicalRepresentations(strings));



    }

    // Helper function to roughly estimate the number of unique canonical representations
    public static int countUniqueCanonicalRepresentations(String[] strings) {
        java.util.Set<Integer> uniqueHashCodes = new java.util.HashSet<>();
        for (String s : strings) {
            uniqueHashCodes.add(System.identityHashCode(s));
        }
        return uniqueHashCodes.size();
    }
}
