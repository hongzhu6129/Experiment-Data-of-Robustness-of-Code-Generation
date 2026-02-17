public class StringConcatenation {

    public static void main(String[] args) {
        String str1 = "Hello"; // First string
        String str2 = " World!"; // Second string

        // Method 1: Using the + operator
        String concatenatedString1 = str1 + str2;
        System.out.println("Concatenated string (using +): " + concatenatedString1);


        // Method 2: Using the concat() method
        String concatenatedString2 = str1.concat(str2);
        System.out.println("Concatenated string (using concat()): " + concatenatedString2);


        //Method 3: Using StringBuilder (more efficient for multiple concatenations)
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(str2);
        String concatenatedString3 = sb.toString();
        System.out.println("Concatenated string (using StringBuilder): " + concatenatedString3);


        // Example with user input (if you were to take input from the command line)
        if (args.length == 2) {  // Check if two arguments are provided
            String userStr1 = args[0];
            String userStr2 = args[1];
            String userConcatenated = userStr1.concat(userStr2); // Or use + or StringBuilder
            System.out.println("Concatenated user input: " + userConcatenated);

        } else {
            System.out.println("Please provide two string arguments.");
        }

    }
}
