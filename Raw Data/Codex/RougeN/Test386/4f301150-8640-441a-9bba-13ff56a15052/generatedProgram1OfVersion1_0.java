public class StringComparison {

    public static void main(String[] args) {

        // Method 1: Using equals() for exact match (case-sensitive)
        String str1 = "hello";
        String str2 = "hello";
        String str3 = "Hello";

        System.out.println("Using equals():");
        System.out.println(str1 + " equals " + str2 + ": " + str1.equals(str2)); // true
        System.out.println(str1 + " equals " + str3 + ": " + str1.equals(str3)); // false


        // Method 2: Using equalsIgnoreCase() for case-insensitive match
        System.out.println("\nUsing equalsIgnoreCase():");
        System.out.println(str1 + " equalsIgnoreCase " + str3 + ": " + str1.equalsIgnoreCase(str3)); // true


        // Method 3: Using compareTo() for lexicographical comparison (case-sensitive)
        // Returns 0 if strings are equal, a negative value if str1 comes before str3,
        // and a positive value if str1 comes after str3.
        System.out.println("\nUsing compareTo():");
        System.out.println(str1 + " compareTo " + str2 + ": " + str1.compareTo(str2)); // 0
        System.out.println(str1 + " compareTo " + str3 + ": " + str1.compareTo(str3)); // 32 (ASCII difference between 'h' and 'H')
        System.out.println(str3 + " compareTo " + str1 + ": " + str3.compareTo(str1)); // -32


        // Method 4: Using compareToIgnoreCase() for lexicographical comparison (case-insensitive)
        System.out.println("\nUsing compareToIgnoreCase():");
        System.out.println(str1 + " compareToIgnoreCase " + str3 + ": " + str1.compareToIgnoreCase(str3)); // 0


        // Method 5: Using startsWith() and endsWith()
        String str4 = "helloworld";
        System.out.println("\nUsing startsWith() and endsWith():");
        System.out.println(str4 + " startsWith \"hello\": " + str4.startsWith("hello")); // true
        System.out.println(str4 + " endsWith \"world\": " + str4.endsWith("world"));    // true


        // Method 6: Using contains() to check for substring
        System.out.println("\nUsing contains():");
        System.out.println(str4 + " contains \"world\": " + str4.contains("world"));  // true


        // Method 7: Comparing character sequences (char arrays or segments of strings)
        // Use Arrays.equals() for char arrays or String.regionMatches() for string segments.
        char[] charArray1 = {'h', 'e', 'l', 'l', 'o'};
        char[] charArray2 = {'h', 'e', 'l', 'l', 'o'};
        char[] charArray3 = {'H', 'e', 'l', 'l', 'o'};
        
        System.out.println("\nComparing char arrays using Arrays.equals():");
        System.out.println("charArray1 equals charArray2: " + java.util.Arrays.equals(charArray1, charArray2)); // true
        System.out.println("charArray1 equals charArray3: " + java.util.Arrays.equals(charArray1, charArray3)); // false


        String str5 = "This is a test string";
        System.out.println("\nUsing regionMatches():");
        System.out.println(str5 + " regionMatches \"is a\": " + str5.regionMatches(5, "is a", 0, 4)); // true (case-sensitive)
        System.out.println(str5 + " regionMatches(ignore case) \"IS A\": " + str5.regionMatches(true, 5, "IS A", 0, 4)); // true



    }
}
