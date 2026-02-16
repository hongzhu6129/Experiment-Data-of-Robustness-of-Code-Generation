public class ExtractFirstHalf {

    public static void main(String[] args) {
        String str = "pythonpyt"; // Test data

        if (str.length() % 2 == 0) { // Check if string length is even
            int halfLength = str.length() / 2;
            String firstHalf = str.substring(0, halfLength);
            System.out.println(firstHalf); // Output: python
        } else {
            System.out.println("String length is not even.");
        }

        // Alternative approach using ternary operator for conciseness:
        // System.out.println(str.length() % 2 == 0 ? str.substring(0, str.length() / 2) : "String length is not even.");

    }
}
