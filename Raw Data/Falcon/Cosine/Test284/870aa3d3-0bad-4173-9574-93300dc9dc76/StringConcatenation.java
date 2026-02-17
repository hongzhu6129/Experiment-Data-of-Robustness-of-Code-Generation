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



        // Example with more strings and different data types
        String str3 = "!";
        int num = 2023;

        String combinedString = str1 + str2 + str3 + " " + num; // + operator handles string conversion for other types
        System.out.println("Combined string: " + combinedString);



    }
}
