public class ConcatenateStringToDouble {

    public static void main(String[] args) {
        double num = 123.45;
        String str = "hello";

        // Convert the double to a String
        String numStr = String.valueOf(num);

        // Concatenate the strings
        String result = numStr + str;

        // Print the result
        System.out.println(result); 

         // Example showing different ways of achieving the same thing:
        System.out.println("" + num + str); // Using an empty string to trigger string conversion
        System.out.println(Double.toString(num) + str); // Another explicit conversion method


        // If you wanted to parse back to a double after prepending/appending other text,
        // you would need to handle potential NumberFormatExceptions:
        double num2 = 123.45;
        String prefix = "Value: ";
        String combined = prefix + num2;

        try {
            double parsedBack = Double.parseDouble(combined.substring(prefix.length())); // Extract numeric part
            System.out.println("Parsed back: " + parsedBack);
        } catch (NumberFormatException e) {
            System.out.println("Could not parse back to double: " + e.getMessage());
        }

    }
}
