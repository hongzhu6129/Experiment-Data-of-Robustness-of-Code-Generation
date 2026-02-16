public class ExtractFirstHalf {

    public static void main(String[] args) {
        String str = "pythonpyt"; // Test string

        if (str.length() % 2 == 0) { // Check if the string length is even
            String firstHalf = str.substring(0, str.length() / 2);
            System.out.println(firstHalf); // Output: python
        } else {
            System.out.println("String length is not even.");
        }


        // Additional test cases (can be commented out)
        test("abcdef");      // Output: abc
        test("abcdefgh");   // Output: abcd
        test("abcde");     // Output: String length is not even.
        test("");           // Output: 
        test(null);         // Output: String length is not even. (Handles null gracefully)
    }

    // Helper method to test different inputs (optional)
    public static void test(String str) {
        if (str == null || str.length() % 2 != 0) {
            System.out.println("String length is not even.");
        } else {
            String firstHalf = str.substring(0, str.length() / 2);
            System.out.println(firstHalf);
        }
    }
}
