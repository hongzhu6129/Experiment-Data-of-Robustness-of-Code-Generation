public class StringConversions {

    public static void main(String[] args) {
        String numStr = "12345"; // Example string

        try {
            int intValue = Integer.parseInt(numStr);
            System.out.println("Integer: " + intValue);

            long longValue = Long.parseLong(numStr);
            System.out.println("Long: " + longValue);

            float floatValue = Float.parseFloat(numStr);
            System.out.println("Float: " + floatValue);

            double doubleValue = Double.parseDouble(numStr);
            System.out.println("Double: " + doubleValue);


        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }


        // Demonstrating with a decimal string
        String decimalStr = "123.45";

         try {
            float floatValue2 = Float.parseFloat(decimalStr);
            System.out.println("Float (from decimal string): " + floatValue2);

            double doubleValue2 = Double.parseDouble(decimalStr);
            System.out.println("Double (from decimal string): " + doubleValue2);

         } catch (NumberFormatException e) {
             System.out.println("Invalid number format: " + e.getMessage());
         }

    }
}
