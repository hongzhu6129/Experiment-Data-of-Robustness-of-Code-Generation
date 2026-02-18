public class StringComparison {

    public static void main(String[] args) {
        String str1 = "hello"; // Example string 1
        String str2 = "hello"; // Example string 2
        String str3 = new String("hello"); // Example string 3 (created differently)
        String str4 = "world"; // Example string 4 (different content)


        // Method 1: Using .equals() (recommended for content comparison)
        System.out.println("Using .equals():");
        System.out.println("str1 and str2 are equal: " + str1.equals(str2)); // True
        System.out.println("str1 and str3 are equal: " + str1.equals(str3)); // True
        System.out.println("str1 and str4 are equal: " + str1.equals(str4)); // False


        // Method 2: Using == (compares references, not always content)
        System.out.println("\nUsing ==:");
        System.out.println("str1 and str2 are identical: " + (str1 == str2)); // True (because of string interning)
        System.out.println("str1 and str3 are identical: " + (str1 == str3)); // False (different objects)
        System.out.println("str1 and str4 are identical: " + (str1 == str4)); // False


        // Method 3: Using .compareTo() (primarily for lexicographical comparison)
        System.out.println("\nUsing .compareTo():");
        System.out.println("str1 and str2 compare: " + str1.compareTo(str2)); // 0 (equal)
        System.out.println("str1 and str3 compare: " + str1.compareTo(str3)); // 0 (equal content)
        System.out.println("str1 and str4 compare: " + str1.compareTo(str4)); // Negative (str1 comes before str4)

       // Method 4: Using .contentEquals() (Similar to .equals() but works with other CharSequence types)
        System.out.println("\nUsing .contentEquals():");
        System.out.println("str1 and str2 are equal: " + str1.contentEquals(str2)); // True
        System.out.println("str1 and str3 are equal: " + str1.contentEquals(str3)); // True
        System.out.println("str1 and str4 are equal: " + str1.contentEquals(str4)); // False

    }
}
