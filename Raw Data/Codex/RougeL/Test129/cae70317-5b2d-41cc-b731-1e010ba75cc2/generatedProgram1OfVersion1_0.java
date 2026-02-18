public class CanonicalString {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello"); // Created using the constructor
        String str3 = str2.intern(); // Explicitly obtaining canonical representation

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);


        System.out.println("str1 == str2: " + (str1 == str2)); // False - different objects
        System.out.println("str1 == str3: " + (str1 == str3)); // True - canonical representation used
        System.out.println("str2 == str3: " + (str2 == str3)); // True - intern() returns canonical form

        // More examples using literals within a loop (for demonstration):

        for(int i=0; i<3; i++) {
            String literal = "loopString";
            String constructed = new String("loopString");
            String interned = constructed.intern();

            System.out.println("\nLoop iteration: " + i);
            System.out.println("literal == constructed: " + (literal == constructed));  // False
            System.out.println("literal == interned: " + (literal == interned));      // True -  intern() returns the canonical rep.
            System.out.println("constructed == interned: "+ (constructed == interned)); // True -  The interned reference now points to the canonical representation.
        }


    }
}
