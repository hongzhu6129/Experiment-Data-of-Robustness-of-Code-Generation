public class CanonicalString {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = str2.intern();


        System.out.println("str1 == str2: " + (str1 == str2)); // false, different objects
        System.out.println("str1 == str3: " + (str1 == str3)); // true, same object (canonical representation)

        // Demonstrating with another example (using String literal vs. new String)
        String str4 = "Java";
        String str5 = new String("Java");

        System.out.println("str4 == str5: " + (str4 == str5)); //false

        String str6 = str5.intern(); // Get the canonical representation of str5

        System.out.println("str4 == str6: " + (str4 == str6)); //true


        // Further explanation (Optional - can be commented out):
        /*
         *  String literals (like "Hello") are automatically interned, meaning they are stored in the String pool. 
         *  When a new String object is created using the new operator, it creates a separate object in the heap, even if the string content is the same.
         *  The intern() method ensures that a string is added to the String pool if it's not already there. 
         *  It returns the canonical representation (the string from the pool) if it exists, or adds the new string to the pool and returns it.
         *  Therefore, after interning, comparisons using == will return true if the string contents are the same.
         */

    }
}
