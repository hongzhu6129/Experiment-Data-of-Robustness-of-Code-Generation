public class StringComparison {

    public static void main(String[] args) {
        // Sample strings and character sequences for comparison
        String str1 = "Hello World";
        String str2 = "Hello World";
        String str3 = "hello world";
        String str4 = "Hello";

        CharSequence charSeq1 = "Hello World";
        CharSequence charSeq2 = new StringBuffer("Hello World");
        CharSequence charSeq3 = new StringBuilder("hello world");


        // Comparison using String.contentEquals()
        System.out.println("str1 contentEquals charSeq1: " + str1.contentEquals(charSeq1)); // true
        System.out.println("str1 contentEquals charSeq2: " + str1.contentEquals(charSeq2)); // true
        System.out.println("str1 contentEquals charSeq3: " + str1.contentEquals(charSeq3)); // false (case-sensitive)

        // Comparison using String.equals()  (only works with String objects)
        System.out.println("str1 equals str2: " + str1.equals(str2)); // true
        System.out.println("str1 equals str3: " + str1.equals(str3)); // false (case-sensitive)
        System.out.println("str1 equals str4: " + str1.equals(str4)); // false


        // Demonstrating case-insensitive comparison (convert both to lowercase)
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3)); // true

         // Demonstrating String.compareTo() (lexicographical comparison)
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));  // negative (str1 comes before str3)
        System.out.println("str3 compareTo str1: " + str3.compareTo(str1));  // positive (str3 comes after str1)
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));  // 0 (equal)


        //  startsWith() and endsWith()
        System.out.println("str1 startsWith \"Hello\": " + str1.startsWith("Hello")); // true
        System.out.println("str1 endsWith \"World\": " + str1.endsWith("World")); // true


        //Important Note: String.equals() and String.contentEquals() handle null differently.
        String str5 = null;
        //System.out.println(str5.equals("Hello")); // This will throw a NullPointerException
        System.out.println("str5 contentEquals \"Hello\": " + "Hello".contentEquals(str5)); // This will return false (handles null safely)



    }
}
