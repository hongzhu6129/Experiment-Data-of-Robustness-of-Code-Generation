public class SubstringExample {

    public static void main(String[] args) {
        String str = "This is a test string";
        int startIndex = 10;
        int endIndex = 15;

        // Handle cases where startIndex or endIndex are out of bounds.
        if (startIndex < 0 || endIndex > str.length() || startIndex > endIndex) {
            System.out.println("Invalid start or end indices.");
            return;
        }


        String subStr = str.substring(startIndex, endIndex);
        System.out.println(subStr); // Output: test


        // Another example demonstrating out-of-bounds handling
        startIndex = 20;
        endIndex = 25;

        if (startIndex < 0 || endIndex > str.length() || startIndex > endIndex) {
            System.out.println("Invalid start or end indices.");
            return;
        } else { // This else is added for clarity for the second example
            subStr = str.substring(startIndex, endIndex);
            System.out.println(subStr);
        }



         // Example with startIndex = 0 (from the beginning)
        startIndex = 0;
        endIndex = 4;

        if (startIndex < 0 || endIndex > str.length() || startIndex > endIndex) {
            System.out.println("Invalid start or end indices.");
            return;
        } else { 
            subStr = str.substring(startIndex, endIndex);
            System.out.println(subStr); // Output: This
        }


        // Example getting the substring to the end of the String
        startIndex = 5;
        endIndex = str.length();

        if (startIndex < 0 || endIndex > str.length() || startIndex > endIndex) {
            System.out.println("Invalid start or end indices.");
            return;
        } else { 
            subStr = str.substring(startIndex, endIndex);
            System.out.println(subStr); // Output: is a test string
        }
    }
}
