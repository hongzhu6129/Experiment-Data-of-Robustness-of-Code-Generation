public class CanonicalString {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = str2.intern();

        System.out.println("str1 == str2: " + (str1 == str2)); // false (different objects)
        System.out.println("str1 == str3: " + (str1 == str3)); // true (same object - canonical representation)
        System.out.println("str2 == str3: " + (str2 == str3)); // true (after interning, str2 also refers to the canonical representation)


        // Another Example demonstrating using intern() to enforce canonical representation.
        String[] strings = new String[10000]; // Imagine a large array of strings

        for (int i = 0; i < strings.length; i++) {
            strings[i] = new String("Some repeated string").intern();  // Using intern() efficiently
        }

        // Now all strings in the array refer to the *same* string object (canonical representation)
        // This can significantly reduce memory usage, especially with many repeated strings.

        System.out.println("strings[0] == strings[9999]: " + (strings[0] == strings[9999])); //true
    }
}
