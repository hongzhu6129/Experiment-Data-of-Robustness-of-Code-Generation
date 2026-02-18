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


        //Method 3: Using String.format()
        String concatenatedString3 = String.format("%s%s", str1, str2);
        System.out.println("Concatenated string (using String.format()): " + concatenatedString3);



        // Example with more strings and different data types
        int num = 123;
        String str3 = "!";
        String concatenatedString4 = str1 + num + str2 + str3; // + operator handles different data types 
        System.out.println("Concatenated string with different data types: " + concatenatedString4);



    }
}
