public class CanonicalString {

    public static void main(String[] args) {
        String str1 = "Hello"; // String literal, goes into the string pool
        String str2 = "Hello"; // Same literal, refers to the same object in the string pool
        String str3 = new String("Hello"); // Creates a new object on the heap

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);


        System.out.println("str1 == str2: " + (str1 == str2)); // True because they refer to the same object in the string pool
        System.out.println("str1 == str3: " + (str1 == str3)); // False because str3 is a different object on the heap
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // True because the content is the same

        // Get the canonical representation (from the string pool if it exists)
        String str4 = str3.intern(); 

        System.out.println("str4: " + str4);
        System.out.println("str1 == str4: " + (str1 == str4)); // Now true, as str4 points to the canonical "Hello" in the string pool


        // Demonstrating with a string that is not initially in the pool
        String str5 = new String("World").intern(); // Create "World" and immediately intern it
        String str6 = "World"; // This will refer to the same object as str5

        System.out.println("str5 == str6: " + (str5 == str6)); // True because of interning str5

    }
}
