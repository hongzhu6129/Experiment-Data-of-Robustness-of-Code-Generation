public class StringConversions {

    public static void main(String[] args) {
        String numStr = "1234567890";
        String decimalStr = "123.456";
        String longStr = "987654321098765432"; // A large number to demonstrate long conversion


        try {
            // Integer Conversion
            int numInt = Integer.parseInt(numStr);
            System.out.println("Integer: " + numInt);


            // Long Conversion
            long numLong = Long.parseLong(longStr);
            System.out.println("Long: " + numLong);


            // Float Conversion
            float numFloat = Float.parseFloat(decimalStr);
            System.out.println("Float: " + numFloat);



            // Double Conversion
            double numDouble = Double.parseDouble(decimalStr);
            System.out.println("Double: " + numDouble);



        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter a valid number string.");
        }

        // Demonstrating handling larger numbers that might exceed the limits
        String veryLargeNumber = "123456789012345678901234567890"; // Too large for Long

        try {
           long veryLargeLong = Long.parseLong(veryLargeNumber);
           System.out.println("Very Large Long (this won't print if it overflows):" + veryLargeLong);
        } catch (NumberFormatException e) {
            System.out.println("The number is too large to fit into a Long.");


            try {
                double veryLargeDouble = Double.parseDouble(veryLargeNumber); // Double can handle larger numbers
                System.out.println("Converted to Double: " + veryLargeDouble); 
            } catch (NumberFormatException ex) {
                System.out.println("The number is also too large for a Double.");
            }

        }
    }
}
