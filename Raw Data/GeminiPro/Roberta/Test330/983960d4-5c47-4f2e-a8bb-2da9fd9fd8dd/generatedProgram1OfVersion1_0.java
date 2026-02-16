public class StringComparison {

    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = "hello";
        String string3 = new String("hello");
        String string4 = "world";

        // Method 1: Using equals() method (recommended for content comparison)
        System.out.println("Using equals():");
        System.out.println("string1 equals string2: " + string1.equals(string2)); // true
        System.out.println("string1 equals string3: " + string1.equals(string3)); // true
        System.out.println("string1 equals string4: " + string1.equals(string4)); // false

        // Method 2: Using == operator (compares references/memory locations)
        System.out.println("\nUsing == operator:");
        System.out.println("string1 == string2: " + (string1 == string2)); // true (because of String pool optimization)
        System.out.println("string1 == string3: " + (string1 == string3)); // false (string3 is a new object)


        // Method 3: Using compareTo() method (lexicographical comparison - for ordering)
        System.out.println("\nUsing compareTo():");
        System.out.println("string1 compareTo string2: " + string1.compareTo(string2)); // 0 (equal)
        System.out.println("string1 compareTo string4: " + string1.compareTo(string4)); // negative (string1 comes before string4)
        System.out.println("string4 compareTo string1: " + string4.compareTo(string1)); // positive (string4 comes after string1)


        // Important Note:  Use equals() to compare string content.
        // == compares memory addresses, which might be the same for string literals
        // (due to String pooling optimization) but different for strings created with 'new'. 
        // This can lead to unexpected results if you use == for content comparison.

        // Example showing the importance of using equals():

        String str5 = "abc";
        String str6 = new String("abc").intern(); // intern() puts it in the String pool

        System.out.println("\nDemonstrating intern():");
        System.out.println("str5 == str6: " + (str5 == str6)); // true because of intern()
        System.out.println("str5.equals(str6): " + str5.equals(str6)); // Always true (content is the same)

    }
}
