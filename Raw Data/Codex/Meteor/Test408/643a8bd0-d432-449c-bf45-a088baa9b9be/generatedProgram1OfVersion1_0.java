public class StringConversions {

    public static void main(String[] args) {

        String str = "12345";

        try {
            // Convert to int
            int intValue = Integer.parseInt(str);
            System.out.println("Integer value: " + intValue);

            // Convert to long
            long longValue = Long.parseLong(str);
            System.out.println("Long value: " + longValue);

            // Convert to float
            float floatValue = Float.parseFloat(str);
            System.out.println("Float value: " + floatValue);

            // Convert to double
            double doubleValue = Double.parseDouble(str);
            System.out.println("Double value: " + doubleValue);



            // Demonstrating with decimals
            String decimalStr = "123.45";

             float decimalFloatValue = Float.parseFloat(decimalStr);
            System.out.println("Float value (decimal): " + decimalFloatValue);

            double decimalDoubleValue = Double.parseDouble(decimalStr);
            System.out.println("Double value (decimal): " + decimalDoubleValue);



        } catch (NumberFormatException e) {
            System.out.println("Invalid string format for conversion.  String: \"" + str + "\"");
        }


        // Example demonstrating a NumberFormatException (uncomment to test)
         try {
         //     String invalidStr = "abc";  // Uncomment this line
         //     int invalidInt = Integer.parseInt(invalidStr); // This will throw an exception 
         } catch (NumberFormatException e) {
             System.out.println("NumberFormatException caught: " + e.getMessage());
         }




    }
}
