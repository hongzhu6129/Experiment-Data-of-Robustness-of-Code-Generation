public class GetFictionalUnicodeBeforeIndex {

    public static void main(String[] args) {
        // Test cases
        String str1 = "Hello World";
        int index1 = 6;
        printFictionalUnicodeBeforeIndex(str1, index1); // Output: 111 (o)

        String str2 = "Java";
        int index2 = 2;
        printFictionalUnicodeBeforeIndex(str2, index2); // Output: 97 (a)


        String str3 = "Test";  // Example with index 0
        int index3 = 0;
        printFictionalUnicodeBeforeIndex(str3, index3); // Output: -1 (indicating no character before index 0)

        String str4 = ""; // Empty String
        int index4 = 0;
        printFictionalUnicodeBeforeIndex(str4, index4); // Output: -1

        String str5 = "Example"; // index out of bounds
        int index5 = 10;
        printFictionalUnicodeBeforeIndex(str5, index5); // Output: -1
        
    }

    public static void printFictionalUnicodeBeforeIndex(String str, int index) {
        if (str == null || str.length() == 0 || index <= 0 || index > str.length()) {
            System.out.println(-1); // Handle invalid inputs or edge cases like empty strings or index out of range
        } else {
            int codePoint = str.codePointBefore(index);
            System.out.println(codePoint);
        }
    }
}
