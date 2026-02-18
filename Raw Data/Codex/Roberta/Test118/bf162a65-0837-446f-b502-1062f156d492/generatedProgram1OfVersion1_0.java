public class StringConcatenation {

    public static void main(String[] args) {

        // Method 1: Using the + operator (most common and simplest)
        String str1 = "Hello";
        String str2 = " World";
        String result1 = str1 + str2;
        System.out.println("Concatenated string (using +): " + result1); // Output: Hello World


        // Method 2: Using the concat() method
        String str3 = "Java";
        String str4 = " Programming";
        String result2 = str3.concat(str4);
        System.out.println("Concatenated string (using concat()): " + result2); // Output: Java Programming


        // Method 3: Using StringBuilder (more efficient for multiple concatenations)
        String str5 = "This";
        String str6 = " is";
        String str7 = " efficient";

        StringBuilder sb = new StringBuilder();
        sb.append(str5);
        sb.append(str6);
        sb.append(str7);
        String result3 = sb.toString();

        System.out.println("Concatenated string (using StringBuilder): " + result3); // Output: This is efficient


        // Example demonstrating why StringBuilder is efficient for multiple concatenations
        String manyStrings = "";
        for (int i = 0; i < 1000; i++) {
            manyStrings += "a"; // Inefficient - creates new String objects repeatedly
        }

        StringBuilder sbEfficient = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sbEfficient.append("a");  // Efficient - modifies the existing StringBuilder object
        }
        String manyStringsEfficient = sbEfficient.toString();



        // Concatenating with other data types
        String name = "Alice";
        int age = 30;
        String message = "My name is " + name + " and I am " + age + " years old.";
        System.out.println(message); // Output: My name is Alice and I am 30 years old.



        // Concatenating with null (results in "null" being added to the string)
        String nullString = null;
        String combined = "The value is: " + nullString;
        System.out.println(combined); // Output: The value is: null
    }
}
