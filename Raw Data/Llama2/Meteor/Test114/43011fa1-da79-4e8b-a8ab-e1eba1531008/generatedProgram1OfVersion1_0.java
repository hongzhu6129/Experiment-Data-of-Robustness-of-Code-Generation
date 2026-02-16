public class StringConversions {

    public static void main(String[] args) {
        String str = "12345"; // Example string

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

        } catch (NumberFormatException e) {
            System.out.println("Invalid string format for conversion to number: " + e.getMessage());
        }


        //Demonstrating handling strings with decimals:

         String decimalStr = "123.45";

        try {

             double decimalDoubleValue = Double.parseDouble(decimalStr);
            System.out.println("Double value (from decimal string): " + decimalDoubleValue);
            
             float decimalFloatValue = Float.parseFloat(decimalStr);
            System.out.println("Float value (from decimal string): " + decimalFloatValue);

        } catch (NumberFormatException e) {
            System.out.println("Invalid string format for conversion to number: " + e.getMessage());
        }
    }
}
