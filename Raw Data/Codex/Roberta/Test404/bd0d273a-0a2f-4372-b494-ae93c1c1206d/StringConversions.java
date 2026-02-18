public class StringConversions {

    public static void main(String[] args) {
        String str = "12345";
        String strDecimal = "12345.6789";
        String strLong = "9876543210";  // Larger than max int

        try {
            int intValue = Integer.parseInt(str);
            System.out.println("Integer: " + intValue);

            long longValue = Long.parseLong(strLong);
            System.out.println("Long: " + longValue);

            float floatValue = Float.parseFloat(strDecimal);
            System.out.println("Float: " + floatValue);

            double doubleValue = Double.parseDouble(strDecimal);
            System.out.println("Double: " + doubleValue);


            // Handling potential NumberFormatExceptions
            String invalidStr = "abc";  // Example of an invalid string

            try {
                int invalidInt = Integer.parseInt(invalidStr);
                System.out.println("Integer (Invalid): " + invalidInt); // This won't be reached if an exception is thrown
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer format: " + e.getMessage()); 
            }


        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }



        // Demonstrating conversion with error handling using methods
        convertAndPrintInt("123");       // Valid
        convertAndPrintInt("123.45");   // Invalid
        convertAndPrintInt("abcdef");    // Invalid


    }

    // Helper method to demonstrate conversion and error handling within main
    public static void convertAndPrintInt(String str) {
        try {
            int intValue = Integer.parseInt(str);
            System.out.println("Integer (from method): " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Error converting '" + str + "' to int: " + e.getMessage());
        }
    }
}
