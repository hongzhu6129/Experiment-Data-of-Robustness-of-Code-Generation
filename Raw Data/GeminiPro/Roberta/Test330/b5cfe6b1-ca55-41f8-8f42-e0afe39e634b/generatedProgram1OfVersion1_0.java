public class StringComparison {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello"); // Creates a new object in the heap
        String str4 = "world";


        // Method 1: Using equals() method (recommended for content comparison)
        System.out.println("Using equals() method:");
        System.out.println("str1 equals str2: " + str1.equals(str2)); // true
        System.out.println("str1 equals str3: " + str1.equals(str3)); // true 
        System.out.println("str1 equals str4: " + str1.equals(str4)); // false

        // Method 2: Using == operator (compares references/memory locations)
        System.out.println("\nUsing == operator:");
        System.out.println("str1 == str2: " + (str1 == str2)); // true (string literals are interned)
        System.out.println("str1 == str3: " + (str1 == str3)); // false (different objects)
        System.out.println("str1 == str4: " + (str1 == str4)); // false


        // Method 3: Using compareTo() method (lexicographical comparison)
        System.out.println("\nUsing compareTo() method:");
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2)); // 0 (equal)
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3)); // 0 (equal content)
        System.out.println("str1 compareTo str4: " + str1.compareTo(str4)); // negative value (str1 comes before str4)
        System.out.println("str4 compareTo str1: " + str4.compareTo(str1)); // positive value (str4 comes after str1)



        //Important Note:
        System.out.println("\nImportant Note on null handling with equals():");
        String str5 = null;
        //System.out.println(str5.equals(str1)); // This will throw a NullPointerException!

        // Correct way to handle nulls with equals():
        System.out.println(str1.equals(str5)); // false  (safe to call .equals() on a non-null string)

        // Or:
        System.out.println(str5 == null ? str1 == null : str5.equals(str1)); // false


    }
}
