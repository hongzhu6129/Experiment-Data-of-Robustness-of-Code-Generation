public class StringComparison {

    public static void main(String[] args) {
        String str1 = "hello"; // Example string 1
        String str2 = "hello"; // Example string 2
        String str3 = "world"; // Example string 3

        // Method 1: Using .equals() - preferred for content comparison
        System.out.println("\"" + str1 + "\" equals \"" + str2 + "\"? " + str1.equals(str2)); // Output: true
        System.out.println("\"" + str1 + "\" equals \"" + str3 + "\"? " + str1.equals(str3)); // Output: false

        // Method 2: Using == (checks reference equality - use with caution for strings)
        System.out.println("\"" + str1 + "\" == \"" + str2 + "\"? " + (str1 == str2)); // Output: true (because string literals are interned)


        String str4 = new String("hello");  // Creating a new string object - different memory location
        System.out.println("\"" + str1 + "\" == \"" + str4 + "\"? " + (str1 == str4));  // Output: false (different objects)
        System.out.println("\"" + str1 + "\" equals \"" + str4 + "\"? " + str1.equals(str4));  // Output: true (content is the same)


        //Handling nulls safely with .equals()

        String str5 = null;
        //System.out.println(str5.equals(str1)); // Throws NullPointerException - Incorrect!

        System.out.println(str1.equals(str5)); // Correct and Safe - returns false
        // Or even better:
        System.out.println(Objects.equals(str1, str5)); // Java 7+ - handles nulls for both strings



    }
}
