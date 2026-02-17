public class StringConcatenation {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " World";

        // Method 1: Using the + operator
        String concatenatedString1 = str1 + str2;
        System.out.println("Concatenated string (using +): " + concatenatedString1);


        // Method 2: Using concat() method
        String concatenatedString2 = str1.concat(str2);
        System.out.println("Concatenated string (using concat()): " + concatenatedString2);


        // Example with more strings and different data types:
        int number = 123;
        String str3 = "!";

        String combinedString = str1 + " " + str2 +  " " + number + str3;  // Note:  number is implicitly converted to a String.
        System.out.println("Combined string: " + combinedString);


        //StringBuilder for more efficient concatenation (especially in loops) - Demonstrated in main for simplicity of the question requirement.
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(" from StringBuilder ");
        sb.append(str2);

        System.out.println("Concatenated string (using StringBuilder): " + sb.toString());

    }
}
