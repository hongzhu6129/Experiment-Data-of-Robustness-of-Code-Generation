public class StringToNumbers {

    public static void main(String[] args) {

        String str = "12345";

        try {
            int intValue = Integer.parseInt(str);
            System.out.println("Int Value: " + intValue);

            long longValue = Long.parseLong(str);
            System.out.println("Long Value: " + longValue);

            float floatValue = Float.parseFloat(str);
            System.out.println("Float Value: " + floatValue);

            double doubleValue = Double.parseDouble(str);
            System.out.println("Double Value: " + doubleValue);

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }


        String decimalStr = "123.45";  // Example with a decimal

        try {
            float floatValue2 = Float.parseFloat(decimalStr);
            System.out.println("Float Value (from decimal string): " + floatValue2);

            double doubleValue2 = Double.parseDouble(decimalStr);
            System.out.println("Double Value (from decimal string): " + doubleValue2);


        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }


         String invalidStr = "abc"; // Demonstrating error handling

        try {
            int invalidInt = Integer.parseInt(invalidStr); 
           //The rest of this try block won't execute if the above line throws an exception.

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format (for abc): " + e.getMessage());
        }


    }
}
